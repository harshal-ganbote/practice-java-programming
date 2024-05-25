SELECT c.firstname
FROM candidate c
  JOIN vote v ON c.id = v.candidateId
GROUP BY c.id
ORDER BY COUNT(*) DESC
LIMIT 1;