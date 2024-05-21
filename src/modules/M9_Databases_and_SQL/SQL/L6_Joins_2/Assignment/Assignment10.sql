SELECT emp.employee_name,
  m.employee_name AS mentor_name
FROM Employees emp
  JOIN Employees m ON emp.mentor_id = m.employee_id
  AND emp.hire_date <= DATE_ADD(m.hire_date, INTERVAL 30 DAY)
ORDER BY m.employee_name;