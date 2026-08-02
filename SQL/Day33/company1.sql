USE company1;

CREATE TABLE employee1 (
    emp_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE,
    salary DECIMAL(10,2) CHECK (salary > 0),
    country VARCHAR(20) DEFAULT 'INDIA',
    age INT CHECK (age >= 18)
);

INSERT INTO employee (name, email, salary, age)
VALUES
('Niranjan','niranjan@gmail.com',60000.90,22),
('Varad','varad@gmail.com',70000.99,20),
('Vivek','vivek@gmail.com',7000.00,21),
('Aman','aman@gmail.com',67000.77,21);

SELECT * FROM employee;

SELECT * FROM employee
WHERE salary > 68000;

SELECT * FROM employee
WHERE age >= 22
AND country = 'INDIA';

SELECT * FROM employee
ORDER BY salary DESC;

SELECT * FROM employee
LIMIT 3;