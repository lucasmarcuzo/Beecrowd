--- Developed by: @LucasMarcuzo

select temperature, count(mark) 
from records 
group by mark, temperature 
order by mark;