DROP TABLE IF EXISTS event_candidate_date;
DROP TABLE IF EXISTS event;

CREATE TABLE IF NOT EXISTS event (
  event_id int PRIMARY KEY GENERATED BY DEFAULT AS IDENTITY,
  title VARCHAR(64) NOT NULL,
  description VARCHAR(2048)
);

CREATE TABLE IF NOT EXISTS event_candidate_date (
  event_id int REFERENCES event(event_id),
  candidate_date DATE,
  PRIMARY KEY(event_id, candidate_date)
);