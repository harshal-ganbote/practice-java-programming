SELECT emp.employee_id
FROM employees emp
  LEFT JOIN employees mgr ON emp.manager_id = mgr.employee_id
  AND emp.salary < 15000
WHERE emp.manager_id IS NOT NULL
  AND mgr.employee_id IS NULL
ORDER BY emp.employee_id;