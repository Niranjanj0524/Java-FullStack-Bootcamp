USE jdbc_day55;

-- CREATE PROCEDURE getAllEmployees()
-- BEGIN
--     SELECT * FROM employees;
-- END ;

-- CALL getAllEmployees();


-- CREATE PROCEDURE getEmployeeById(IN empId INT)
-- BEGIN
--     SELECT * FROM employees
--     WHERE id = empId;
-- END;


-- CREATE PROCEDURE getEmployeeCount(OUT total INT)
-- BEGIN
--     SELECT COUNT(*) INTO total
--     FROM employees;
-- END;



-- CREATE PROCEDURE increaseSalary(
--     INOUT salaryValue DOUBLE
-- )
-- BEGIN
--     SET salaryValue = salaryValue + 5000;
-- END 



CREATE PROCEDURE getEmployeesByDepartment(
    IN deptName VARCHAR(50)
)
BEGIN
    SELECT *
    FROM employees
    WHERE department = deptName;
END