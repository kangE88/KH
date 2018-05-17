
SELECT * FROM EMPLOYEES;

-- EXAM 1
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID,SALARY
FROM EMPLOYEES
WHERE SALARY > 3000;

-- EXAM 2
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY, DEPARTMENT_ID
FROM EMPLOYEES
WHERE JOB_ID = 'ST_MAN';

-- EXAM 3
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY, HIRE_DATE, DEPARTMENT_ID
FROM EMPLOYEES
WHERE HIRE_DATE > '1982/12/31';

-- EXAM 4
SELECT FIRST_NAME, JOB_ID, SALARY, HIRE_DATE, DEPARTMENT_ID
FROM EMPLOYEES
WHERE SALARY BETWEEN 3000 AND 5000;

-- EXAM 5

-- IN
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY, HIRE_DATE
FROM EMPLOYEES 
WHERE EMPLOYEE_ID IN ('145', '152', '203');

-- OR
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY, HIRE_DATE
FROM EMPLOYEES 
WHERE EMPLOYEE_ID = 145 OR  EMPLOYEE_ID = 152 OR EMPLOYEE_ID = 203;

-- EXAM 6
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY, HIRE_DATE, DEPARTMENT_ID
FROM EMPLOYEES
WHERE HIRE_DATE LIKE '05/%';

-- EXAM 7
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY, HIRE_DATE, COMMISSION_PCT, DEPARTMENT_ID
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NULL;

-- EXAM 8
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY, HIRE_DATE, DEPARTMENT_ID
FROM EMPLOYEES
WHERE SALARY > 1100 AND JOB_ID = 'ST_MAN';

-- EXAM 9
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY, HIRE_DATE, DEPARTMENT_ID
FROM EMPLOYEES
WHERE SALARY > 10000 OR JOB_ID = 'ST_MAN';


-- EXAM 10
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY, DEPARTMENT_ID 
FROM EMPLOYEES
WHERE JOB_ID NOT IN 'ST_MAN' AND JOB_ID NOT IN 'SA_MEN' AND JOB_ID NOT IN 'SA_REP'

-- EXAM 11
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
WHERE JOB_ID = 'AD_PRES' OR JOB_ID = 'SA_MAN' AND SALARY > 12000;

-- EXAM 12
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
WHERE (JOB_ID = 'AD_PRES' OR JOB_ID = 'SA_MAN') AND SALARY > 12000;