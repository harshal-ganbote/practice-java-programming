SELECT customerName,
  phone,
  addressLine1,
  city,
  state,
  postalCode
FROM customers
WHERE country != "Germany"
ORDER BY customerName;