SELECT name AS warehouse_name,
  SUM(units * Width * Length * Height) AS volume
FROM Warehouse
  JOIN Products USING (product_id)
GROUP BY name
ORDER BY name;