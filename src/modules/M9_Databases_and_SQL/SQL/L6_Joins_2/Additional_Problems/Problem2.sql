SELECT euni.unique_id
FROM employees emp
  LEFT JOIN employeeUNI euni ON emp.id = euni.id
ORDER BY emp.id;