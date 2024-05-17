SELECT product_id
FROM products
WHERE low_fats = "Y"
  AND recyclable = "Y"
ORDER BY product_id;