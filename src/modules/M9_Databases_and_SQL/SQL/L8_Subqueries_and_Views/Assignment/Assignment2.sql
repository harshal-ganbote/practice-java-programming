SELECT name AS Customers
FROM customers
WHERE id NOT IN (
    SELECT cust_id
    FROM orders
  );