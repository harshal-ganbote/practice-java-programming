SELECT ac.player_id,
  ac.device_id
FROM activity ac
  JOIN (
    SELECT player_id,
      MIN(event_date) AS min_date
    FROM activity
    GROUP BY player_id
  ) acm ON ac.player_id = acm.player_id
  AND ac.event_date = acm.min_date
ORDER BY ac.player_id;