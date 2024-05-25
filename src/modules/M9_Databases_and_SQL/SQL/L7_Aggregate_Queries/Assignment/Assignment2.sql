SELECT department_id,
  AVG(salary) AS avg_employee_salary
FROM employees
GROUP BY department_id
ORDER BY avg_employee_salary DESC,
  department_id;