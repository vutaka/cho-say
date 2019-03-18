package com.example.chosay.dao;

import org.seasar.doma.Entity;

@Entity
public class ParticipantAnswerWithName extends ParticipantAnswer {
  private String participantName;
  private String candidate;
  private String comment;

  public String getParticipantName() {
    return participantName;
  }

  public void setParticipantName(String participantName) {
    this.participantName = participantName;
  }

  public String getCandidate() {
    return candidate;
  }

  public void setCandidate(String candidate) {
    this.candidate = candidate;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

}