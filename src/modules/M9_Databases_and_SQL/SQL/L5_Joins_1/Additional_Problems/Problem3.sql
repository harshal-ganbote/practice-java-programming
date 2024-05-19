SELECT emp.employee_id,
  emp.first_name,
  emp.last_name,
  emp.salary,
  d.department_name,
  emp.hire_date,
  l.city
FROM employees emp
  JOIN departments d ON emp.department_id = d.department_id
  JOIN locations l ON d.location_id = l.location_id
  AND emp.hire_date BETWEEN "1998-01-01" AND DATE_ADD("1998-01-01", INTERVAL 90 DAY)
ORDER BY emp.employee_id;