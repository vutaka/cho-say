import React, { Component } from 'react';
import { Table } from 'antd';

const columns = [{
  title: 'イベント名',
  dataIndex: 'title'
}, {
  title: '説明',
  dataIndex: 'description'
}];

class EventListPage extends Component {

  state = {event:[]}

  componentDidMount() {
    fetch('/event')
      .then(res => res.json())
      .then(json => this.setState({event:json}));
  }

  render() {
    return (
      <React.Fragment>
        <h2>イベント一覧</h2>
        <Table dataSource={this.state.event} columns={columns} rowKey={record => record.eventId}/>
      </React.Fragment>
    );
  }
}

export default EventListPage;