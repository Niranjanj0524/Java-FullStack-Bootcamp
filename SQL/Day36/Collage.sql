CREATE DATABASE CollageDB;

use CollageDB;

create table departments(
    dept_id int PRIMARY KEY,
    dept_name VARCHAR(40)
);

create table students(
    std_id int PRIMARY KEY,
    Sname VARCHAR(40),
    age INT,
    city VARCHAR(50),
    dept_id INT,
    Foreign Key (dept_id) REFERENCES departments(dept_id)
);

insert into departments(dept_id,dept_name)
VALUES
(100,'IT'),
(200,'CS'),
(300,'ENTC'),
(400,'MECH');

INSERT INTO students(std_id,Sname,age,city,dept_id)
VALUES
(1,'Niranjan',22,'Solapur',200),
(2,'Varad',20,'Kolhapur',100),
(3,'Yash',19,'Pune',300),
(4,'Om',23,'Solapur',400),
(5,'Vivek',20,'Jalgoan',200),
(6,'Aman',21,'Amaravati',100);

SELECT * FROM students;
SELECT * FROM departments;

UPDATE students 
SET city = 'Pandharpur'
WHERE std_id = 4;

UPDATE students 
set age = 15
WHERE std_id = 2;

UPDATE departments SET dept_name = 'CIVIL'
WHERE dept_id = 400;

DELETE FROM students
WHERE std_id = 5;

