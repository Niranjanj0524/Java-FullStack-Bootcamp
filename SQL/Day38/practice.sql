-- ============================================
-- DAY 38 - SQL WEEKLY REVISION PRACTICE
-- DDL + DML + CONSTRAINTS
-- ============================================


-- 1. CREATE DATABASE
CREATE DATABASE CollegeDB_Day38;

-- 2. USE DATABASE
USE CollegeDB_Day38;


-- ============================================
-- 3. CREATE DEPARTMENT TABLE
-- ============================================

CREATE TABLE Department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50) NOT NULL UNIQUE
);


-- ============================================
-- 4. CREATE STUDENT TABLE
-- ============================================

CREATE TABLE Student (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE,
    age INT CHECK(age >= 18),
    city VARCHAR(50) DEFAULT 'Pune',
    dept_id INT,
    
    FOREIGN KEY (dept_id)
    REFERENCES Department(dept_id)
);


-- ============================================
-- 5. CHECK TABLE STRUCTURE
-- ============================================

DESC Department;

DESC Student;


-- ============================================
-- 6. INSERT DEPARTMENT DATA
-- ============================================

INSERT INTO Department
VALUES
(101, 'Computer'),
(102, 'Mechanical'),
(103, 'Civil'),
(104, 'Electrical'),
(105, 'IT');


-- ============================================
-- 7. INSERT STUDENT DATA
-- ============================================

INSERT INTO Student
(student_id, student_name, email, age, city, dept_id)
VALUES
(1, 'Niranjan', 'niranjan@gmail.com', 21, 'Pune', 101),
(2, 'Rahul', 'rahul@gmail.com', 20, 'Mumbai', 102),
(3, 'Sneha', 'sneha@gmail.com', 22, 'Nashik', 103),
(4, 'Amit', 'amit@gmail.com', 19, 'Kolhapur', 101),
(5, 'Priya', 'priya@gmail.com', 20, 'Satara', 104);


-- ============================================
-- 8. DISPLAY ALL DEPARTMENTS
-- ============================================

SELECT * FROM Department;


-- ============================================
-- 9. DISPLAY ALL STUDENTS
-- ============================================

SELECT * FROM Student;


-- ============================================
-- 10. ALTER - ADD COLUMN
-- ============================================

ALTER TABLE Student
ADD phone VARCHAR(15);


-- Check table
DESC Student;


-- ============================================
-- 11. ALTER - MODIFY COLUMN
-- ============================================

ALTER TABLE Student
MODIFY phone VARCHAR(20);


-- ============================================
-- 12. ALTER - RENAME COLUMN
-- ============================================

ALTER TABLE Student
RENAME COLUMN phone TO mobile_no;


-- Check table
DESC Student;


-- ============================================
-- 13. ALTER - DROP COLUMN
-- ============================================

ALTER TABLE Student
DROP COLUMN mobile_no;


-- Check table
DESC Student;


-- ============================================
-- 14. UPDATE STUDENT CITY
-- ============================================

UPDATE Student
SET city = 'Pune'
WHERE student_id = 2;


-- ============================================
-- 15. UPDATE STUDENT AGE
-- ============================================

UPDATE Student
SET age = 23
WHERE student_id = 3;


-- ============================================
-- 16. UPDATE DEPARTMENT
-- ============================================

UPDATE Department
SET dept_name = 'Information Technology'
WHERE dept_id = 105;


-- ============================================
-- 17. CHECK UPDATED DATA
-- ============================================

SELECT * FROM Student;

SELECT * FROM Department;


-- ============================================
-- 18. DELETE ONE STUDENT
-- ============================================

DELETE FROM Student
WHERE student_id = 5;


-- ============================================
-- 19. CHECK AFTER DELETE
-- ============================================

SELECT * FROM Student;


-- ============================================
-- 20. PRIMARY KEY CONSTRAINT TEST
-- ============================================

-- This should give a duplicate PRIMARY KEY error

INSERT INTO Student
(student_id, student_name, email, age, city, dept_id)
VALUES
(1, 'Test Student', 'test@gmail.com', 20, 'Pune', 101);


-- ============================================
-- 21. UNIQUE CONSTRAINT TEST
-- ============================================

-- This should give a duplicate UNIQUE value error

INSERT INTO Student
(student_id, student_name, email, age, city, dept_id)
VALUES
(6, 'Test User', 'niranjan@gmail.com', 20, 'Pune', 101);


-- ============================================
-- 22. NOT NULL CONSTRAINT TEST
-- ============================================

-- This should give a NOT NULL error

INSERT INTO Student
(student_id, student_name, email, age, city, dept_id)
VALUES
(7, NULL, 'nulltest@gmail.com', 20, 'Pune', 101);


-- ============================================
-- 23. CHECK CONSTRAINT TEST
-- ============================================

-- This should give a CHECK constraint error

INSERT INTO Student
(student_id, student_name, email, age, city, dept_id)
VALUES
(8, 'Invalid Age', 'invalid@gmail.com', 16, 'Pune', 101);


-- ============================================
-- 24. FOREIGN KEY CONSTRAINT TEST
-- ============================================

-- dept_id 999 does not exist
-- This should give a FOREIGN KEY error

INSERT INTO Student
(student_id, student_name, email, age, city, dept_id)
VALUES
(9, 'Foreign Test', 'foreign@gmail.com', 20, 'Pune', 999);


-- ============================================
-- 25. DEFAULT CONSTRAINT TEST
-- ============================================

INSERT INTO Student
(student_id, student_name, email, age, dept_id)
VALUES
(10, 'Default Test', 'default@gmail.com', 21, 101);


-- Check default city
SELECT * FROM Student
WHERE student_id = 10;


-- ============================================
-- 26. FINAL STUDENT DATA
-- ============================================

SELECT * FROM Student;


-- ============================================
-- 27. FINAL DEPARTMENT DATA
-- ============================================

SELECT * FROM Department;


-- ============================================
-- 28. SHOW ALL TABLES
-- ============================================

SHOW TABLES;


-- ============================================
-- 29. CHECK DATABASE
-- ============================================

SELECT DATABASE();


-- ============================================
-- 30. FINAL VERIFICATION
-- ============================================

SELECT
    student_id,
    student_name,
    email,
    age,
    city,
    dept_id
FROM Student;