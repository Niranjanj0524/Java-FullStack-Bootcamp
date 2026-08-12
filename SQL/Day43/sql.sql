CREATE DATABASE Day43_SQL_Practice;

use Day43_SQL_Practice;

CREATE Table student(
    student_id INT PRIMARY KEY,
    student_name VARCHAR(50),
    city VARCHAR(50),
    age INT,
    dept_id INT,
    joining_date DATE
);


INSERT INTO student(student_id, student_name, city, age, dept_id, joining_date)
VALUES
(1, 'Amit', 'Pune', 21, 101, '2024-06-10'),
(2, 'Rahul', 'Mumbai', 22, 102, '2023-07-15'),
(3, 'Sneha', 'Pune', 20, 101, '2024-01-20'),
(4, 'Priya', 'Nashik', 23, 103, '2022-08-05'),
(5, 'Rohan', 'Mumbai', 19, 102, '2024-02-12'),
(6, 'Neha', 'Pune', 22, 101, '2023-09-18'),
(7, 'Akash', 'Nashik', 20, 103, '2024-03-25'),
(8, 'Pooja', 'Mumbai', 21, 102, '2023-11-30'),
(9, 'Vikas', 'Pune', 24, 101, '2022-05-14'),
(10, 'Anita', 'Nashik', 19, 103, '2024-04-08');

SELECT * FROM student;


#String Functions

SELECT student_name, UPPER(student_name) AS upper_case FROM student;

SELECT student_name, LOWER(student_name) AS lower_case FROM student;

SELECT student_name, LENGTH(student_name) AS len_name FROM student;

SELECT CONCAT(student_name, ' - ',city) FROM student;

SELECT SUBSTRING(student_name,1,3) AS substring_3 FROM student;

SELECT student_name, 
    LOWER(student_name) AS lower_case,
    UPPER(student_name) AS upper_case,
    LENGTH(student_name) AS name_len
FROM student;

SELECT student_name FROM student
WHERE LENGTH(student_name) > 4;


#Numeric Functions

SELECT ROUND(AVG(age), 2) AS avg_age FROM student;

--CEIL(): Find the ceiling value of 25.3
SELECT CEIL(25.3) AS ceil_value;

--FLOOR(): Find the floor value of 25.9
SELECT FLOOR(25.9) AS floor_value;

--ABS(): Find the absolute value of -100
SELECT ABS(-100) AS absolute_value;

--MOD(): Find the remainder when 25 ÷ 4 using MOD()
SELECT MOD(25, 4) AS remainder_value;

--ROUND + AVG: Find the average age of students and round it to 1 decimal place.
SELECT ROUND(AVG(age), 1) AS avg_age_1_decimal FROM student;

--MOD with Table: Display student_id and the remainder when student_id is divided by 2.
SELECT student_id, MOD(student_id, 2) AS remainder_id FROM student;

--Even Student IDs: Display students whose student_id is even using MOD().
SELECT * FROM student WHERE MOD(student_id, 2) = 0;


--Date Functions

--CURDATE(): Display the current date.
SELECT CURDATE() AS current_date_today;

-- Display the current time.
SELECT CURTIME() AS current_time_now;

--Display the current date and time.
SELECT NOW() AS current_date_and_time;

--Display student_name and joining_year using YEAR(joining_date).
SELECT student_name, YEAR(joining_date) AS joining_year FROM student;

--  Display student_name and joining_month using MONTH(joining_date).
SELECT student_name, MONTH(joining_date) AS joining_month FROM student;

--Display student_name and joining_day using DAY(joining_date).
SELECT student_name, DAY(joining_date) AS joining_day FROM student;


--Combined Practice

--Display student_name, city, name_length, joining_year using LENGTH() and YEAR().
SELECT student_name, city, LENGTH(student_name) AS name_length, YEAR(joining_date) AS joining_year FROM student;

--Display student_name, uppercase_name, city, joining_month using UPPER() and MONTH().
SELECT student_name, 
UPPER(student_name) AS uppercase_name, city, 
MONTH(joining_date) AS joining_month 
FROM student;

-- Challenge: Display student_name, city, name_length, age, joining_year
SELECT student_name, city, 
LENGTH(student_name) AS name_length, age, 
YEAR(joining_date) AS joining_year 
FROM student;
