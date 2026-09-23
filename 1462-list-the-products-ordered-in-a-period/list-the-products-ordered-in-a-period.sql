# Write your MySQL query statement below
SELECT a.product_name , SUM(b.unit) AS unit
FROM Products a
JOIN Orders b
ON a.product_id = b.product_id 
WHERE MONTH(b.order_date) = 2 AND YEAR(b.order_date) = 2020
GROUP BY product_name
HAVING SUM(b.unit) >= 100;