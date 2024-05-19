SELECT emp.employee_id,
  emp.first_name,
  emp.last_name
FROM employees emp
  JOIN employees mgr ON emp.manager_id = mgr.employee_id
  JOIN departments d ON mgr.department_id = d.department_id
  JOIN locations l ON d.location_id = l.location_id
  AND l.country_id = "US"
ORDER BY emp.employee_id;