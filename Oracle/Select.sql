
-- ���̺��� ��� �����͸� ǥ��
SELECT * FROM EMP;

-- ���̺��� �̸��� ����� ���̺� ��
SELECT * FROM tab;

-- ���̺��� ���ϴ� �����͸��� ǥ��
SELECT EMPNO, ENAME, SAL FROM EMP;

SELECT ENAME FROM EMP;

-- DUAL : �������̺�
SELECT SYSDATE FROM DUAL;
SELECT 10+2 FROM DUAL;
SELECT ROUND(10.6) FROM DUAL;

SELECT ENAME, SAL, SAL+300 FROM EMP;
SELECT ENAME, SAL, SAL*12 FROM EMP;

-- ���� �ּ�
/* ���� �ּ� */

-- ALIAS : ����
-- ��ҹ��� ���� ����

SELECT SAL*12 ���� FROM EMP;


-- ���Ῥ���� : ���̳� ���ڿ��� �ٸ����� ���� ||
SELECT ENAME || ' HAS $' || SAL FROM EMP;

SELECT ENAME || ENAME FROM EMP;

-- DISTINCT : �ߺ��� ����
SELECT DISTINCT DEPTNO FROM EMP;


-- ���̺� ���� ǥ��
DESCRIBE EMP;
DESC EMP; -- ������ ���� ǥ��

--[�ǽ�����]

-- EMP ���̺��� �����ȣ ����̸� ������ ���
-- EMP ���̺��� ����̸��� ������ ����ϴµ� �÷���� �̸�,�������� �ٲ㼭 ���
-- EMP ���̺��� �����ȣ ����̸� ���� ������ ���ϰ� ���� �÷����� �����ȣ, ����̸�, ����, �������� ���
-- EMP ���̺��� ������ �ߺ����� �ʰ� ǥ��
-- EMP ���̺��� ������ ������ �����ؼ� ǥ���ϰ� �÷����� EMPLOYES AND JOB���� ǥ��

-- SELECT * FROM EMP;
SELECT EMPNO, ENAME, SAL FROM EMP;
SELECT ENAME AS "�� ��", SAL  AS "�� ��" FROM EMP;
SELECT EMPNO AS �����ȣ, ENAME AS ����̸�, SAL AS "�� ��", SAL*12 AS "�� ��" FROM EMP;
SELECT DISTINCT JOB FROM EMP;
SELECT ENAME || ', ' || JOB "EMPLOYES AND JOB" FROM EMP;
