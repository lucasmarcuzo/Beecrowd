--- Developed by: @LucasMarcuzo

select life_registry.name, round((life_registry.omega * 1.618), 3) 
from life_registry 
inner join dimensions on life_registry.dimensions_id = dimensions.id 
where life_registry.name like '%Richard%' and dimensions.name in ('C774',  'C875')