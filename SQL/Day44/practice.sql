-- CREATE DATABASE Day44_SQL_Practice;

USE Day44_SQL_Practice;

-- CREATE TABLE Department (
--     dept_id INT PRIMARY KEY,
--     dept_name VARCHAR(50) NOT NULL UNIQUE
-- );

-- CREATE TABLE Student (
--     student_id INT PRIMARY KEY,
--     student_name VARCHAR(50) NOT NULL,
--     city VARCHAR(50),
--     age INT CHECK (age >= 18),
--     email VARCHAR(100) UNIQUE,
--     dept_id INT,
--     joining_date DATE,
--     fees DECIMAL(10,2) DEFAULT 50000,
--     FOREIGN KEY (dept_id) REFERENCES Department(dept_id)
-- );

-- INSERT INTO Department (dept_id, dept_name)
-- VALUES
-- (101, 'Computer Science'),
-- (102, 'Information Technology'),
-- (103, 'Electronics'),
-- (104, 'Mechanical');

-- INSERT INTO Student
-- (student_id, student_name, city, age, email, dept_id, joining_date, fees)
-- VALUES
-- (1, 'Amit', 'Pune', 21, 'amit@gmail.com', 101, '2024-06-10', 55000),
-- (2, 'Rahul', 'Mumbai', 22, 'rahul@gmail.com', 102, '2023-07-15', 60000),
-- (3, 'Sneha', 'Pune', 20, 'sneha@gmail.com', 101, '2024-01-20', 52000),
-- (4, 'Priya', 'Nashik', 23, 'priya@gmail.com', 103, '2022-08-05', 65000),
-- (5, 'Rohan', 'Mumbai', 19, 'rohan@gmail.com', 102, '2024-02-12', 48000),
-- (6, 'Neha', 'Pune', 22, 'neha@gmail.com', 101, '2023-09-18', 57000),
-- (7, 'Akash', 'Nashik', 20, 'akash@gmail.com', 103, '2024-03-25', 51000),
-- (8, 'Pooja', 'Mumbai', 21, 'pooja@gmail.com', 102, '2023-11-30', 59000),
-- (9, 'Vikas', 'Pune', 24, 'vikas@gmail.com', 101, '2022-05-14', 70000),
-- (10, 'Anita', 'Nashik', 19, 'anita@gmail.com', 103, '2024-04-08', 49000);

-- SELECT * FROM Department;
-- SELECT * FROM Student;

-- SELECT student_name, age, city from Student;

-- SELECT * FROM Student WHERE age > 20;

-- SELECT * FROM Student WHERE city='Pune';

-- SELECT * FROM Student WHERE fees > 55000;

-- SELECT * FROM Student ORDER BY age ASC;

-- SELECT * FROM Student ORDER BY fees DESC;

-- SELECT * FROM Student WHERE student_name LIKE 'a%';

-- SELECT * FROM Student WHERE student_name LIKE '%a';

-- SELECT * FROM Student WHERE student_name LIKE '%h%';

-- SELECT * FROM Student WHERE age BETWEEN 20 AND 22;

-- SELECT * FROM Student WHERE city IN('Pune','Mumbai');

-- SELECT * FROM Student WHERE dept_id IN(101,103);

-- SELECT * FROM Student LIMIT 5;

-- SELECT COUNT(student_name) AS total_student FROM Student;

-- SELECT SUM(fees) AS total_fees FROM Student;

-- SELECT AVG(age) AS avg_age FROM Student;

-- SELECT MIN(fees) AS min_fees FROM Student;

-- SELECT MAX(fees) AS max_fees FROM Student;

-- SELECT ROUND(AVG(fees),2) AS avg_fees FROM Student;

-- SELECT city, COUNT(*) total_student FROM Student GROUP BY city;

-- SELECT city, AVG(age) avg_age FROM Student GROUP BY city;

-- SELECT city, SUM(fees) total_fees FROM Student GROUP BY city;

-- SELECT d.dept_name, COUNT(s.student_id) AS total_students
-- FROM Department d
-- INNER JOIN Student s ON d.dept_id = s.dept_id
-- GROUP BY d.dept_name;


-- SELECT d.dept_name, COUNT(s.student_id) AS total_students
-- FROM Department d
-- INNER JOIN Student s ON d.dept_id = s.dept_id
-- GROUP BY d.dept_name
-- HAVING COUNT(s.student_id) > 2;

-- SELECT city, COUNT(student_id) AS total_students
-- FROM Student
-- GROUP BY city
-- HAVING COUNT(student_id) >= 3;

-- SELECT UPPER(student_name) AS student_name_uppercase 
-- FROM Student;

-- SELECT LOWER(student_name) AS student_name_lowercase 
-- FROM Student;

-- SELECT student_name, LENGTH(student_name) AS name_length 
-- FROM Student;

-- SELECT CONCAT(student_name, ' from ', city) AS student_and_city 
-- FROM Student;

-- SELECT SUBSTRING(student_name, 1, 3) AS short_name 
-- FROM Student;


-- SELECT ROUND(AVG(age), 2) AS rounded_average_age 
-- FROM Student;

-- SELECT student_id, MOD(student_id, 2) AS remainder 
-- FROM Student;

-- SELECT CEIL(45.3) AS ceiling_value;

-- SELECT FLOOR(45.8) AS floor_value;

-- SELECT CURRENT_DATE() AS current_date_today;

-- SELECT student_id, student_name, YEAR(joining_date) AS joining_year 
-- FROM Student;

-- SELECT student_id, student_name, MONTH(joining_date) AS joining_month 
-- FROM Student;

-- SELECT student_id, student_name, DAY(joining_date) AS joining_day 
-- FROM Student;


SELECT 
    student_name,
    city,
    age,
    fees,
    LENGTH(student_name) AS name_length,
    YEAR(joining_date) AS joining_year
FROM Student
ORDER BY fees DESC;
