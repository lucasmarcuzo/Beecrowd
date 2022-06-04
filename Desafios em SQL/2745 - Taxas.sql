--- Developed by: @LucasMarcuzo

select name, round((salary * 0.10),2) as tax 
from people 
where salary >= 3000;