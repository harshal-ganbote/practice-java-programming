SELECT employee_id,
  COUNT(*) AS team_size
FROM employee
GROUP BY team_id
ORDER BY employee_id;