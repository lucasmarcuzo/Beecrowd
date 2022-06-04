--- Developed by: @LucasMarcuzo

select 
departamento.nome as "Departamento",
empregado.nome as "Empregado",
CASE
	WHEN coalesce(sum(vencimento.valor),0) > 0 THEN round(coalesce(sum(vencimento.valor),0),2)
    ELSE 0
END AS "Salario Bruto",
CASE
	WHEN coalesce(desconto.val_desc,0) > 0 THEN round(coalesce(desconto.val_desc,0),2)
    ELSE 0
END AS "Total Desconto",
CASE
	WHEN coalesce(sum(vencimento.valor),0) - coalesce(desconto.val_desc,0) > 0 THEN round(coalesce(sum(vencimento.valor),0) - coalesce(desconto.val_desc,0),2)
    ELSE 0
END AS "Salario Liquidoaws"
from emp_venc 
	right join empregado 
		on empregado.matr = emp_venc.matr 
	left join vencimento 
		on vencimento.cod_venc = emp_venc.cod_venc 
	left join departamento 
		on departamento.cod_dep = empregado.lotacao 
	left join (select empregado.matr, sum(desconto.valor) as val_desc
		from empregado 
			inner join emp_desc 
				on emp_desc.matr = empregado.matr 
			left join desconto 
				on desconto.cod_desc = emp_desc.cod_desc
			group by empregado.matr) as desconto 
				on desconto.matr = empregado.matr
group by departamento.nome, empregado.nome, desconto.val_desc, empregado.lotacao_div
order by (coalesce(sum(vencimento.valor),0) - coalesce(desconto.val_desc,0)) desc, lotacao_div desc