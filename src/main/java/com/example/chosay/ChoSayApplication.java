package com.example.chosay;

import java.util.Arrays;
import java.util.Optional;

import com.example.chosay.dao.Event;
import com.example.chosay.dao.EventDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ChoSayApplication {

  public static void main(String[] args) {
    SpringApplication.run(ChoSayApplication.class, args);
  }

  @Autowired
  EventDao eventDao;

  @Bean
  CommandLineRunner runner() {
    return args -> Arrays.asList("spring", "spring boot", "spring cloud", "doma").forEach(s -> {
      Event event = new Event();
      event.setTitle(s);
      eventDao.insert(event);
    });
  }

  @GetMapping("/{id}")
  Optional<Event> find(@PathVariable("id") Integer eventId) {
    return eventDao.selectById(eventId);
  }

}
