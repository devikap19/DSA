# Write your MySQL query statement below
(SELECT a.name AS results 
FROM Users a
INNER JOIN MovieRating b 
ON a.user_id = b.user_id
GROUP BY name 
ORDER BY COUNT(*) DESC , name
LIMIT 1)

UNION ALL
(
SELECT a.title
FROM Movies a
INNER JOIN MovieRating b
ON a.movie_id = b.movie_id
WHERE MONTH(b.created_at) = 2 AND YEAR(b.created_at) = 2020
GROUP BY a.movie_id 
ORDER BY AVG(rating) DESC, a.title
LIMIT 1
);
