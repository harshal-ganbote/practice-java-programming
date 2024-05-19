SELECT emp.employee_id,
  d.department_id,
  emp.first_name,
  emp.last_name,
  emp.job_id,
  d.department_name
FROM employees emp
  JOIN departments d ON emp.department_id = d.department_id
  AND d.department_name = "Human Resources"
ORDER BY emp.employee_id;