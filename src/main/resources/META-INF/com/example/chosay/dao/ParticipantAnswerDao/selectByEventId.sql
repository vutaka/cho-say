SELECT
  c.candidate_id,
  c.candidate,
  p.participant_id,
  p.participant_name,
  pa.answer,
  p.comment
FROM
  event e
  INNER JOIN event_candidate c
    ON e.event_id = c.event_id
  LEFT JOIN participant_answer pa
    on c.candidate_id = pa.candidate_id
  INNER JOIN participant p
    on pa.participant_id = p.participant_id
WHERE
  e.event_id = /* eventId */'1'
ORDER BY
  c.candidate