SELECT DISTINCT mgr.employee_name AS manager_name
FROM Employees emp
  JOIN Employees mgr ON emp.manager_id = mgr.employee_id
ORDER BY mgr.employee_name DESC;