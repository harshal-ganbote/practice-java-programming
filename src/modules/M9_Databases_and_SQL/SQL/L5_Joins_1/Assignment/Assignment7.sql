SELECT DISTINCT c.title
FROM content c
  JOIN TVProgram tv ON c.content_id = tv.content_id
  AND c.kids_content = "Y"
  AND MONTH(tv.Program_date) = 6
  AND YEAR(tv.Program_date) = 2020
ORDER BY c.title;