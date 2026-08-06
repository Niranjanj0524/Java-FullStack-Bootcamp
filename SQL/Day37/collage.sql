CREATE DATABASE clg

use clg;

CREATE Table Department(
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(30) NOT NULL UNIQUE
);

CREATE Table Student(
    student_id INT PRIMARY KEY,
    student_name VARCHAR(30) NOT NULL,
    email VARCHAR(40) UNIQUE,
    age INT CHECK(age>=18),
    city VARCHAR(10) DEFAULT 'Pune',
    dept_id INT,
    FOREIGN KEY(dept_id) REFERENCES Department(dept_id)
);

ALTER TABLE Student
ADD phone VARCHAR(15);

ALTER TABLE student
MODIFY phone VARCHAR(20);

ALTER TABLE student
RENAME COLUMN phone TO mobile_no;

ALTER TABLE Student 
DROP mobile_no;


INSERT INTO Department VALUES
(101,'Computer'),
(102,'Mechanical'),
(103,'Civil'),
(104,'Electrical');

INSERT INTO Student
(student_id,student_name,email,age,city,dept_id)
VALUES
(1,'Niranjan','niranjan@gmail.com',21,'Pune',101),
(2,'Rahul','rahul@gmail.com',20,'Mumbai',102),
(3,'Sneha','sneha@gmail.com',22,'Nashik',103),
(4,'Amit','amit@gmail.com',19,'Kolhapur',101),
(5,'Priya','priya@gmail.com',20,'Satara',104);

SELECT * FROM Department;

SELECT * FROM Student;

UPDATE Student
SET city='Pune'
WHERE student_id=2;

UPDATE Student
SET age=23
WHERE student_id=3;

UPDATE Department
SET dept_name='Information Technology'
WHERE dept_id=104;

DELETE FROM Student
WHERE student_id=5;


--constraints error
INSERT INTO Student
VALUES
(1,'Test','test@gmail.com',20,'Pune',101);

INSERT INTO Student
(student_id,student_name,email,age,dept_id)
VALUES
(6,'ABC','niranjan@gmail.com',20,101);

INSERT INTO Student
(student_id,student_name,email,age,dept_id)
VALUES
(7,NULL,'abc@gmail.com',20,101);

INSERT INTO Student
(student_id,student_name,email,age,dept_id)
VALUES
(8,'XYZ','xyz@gmail.com',16,101);

INSERT INTO Student
(student_id,student_name,email,age,dept_id)
VALUES
(9,'AAA','aaa@gmail.com',20,999);

SELECT * FROM Department;

SELECT * FROM Student;