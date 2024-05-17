SELECT original_title,
  director,
  genres,
  cast,
  budget,
  revenue,
  runtime,
  vote_average
FROM movies
WHERE keywords LIKE "%sport%"
  OR keywords LIKE "%sequel%"
  OR keywords LIKE "%suspense%"
ORDER BY original_title;