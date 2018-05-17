-- 50) ��� ����� �̸�, �μ���ȣ, �μ��̸��� ǥ���Ͻÿ�.(emp,dept)
SELECT A.ENAME, EMPNO,B.DNAME 
FROM EMP A INNER JOIN DEPT B
ON A.DEPTNO = B.DEPTNO;

-- 51) ������ MANAGER�� ����� ������ �̸�,����,�μ���,�ٹ��� ������ ����Ͻÿ�.(emp,dept)
SELECT A.ENAME, JOB,
    B.DNAME, LOC
FROM EMP A INNER JOIN DEPT B
ON A.DEPTNO = B.DEPTNO
AND A.JOB ='MANAGER';

SELECT A.ENAME, A.JOB, B.DNAME, B.LOC
FROM EMP A JOIN DEPT B
USING(DEPTNO)
WHERE A.JOB = 'MANAGER';


--52) Ŀ�̼��� �ް� �޿��� 1,600�̻��� ����� ����̸�,�μ���,�ٹ����� ����Ͻÿ�
SELECT A.ENAME, COMM, SAL, B.DNAME, LOC 
FROM EMP A INNER JOIN DEPT B
ON A.DEPTNO = B.DEPTNO
WHERE A.COMM IS NOT NULL AND A.SAL >= 1600;

SELECT A.ENAME, B.DNAME, B.LOC 
FROM EMP A, DEPT B
WHERE A.DEPTNO = B.DEPTNO
AND A.COMM IS NOT NULL
AND A.SAL >= 1600;


--53) �ٹ����� CHICAGO�� ��� ����� �̸�,����,�μ���ȣ �� �μ��̸��� ǥ���Ͻÿ�.
SELECT A.ENAME, A.SAL, A.JOB, A.DEPTNO, B.DNAME, LOC 
FROM EMP A INNER JOIN DEPT B
ON A.DEPTNO = B.DEPTNO
WHERE B.LOC = 'CHICAGO';

SELECT A.ENAME, A.JOB, B.DEPTNO, B.DNAME, B.LOC
FROM EMP A, DEPT B
WHERE A.DEPTNO = B.DEPTNO
AND B.LOC = 'CHICAGO';


--54) �ٹ������� �ٹ��ϴ� ����� ���� 5�� ������ ���, �ο��� ���� ���ü����� �����Ͻÿ�. (�ٹ� �ο��� 0���� ���� ǥ��)
SELECT B.LOC, COUNT(B.LOC)
FROM EMP A INNER JOIN DEPT B
ON A.DEPTNO = B.DEPTNO
GROUP BY B.LOC
HAVING COUNT(B.LOC) <= 5
ORDER BY B.LOC ASC;

SELECT A.LOC, COUNT(B.EMPNO) EMP_NUMBER
FROM DEPT A, EMP B
WHERE A.DEPTNO = B.DEPTNO(+)
GROUP BY A.LOC
HAVING COUNT(B.EMPNO) <= 5
ORDER BY EMP_NUMBER ASC;

--55) ����� �̸� �� ��� ��ȣ�� �������� �̸��� ������ ��ȣ�� �Բ� ǥ���ϰ� ������ �� ���̺���
--    employee, emp#, manager, mgr#�� �����Ͻÿ�.
SELECT A.ENAME AS employee, A.EMPNO AS emp#, B.ENAME AS manager, B.MGR AS mgr#
FROM EMP A, EMP B
WHERE A.EMPNO = B.MGR;

SELECT A.ENAME AS employee, A.EMPNO AS emp#, B.ENAME AS manager, B.MGR AS mgr# 
FROM EMP A INNER JOIN EMP B
ON A.EMPNO = B.MGR;

-- 56) �����ں��� ���� �Ի��� ��� ����� �̸� �� �Ի����� �������� �̸� �� �Ի��ϰ�
--  �Բ� ǥ���ϰ� �� ���̺��� ���� employee, emp hired, manager, mgr hired�� ����
SELECT A.ENAME AS "employee", A.HIREDATE AS "emp hired", B.ENAME AS "manager", B.HIREDATE AS "mgr hired"
FROM EMP A, EMP B
WHERE A.EMPNO = B.MGR AND A.HIREDATE < B.HIREDATE;

SELECT A.ENAME AS "employee", A.HIREDATE AS "emp hired", B.ENAME AS "manager", B.HIREDATE AS "mgr hired" 
FROM EMP A INNER JOIN EMP B
ON A.MGR = B.EMPNO
AND A.HIREDATE < B.HIREDATE;

--57) ����� �̸� �� �����ȣ�� �������� �̸��� ������ ��ȣ�� �Բ� ǥ���ϰ� ������ �� 
--    ���̺��� employee, emp#, manager, mgr#�� �����ϴµ� King�� �����Ͽ� �����ڰ� 
--    ���� ��� ����� ǥ���ϵ��� �ϰ� ����� �����ȣ�� �������� ����

SELECT A.ENAME AS "employee", A.EMPNO AS "emp#", B.ENAME AS "manager", B.EMPNO AS "mgr#"
FROM EMP A LEFT OUTER JOIN EMP B
ON A.EMPNO = B.MGR
WHERE B.ENAME='King' OR B.MGR IS NOT NULL
ORDER BY A.EMPNO ASC;


SELECT E.ENAME employee, E.EMPNO emp#, M.ENAME manager, E.EMPNO mgr# 
FROM EMP E, EMP M
WHERE E.MGR = M.EMPNO(+)
ORDER BY E.EMPNO ASC;



--58) ������ �μ���ȣ, ����̸� �� ������ ����� ������ �μ����� �ٹ��ϴ� ��� �����
--    ǥ���ϵ��� ���Ǹ� �ۼ��ϰ� �μ���ȣ�� department, ����̸��� employee, ������
--    �μ����� �ٹ��ϴ� ����� colleague�� ǥ���Ͻÿ�.(�μ���ȣ, ����̸�,���� ������
--    �������� ����)

SELECT A.DEPTNO AS "department", A.ENAME AS "employee", B.ENAME AS "colleague"
FROM EMP A, EMP B
WHERE A.DEPTNO = B.DEPTNO --AND A.DEPTNO = 
ORDER BY A.EMPNO, A.ENAME, B.ENAME ASC;

SELECT A.DEPTNO AS "department", A.ENAME AS "employee", B.ENAME AS "colleague" 
FROM EMP A, EMP B
WHERE A.DEPTNO = B.DEPTNO
AND A.EMPNO != B.EMPNO -- AND A.EMPNO <> B.EMPNO
ORDER BY A.DEPTNO, A.ENAME, B.ENAME;


--59)10���μ����� �ٹ��ϴ� ������� �μ���ȣ, �μ��̸�, ����̸�,����,�޿������ ����Ͻÿ�.
--(emp,dept,salgrade)

SELECT 
FROM EMP E, DEPT D, SALGRADE S
WHERE E.DEPTNO = D.DEPTNO







SELECT E.DEPTNO, D.DNAME, E.ENAME, E.SAL, S.GRADE
FROM EMP E, DEPT D, SALGRADE S
WHERE E.DEPTNO = D.DEPTNO
AND E.SAL BETWEEN S.LOSAL AND S.HISAL
AND E.DEPTNO =10;