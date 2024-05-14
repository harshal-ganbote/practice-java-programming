SELECT movie_title
FROM Movies
WHERE release_year >= 2000
  AND genre = "Sci-Fi"
  OR genre = "Action"
ORDER BY movie_id;