SELECT DISTINCT p.session_id
FROM Playback p
  LEFT JOIN Ads a ON p.customer_id = a.customer_id
WHERE a.timestamp NOT BETWEEN p.start_time AND p.end_time
ORDER BY p.session_id;