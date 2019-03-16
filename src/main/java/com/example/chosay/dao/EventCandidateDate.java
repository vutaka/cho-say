package com.example.chosay.dao;

import java.util.Date;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;

@Entity
public class EventCandidateDate {
  @Id
  private Integer eventId;
  @Id
  private Date candidateDate;

  public Integer getEventId() {
    return eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  public Date getCandidateDate() {
    return candidateDate;
  }

  public void setCandidateDate(Date candidateDate) {
    this.candidateDate = candidateDate;
  }
}