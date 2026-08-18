USE Day48_SQL_Practice;

SELECT * FROM Student;

EXPLAIN SELECT * FROM Student WHERE city='Pune';

EXPLAIN SELECT * FROM Student WHERE fees > 55000;

EXPLAIN SELECT student_name, city, fees
FROM Student
WHERE city = 'Mumbai';

SHOW INDEX FROM Student;

CREATE INDEX idx_city ON Student(city);

EXPLAIN SELECT * FROM Student WHERE city = 'Pune';

EXPLAIN 
SELECT s.student_id, s.student_name, d.dept_name 
FROM Student s 
INNER JOIN Department d ON s.dept_id = d.dept_id;

