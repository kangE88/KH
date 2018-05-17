SELECT EMPNO, ENAME, JOB, SAL
FROM EMP
WHERE EMPNO = '7698';

-- 2) emp ���̺��� ����̸��� SMITH�� ����� �̸��� ����, �μ���ȣ�� ���Ͻÿ�.
SELECT * FROM EMP;

SELECT ENAME, SAL, DEPTNO
FROM EMP
WHERE ENAME = 'SMITH';

-- 8) ������ 2500�̻� 3500�̸��� ����� �̸�, �Ի���, ������ ���Ͻÿ�.
SELECT ENAME, HIREDATE, SAL
FROM EMP
WHERE SAL >= 2500 AND SAL < 3500;


-- 9) �޿��� 2000���� 3000���̿� ���Ե��� �ʴ� ����� �̸�, ����, �޿��� ����Ͻÿ�.
SELECT ENAME, JOB, SAL
FROM EMP
WHERE NOT SAL >= 2000 AND SAL <= 3000;


-- 10) 81��05��01�ϰ� 81��12��03�� ���̿� �Ի��� ����� �̸�, �޿�, �Ի����� ����Ͻÿ�.
SELECT ENAME, SAL, HIREDATE
FROM EMP
WHERE HIREDATE BETWEEN '81/05/01' AND '81/12/03';


-- 11) emp���̺��� �����ȣ�� 7566,7782,7934�� ����� ������ ������� �����ȣ,�̸�,������ ����Ͻÿ�.
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE EMPNO NOT IN ('7566' , '7782' , '7934');


-- 12) �μ���ȣ 30(deptno)���� �ٹ��ϸ� ��2,000�޷� ���ϸ� �޴� 81��05��01�� ������ �Ի��� ����� �̸�, �޿�, �μ���ȣ, �Ի����� ����Ͻÿ�.
SELECT ENAME, SAL, DEPTNO, HIREDATE
FROM EMP
WHERE DEPTNO = 30 AND SAL <= 2000 AND HIREDATE < '81/05/01';

-- 13) emp���̺��� �޿��� 2,000�� 5,000 ���̰� �μ���ȣ�� 10 �Ǵ� 30�� ����� �̸��� �޿�,�μ���ȣ�� �����Ͻÿ�.
SELECT ENAME, SAL, DEPTNO
FROM EMP
WHERE (SAL BETWEEN 2000 AND 5000)  AND (DEPTNO = '10' OR DEPTNO= '30');

--14) ������ SALESMAN �Ǵ� MANAGER�̸鼭 �޿��� 1,600, 2,975 �Ǵ� 2,850�� �ƴ� ��� ����� �̸�, ���� �� �޿��� ǥ���Ͻÿ�.
SELECT ENAME, JOB, SAL 
FROM EMP
WHERE (JOB = 'SALESMAN' OR JOB = 'MANAGER') AND SAL NOT IN(1600,2975,2850);

-- 15) emp���̺��� ����̸� �� S�� ���Ե��� ���� ����� �� �μ���ȣ�� 20�� ������� �̸��� �μ���ȣ�� ����Ͻÿ�.
SELECT ENAME, DEPTNO
FROM EMP
WHERE ENAME NOT LIKE '%S%' AND DEPTNO = 20;
    
-- 16) emp���̺��� �̸��� A�� E�� �ִ� ��� ����� �̸��� ǥ���Ͻÿ�.
SELECT ENAME
FROM EMP
WHERE ENAME NOT LIKE '%A%' AND ENAME NOT LIKE '%E%';

-- 17) emp���̺��� �����ڰ� ���� ��� ����� �̸��� ������ ǥ���Ͻÿ�.
SELECT ENAME, JOB
FROM EMP
WHERE MGR IS NULL;

-- 18) emp���̺��� Ŀ�̼� �׸��� �Էµ� ������� �̸��� �޿�, Ŀ�̼��� ���Ͻÿ�.
SELECT  ENAME, SAL, COMM
FROM EMP
WHERE COMM IS NOT NULL AND COMM !=0;