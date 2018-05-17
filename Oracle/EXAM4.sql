

SELECT * FROM EMPLOYEES;

-- ����1) EMPLOYEES ���̺��� King�� ������ �ҹ��ڷ� �˻��ϰ� �����ȣ,����, ������(�ҹ��ڷ�),�μ���ȣ�� ����϶�.

SELECT EMPLOYEE_ID, LAST_NAME, LOWER(JOB_ID), DEPARTMENT_ID
FROM EMPLOYEES
WHERE LOWER(LAST_NAME) LIKE 'king';

-- ����2) EMPLOYEES ���̺��� King�� ������ �빮�ڷ� �˻��ϰ� �����ȣ, ����, ������(�빮�ڷ�),�μ���ȣ�� ����϶�.

SELECT EMPLOYEE_ID, LAST_NAME, UPPER(JOB_ID), DEPARTMENT_ID
FROM EMPLOYEES
WHERE UPPER(LAST_NAME) LIKE 'KING';

-- ����3) DEPARTMENTS ���̺��� �μ���ȣ�� �μ��̸�, �μ��̸��� ��ġ��ȣ�� ���Ͽ� ����ϵ��� �϶�.

SELECT * FROM DEPARTMENTS;

SELECT DEPARTMENT_ID, LOCATION_ID,CONCAT(DEPARTMENT_ID,DEPARTMENT_NAME), CONCAT(DEPARTMENT_NAME, LOCATION_ID)
FROM DEPARTMENTS;

-- ����4) EMPLOYEES ���̺��� �̸��� ù ���ڰ� ��K�� ���� ũ�� ��Y������ ���� ����� ������ �����ȣ, �̸�, ����, �޿�, �μ���ȣ�� ����϶�. 
-- �� �̸������� �����Ͽ���.

SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY, DEPARTMENT_ID
FROM EMPLOYEES
WHERE SUBSTR(LAST_NAME, 1, 1) > 'K'
    AND SUBSTR(LAST_NAME, 1, 1) < 'Y'
ORDER BY LAST_NAME;

-- ����5) EMPLOYEES ���̺��� 20�� �μ� ��  �̸��� ���� �� �޿��� �ڸ����� �����ȣ, �̸�, �̸��� �ڸ���, �޿�, �޿��� �ڸ����� ����϶�.

SELECT DEPARTMENT_ID, EMPLOYEE_ID, LAST_NAME, LENGTH(LAST_NAME), SALARY, LENGTH(SALARY)
FROM EMPLOYEES
WHERE DEPARTMENT_ID = '20';


-- ����6) EMPLOYEES ���̺��� �̸� �� ��e������ ��ġ�� ����϶�.
SELECT LAST_NAME, INSTR(LAST_NAME, 'e'), INSTR(LAST_NAME, 'e' , 1 , 2), INSTR(LAST_NAME, 'e' , 1 , 3)
FROM EMPLOYEES;

-- ����7) ������ ������ �����ϰ� ����� �м��϶�.
/*
SELECT ROUND(4567.678),ROUND(4567.678,0),
ROUND(4567.678,2),ROUND(4567.678,-2)
FROM dual;
*/
SELECT ROUND(4567.678),ROUND(4567.678,0),
ROUND(4567.678,2),ROUND(4567.678,-2)
FROM dual;
-- 4568 // 4567.68 // 4567.68 // 4600

-- ����8) EMPLOYEES ���̺��� �μ���ȣ�� 80�� ����� �޿��� 30���� ���� �������� ���Ͽ� ����϶�.
SELECT DEPARTMENT_ID, MOD(SALARY, 30), SALARY
FROM EMPLOYEES
WHERE DEPARTMENT_ID = '80';

-- ����9) EMPLOYEES ���̺��� 30�� �μ� �� �̸��� ��� ������ �����Ͽ� ����Ͽ���. �� ��� ������ �� �� �Ʒ��� ����϶�.
-- ���̱⿣ ����ó�� �������� �׸��带 ���� Ŭ���ϸ� ���� �Ǿ��ٴ� ���� Ȯ���� �� �ֽ��ϴ�.

SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, LAST_NAME|| CHR(10)|| JOB_ID, DEPARTMENT_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 30;

-- ����10) EMPLOYEES ���̺��� ������� �ٹ��� ���� ���� ���� �ΰ��� ����Ͽ���. �� �ٹ� �ϼ��� ���� ��� ������ ����Ͽ���.
SELECT HIRE_DATE, SYSDATE, FLOOR(SYSDATE-HIRE_DATE) AS "Total Days", FLOOR((SYSDATE-HIRE_DATE)/7) AS WEEK, CEIL(MOD((SYSDATE-HIRE_DATE),7)) AS Day
FROM EMPLOYEES;

SELECT LAST_NAME, HIRE_DATE, SYSDATE,
TRUNC((SYSDATE - HIRE_DATE), 0) AS TOTALDAYS,
TRUNC((SYSDATE - HIRE_DATE)/7, 0) AS WEEKS,
ROUND(MOD((SYSDATE-HIRE_DATE),7), 0) AS DAYS
FROM EMPLOYEES
ORDER BY SYSDATE - HIRE_DATE DESC;

-- ����11) EMPLOYEES ���̺��� �μ� 50���� �޿� �տ� $�� �����ϰ� 3�ڸ����� ,�� ����϶�
SELECT DEPARTMENT_ID, SALARY, TO_CHAR(SALARY, '$999,999')
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 50;


