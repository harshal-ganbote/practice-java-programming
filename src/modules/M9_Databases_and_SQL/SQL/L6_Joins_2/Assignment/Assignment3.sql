SELECT emp.employeeNumber,
  emp.firstName,
  emp.lastName
FROM employees emp
  LEFT JOIN customers c ON emp.employeeNumber = c.salesRepEmployeeNumber
WHERE c.customerNumber IS NULL
ORDER BY emp.employeeNumber;