SELECT order_id
FROM Orders
WHERE customer_id = 1
  AND (
    order_status = "Shipped"
    OR order_status = "Delivered"
  )
ORDER BY order_id;