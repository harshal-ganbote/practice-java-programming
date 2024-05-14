-- Write an SQL query to report the unique customers with 
-- positive revenue in the year 2021.
--
-- Note: Use distinct operator to get unique values.
--
--
SELECT DISTINCT customer_id
FROM Customers
WHERE revenue > 0
  AND year = 2021