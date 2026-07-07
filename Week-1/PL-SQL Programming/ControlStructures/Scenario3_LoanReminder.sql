SELECT CONCAT('Reminder: Dear ', customer_name, 
              ', your loan is due on ', loan_due_date) AS Loan_Reminder
FROM loans 
WHERE loan_due_date BETWEEN CURDATE() AND DATE_ADD(CURDATE(), INTERVAL 30 DAY);