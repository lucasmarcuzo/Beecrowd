--- Developed by: @LucasMarcuzo

SELECT amount 
FROM value_table 
GROUP BY amount 
HAVING count(*) <= 12 
ORDER BY count(*) DESC 
LIMIT 1;