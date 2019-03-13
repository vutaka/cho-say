package com.example.chosay.dao;

import java.util.List;
import java.util.Optional;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.transaction.annotation.Transactional;

@ConfigAutowireable
@Dao
public interface EventDao {

  @Select
  List<Event> selectAll();

  @Select
  Optional<Event> selectById(Integer eventId);

  @Insert
  @Transactional
  int insert(Event event);
}