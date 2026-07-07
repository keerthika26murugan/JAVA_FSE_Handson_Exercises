-- Create the tables
CREATE TABLE customers (
    customer_id INTEGER PRIMARY KEY,
    customer_name TEXT,
    age INTEGER,
    interest_rate REAL,
    balance REAL,
    IsVIP TEXT
);

CREATE TABLE loans (
    customer_name TEXT,
    loan_due_date DATE
);

-- Insert sample data to test your scenarios
INSERT INTO customers VALUES (1, 'Keerthika', 65, 0.05, 12000, 'FALSE');
INSERT INTO customers VALUES (2, 'Student', 25, 0.04, 5000, 'FALSE');
INSERT INTO loans VALUES ('Keerthika', '2026-07-05');