SELECT
  e.event_id,
  candidate_datee.title,
  e.description,
  e_date.candidate_date
FROM
  event e
  INNER JOIN event_candidate_date e_date
  ON e.event_id = e_date.event_id
WHERE
  e.event_id = /* eventId */'1'