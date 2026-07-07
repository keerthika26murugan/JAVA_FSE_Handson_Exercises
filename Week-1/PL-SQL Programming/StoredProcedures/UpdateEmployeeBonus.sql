-- Replace 'Sales' and 0.05 with your specific department and bonus %
UPDATE employees 
SET salary = salary + (salary * 0.05)
WHERE department = 'Sales';

SELECT * FROM employees;