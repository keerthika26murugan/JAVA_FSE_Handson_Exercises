UPDATE customers 
SET interest_rate = interest_rate - 0.01 
WHERE age > 60;

-- This will show you the updated data
SELECT * FROM customers WHERE age > 60;