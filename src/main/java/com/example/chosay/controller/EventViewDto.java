package com.example.chosay.controller;

import java.util.List;

import com.example.chosay.dao.EventWithCandidate;

public class EventViewDto {
  List<EventWithCandidate> candidates;

  List<AnswerDto> answerList;

  public List<EventWithCandidate> getCandidates() {
    return candidates;
  }

  public void setCandidates(List<EventWithCandidate> candidates) {
    this.candidates = candidates;
  }

  public List<AnswerDto> getAnswerList() {
    return answerList;
  }

  public void setAnswerList(List<AnswerDto> answerList) {
    this.answerList = answerList;
  }
}