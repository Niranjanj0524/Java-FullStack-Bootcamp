use clg;

SELECT COUNT(*) FROM student;

SELECT COUNT(student_id) FROM student

SELECT COUNT(age) AS total_age FROM student

SELECT AVG(age) from student

SELECT MIN(age) FROM student

SELECT MAX(age) FROM student

SELECT COUNT(age) FROM student WHERE age > 20

SELECT COUNT(city) FROM student WHERE city='Pune'

SELECT AVG(age) FROM student WHERE city='Pune'

SELECT MAX(age) FROM student WHERE city='Pune'

SELECT MIN(age) FROM student WHERE city='Pune'

SELECT 
    COUNT(*) AS total_student,
    AVG(age) AS AVG_age,
    MIN(age) AS Min_age,
    MAX(age) AS Max_age
FROM student

SELECT COUNT(age) FROM student
WHERE age BETWEEN 20 AND 22

SELECT AVG(age) AS average_age 
FROM student
WHERE city IN ('Pune', 'Mumbai');

SELECT MAX(age) FROM student WHERE dept_id=101

SELECT MIN(age) FROM student WHERE dept_id=101

SELECT (age) FROM student WHERE dept_id=101

SELECT * FROM student WHERE student_name LIKE 'A%'

SELECT AVG(age) AS avg_age
FROM student
WHERE student_name LIKE '%a%';

SELECT MAX(age) AS max_age
FROM student
WHERE city IN ('Pune','Nashik')

SELECT MIN(age) AS min_age
FROM student
WHERE age > 20
