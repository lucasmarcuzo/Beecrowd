--- Developed by: @LucasMarcuzo

select products.name, providers.name, products.price from products 
inner join providers on products.id_providers = providers.id 
inner join categories on products.id_categories = categories.id 
where categories.name = 'Super Luxury' and products.price > 1000;