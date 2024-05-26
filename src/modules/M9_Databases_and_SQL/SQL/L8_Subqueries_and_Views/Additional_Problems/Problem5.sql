SELECT seat_id
FROM cinema c
WHERE free = 1
  AND (
    (
      SELECT free
      FROM cinema
      WHERE seat_id = c.seat_id + 1
    ) = 1
    OR (
      SELECT free
      FROM cinema
      WHERE seat_id = c.seat_id -1
    ) = 1
  )
ORDER BY seat_id;