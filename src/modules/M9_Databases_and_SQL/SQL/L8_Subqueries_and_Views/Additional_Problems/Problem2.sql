SELECT candidate_id
FROM candidates
WHERE skill in ("Python", "Tableau", "MySQL")
GROUP BY candidate_id
HAVING COUNT(*) = 3
ORDER BY candidate_id;