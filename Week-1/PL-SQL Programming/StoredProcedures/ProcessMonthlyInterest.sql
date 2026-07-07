-- This simulates the 'stored procedure' logic
UPDATE customers 
SET balance = balance + (balance * 0.01)
WHERE IsVIP = 'FALSE'; -- Assuming interest only for standard accounts

SELECT * FROM customers;