SELECT employee_id,
  (
    SELECT COUNT(*)
    FROM employee
    GROUP BY team_id
    HAVING team_id = emp.team_id
  ) AS team_size
FROM employee emp
ORDER BY employee_id;