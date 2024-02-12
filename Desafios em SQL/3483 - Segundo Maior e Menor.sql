--- Developed by: @LucasMarcuzo

(SELECT city_name, population
FROM cities
ORDER BY population desc
LIMIT 1 OFFSET 1)
UNION
(SELECT city_name, population
FROM cities
ORDER BY population asc
LIMIT 1 OFFSET 1)
order by city_name desc