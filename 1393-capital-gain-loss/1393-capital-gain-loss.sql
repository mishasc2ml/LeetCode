# Write your MySQL query statement below
SELECT stock_name, sell_qry - buy_qry  as capital_gain_loss
FROM (
    SELECT stock_name,
    (SELECT SUM(price) FROM Stocks WHERE stock_name = s.stock_name AND operation = 'Buy') AS buy_qry,
    (SELECT SUM(price) FROM Stocks WHERE stock_name = s.stock_name AND operation = 'Sell') AS sell_qry
    FROM Stocks s
    GROUP BY stock_name
) as stock_summary;


