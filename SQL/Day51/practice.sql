USE Day48_SQL_Practice;

-- 🧪 PART 1 – JOINS & AGGREGATIONS

-- Q1. Display all students with their department names using INNER JOIN.
SELECT s.*, d.dept_name 
FROM student s 
INNER JOIN department d ON s.dept_id = d.dept_id;

-- Q2. Display all students and their department names using LEFT JOIN.
SELECT s.*, d.dept_name 
FROM student s 
LEFT JOIN department d ON s.dept_id = d.dept_id;

-- Q3. Display department names and their students using RIGHT JOIN.
SELECT d.dept_name, s.* 
FROM student s 
RIGHT JOIN department d ON s.dept_id = d.dept_id;

-- Q4. Display: student_name dept_name city using a JOIN.
SELECT s.student_name, d.dept_name, s.city 
FROM student s 
INNER JOIN department d ON s.dept_id = d.dept_id;

-- Q5. Display students belonging to the Computer department.
SELECT s.*, d.dept_name 
FROM student s 
INNER JOIN department d ON s.dept_id = d.dept_id 
WHERE d.dept_name = 'Computer';

-- Q6. Display students belonging to the IT department.
SELECT s.*, d.dept_name 
FROM student s 
INNER JOIN department d ON s.dept_id = d.dept_id 
WHERE d.dept_name = 'IT';

-- Q7. Display each student's name, department name and fees.
SELECT s.student_name, d.dept_name, s.fees 
FROM student s 
INNER JOIN department d ON s.dept_id = d.dept_id;

-- Q8. Display students whose fees are greater than 50000 along with their department name.
SELECT s.student_name, d.dept_name, s.fees 
FROM student s 
INNER JOIN department d ON s.dept_id = d.dept_id 
WHERE s.fees > 50000;

-- Q9. Count the number of students in each department using JOIN + GROUP BY.
SELECT d.dept_name, COUNT(s.student_id) AS student_count 
FROM department d 
LEFT JOIN student s ON d.dept_id = s.dept_id 
GROUP BY d.dept_name;

-- Q10. Display departments that have at least one student.
SELECT d.dept_name 
FROM department d 
INNER JOIN student s ON d.dept_id = s.dept_id 
GROUP BY d.dept_name 
HAVING COUNT(s.student_id) >= 1;


-- -- 🧪 PART 2 – SELF JOIN, CROSS JOIN & SUBQUERIES

-- -- Q11. Use a SELF JOIN to display pairs of students from the same city.
-- SELECT s1.student_name AS student_1, s2.student_name AS student_2, s1.city 
-- FROM student s1 
-- INNER JOIN student s2 ON s1.city = s2.city AND s1.student_id < s2.student_id;

-- -- Q12. Use a SELF JOIN to display students having the same department.
-- SELECT s1.student_name AS student_1, s2.student_name AS student_2, s1.dept_id 
-- FROM student s1 
-- INNER JOIN student s2 ON s1.dept_id = s2.dept_id AND s1.student_id < s2.student_id;

-- -- Q13. Use a CROSS JOIN between student and department.
-- SELECT s.student_name, d.dept_name 
-- FROM student s 
-- CROSS JOIN department d;

-- -- Q14. Write a subquery to find students whose fees are greater than the average fees.
-- SELECT student_name, fees 
-- FROM student 
-- WHERE fees > (SELECT AVG(fees) FROM student);

-- -- Q15. Write a subquery to find the student with the highest fees.
-- SELECT student_name, fees 
-- FROM student 
-- WHERE fees = (SELECT MAX(fees) FROM student);


-- -- 🧪 PART 3 – VIEWS

-- -- Q16. Create a view containing: student_name city fees
-- CREATE VIEW view_student_basic AS 
-- SELECT student_name, city, fees 
-- FROM student;

-- -- Q17. Display all records from your view.
-- SELECT * FROM view_student_basic;

-- -- Q18. Create a view containing student name and department name.
-- CREATE VIEW view_student_dept AS 
-- SELECT s.student_name, d.dept_name 
-- FROM student s 
-- INNER JOIN department d ON s.dept_id = d.dept_id;

-- -- Q19. Display students from your department view.
-- SELECT * FROM view_student_dept;

-- -- Q20. Drop one of the views.
-- DROP VIEW view_student_basic;


-- -- 🧪 PART 4 – INDEXES

-- -- Q21. Display all indexes of the student table.
-- SHOW INDEX FROM student;

-- -- Q22. Create an index on the city column.
-- CREATE INDEX idx_city ON student(city);

-- -- Q23. Create an index on the fees column.
-- CREATE INDEX idx_fees ON student(fees);

-- -- Q24. Display the indexes again and verify that they were created.
-- SHOW INDEX FROM student;

-- -- Q25. Drop one of the indexes.
-- ALTER TABLE student DROP INDEX idx_city;


