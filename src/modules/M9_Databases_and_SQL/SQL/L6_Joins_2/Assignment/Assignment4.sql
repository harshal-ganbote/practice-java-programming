SELECT emp.employeeNumber,
  emp.firstName,
  emp.lastName,
  o.officeCode,
  o.city
FROM employees emp
  JOIN offices o
ORDER BY emp.employeeNumber,
  o.officeCode;