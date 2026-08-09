use clg;

SELECT * FROM Student
WHERE student_name LIKE 'N%';

SELECT * FROM Student
WHERE student_name LIKE '%t'

SELECT * FROM Student
WHERE student_name LIKE '%n%'

SELECT * FROM Student 
WHERE student_name LIKE '_iranjan'

SELECT * FROM Student 
WHERE age BETWEEN 20 AND 22

SELECT * FROM Student 
WHERE student_id BETWEEN 2 AND 4

SELECT * FROM Student
WHERE age BETWEEN 20 AND 23
ORDER BY age ASC;

SELECT * FROM Student
WHERE city IN ('Pune', 'Mumbai');

SELECT * FROM Student
WHERE dept_id IN (101, 103);

SELECT * FROM Student 
WHERE city NOT IN ('Pune')

SELECT * FROM Student
LIMIT 3;

SELECT * FROM Student
ORDER BY age ASC
LIMIT 2;

SELECT * FROM Student
ORDER BY student_name ASC
LIMIT 3;

SELECT student_name, age, city
FROM Student
WHERE student_name LIKE '%a%'
AND age BETWEEN 19 AND 23
AND city IN ('Pune', 'Mumbai', 'Nashik')
ORDER BY age DESC
LIMIT 2;