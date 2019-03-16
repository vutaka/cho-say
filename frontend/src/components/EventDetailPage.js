import React, { Component } from 'react';




class EventDetailPage extends Component {
  state = {event: []}

  componentDidMount() {
    fetch('/event/' + this.props.match.params.eventId)
      .then(res => res.json())
      .then(json => this.setState({event:json}));
  }

  render() {
    return (
      <React.Fragment>
        <h2>イベント詳細{this.props.match.params.eventId}</h2>
      </React.Fragment>
    );
  }
}

export default EventDetailPage;