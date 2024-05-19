SELECT s.user_id,
  SUM(s.quantity * p.price) AS spending
FROM sales s
  JOIN product p ON s.product_id = p.product_id
GROUP BY s.user_id
ORDER BY SUM(s.quantity * p.price) DESC,
  s.user_id;