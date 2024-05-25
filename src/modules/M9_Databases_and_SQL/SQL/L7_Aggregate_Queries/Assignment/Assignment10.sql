SELECT p.project_id,
  ROUND(AVG(emp.experience_years), 2) AS average_years
FROM project p
  JOIN employee emp ON p.employee_id = emp.employee_id
GROUP BY p.project_id
ORDER By project_id;