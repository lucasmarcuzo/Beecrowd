--- Developed by: @LucasMarcuzo

WITH NodeTypes AS (
  SELECT
    distinct node_id,
    CASE
      WHEN node_id = 50 THEN 'ROOT'
      WHEN pointer IS NULL AND node_id IS NOT NULL THEN 'LEAF'
      WHEN pointer IS NOT NULL AND node_id IS NOT NULL THEN 'INNER'
    END AS type
  FROM nodes
)

SELECT
  node_id,
  type
FROM NodeTypes
ORDER BY
  node_id;
