SELECT *
FROM Customers
WHERE (
    first_name = "John"
    OR last_name = "Smith"
  )
  AND NOT CONCAT(first_name, last_name) = "JohnSmith"
ORDER BY customer_id;
select *
from Customers
where first_name = "John"
  and last_name != "Smith"
  or first_name != "John"
  and last_name = "Smith";