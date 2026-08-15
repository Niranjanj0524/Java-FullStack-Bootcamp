USE Day44_SQL_Practice;

--INNER JOIN

SELECT s.student_name, d.dept_name
FROM Student s
INNER JOIN Department d ON s.dept_id = d.dept_id;

SELECT s.student_name, s.city, d.dept_name
FROM Student s
INNER JOIN Department d ON s.dept_id = d.dept_id;

SELECT s.*, d.dept_name
FROM Student s
INNER JOIN Department d ON s.dept_id = d.dept_id
WHERE d.dept_name = 'Computer Science';

SELECT s.*, d.dept_name
FROM Student s
INNER JOIN Department d ON s.dept_id = d.dept_id
WHERE d.dept_name = 'Information Technology';

SELECT s.student_name, s.age, d.dept_name
FROM Student s
INNER JOIN Department d ON s.dept_id = d.dept_id;

SELECT s.student_name, s.city, d.dept_name
FROM Student s
INNER JOIN Department d ON s.dept_id = d.dept_id
WHERE s.city = 'Pune';

SELECT s.student_name, s.age, d.dept_name
FROM Student s
INNER JOIN Department d ON s.dept_id = d.dept_id
WHERE s.age > 20;

SELECT s.student_name, d.dept_name
FROM Student s
INNER JOIN Department d ON s.dept_id = d.dept_id
ORDER BY s.student_name ASC;

--LEFT JOIN

SELECT d.dept_name, s.student_name
FROM Department d
LEFT JOIN Student s ON d.dept_id = s.dept_id;

SELECT d.dept_name
FROM Department d
LEFT JOIN Student s ON d.dept_id = s.dept_id
WHERE s.student_id IS NULL;

SELECT d.dept_name, s.student_name, s.city
FROM Department d
LEFT JOIN Student s ON d.dept_id = s.dept_id;

SELECT d.dept_id, d.dept_name
FROM Department d
LEFT JOIN Student s ON d.dept_id = s.dept_id;

SELECT d.dept_name, COUNT(s.student_id) AS total_students
FROM Department d
LEFT JOIN Student s ON d.dept_id = s.dept_id
GROUP BY d.dept_name;

--RIGHT JOIN

SELECT d.dept_name, s.student_name
FROM Student s
RIGHT JOIN Department d ON s.dept_id = d.dept_id;

SELECT d.dept_name, s.student_name
FROM Student s
RIGHT JOIN Department d ON s.dept_id = d.dept_id;

SELECT d.dept_name
FROM Student s
RIGHT JOIN Department d ON s.dept_id = d.dept_id
WHERE s.student_id IS NULL;

--JOIN + WHERE

-- [दुरुस्त केलेली क्वेरी - येथे SELECT क्लॉज जोडला आहे]
SELECT s.student_name, s.city, d.dept_name
FROM Student s
INNER JOIN Department d ON s.dept_id = d.dept_id
WHERE s.city = 'Pune';

SELECT s.student_name, s.age, d.dept_name
FROM Student s
INNER JOIN Department d ON s.dept_id = d.dept_id
WHERE s.age > 20;

SELECT s.student_name, d.dept_name, s.age
FROM Student s
INNER JOIN Department d ON s.dept_id = d.dept_id
WHERE d.dept_name = 'Computer Science' AND s.age > 20;

SELECT s.student_name, s.city, d.dept_name
FROM Student s
INNER JOIN Department d ON s.dept_id = d.dept_id
WHERE s.city = 'Mumbai';

--JOIN + ORDER BY

SELECT s.student_name, d.dept_name
FROM Student s
INNER JOIN Department d ON s.dept_id = d.dept_id
ORDER BY d.dept_name ASC;

SELECT s.student_name, s.age, d.dept_name
FROM Student s
INNER JOIN Department d ON s.dept_id = d.dept_id
ORDER BY s.age DESC;

--JOIN + Aggregate Functions

SELECT d.dept_name, COUNT(s.student_id) AS total_students
FROM Department d
INNER JOIN Student s ON d.dept_id = s.dept_id
GROUP BY d.dept_name;

SELECT d.dept_name, AVG(s.age) AS average_age
FROM Department d
INNER JOIN Student s ON d.dept_id = s.dept_id
GROUP BY d.dept_name;

SELECT d.dept_name, MAX(s.age) AS max_age
FROM Department d
INNER JOIN Student s ON d.dept_id = s.dept_id
GROUP BY d.dept_name;

SELECT d.dept_name, MIN(s.age) AS min_age
FROM Department d
INNER JOIN Student s ON d.dept_id = s.dept_id
GROUP BY d.dept_name;

SELECT COUNT(s.student_id) AS cs_student_count
FROM Student s
INNER JOIN Department d ON s.dept_id = d.dept_id
WHERE d.dept_name = 'Computer Science';

--🔥 Challenge

SELECT d.dept_name, COUNT(s.student_id) AS total_students
FROM Department d
LEFT JOIN Student s ON d.dept_id = s.dept_id
GROUP BY d.dept_name;

SELECT d.dept_name, COUNT(s.student_id) AS total_students
FROM Department d
INNER JOIN Student s ON d.dept_id = s.dept_id
GROUP BY d.dept_name
HAVING COUNT(s.student_id) > 1;

SELECT s.student_name, s.city, s.age, d.dept_name
FROM Student s
INNER JOIN Department d ON s.dept_id = d.dept_id
WHERE s.age BETWEEN 20 AND 22
ORDER BY s.age DESC;
