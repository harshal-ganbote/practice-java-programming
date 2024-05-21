SELECT q.id,
  q.year,
  IFNULL(n.npv, 0) as npv
FROM queries q
  LEFT JOIN npv n ON q.id = n.id
  AND q.year = n.year
ORDER BY q.id,
  q.year;