SELECT
    c1.queue AS "queue",
    c1.id AS "left",
    c2.id AS "right"
FROM
    chairs c1
    JOIN chairs c2 ON c1.queue = c2.queue AND c1.id + 1 = c2.id
WHERE
    c1.available = TRUE
    AND c2.available = TRUE
ORDER BY
    c1.queue, c1.id;
