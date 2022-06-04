--- Developed by: @LucasMarcuzo

select products.name 
from products 
inner join providers 
on providers.id = products.id_providers 
where providers.name like '%P%' and amount between 10 and 20;