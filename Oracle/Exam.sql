-- EXAM 1
SELECT * FROM EMPLOYEES;
-- EXAM 2
DESC EMPLOYEES;
-- EXAM 3
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, JOB_ID FROM EMPLOYEES;
-- EXAM 4 
SELECT FIRST_NAME, SALARY, SALARY+300 FROM EMPLOYEES;
-- EXAM 5 
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, COMMISSION_PCT*SALARY, (SALARY+(SALARY*COMMISSION_PCT)) FROM EMPLOYEES;
-- EXAM 6
SELECT LAST_NAME AS "�̸�", SALARY AS "����" FROM EMPLOYEES;
-- EXAM 7
SELECT LAST_NAME AS "Name", SALARY*12 AS "Annual Salary" FROM EMPLOYEES;
--EXAM 8
SELECT FIRST_NAME || ', '  || JOB_ID AS "Employees" FROM EMPLOYEES;
--EXAM 9
SELECT FIRST_NAME || ' is a '  || JOB_ID AS "Employees" FROM EMPLOYEES;
--EXAM 10
SELECT FIRST_NAME || ' 1 YEAR SALARY = '  || SALARY*12 AS "MONTHLY" FROM EMPLOYEES;
--EXAM 11
SELECT JOB_ID FROM EMPLOYEES;