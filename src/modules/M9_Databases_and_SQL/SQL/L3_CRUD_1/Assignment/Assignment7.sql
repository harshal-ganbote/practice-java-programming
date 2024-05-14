SELECT name,
  population,
  area
FROM world
WHERE area > 300000
  AND population > 20000000
ORDER BY population;