--
--
-- Create an Index based upon release year 
CREATE INDEX idx_release_year ON film(release_year);
--
--
CREATE INDEX idx_release_year_title ON film(release_year, title);
--
--
-- Run QUery (0.00074s) after indexing 
EXPLAIN ANALYZE
SELECT *
FROM film
WHERE release_year = 2023;
-- '-> Index lookup on film using idx_release_year 
-- (release_year=2023)  (cost=1.75 rows=5) (actual
-- time=0.0885..0.129 rows=5 loops=1)\n'
--
--
-- Title 
CREATE INDEX idx_film_title ON film(title(2));
EXPLAIN ANALYZE
SELECT *
FROM film
WHERE title = "'AFRICAN EGG'";