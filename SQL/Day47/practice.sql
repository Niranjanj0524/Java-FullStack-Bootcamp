CREATE DATABASE Day47_SQL_Practice;

USE Day47_SQL_Practice;

CREATE TABLE Employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50) NOT NULL,
    salary DECIMAL(10,2),
    department VARCHAR(50),
    manager_id INT
);

CREATE TABLE Department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50) NOT NULL
);

CREATE TABLE Student (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(50) NOT NULL,
    age INT,
    city VARCHAR(50),
    dept_id INT,
    fees DECIMAL(10,2)
);

CREATE TABLE Course (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(50)
);

INSERT INTO Employee
(emp_id, emp_name, salary, department, manager_id)
VALUES
(1, 'Amit', 80000, 'IT', NULL),
(2, 'Rahul', 60000, 'IT', 1),
(3, 'Sneha', 65000, 'IT', 1),
(4, 'Priya', 55000, 'HR', 2),
(5, 'Rohan', 50000, 'HR', 2),
(6, 'Neha', 70000, 'Finance', 1);

INSERT INTO Department
(dept_id, dept_name)
VALUES
(101, 'Computer Science'),
(102, 'Information Technology'),
(103, 'Electronics');

INSERT INTO Student
(student_id, student_name, age, city, dept_id, fees)
VALUES
(1, 'Anita', 19, 'Pune', 101, 50000),
(2, 'Rahul', 22, 'Mumbai', 102, 60000),
(3, 'Sneha', 20, 'Pune', 101, 52000),
(4, 'Priya', 24, 'Nashik', 103, 70000),
(5, 'Rohan', 21, 'Mumbai', 102, 58000),
(6, 'Vikas', 25, 'Pune', 101, 75000);

INSERT INTO Course
(course_id, course_name)
VALUES
(1, 'Java'),
(2, 'SQL'),
(3, 'Python');


CREATE TABLE Employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50) NOT NULL,
    salary DECIMAL(10,2),
    department VARCHAR(50),
    manager_id INT
);

CREATE TABLE Department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50) NOT NULL
);

CREATE TABLE Student (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(50) NOT NULL,
    age INT,
    city VARCHAR(50),
    dept_id INT,
    fees DECIMAL(10,2)
);

CREATE TABLE Course (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(50)
);

INSERT INTO Employee
(emp_id, emp_name, salary, department, manager_id)
VALUES
(1, 'Amit', 80000, 'IT', NULL),
(2, 'Rahul', 60000, 'IT', 1),
(3, 'Sneha', 65000, 'IT', 1),
(4, 'Priya', 55000, 'HR', 2),
(5, 'Rohan', 50000, 'HR', 2),
(6, 'Neha', 70000, 'Finance', 1);

INSERT INTO Department
(dept_id, dept_name)
VALUES
(101, 'Computer Science'),
(102, 'Information Technology'),
(103, 'Electronics');

INSERT INTO Student
(student_id, student_name, age, city, dept_id, fees)
VALUES
(1, 'Anita', 19, 'Pune', 101, 50000),
(2, 'Rahul', 22, 'Mumbai', 102, 60000),
(3, 'Sneha', 20, 'Pune', 101, 52000),
(4, 'Priya', 24, 'Nashik', 103, 70000),
(5, 'Rohan', 21, 'Mumbai', 102, 58000),
(6, 'Vikas', 25, 'Pune', 101, 75000);

INSERT INTO Course
(course_id, course_name)
VALUES
(1, 'Java'),
(2, 'SQL'),
(3, 'Python');

SELECT e.emp_name AS employee_name, m.emp_name AS manager_name
FROM Employee e
JOIN Employee m ON e.manager_id = m.emp_id;

SELECT e.emp_name AS employee, m.emp_name AS manager
FROM Employee e
INNER JOIN Employee m ON e.manager_id = m.emp_id;

SELECT e.emp_name FROM Employee e
JOIN Employee m ON e.manager_id = m.emp_id
WHERE m.emp_name='Amit';

SELECT e.emp_name, e.salary, m.emp_name AS manager_name
FROM Employee e
JOIN Employee m ON e.manager_id = m.emp_id;

SELECT e.emp_name AS employee, m.emp_name AS manager
FROM Employee e
JOIN Employee m ON e.manager_id = m.emp_id
ORDER BY m.emp_name ASC;

SELECT e.emp_name
FROM Employee e
JOIN Employee m ON e.manager_id = m.emp_id
WHERE e.salary > m.salary;

SELECT * 
FROM Student
CROSS JOIN Course;

SELECT COUNT(*) AS total_combinations
FROM Student
CROSS JOIN Course;

SELECT * 
FROM Student 
WHERE age > (SELECT AVG(age) FROM Student);

SELECT * 
FROM Student 
WHERE fees = (SELECT MAX(fees) FROM Student);

SELECT * 
FROM Student 
WHERE dept_id = (SELECT dept_id FROM Department WHERE dept_id = 101);

SELECT d.dept_name 
FROM Department d
WHERE EXISTS (
    SELECT 1 
    FROM Student s 
    WHERE s.dept_id = d.dept_id
);

SELECT * 
FROM Student 
WHERE fees > (SELECT fees FROM Student WHERE student_name = 'Anita');

SELECT student_name, age, fees
FROM Student
WHERE age > (SELECT AVG(age) FROM Student)
  AND fees > (SELECT AVG(fees) FROM Student);
