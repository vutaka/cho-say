package com.example.chosay.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

@ConfigAutowireable
@Dao
public interface EventDao {

  @Select
  List<Event> selectAll();

  @Select
  List<EventWithCandidateDate> selectById(Integer eventId);

  @Insert
  int insert(Event event);
}