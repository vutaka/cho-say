package com.example.chosay.controller;

import java.util.List;

import com.example.chosay.dao.EventWithCandidate;
import com.example.chosay.dao.ParticipantAnswerWithName;

public class EventViewDto {
  List<EventWithCandidate> candidates;

  List<ParticipantAnswerWithName> answerList;

  public List<EventWithCandidate> getCandidates() {
    return candidates;
  }

  public void setCandidates(List<EventWithCandidate> candidates) {
    this.candidates = candidates;
  }

  public List<ParticipantAnswerWithName> getAnswerList() {
    return answerList;
  }

  public void setAnswerList(List<ParticipantAnswerWithName> answerList) {
    this.answerList = answerList;
  }
}