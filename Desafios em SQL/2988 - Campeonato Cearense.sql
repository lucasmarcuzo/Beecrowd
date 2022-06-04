-- Developed by: @LucasMarcuzo

SELECT teams.name, count(matches.team_1 + matches.team_2) AS matches,
	SUM(CASE
        WHEN (matches.team_1_goals > matches.team_2_goals AND teams.id = matches.team_1)
		OR (matches.team_2_goals > matches.team_1_goals AND teams.id = matches.team_2) THEN 1 ELSE 0 END) AS victories,
    SUM(CASE
        WHEN (matches.team_1_goals < matches.team_2_goals AND teams.id = matches.team_1)
		OR (matches.team_2_goals < matches.team_1_goals AND teams.id = matches.team_2) THEN 1 ELSE 0 END) AS defeats,
  SUM(CASE
	    WHEN (matches.team_1_goals = matches.team_2_goals AND teams.id = matches.team_1)
		OR (matches.team_2_goals = matches.team_1_goals AND teams.id = matches.team_2) THEN 1 ELSE 0 END) AS draws,
  SUM(CASE
        WHEN (matches.team_1_goals = matches.team_2_goals AND teams.id = matches.team_1)
		OR (matches.team_2_goals = matches.team_1_goals AND teams.id = matches.team_2) THEN 1 ELSE 0 END) + 
  SUM(CASE
        WHEN (matches.team_1_goals > matches.team_2_goals AND teams.id = matches.team_1)
		OR (matches.team_2_goals > matches.team_1_goals AND teams.id = matches.team_2) THEN 3 ELSE 0 END) AS score
FROM matches, teams 
WHERE teams.id = matches.team_1 OR teams.id = matches.team_2
GROUP BY teams.name 
ORDER BY score desc;
