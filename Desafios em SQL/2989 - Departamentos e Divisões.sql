SELECT
	d.nome AS "Departamento",
	divi.nome AS "Divisao",
	ROUND(AVG(tsalario.salario - tdescontos.descontos), 2) AS "Media",
	ROUND(MAX(tsalario.salario - tdescontos.descontos), 2) AS "Maior"
FROM
	departamento d
		INNER JOIN divisao divi ON d.cod_dep = divi.cod_dep
		INNER JOIN empregado emp ON divi.cod_divisao = emp.lotacao_div
		INNER JOIN (SELECT
						emp.matr,
						COALESCE(SUM(v.valor), 0) AS salario
					FROM
						empregado emp
							LEFT JOIN emp_venc ON emp.matr = emp_venc.matr
							LEFT JOIN vencimento v ON emp_venc.cod_venc = v.cod_venc
					GROUP BY
						emp.matr
					) AS tsalario ON emp.matr = tsalario.matr
		INNER JOIN (SELECT
						emp.matr,
						COALESCE(SUM(desconto.valor), 0) AS descontos
					FROM
						empregado emp
							LEFT JOIN emp_desc ON emp.matr = emp_desc.matr
							LEFT JOIN desconto ON emp_desc.cod_desc = desconto.cod_desc
					GROUP BY
						emp.matr
					) AS tdescontos ON emp.matr = tdescontos.matr
GROUP BY
	divi.cod_divisao,
	divi.nome,
	d.nome
ORDER BY
	AVG(tsalario.salario - tdescontos.descontos) DESC