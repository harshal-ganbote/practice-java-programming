SELECT CONCAT(first_name, " ", last_name) AS full_name
FROM employees
WHERE employee_id IN (
    SELECT manager_id
    FROM employees
    GROUP BY manager_id
    HAVING COUNT(employee_id) >= 4
  )
ORDER BY full_name;