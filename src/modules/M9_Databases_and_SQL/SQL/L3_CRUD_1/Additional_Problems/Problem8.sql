SELECT customer_name
FROM Customers
WHERE last_purchase_date < "2023-01-01"
ORDER BY customer_id;