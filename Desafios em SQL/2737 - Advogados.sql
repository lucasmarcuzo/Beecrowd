--- Developed by: @LucasMarcuzo

(
select lawyers.name, lawyers.customers_number
from lawyers
order by lawyers.customers_number desc
limit 1
)
UNION ALL
(
select lawyers.name, lawyers.customers_number
from lawyers
order by lawyers.customers_number asc
limit 1 
)
UNION ALL
(
select 'Average', round(avg(lawyers.customers_number))
from lawyers
)