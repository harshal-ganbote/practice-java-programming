SELECT DISTINCT emp.employee_name
FROM Employees emp
  JOIN Sales s ON emp.employee_id = s.employee_id
  JOIN Products p ON s.product_id = p.product_id
  AND p.product_name = "Laptop"
ORDER BY emp.employee_name;