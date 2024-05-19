SELECT emp.employee_id,
  d.department_name,
  j.job_id,
  j.job_title,
  j.min_salary
FROM employees emp
  JOIN departments d ON emp.department_id = d.department_id
  JOIN job_history jh ON emp.employee_id = jh.employee_id
  JOIN jobs j ON jh.job_id = j.job_id
  AND j.job_title LIKE "%sales%"
  AND j.min_salary >= 6000
ORDER BY emp.employee_id,
  j.min_salary;