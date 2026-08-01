-- Create Database
CREATE DATABASE company;

-- Use the database
USE company;

-- Create Employee Table
CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    name VARCHAR(100),
    salary DECIMAL(10,2),
    department VARCHAR(50)
);

--  Insert 5 Employee Records
INSERT INTO employee (emp_id, name, salary, department)
VALUES
(101, 'Niranjan', 50000.00, 'IT'),
(102, 'Varad', 45000.00, 'HR'),
(103, 'Vivek', 55000.00, 'Finance'),
(104, 'Aman', 60000.00, 'Marketing'),
(105, 'Rohit', 48000.00, 'Sales');

-- Display all records
SELECT * FROM employee;

-- Display Only Employee Name and Salary
SELECT name, salary
FROM employee;

-- Update One Employee's Salary
UPDATE employee
SET salary = 65000.00
WHERE emp_id = 103;

-- Verify the update
SELECT * FROM employee;

-- Delete One Employee
DELETE FROM employee
WHERE emp_id = 105;

-- Verify the deletion
SELECT * FROM employee;