SELECT original_title
FROM movies
WHERE release_year > 2014
  AND vote_average > 7
ORDER BY original_title;