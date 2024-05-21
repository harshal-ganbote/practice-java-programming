SELECT c.name AS Customers
FROM Orders o
  RIGHT JOIN Customers c ON o.customerId = c.id
WHERE o.customerId IS NULL
ORDER BY c.name;