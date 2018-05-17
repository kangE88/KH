--����1) EMPLOYEES ���̺��� ��� SALESMAN(SA_MAN)�� ���Ͽ� �޿��� ���, �ְ��, ������, �հ踦 ���Ͽ� ����Ͽ���.

SELECT *FROM EMPLOYEES;

SELECT AVG(SALARY), SUM(SALARY), MAX(SALARY), MIN(SALARY)
FROM EMPLOYEES
WHERE JOB_ID = 'SA_MAN'
GROUP BY JOB_ID;

-- ����2) EMPLOYEES ���̺� ��ϵǾ� �ִ� �ο���, ���ʽ��� NULL�� �ƴ� �ο���, ���ʽ��� ���, ��ϵǾ� �ִ� �μ��� ���� ���Ͽ� ����϶�.

SELECT COUNT(*), COUNT(COMMISSION_PCT), AVG(COMMISSION_PCT), COUNT(DISTINCT DEPARTMENT_ID)
FROM EMPLOYEES


-- ����3) EMPLOYEES ���̺��� �μ����� �ο���, ��� �޿�, �����޿�, �ְ� �޿�, �޿��� ���� ���Ͽ� ����϶�.
SELECT * FROM EMPLOYEES;

SELECT DEPARTMENT_ID, COUNT(*), TRUNC(AVG(SALARY)), MIN(SALARY), MAX(SALARY), SUM(SALARY) 
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID;

-- ����4) EMPLOYEES ���̺��� �� �μ����� �ο���,�޿��� ���, ���� �޿�, �ְ� �޿�, �޿��� ���� ���Ͽ� �޿��� ���� ���� ������ ����Ͽ���.
SELECT DEPARTMENT_ID, COUNT(*), AVG(SALARY), MIN(SALARY), MAX(SALARY), SUM(SALARY)
FROM EMPLOYEES 
GROUP BY DEPARTMENT_ID
ORDER BY SUM(SALARY) DESC;

-- ����5) EMPLOYEES ���̺��� �μ���, ������ �׷��Ͽ� ����� �μ���ȣ, ����, �ο���, �޿��� ���, �޿��� ���� ���Ͽ� ����Ͽ���.
SELECT DEPARTMENT_ID, JOB_ID, COUNT(*), AVG(SALARY), SUM(SALARY)
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID, JOB_ID;

-- ����6) EMPLOYEES ���̺��� �μ� �ο��� 4���� ���� �μ��� �μ���ȣ, �ο���, �޿��� ���� ���Ͽ� ����Ͽ���.(GROUP BY, HAVING)
SELECT DEPARTMENT_ID, COUNT(*), SUM(SALARY) 
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
HAVING 4 < COUNT(*);

-- ����7) EMPLOYEES ���̺��� �޿��� �ִ� 10000�̻��� �μ��� ���ؼ� �μ���ȣ, ��� �޿�, �޿��� ���� ���Ͽ� ����Ͽ���.
SELECT DEPARTMENT_ID, TRUNC(AVG(SALARY),1), SUM(SALARY)
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
HAVING MAX(SALARY) >= 1000;

-- ����8) EMPLOYEES ���̺��� ������ �޿��� ����� 10000 �̻��� ������ ���ؼ� ������,��� �޿�, �޿��� ���� ���Ͽ� ����϶�.
SELECT JOB_ID, AVG(SALARY), SUM(SALARY) 
FROM EMPLOYEES
GROUP BY JOB_ID
HAVING AVG(SALARY) >= 10000;

-- ����9) EMPLOYEES ���̺��� ��ü ������ 10000�� �ʰ��ϴ� �� ������ ���ؼ� ������ ���޿� �հ踦 ����϶�. �� �Ǹſ��� �����ϰ� �� �޿� �հ�� ����(��������)�϶�.(SA_)

SELECT JOB_ID, SUM(SALARY) 
FROM EMPLOYEES
WHERE JOB_ID NOT LIKE '%SA_%'
GROUP BY JOB_ID
HAVING SUM(SALARY) > 10000
ORDER BY SUM(SALARY) DESC;

