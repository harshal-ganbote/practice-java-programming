SELECT firstName,
  lastName,
  jobTitle
FROM employees
WHERE officeCode NOT IN (4, 6, 7)
ORDER BY firstName,
  lastName;