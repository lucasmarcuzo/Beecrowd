--- Developed by: @LucasMarcuzo

(
select concat('Podium: ', team) as name from league order by position asc limit 3
)
UNION ALL
(
select concat('Demoted: ', team) as name from league where position in(14,15)
)
