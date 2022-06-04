--- Developed by: @LucasMarcuzo

SELECT movies.id,movies.name 
FROM movies,prices 
WHERE movies.id_prices = prices.id AND prices.value < 2.0;