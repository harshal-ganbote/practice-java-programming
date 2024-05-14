SELECT orderNumber,
  productCode,
  ROUND((quantityOrdered * priceEach), 2) AS sub_total
FROM orderdetails
ORDER BY orderNumber ASC,
  sub_total DESC;