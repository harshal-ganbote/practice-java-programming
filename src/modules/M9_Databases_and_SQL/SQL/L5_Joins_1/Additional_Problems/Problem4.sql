SELECT p.product_name,
  s.sale_amount
FROM Sales s
  JOIN Products p ON s.product_id = p.product_id
ORDER By s.sale_amount DESC
LIMIT 2;