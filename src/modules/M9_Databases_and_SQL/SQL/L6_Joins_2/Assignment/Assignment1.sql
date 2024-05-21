SELECT d.department_id,
  d.department_name
FROM departments d
  LEFT JOIN employees emp ON d.department_id = emp.department_id
WHERE emp.department_id IS NULL
ORDER BY d.department_id;