# Write your MySQL query statement below
SELECT  CONCAT_WS('-',YEAR(trans_date),LPAD(MONTH(trans_date),2,0)) AS month , 
country , 
COUNT(state)AS trans_count,
SUM(IF(state = 'approved',1, 0)) AS approved_count, 
SUM(amount) AS trans_total_amount, 
SUM(IF(state = 'approved',amount,0)) AS approved_total_amount
FROM Transactions
GROUP BY month, country;