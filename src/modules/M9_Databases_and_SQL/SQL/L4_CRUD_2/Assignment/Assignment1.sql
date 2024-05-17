SELECT original_title,
  tagline,
  director
FROM movies
ORDER BY popularity DESC
LIMIT 5;