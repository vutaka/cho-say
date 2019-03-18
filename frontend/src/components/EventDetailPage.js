import React, { Component } from 'react';
import { Table } from 'antd';



class EventDetailPage extends Component {
  state = {columns:[], dataSource: []}

  componentDidMount() {
    fetch('/event/' + this.props.match.params.eventId)
      .then(res => res.json())
      .then(json => {
        const tableDef = {
          columns : [{
            title: '候補日',
            dataIndex: 'candidate',
            key: 'candidate'
          }],
          dataSource: []
        };
        // 候補日の辞書を用意する
        const candidateAnswers = {};
        json.candidates.forEach(candidate => {
          candidateAnswers[candidate.candidateId] = {candidate: candidate.candidate ,candidateId: candidate.candidateId};
        });
        // 参加者の辞書を用意する。
        const participantAnswers={};
        json.answerList.forEach(answer => {
          if(!participantAnswers[answer.participantId]) 
            participantAnswers[answer.participantId] = {name: answer.participantName, comment: answer.comment};
          // 参加者の回答は候補日に格納する。
          candidateAnswers[answer.candidateId][answer.participantId] = answer.answer;
        });

        for (const participantId in participantAnswers) {
          tableDef.columns.push({
            title: participantAnswers[participantId].name,
            dataIndex: participantId
          })
        }
        console.log(candidateAnswers);
        for (const candidateId in candidateAnswers) {
            tableDef.dataSource.push(candidateAnswers[candidateId]);
            
          }
        this.setState(tableDef);
      });
  }

  createColumns() {

  }

  render() {
    return (
      <React.Fragment>
        <h2>イベント詳細{this.props.match.params.eventId}</h2>
        <Table dataSource={this.state.dataSource} columns={this.state.columns} rowKey={record => record.candidateId}/>
      </React.Fragment>
    );
  }
}

export default EventDetailPage;