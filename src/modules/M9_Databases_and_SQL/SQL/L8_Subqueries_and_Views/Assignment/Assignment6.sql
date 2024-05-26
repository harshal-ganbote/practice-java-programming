SELECT name
FROM salesperson
WHERE sales_id != (
    SELECT sales_id
    FROM orders o
      JOIN company c ON o.com_id = c.com_id
      AND name = "RED"
  )
ORDER BY name;