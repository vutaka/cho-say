import React, { Component } from 'react';
import { Table } from 'antd';
import CodeConstants from '../code/codeValue';



class EventDetailPage extends Component {
  state = {columns:[], dataSource: []}

  componentDidMount() {
    fetch('/event/' + this.props.match.params.eventId)
      .then(res => res.json())
      .then(json => {
        const tableDef = {
          columns : [{
            title: '参加者',
            dataIndex: 'participantName'
          }],
          dataSource: json.answerList
        };
        json.candidates.forEach(candidate => {
          tableDef.columns.push({
              title: candidate.candidate,
              dataIndex: 'candidateAnswer.' + candidate.candidateId,
              render: text => (<React.Fragment>{CodeConstants.answerCode[text]}</React.Fragment>)
            });
        })
        this.setState(tableDef);
      });
  }

  createColumns() {

  }

  render() {
    return (
      <React.Fragment>
        <h2>イベント詳細</h2>
        <Table dataSource={this.state.dataSource} columns={this.state.columns} rowKey={record => record.participantId} pagination={false} />
      </React.Fragment>
    );
  }
}

export default EventDetailPage;