SELECT original_title,
  genres,
  vote_average,
  revenue
FROM movies
WHERE release_year BETWEEN 2012 AND 2015
ORDER BY original_title;