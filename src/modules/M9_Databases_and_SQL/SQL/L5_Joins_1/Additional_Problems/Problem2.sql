SELECT emp.manager_id,
  CONCAT(mgr.first_name, " ", mgr.last_name) AS Manager,
  CONCAT(emp.first_name, " ", emp.last_name) AS Employee
FROM employees emp
  JOIN employees mgr ON emp.manager_id = mgr.employee_id
ORDER BY emp.manager_id,
  CONCAT(emp.first_name, " ", emp.last_name);