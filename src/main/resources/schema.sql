CREATE TABLE IF NOT EXISTS event (
  event_id int PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
  title VARCHAR(64) NOT NULL,
  description VARCHAR(2048)
);