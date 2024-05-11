--
-- Inserting into the database
INSERT INTO film (
    title,
    description,
    release_year,
    language_id,
    rental_duration,
    rental_rate,
    length,
    replacement
  )
VALUES (
    'The Moon Night',
    'Batman fights the Joker',
    2028,
    1,
    3,
    4.99,
    152,
    19.99,
    'PG-13',
    'Trailers'
  ),
  (
    'Bahubali',
    'Bahubali fights the Evil',
    2023,
    1,
    3,
    4.99,
    152,
    19.99,
    'PG-13',
    'Trailers'
  ),
  (
    'KGF',
    'KGF fights the Joker',
    2024,
    1,
    3,
    4.99,
    152,
    19.99,
    'PG-13',
    'Trailers'
  );
--
-- Inserting into the database
INSERT INTO film (
    title,
    description,
    release_year,
    language_id,
    rental_duration,
    rental_rate,
    length,
    replacement
  )
VALUES (
    'The Sun&moon',
    'Batman fights the Joker',
    2028,
    1,
    3,
    4.99,
    152,
    19.99,
    'PG-13',
    'Trailers',
    NOW()
  ),
  (
    'Bahubali-II',
    'Bahubali fights the Evil',
    2023,
    1,
    3,
    4.99,
    152,
    19.99,
    'PG-13',
    'Trailers',
    default
  );
-- 21:32:44 default Error Code: 1064. You have an error in your SQL syntax;
-- Show all movies
SELECT *
FROM film;
--
--
SELECT NOW();
--
-- READING
SELECT *
FROM film;
--
-- Reading few columns
SELECT film_id,
  title,
  release_year,
  length
FROM film;
--
--
SELECT film_id,
  title,
  release_year,
  ROUND(length / 60, 2) AS Duration
FROM film;
--
-- Math Operations
SELECT "Hello",
  ROUND(10 / 3, 2);
--
SELECT POW(5,3);
--
-- Distinct Keyword
SELECT DISTINCT release_year
FROM film;
--
-- Distinct Keyword with multiple columns (distinct only considers non-null values)
SELECT DISTINCT rating,
  release_year
FROM film;
--
-- Count unique ratings
SELECT DISTINCT rating
FROM film;
--
-- later in aggregate queries
SELECT COUNT(DISTINCT rating) AS "Unique Ratings Count"
FROM film;
-- WHERE clause
SELECT *
FROM film
WHERE length <= 60;
-- specific movie, USE "WHERE BINARY" for case-sensitive search
SELECT title,
  description
FROM film
WHERE title = "ALIEN CENTER";
SELECT title,
  description
FROM film
WHERE BINARY title = "Alien CENTER";
-- Todo Practice
-- Print actors where first name is "ED" or "BOB"
-- Print all payments done before 2005-06-15
-- AND, OR, NOT
SELECT *
FROM actor
WHERE first_name = 'ED'
  OR first_name = 'BOB';
-- Payment Table
SELECT *
FROM payment
WHERE payment_date < "2005-06-15";
-- AND
-- Sample Query: Select movies from 2006 AND they must have rating=g
SELECT *
FROM film
WHERE release_year = 2006
  AND rating = 'G';
SELECT *
FROM film
WHERE release_year = 2006
  OR rating = 'G';
-- NOT !=
SELECT *
FROM film
WHERE release_year != 2006
  AND rating != 'G';
-- NOT <>
SELECT *
FROM film
WHERE release_year <> 2006
  AND rating <> 'G';
-- NOT
SELECT *
FROM film
WHERE NOT release_year = 2006
  AND NOT rating = 'G';
SELECT *
FROM film
WHERE NOT (
    release_year = 2006
    OR rating = 'G'
  );
-- IN Operator
-- movies release in 2023, 2024, 2028
SELECT *
FROM film
WHERE release_year = 2023
  OR release_year = 2024
  OR release_year = 2028;
SELECT *
FROM film
WHERE release_year IN (2023, 2024, 2028)
  AND rating = 'PG';
# Sample Queries (Homework)
-- Insert Hindi, Tamil as languages in the language table
-- Find out distinct film_id, store_id from the inventor table
-- Count the total number of unique actors across all films
-- Print all cities of Brazil using the city table
INSERT INTO language
VALUES (9, "Marathi", NOW());
--
SELECT DISTINCT film_id,
store_id
FROM inventory;
--
SELECT count(*)
from actor;
--
SELECT *
from city
WHERE country_id = 15;