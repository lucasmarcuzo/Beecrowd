--- Developed by: @LucasMarcuzo

select ctg.name, sum(pro.amount) as sum
from products as pro
inner join categories as ctg
on pro.id_categories = ctg.id
where pro.id_categories = ctg.id
group by ctg.name;