-- -- 🧪 PART 5 – EXPLAIN & OPTIMIZATION

-- -- Q26. Use EXPLAIN on: SELECT * FROM student WHERE city = 'Pune';
-- EXPLAIN SELECT * FROM student WHERE city = 'Pune';

-- -- Q27. Use EXPLAIN on a query that searches students by fees.
-- EXPLAIN SELECT * FROM Student WHERE fees = 45000;

-- -- Q28. Use EXPLAIN on a Student–department JOIN.
-- EXPLAIN SELECT s.student_name, d.dept_name 
-- FROM Student s 
-- INNER JOIN department d ON s.dept_id = d.dept_id;

-- -- Q29. Use EXPLAIN on a query with ORDER BY fees.
-- EXPLAIN SELECT * FROM student ORDER BY fees DESC;

-- -- Q30. Use EXPLAIN on a query using both WHERE and ORDER BY.
-- EXPLAIN SELECT * FROM student WHERE city = 'Pune' ORDER BY fees DESC;

-- -- Q31. Rewrite this query without SELECT *: SELECT * FROM student WHERE city = 'Pune';
-- SELECT student_id, student_name, city, fees, dept_id 
-- FROM student 
-- WHERE city = 'Pune';

-- -- Q32. Write an optimized query to display only the top 5 students by fees.
-- SELECT student_id, student_name, fees 
-- FROM student 
-- ORDER BY fees DESC 
-- LIMIT 5;


-- -- 🧪 PART 6 – TRANSACTIONS

-- -- Q33. Start a transaction and increase student 1's fees by 1000. Then: COMMIT;
-- START TRANSACTION;
-- UPDATE student SET fees = fees + 1000 WHERE student_id = 1;
-- COMMIT;

-- -- Q34. Start a transaction and increase student 2's fees by 2000. Then: ROLLBACK; Verify the result.
-- START TRANSACTION;
-- UPDATE student SET fees = fees + 2000 WHERE student_id = 2;
-- ROLLBACK;
-- SELECT fees FROM student WHERE student_id = 2;

-- -- Q35. Start a transaction, update student 1, create a savepoint, then update student 2. Rollback to the savepoint.
-- START TRANSACTION;
-- UPDATE student SET fees = fees + 500 WHERE student_id = 1;
-- SAVEPOINT sp1;
-- UPDATE student SET fees = fees + 500 WHERE student_id = 2;
-- ROLLBACK TO SAVEPOINT sp1;
-- COMMIT;

-- -- Q36. Create two savepoints in a transaction. Rollback to the first savepoint.
-- START TRANSACTION;
-- UPDATE student SET city = 'Mumbai' WHERE student_id = 1;
-- SAVEPOINT first_point;
-- UPDATE student SET city = 'Delhi' WHERE student_id = 2;
-- SAVEPOINT second_point;
-- UPDATE student SET city = 'Goa' WHERE student_id = 3;
-- ROLLBACK TO SAVEPOINT first_point;
-- COMMIT;

-- -- Q37. Start a transaction and update three students. Rollback the complete transaction.
-- START TRANSACTION;
-- UPDATE student SET fees = 60000 WHERE student_id = 1;
-- UPDATE student SET fees = 65000 WHERE student_id = 2;
-- UPDATE student SET fees = 70000 WHERE student_id = 3;
-- ROLLBACK;

-- -- Q38. Start a transaction, update student 1, create point1, update student 2, then rollback to point1 and commit.
-- START TRANSACTION;
-- UPDATE student SET fees = fees + 100 WHERE student_id = 1;
-- SAVEPOINT point1;
-- UPDATE student SET fees = fees + 200 WHERE student_id = 2;
-- ROLLBACK TO SAVEPOINT point1;
-- COMMIT;


-- -- ⭐ PART 7 – CHALLENGE QUESTIONS

-- -- Q39. Write a query that displays: student_name department_name fees Then use EXPLAIN to analyze the query.
-- SELECT s.student_name, d.dept_name, s.fees 
-- FROM student s 
-- INNER JOIN department d ON s.dept_id = d.dept_id;

-- EXPLAIN SELECT s.student_name, d.dept_name, s.fees 
-- FROM student s 
-- INNER JOIN department d ON s.dept_id = d.dept_id;

-- -- Q40. Final Challenge Operation Block
-- START TRANSACTION;

-- UPDATE student 
-- SET fees = fees + 1000 
-- WHERE student_id = 1;

-- SAVEPOINT A;

-- UPDATE student 
-- SET fees = fees + 2000 
-- WHERE student_id = 2;

-- SAVEPOINT B;

-- UPDATE student 
-- SET fees = fees + 3000 
-- WHERE student_id = 3;

-- ROLLBACK TO SAVEPOINT B;

-- COMMIT;

-- SELECT student_id, student_name, fees 
-- FROM student 
-- WHERE student_id IN (1, 2, 3);
