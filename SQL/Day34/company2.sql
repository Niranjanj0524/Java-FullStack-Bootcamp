CREATE DATABASE company2;

USE company2;
CREATE Table employee(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(30),
    salary DECIMAL(10,2),
    city VARCHAR(20)
);

INSERT INTO employee(name,department,salary,city)
VALUES
('Niranjan','CS',40000.0,'Solapur'),
('Varad','IT',60000.0,'Kolhapur'),
('Aman','HR',66000.90,'Amaravati'),
('Vivek','CS',7000.20,'Jalgoan'),
('Om','CS',90000.0,'Solapur'),
('Yash','IT',4000.0,'Solapur');


SELECT * FROM employee;
SELECT COUNT(*) FROM employee;

SELECT SUM(salary) FROM employee;

SELECT AVG(salary) FROM employee;

SELECT MAX(salary) FROM employee;

SELECT MIN(salary) FROM employee;

SELECT DISTINCT city FROM employee;

SELECT department,
COUNT(*) FROM employee
GROUP BY department;

SELECT COUNT(id) AS total_employees 
FROM employee;

SELECT department, COUNT(id) AS employee_count
FROM employee
GROUP BY department
HAVING COUNT(id) > 1;

