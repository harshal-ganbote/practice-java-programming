SELECT a.city
FROM address a
  RIGHT JOIN person p ON a.personId = p.personId
ORDER BY a.city;