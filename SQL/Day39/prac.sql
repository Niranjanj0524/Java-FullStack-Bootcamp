use collagedb;

SELECT * FROM Students;
SELECT * FROM departments;

SELECT Sname from Students;

SELECT Sname,age from Students;

SELECT Sname,city from Students;

SELECT * from students
WHERE age = 22;

SELECT * from students
WHERE age > 20;

SELECT * from students
WHERE age < 20;

SELECT * FROM Students
WHERE city = 'Pune';

SELECT * FROM Students
WHERE city <> 'Pune';

SELECT * FROM Students
WHERE dept_id = 100;

SELECT Sname, age
FROM Students
WHERE age > 19;

SELECT Sname, city
FROM Students
WHERE city = 'Pune';

SELECT *
FROM Students
WHERE age >=19
AND city = 'Pune';

SELECT *
FROM Students
WHERE city = 'Pune'
OR city = 'Solapur';

SELECT *
FROM Students
WHERE NOT city = 'Pune';

SELECT *
FROM Students
ORDER BY age ASC;

SELECT *
FROM Students
ORDER BY Sname ASC;

SELECT Sname, age, city
FROM Students
WHERE age >= 20
AND city <> 'Mumbai'
ORDER BY Sname ASC;