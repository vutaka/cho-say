package com.example.chosay.controller;

import java.util.HashMap;
import java.util.Map;

public class AnswerDto {

  private Integer participantId;
  private String participantName;
  private String comment;
  private Map<Integer, String> candidateAnswer;

  public AnswerDto() {
    candidateAnswer = new HashMap<>();
  }

  public Integer getParticipantId() {
    return participantId;
  }

  public void setParticipantId(Integer participantId) {
    this.participantId = participantId;
  }

  public String getParticipantName() {
    return participantName;
  }

  public void setParticipantName(String participantName) {
    this.participantName = participantName;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Map<Integer, String> getCandidateAnswer() {
    return candidateAnswer;
  }

  public void setCandidateAnswer(Map<Integer, String> candidateAnswer) {
    this.candidateAnswer = candidateAnswer;
  }
}