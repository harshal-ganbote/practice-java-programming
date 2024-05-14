SELECT *
FROM Products
WHERE (
    category = "Electronics"
    AND price > 500
  )
  OR (
    category = "Apparel"
    AND price < 50
  )
ORDER BY product_id;