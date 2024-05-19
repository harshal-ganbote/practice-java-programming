SELECT emp1.employee_name AS employee1,
  emp2.employee_name AS employee2,
  mgr.employee_name AS manager_name
FROM Employees emp1
  JOIN Employees emp2 ON emp1.manager_id = emp2.manager_id
  AND emp1.employee_id != emp2.employee_id
  AND emp1.employee_id < emp2.employee_id
  JOIN Employees mgr ON emp1.manager_id = mgr.employee_id
ORDER BY emp1.employee_name,
  emp2.employee_name;