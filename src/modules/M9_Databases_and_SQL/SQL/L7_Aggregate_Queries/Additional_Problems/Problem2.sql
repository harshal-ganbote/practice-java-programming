SELECT City,
  ROUND(MIN(Income), 2) AS Minimum_Income
FROM employees
GROUP BY City
HAVING Minimum_Income > 2000
ORDER BY City;