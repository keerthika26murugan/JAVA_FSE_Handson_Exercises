SELECT 'Reminder: Dear ' || customer_name || ', your loan is due on ' || loan_due_date AS Loan_Reminder
FROM loans
WHERE loan_due_date BETWEEN date('now') AND date('now', '+30 days');