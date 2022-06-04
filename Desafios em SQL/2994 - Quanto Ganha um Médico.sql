--- Developed by: @LucasMarcuzo

select doctors.name, round(sum((attendances.hours * 150) + ((attendances.hours * 150) * work_shifts.bonus) / 100),1) as salary 
from attendances 
inner join doctors 
on doctors.id = attendances.id_doctor 
inner join work_shifts 
on work_shifts.id = attendances.id_work_shift 
group by doctors.name 
order by salary desc;