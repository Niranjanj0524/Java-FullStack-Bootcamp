USE Day48_SQL_Practice;

UPDATE student
SET fees = fees + 1000
WHERE student_name = 'Amit';
COMMIT;

SELECT * FROM student WHERE student_name='Amit';

UPDATE student
SET fees = fees + 2000
WHERE student_name='Rahul';

ROLLBACK;

SELECT * FROM student WHERE student_name='Rahul';

UPDATE student
SET city = 'Mumbai'
WHERE student_name='Sneha';

SELECT * FROM student WHERE student_name='Sneha';

START TRANSACTION;

UPDATE student 
SET fees = fees + 500 
WHERE student_id = 1;

SAVEPOINT savepoint1;

UPDATE student 
SET fees = fees + 500 
WHERE student_id = 2;

SAVEPOINT savepoint2;

UPDATE student 
SET fees = fees + 500 
WHERE student_id = 3;

ROLLBACK TO savepoint2;

COMMIT;

SELECT * FROM student;

START TRANSACTION;

UPDATE student SET fees = fees + 1000 WHERE student_id = 1;
UPDATE student SET fees = fees + 1000 WHERE student_id = 2;

ROLLBACK;

SELECT * FROM student;

START TRANSACTION;

UPDATE student SET fees = fees + 1000 WHERE student_id = 1;
SAVEPOINT sp1;

UPDATE student SET fees = fees + 1000 WHERE student_id = 2;

ROLLBACK TO sp1;
COMMIT;

START TRANSACTION;

UPDATE student SET fees = fees + 1000 WHERE student_id = 1;
SAVEPOINT first_sp;

UPDATE student SET fees = fees + 1000 WHERE student_id = 2;
SAVEPOINT second_sp;

ROLLBACK TO first_sp;
COMMIT;

START TRANSACTION;

UPDATE student SET fees = fees + 1000 WHERE student_id = 1;
SAVEPOINT my_sp;

RELEASE SAVEPOINT my_sp;
COMMIT;

START TRANSACTION;

UPDATE student SET fees = fees + 1000 WHERE student_id = 1;
SAVEPOINT test_sp;

RELEASE SAVEPOINT test_sp;

ROLLBACK TO my_sp; 

START TRANSACTION;

UPDATE student SET fees = fees + 2000 WHERE student_id = 1;
UPDATE student SET fees = fees + 2000 WHERE student_id = 2;

ROLLBACK;

SELECT * FROM student WHERE student_id IN (1, 2);



START TRANSACTION;

UPDATE student SET fees = fees + 1000 WHERE student_id = 1;

SAVEPOINT A;

UPDATE student SET fees = fees + 1000 WHERE student_id = 2;

SAVEPOINT B;

UPDATE student SET fees = fees + 1000 WHERE student_id = 3;

ROLLBACK TO SAVEPOINT B;

COMMIT;