/*
    SUB QUERY : QUERY ���� QUERY
    
    ���� �� ��������
    
    ���� �� ��������
    
    SELECT  ���� ���� �����÷�
    FROM ����
    WHERE ����
    
*/

SELECT FIRST_NAME, (SELECT MAX(MAX_SALARY) FROM JOBS) -- SELECT�� SUB QUERY�� �÷��� 1���� ����
FROM EMPLOYEES
WHERE SALARY > (SELECT AVG(SALARY) FROM EMPLOYEES);

SELECT FIRST_NAME, LAST_NAME, SALARY, JOB_ID 
FROM EMPLOYEES
WHERE(SALARY, JOB_ID) = ( SELECT SALARY, JOB_ID 
                            FROM EMPLOYEES 
                            WHERE EMPLOYEE_ID = 101 );


SELECT EMPLOYEE_ID, FIRST_NAME
FROM EMPLOYEES
WHERE JOB_ID IN (SELECT JOB_ID FROM JOBS);
--WHERE JOB_ID = ANY(SELECT JOB_ID FROM JOBS);

SELECT EMPLOYEE_ID, START_DATE, END_DATE, JOB_ID, DEPARTMENT_ID 
FROM JOB_HISTORY
WHERE (EMPLOYEE_ID, START_DATE) IN(SELECT EMPLOYEE_ID, HIRE_DATE FROM EMPLOYEES);

-- FROM SUB QUERY
SELECT A.EMPLOYEE_ID, A.FIRST_NAME, A.JOB_ID, B.SAL_SUM 
FROM EMPLOYEES A, (SELECT JOB_ID, SUM(SALARY) AS SAL_SUM 
                        FROM EMPLOYEES
                        GROUP BY JOB_ID) B
WHERE A.JOB_ID = B.JOB_ID;

SELECT FIRST_NAME, A.SALARY, DEPT_SAL, (SELECT AVG(SALARY)    
                                            FROM EMPLOYEES C
                                            WHERE A.JOB_ID = C.JOB_ID)
FROM EMPLOYEES A, (SELECT DEPARTMENT_ID, AVG(SALARY) AS DEPT_SAL 
                        FROM EMPLOYEES
                        GROUP BY DEPARTMENT_ID) B
WHERE A.DEPARTMENT_ID = B.DEPARTMENT_ID
AND A.SALARY > (SELECT AVG(SALARY) 
                    FROM EMPLOYEES D
                    WHERE A.JOB_ID = D.JOB_ID);
                    
                    
-- Ư�� ����
-- CASE

SELECT EMPLOYEE_ID, FIRST_NAME, PHONE_NUMBER,
    CASE SUBSTR(PHONE_NUMBER, 1, 3)
        WHEN '515' THEN '����'
        WHEN '590' THEN '����'
        WHEN '659' THEN '�λ�'
        WHEN '603' THEN '����'
        ELSE '��Ÿ' END  AS ����
FROM EMPLOYEES;

SELECT EMPLOYEE_ID, FIRST_NAME, PHONE_NUMBER,
    CASE WHEN SUBSTR(PHONE_NUMBER, 1, 3) = '515' THEN '����'
         WHEN SUBSTR(PHONE_NUMBER, 1, 3) = '590' THEN '����'
         WHEN SUBSTR(PHONE_NUMBER, 1, 3) = '659' THEN '�λ�'
         WHEN SUBSTR(PHONE_NUMBER, 1, 3) = '515' THEN '����'
         ELSE '��Ÿ' END AS ����
FROM EMPLOYEES;

-- DECODE
SELECT EMPLOYEE_ID, FIRST_NAME, PHONE_NUMBER, 
    DECODE(SUBSTR(PHONE_NUMBER, 1, 3),
        '515','����','590','����','659','�λ�',
        '603','����','��Ÿ') AS ����
FROM EMPLOYEES;


-- NVL2
-- MANAGER ID ������ '����' ������' ����'
-- NVL2 (����÷�, NULL�� �ƴϸ�, NULL �̸�)
SELECT LAST_NAME, NVL2(MANAGER_ID, '����','����')
FROM EMPLOYEES;


--�м� �Լ�
SELECT FIRST_NAME, JOB_ID, SALARY,
    RANK() OVER(ORDER BY SALARY DESC) AS RANK,              -- RANK ���� ���� ������ ���� ���ڷ� ǥ�� �� ������ COUNT ���� ��� EX) 1224
    DENSE_RANK() OVER(ORDER BY SALARY DESC) AS DENSE_RANK,  -- ���� ������ �������ڷ� ǥ�� ������ COUNT �����ʴ´�. EX) 1223
    ROW_NUMBER() OVER(ORDER BY SALARY DESC) AS ROW_NUM
FROM EMPLOYEES
ORDER BY SALARY DESC;


SELECT FIRST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
WHERE ROWNUM <=10 AND ROWNUM >=20     -- ���� 5����� ��
ORDER BY SALARY DESC;

SELECT * FROM JOBS

SELECT FIRST_NAME, JOB_ID, CASE JOB_ID  WHEN 'AD_PRES' THEN 'A'
                                        WHEN 'ANALYST' THEN 'B'
                                        WHEN 'FI_MGR' THEN 'C'
                                        WHEN 'SA_MAN' THEN 'D'
                                        WHEN 'ST_CLERK' THEN 'E'
                                        ELSE '��Ÿ' END AS ����
FROM EMPLOYEES


-- ����1) EMPLOYEES ���̺��� Kochhar�� �޿����� ���� ����� ������ �����ȣ,�̸�,������,�޿��� ����϶�.

SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
WHERE (SALARY) > (SELECT SALARY FROM EMPLOYEES WHERE LAST_NAME ='Kochhar')
ORDER BY SALARY DESC;

-- ����2) EMPLOYEES ���̺��� �޿��� ��պ��� ���� ����� ������ �����ȣ,�̸�,������,�޿�,�μ���ȣ�� ����Ͽ���.

SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY, DEPARTMENT_ID
FROM EMPLOYEES
WHERE SALARY < (SELECT AVG(SALARY) FROM EMPLOYEES);

-- ����3) EMPLOYEES ���̺��� 100�� �μ��� �ּ� �޿����� �ּ� �޿��� ���� �ٸ� ��� �μ��� ����϶�

SELECT DEPARTMENT_ID, MIN(SALARY)
FROM EMPLOYEES 
GROUP BY DEPARTMENT_ID
HAVING MIN(SALARY) > (SELECT MIN(SALARY) FROM EMPLOYEES WHERE DEPARTMENT_ID = 100 );

-- ����4) �������� �ּ� �޿��� �޴� ����� ������ �����ȣ,�̸�,����,�μ���ȣ�� ����Ͽ���. �� �������� �����Ͽ���.

SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, MIN(SALARY)
FROM EMPLOYEES


HAVING JOB_ID, MIN(SALARY) = (SELECT JOB_ID, MIN(SALARY) FROM EMPLOYEES GROUP BY JOB_ID)



