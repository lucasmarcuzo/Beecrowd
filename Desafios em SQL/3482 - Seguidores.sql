--- Developed by: @LucasMarcuzo

SELECT
  LEAST(u1.user_name, u2.user_name) AS u1_name,
  GREATEST(u1.user_name, u2.user_name) AS u2_name
FROM
  followers f
  JOIN users u1 ON f.user_id_fk = u1.user_id
  JOIN users u2 ON f.following_user_id_fk = u2.user_id
WHERE
  (u1.user_id, u2.user_id) IN (
    SELECT
      user_id_fk AS user_id1,
      following_user_id_fk AS user_id2
    FROM
      followers
    
    UNION ALL
    
    SELECT
      following_user_id_fk AS user_id1,
      user_id_fk AS user_id2
    FROM
      followers
  )
  AND u1.posts < u2.posts
ORDER BY
  u1.user_id;
