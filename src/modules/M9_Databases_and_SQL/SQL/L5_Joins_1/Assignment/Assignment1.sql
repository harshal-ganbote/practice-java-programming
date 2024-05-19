SELECT emp.employee_id,
  emp.first_name,
  emp.last_name
FROM employees emp
  JOIN employees mgr ON emp.manager_id = mgr.employee_id
  AND emp.hire_date < mgr.hire_date
ORDER BY emp.employee_id;