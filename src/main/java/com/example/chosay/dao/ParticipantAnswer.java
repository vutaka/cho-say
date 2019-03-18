package com.example.chosay.dao;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;

@Entity
public class ParticipantAnswer {

  @Id
  private Integer candidateId;
  @Id
  private Integer participantId;
  private String answer;

  public Integer getCandidateId() {
    return candidateId;
  }

  public void setCandidateId(Integer candidateId) {
    this.candidateId = candidateId;
  }

  public Integer getParticipantId() {
    return participantId;
  }

  public void setParticipantId(Integer participantId) {
    this.participantId = participantId;
  }

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }
}