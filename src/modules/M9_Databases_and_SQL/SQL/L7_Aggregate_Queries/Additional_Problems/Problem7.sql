SELECT product_id,
  ROUND(SUM(price * units) / SUM(units), 2) AS average_price
FROM prices
  JOIN unitsSold USING (product_id)
WHERE purchase_date BETWEEN start_date AND end_date
GROUP BY product_id
ORDER BY product_id;