package com.example.chosay.controller;

import java.util.List;

import com.example.chosay.dao.Event;
import com.example.chosay.dao.EventDao;
import com.example.chosay.dao.EventWithCandidateDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

  @Autowired
  EventDao eventDao;
  
  @GetMapping("/event")
  @Transactional
  List<Event> findAll() {
    return eventDao.selectAll();
  }

  @GetMapping("/event/{id}")
  @Transactional
  List<EventWithCandidateDate> find(@PathVariable("id") Integer eventId) {
    return eventDao.selectById(eventId);
  }
}