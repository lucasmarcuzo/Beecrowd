SELECT
	*
FROM
	(SELECT
		dep.nome,	
		div.nome AS Divisao,
		ROUND(AVG(tsalario.salario - tdescontos.descontos), 2) AS Media
	FROM
		divisao div
			INNER JOIN empregado emp ON div.cod_divisao = emp.lotacao_div
			INNER JOIN departamento dep ON div.cod_dep = dep.cod_dep
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
	WHERE
		div.cod_dep = 1 AND dep.cod_dep = 1
	GROUP BY
		div.cod_divisao, dep.nome, div.nome
	ORDER BY
		AVG(tsalario.salario - tdescontos.descontos) DESC
    LIMIT 1) AS T
UNION ALL
SELECT
	*
FROM
	(SELECT
		dep.nome,	
		div.nome AS Divisao,
		ROUND(AVG(tsalario.salario - tdescontos.descontos), 2) AS Media
	FROM
		divisao div
			INNER JOIN empregado emp ON div.cod_divisao = emp.lotacao_div
			INNER JOIN departamento dep ON div.cod_dep = dep.cod_dep
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
	WHERE
		div.cod_dep = 2 AND dep.cod_dep = 2
	GROUP BY
		div.cod_divisao, dep.nome, div.nome
	ORDER BY
		AVG(tsalario.salario - tdescontos.descontos) DESC
    LIMIT 1) AS T
UNION ALL
SELECT
	*
FROM
	(SELECT
		dep.nome,	
		div.nome AS Divisao,
		ROUND(AVG(tsalario.salario - tdescontos.descontos), 2) AS Media
	FROM
		divisao div
			INNER JOIN empregado emp ON div.cod_divisao = emp.lotacao_div
			INNER JOIN departamento dep ON div.cod_dep = dep.cod_dep
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
	WHERE
		div.cod_dep = 3 AND dep.cod_dep = 3
	GROUP BY
		div.cod_divisao, dep.nome, div.nome
	ORDER BY
		AVG(tsalario.salario - tdescontos.descontos) DESC
    LIMIT 1) AS T
ORDER BY
	Media DESC