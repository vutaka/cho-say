SELECT
  e.event_id,
  e.title,
  e.description,
  candidate.candidate_id,
  candidate.candidate
FROM
  event e
  INNER JOIN event_candidate candidate
  ON e.event_id = candidate.event_id
WHERE
  e.event_id = /* eventId */'1'
ORDER BY
  candidate.candidate