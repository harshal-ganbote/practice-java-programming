SELECT deptname AS department_name,
  ROUND(AVG(salary), 2) AS average_salary
FROM employee
  JOIN department USING (deptid)
GROUP BY deptid;