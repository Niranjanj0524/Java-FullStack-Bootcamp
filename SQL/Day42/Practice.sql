use collegedb_day38;

#Group By

SELECT city, COUNT(*) AS total_students
FROM student
GROUP BY city;

SELECT city, AVG(age) AS avg_age
FROM student
GROUP BY city;

SELECT city, SUM(age) AS total_age
FROM student
GROUP BY city;

SELECT city, MIN(age) AS Min_age
FROM student
GROUP BY city;

SELECT city, MAX(age) AS Max_age
FROM student
GROUP BY city;

#GROUP BY with Department

SELECT dept_name, 
       (SELECT COUNT(*) 
        FROM student 
        WHERE student.dept_id = department.dept_id) AS student_count
FROM department;

SELECT dept_name, 
       (SELECT AVG(age) 
        FROM student 
        WHERE student.dept_id = department.dept_id) AS avg_age
FROM department;

SELECT dept_name, 
       (SELECT MAX(age) 
        FROM student 
        WHERE student.dept_id = department.dept_id) AS max_age
FROM department;

SELECT dept_name, 
       (SELECT MIN(age) 
        FROM student 
        WHERE student.dept_id = department.dept_id) AS min_age
FROM department;

SELECT dept_name, 
       (SELECT SUM(age) 
        FROM student 
        WHERE student.dept_id = department.dept_id) AS sum_age
FROM department;

#HAVING

SELECT city, COUNT(student_id) AS student_count
FROM student GROUP BY city
HAVING COUNT(student_id) > 1;

SELECT dept_name 
FROM department 
WHERE (SELECT COUNT(*)
        FROM student
        WHERE student.dept_id = department.dept_id) > 1;

SELECT city, AVG(age) AS average_age
FROM student
GROUP BY city
HAVING AVG(age) > 20;

SELECT dept_name 
FROM department 
WHERE (SELECT MAX(age) 
       FROM student 
       WHERE student.dept_id = department.dept_id) > 21;

SELECT city, MIN(age) AS min_age
FROM student
GROUP BY city
HAVING MIN(age) < 20;

#WHERE + GROUP BY + HAVING

SELECT city, COUNT(student_id) AS student_count
FROM student
WHERE age > 20
GROUP BY city;

SELECT city, AVG(age) AS avg_age
FROM student
WHERE age >= 20
GROUP BY city;

SELECT city, COUNT(student_id) AS student_count
FROM student
WHERE age > 20
GROUP BY city
HAVING COUNT(student_id) >= 2;

SELECT city, COUNT(student_id) AS student_count
FROM student
GROUP BY city
ORDER BY student_count DESC;

SELECT city, COUNT(student_id) AS total_students, AVG(age) AS avg_age
FROM student
GROUP BY city
HAVING COUNT(student_id) >= 2SELECT city, COUNT(student_id) AS student_count
FROM student
GROUP BY city
ORDER BY student_count DESC;
ORDER BY avg_age DESC;
