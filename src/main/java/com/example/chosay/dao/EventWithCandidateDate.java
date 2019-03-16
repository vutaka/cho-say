package com.example.chosay.dao;

import java.util.Date;

import org.seasar.doma.Entity;

@Entity
public class EventWithCandidateDate extends Event {
  private Date candidateDate;

  public Date getCandidateDate() {
    return candidateDate;
  }

  public void setCandidateDate(Date candidateDate) {
    this.candidateDate = candidateDate;
  }

}