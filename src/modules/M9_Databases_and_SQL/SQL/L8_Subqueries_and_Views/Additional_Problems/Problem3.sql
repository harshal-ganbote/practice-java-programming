SELECT employee_id,
  first_name,
  last_name,
  job_id
FROM employees
WHERE department_id IN (
    SELECT department_id
    FROM departments
    WHERE location_id = (
        SELECT location_id
        FROM locations
        WHERE city = "Seattle"
      )
  )
ORDER BY employee_id;