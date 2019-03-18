package com.example.chosay.controller;

import java.util.List;

import com.example.chosay.dao.Event;
import com.example.chosay.dao.EventDao;
import com.example.chosay.dao.EventWithCandidate;
import com.example.chosay.dao.ParticipantAnswerDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

  @Autowired
  EventDao eventDao;

  @Autowired
  ParticipantAnswerDao answerDao;
  
  @GetMapping("/event")
  @Transactional
  List<Event> findAll() {
    return eventDao.selectAll();
  }

  @GetMapping("/event/{id}")
  @Transactional
  EventViewDto find(@PathVariable("id") Integer eventId) {
    EventViewDto viewDto = new EventViewDto();
    viewDto.setCandidates(eventDao.selectById(eventId));
    viewDto.setAnswerList(answerDao.selectByEventId(eventId));
    return viewDto;
  }
}