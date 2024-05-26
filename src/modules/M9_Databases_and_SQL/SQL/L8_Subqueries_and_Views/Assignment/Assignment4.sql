SELECT employee_id,
  CONCAT(first_name, " ", last_name) AS full_name,
  salary
FROM employees
WHERE department_id IN (
    SELECT department_id
    FROM departments
    WHERE department_name IN ("Administration", "Marketing", "Human Resources")
  )
ORDER BY employee_id;