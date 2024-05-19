SELECT emp.name AS Employee
FROM employee emp
  JOIN employee mgr ON emp.managerId = mgr.id
  AND emp.salary > mgr.salary
ORDER BY emp.name;