CREATE DATABASE CollegeDB;

USE CollegeDB;

CREATE TABLE Department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE student (
    student_id INT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE,
    age INT CHECK (age >= 18),
    status VARCHAR(20) DEFAULT 'Active',
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES Department(dept_id)
);

INSERT INTO Department (dept_id, dept_name) VALUES 
(10, 'Computer Engineering'),
(20, 'Information Technology'),
(30, 'Mechanical Engineering');

INSERT INTO student (student_id, first_name, email, age, dept_id) VALUES 
(1, 'Amit', 'amit@email.com', 20, 10),
(2, 'Rahul', 'rahul@email.com', 21, 20),
(3, 'Priya', 'priya@email.com', 19, 10);

-- INSERT INTO student (student_id, first_name, email, age, dept_id) 
-- VALUES (1, 'Rohan', 'rohan@email.com', 22, 10);

-- INSERT INTO student (student_id, first_name, email, age, dept_id) 
-- VALUES (4, NULL, 'test@email.com', 22, 10);

-- INSERT INTO student (student_id, first_name, email, age, dept_id) 
-- VALUES (5, 'Suresh', 'amit@email.com', 23, 10);

-- INSERT INTO student (student_id, first_name, email, age, dept_id) 
-- VALUES (6, 'Anjali', 'anjali@email.com', 17, 10);

-- INSERT INTO student (student_id, first_name, email, age, dept_id) 
-- VALUES (7, 'Vikram', 'vikram@email.com', 20, 30);

-- INSERT INTO student (student_id, first_name, email, age, dept_id) 
-- VALUES (8, 'Kiran', 'kiran@email.com', 22, 99);

SELECT * FROM Department;

SELECT * FROM student;