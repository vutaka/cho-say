package com.example.chosay.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

@ConfigAutowireable
@Dao
public interface ParticipantAnswerDao {

  @Select
  public List<ParticipantAnswerWithName> selectByEventId(Integer eventId);

  @Insert
  public int insert(ParticipantAnswer participantAnswer);

}