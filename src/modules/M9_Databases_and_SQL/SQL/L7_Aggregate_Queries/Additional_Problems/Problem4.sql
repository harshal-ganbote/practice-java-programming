SELECT customer_id,
  customer_name
FROM customers
  JOIN orders USING (customer_id)
GROUP BY customer_id,
  customer_name
HAVING SUM(product_name = "Bread") > 0
  AND SUM(product_name = "Milk") > 0
  AND SUM(product_name = "Eggs") = 0
ORDER BY customer_name;