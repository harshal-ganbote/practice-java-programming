SELECT *
FROM employees
WHERE employee_id NOT IN (
    SELECT employee_id
    FROM job_history
  )
ORDER BY employee_id;