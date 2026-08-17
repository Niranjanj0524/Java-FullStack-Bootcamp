CREATE DATABASE Day48_SQL_Practice;

USE Day48_SQL_Practice;

CREATE TABLE Department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50) NOT NULL
);

CREATE TABLE Student (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(50) NOT NULL,
    city VARCHAR(50),
    age INT,
    email VARCHAR(100),
    dept_id INT,
    fees DECIMAL(10,2),
    FOREIGN KEY (dept_id) REFERENCES Department(dept_id)
);

INSERT INTO Department (dept_id, dept_name)
VALUES
(101, 'Computer Science'),
(102, 'Information Technology'),
(103, 'Electronics'),
(104, 'Mechanical');

INSERT INTO Student
(student_id, student_name, city, age, email, dept_id, fees)
VALUES
(1, 'Amit', 'Pune', 21, 'amit@gmail.com', 101, 55000),
(2, 'Rahul', 'Mumbai', 22, 'rahul@gmail.com', 102, 60000),
(3, 'Sneha', 'Pune', 20, 'sneha@gmail.com', 101, 52000),
(4, 'Priya', 'Nashik', 23, 'priya@gmail.com', 103, 65000),
(5, 'Rohan', 'Mumbai', 19, 'rohan@gmail.com', 102, 48000),
(6, 'Neha', 'Pune', 22, 'neha@gmail.com', 101, 57000),
(7, 'Akash', 'Nashik', 20, '103ak@gmail.com', 103, 51000),
(8, 'Pooja', 'Mumbai', 21, 'pooja@gmail.com', 102, 59000),
(9, 'Vikas', 'Pune', 24, 'vikas@gmail.com', 101, 70000),
(10, 'Anita', 'Nashik', 19, 'anita@gmail.com', 103, 49000);

CREATE VIEW Pune_Students1 AS
SELECT student_id, student_name, age, fees
FROM Student
WHERE city = 'Pune';

SELECT * FROM pune_students1;

CREATE View view_1 AS
SELECT student_name, city, fees
FROM Student
WHERE fees > 55000;

SELECT * FROM view_1;

CREATE VIEW Student_Department AS
SELECT s.student_name, d.dept_name
FROM Student s
JOIN Department d ON s.dept_id = d.dept_id;

SELECT * FROM Student_Department;

CREATE OR REPLACE VIEW pune_students1 AS 
SELECT student_id, student_name, city, age
FROM Student WHERE city='Pune';

SELECT * FROM pune_students1;

CREATE VIEW Students_Above_20 AS
SELECT *
FROM Student
WHERE age > 20;

DROP View students_above_20;

CREATE INDEX idx_student_city ON Student(city);

SHOW INDEX FROM Student;

CREATE INDEX idx_city_age ON Student(city, age);

CREATE UNIQUE INDEX idx_student_email ON Student(email);

DROP INDEX idx_city_age ON Student;

SELECT student_id, student_name, city
FROM Student
WHERE city = 'Pune'
LIMIT 5;

CREATE VIEW High_Fee_Students AS
SELECT student_id, student_name, city, fees
FROM Student
WHERE fees > 55000;

CREATE INDEX idx_student_city1 ON Student(city);

SELECT student_name, city, fees
FROM High_Fee_Students
LIMIT 5;