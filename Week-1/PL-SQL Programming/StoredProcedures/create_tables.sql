CREATE TABLE IF NOT EXISTS accounts (
    account_id INTEGER PRIMARY KEY,
    customer_name TEXT,
    balance REAL
);

-- Only insert if they don't exist
INSERT OR IGNORE INTO accounts VALUES (1, 'Keerthika', 5000);
INSERT OR IGNORE INTO accounts VALUES (2, 'Student', 1000);