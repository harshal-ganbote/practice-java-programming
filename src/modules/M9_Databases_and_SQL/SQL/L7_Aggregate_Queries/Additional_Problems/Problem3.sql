SELECT dept_name,
  COUNT(student_id) AS student_number
FROM department
  LEFT JOIN student USING (dept_id)
GROUP BY dept_name
ORDER By student_number DESC,
  dept_name;