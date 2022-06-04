--- Developed by: @LucasMarcuzo

SELECT c.id, c.name
FROM customers as c
where not exists (SELECT l.id_customers 
				  from locations l 
				  where c.id = l.id_customers)