UPDATE customers 
SET IsVIP = 'TRUE' 
WHERE balance > 10000;

-- This will show you the updated VIPs
SELECT * FROM customers WHERE IsVIP = 'TRUE';