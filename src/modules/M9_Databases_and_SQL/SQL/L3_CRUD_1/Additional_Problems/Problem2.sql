SELECT employee_id,
  first_name,
  job_id,
  department_id
FROM employees
WHERE department_id IN (30, 40, 90)
ORDER BY employee_id;