SELECT emp.name,
  b.bonus
FROM Bonus b
  RIGHT JOIN employee emp ON b.empId = emp.empId
WHERE b.bonus < 1000
  OR b.empId IS NULL
ORDER BY emp.name;