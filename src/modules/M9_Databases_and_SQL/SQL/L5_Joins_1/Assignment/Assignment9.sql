SELECT s.sale_id,
  p.product_name,
  c.customer_name,
  emp.employee_name,
  s.sale_amount
FROM Sales s
  JOIN Products p ON s.product_id = p.product_id
  JOIN Customers c ON s.customer_id = c.customer_id
  JOIN Employees emp ON s.employee_id = emp.employee_id
ORDER BY s.sale_amount DESC;