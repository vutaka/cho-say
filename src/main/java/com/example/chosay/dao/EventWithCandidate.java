package com.example.chosay.dao;

import org.seasar.doma.Entity;

@Entity
public class EventWithCandidate extends Event {
  private Integer candidateId;
  private String candidate;

  public Integer getCandidateId() {
    return candidateId;
  }

  public void setCandidateId(Integer candidateId) {
    this.candidateId = candidateId;
  }

  public String getCandidate() {
    return candidate;
  }

  public void setCandidate(String candidate) {
    this.candidate = candidate;
  }
}