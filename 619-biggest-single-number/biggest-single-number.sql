# Write your MySQL query state
   SELECT max(num)AS num
    FROM  (SELECT num 
    FROM Mynumbers
    GROUP BY num
    HAVING COUNT(num) = 1
    ORDER BY num DESC
    LIMIT 1) t;