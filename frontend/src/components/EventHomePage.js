import React, { Component } from 'react';
import {Route} from 'react-router-dom';
import EventListPage from './EventListPage';
import EventDetailPage from './EventDetailPage';


class EventHomePage extends Component {

  render() {
    return (
      <React.Fragment>
         <Route exact path='/event' component={EventListPage} />
         <Route path='/event/:eventId' component={EventDetailPage} />
      </React.Fragment>
    );
  }
}

export default EventHomePage;