-- 1. Perform the operation
BEGIN TRANSACTION;
UPDATE accounts SET balance = balance - 100 WHERE account_id = 1;
UPDATE accounts SET balance = balance + 100 WHERE account_id = 2;
COMMIT;

-- 2. THIS IS THE "PRINT" STATEMENT
-- It will show up as a new column in your result table
SELECT 'Transfer completed successfully' AS Status_Message;

-- 3. Show the new data so you can verify it
SELECT * FROM accounts;