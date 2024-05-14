SELECT original_title,
  popularity
FROM movies
WHERE genres = "Horror"
ORDER BY popularity DESC;