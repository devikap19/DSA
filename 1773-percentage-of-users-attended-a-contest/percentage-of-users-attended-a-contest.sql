# Write your MySQL query statement below
SELECT b.contest_id , ROUND(
    COUNT(DISTINCT b.user_id) * 100 /
    (
        SELECT COUNT(user_id) FROM Users
    ) 
    ,2
)AS percentage
FROM Users a
JOIN Register b 
ON a.user_id = b.user_id
GROUP BY b.contest_id
ORDER BY percentage DESC, contest_id ASC;