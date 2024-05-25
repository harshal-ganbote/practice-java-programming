SELECT query_name,
  ROUND(SUM(rating / position) / COUNT(*), 2) AS quality,
  ROUND(1 / COUNT(*) * 100, 2) AS poor_query_percentage
FROM queries
GROUP BY query_name
ORDER BY query_name;