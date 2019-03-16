import React, { Component } from 'react';
import { Link } from 'react-router-dom';
import { Table } from 'antd';

const columns = [{
  title: 'イベント名',
  dataIndex: 'title',
  render: (text, record) =>( <Link to={`/event/${record.eventId}`}>{text}</Link>)
}, {
  title: '説明',
  dataIndex: 'description'
}];


class EventListPage extends Component {

  state = {events:[]}

  componentDidMount() {
    fetch('/event')
      .then(res => res.json())
      .then(json => this.setState({events:json}));
  }

  render() {
    return (
      <React.Fragment>
        <h2>イベント一覧</h2>
        <Table dataSource={this.state.events} columns={columns} rowKey={record => record.eventId}/>
      </React.Fragment>
    );
  }
}

export default EventListPage;