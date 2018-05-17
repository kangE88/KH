-- 50) 모든 사원의 이름, 부서번호, 부서이름을 표시하시오.(emp,dept)
SELECT A.ENAME, EMPNO,B.DNAME 
FROM EMP A INNER JOIN DEPT B
ON A.DEPTNO = B.DEPTNO;

-- 51) 업무가 MANAGER인 사원의 정보를 이름,업무,부서명,근무지 순으로 출력하시오.(emp,dept)
SELECT A.ENAME, JOB,
    B.DNAME, LOC
FROM EMP A INNER JOIN DEPT B
ON A.DEPTNO = B.DEPTNO
AND A.JOB ='MANAGER';

SELECT A.ENAME, A.JOB, B.DNAME, B.LOC
FROM EMP A JOIN DEPT B
USING(DEPTNO)
WHERE A.JOB = 'MANAGER';


--52) 커미션을 받고 급여가 1,600이상인 사원의 사원이름,부서명,근무지를 출력하시오
SELECT A.ENAME, COMM, SAL, B.DNAME, LOC 
FROM EMP A INNER JOIN DEPT B
ON A.DEPTNO = B.DEPTNO
WHERE A.COMM IS NOT NULL AND A.SAL >= 1600;

SELECT A.ENAME, B.DNAME, B.LOC 
FROM EMP A, DEPT B
WHERE A.DEPTNO = B.DEPTNO
AND A.COMM IS NOT NULL
AND A.SAL >= 1600;


--53) 근무지가 CHICAGO인 모든 사원의 이름,업무,부서번호 및 부서이름을 표시하시오.
SELECT A.ENAME, A.SAL, A.JOB, A.DEPTNO, B.DNAME, LOC 
FROM EMP A INNER JOIN DEPT B
ON A.DEPTNO = B.DEPTNO
WHERE B.LOC = 'CHICAGO';

SELECT A.ENAME, A.JOB, B.DEPTNO, B.DNAME, B.LOC
FROM EMP A, DEPT B
WHERE A.DEPTNO = B.DEPTNO
AND B.LOC = 'CHICAGO';


--54) 근무지별로 근무하는 사원의 수가 5명 이하인 경우, 인원이 적은 도시순으로 정렬하시오. (근무 인원이 0명인 곳도 표시)
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

--55) 사원의 이름 및 사원 번호를 관리자의 이름과 관리자 번호와 함께 표시하고 각각의 열 레이블은
--    employee, emp#, manager, mgr#로 지정하시오.
SELECT A.ENAME AS employee, A.EMPNO AS emp#, B.ENAME AS manager, B.MGR AS mgr#
FROM EMP A, EMP B
WHERE A.EMPNO = B.MGR;

SELECT A.ENAME AS employee, A.EMPNO AS emp#, B.ENAME AS manager, B.MGR AS mgr# 
FROM EMP A INNER JOIN EMP B
ON A.EMPNO = B.MGR;

-- 56) 관리자보다 먼저 입사한 모든 사원의 이름 및 입사일을 관리자의 이름 및 입사일과
--  함께 표시하고 열 레이블을 각각 employee, emp hired, manager, mgr hired로 지정
SELECT A.ENAME AS "employee", A.HIREDATE AS "emp hired", B.ENAME AS "manager", B.HIREDATE AS "mgr hired"
FROM EMP A, EMP B
WHERE A.EMPNO = B.MGR AND A.HIREDATE < B.HIREDATE;

SELECT A.ENAME AS "employee", A.HIREDATE AS "emp hired", B.ENAME AS "manager", B.HIREDATE AS "mgr hired" 
FROM EMP A INNER JOIN EMP B
ON A.MGR = B.EMPNO
AND A.HIREDATE < B.HIREDATE;

--57) 사원의 이름 및 사원번호를 관리자의 이름과 관리자 번호와 함께 표시하고 각각의 열 
--    레이블은 employee, emp#, manager, mgr#로 지정하는데 King을 포함하여 관리자가 
--    없는 모든 사원을 표시하도록 하고 결과를 사원번호를 기준으로 정렬

SELECT A.ENAME AS "employee", A.EMPNO AS "emp#", B.ENAME AS "manager", B.EMPNO AS "mgr#"
FROM EMP A LEFT OUTER JOIN EMP B
ON A.EMPNO = B.MGR
WHERE B.ENAME='King' OR B.MGR IS NOT NULL
ORDER BY A.EMPNO ASC;


SELECT E.ENAME employee, E.EMPNO emp#, M.ENAME manager, E.EMPNO mgr# 
FROM EMP E, EMP M
WHERE E.MGR = M.EMPNO(+)
ORDER BY E.EMPNO ASC;



--58) 지정한 부서번호, 사원이름 및 지정한 사원과 동일한 부서에서 근무하는 모든 사원을
--    표시하도록 질의를 작성하고 부서번호는 department, 사원이름은 employee, 동일한
--    부서에서 근무하는 사원은 colleague로 표시하시오.(부서번호, 사원이름,동료 순으로
--    오름차순 정렬)

SELECT A.DEPTNO AS "department", A.ENAME AS "employee", B.ENAME AS "colleague"
FROM EMP A, EMP B
WHERE A.DEPTNO = B.DEPTNO --AND A.DEPTNO = 
ORDER BY A.EMPNO, A.ENAME, B.ENAME ASC;

SELECT A.DEPTNO AS "department", A.ENAME AS "employee", B.ENAME AS "colleague" 
FROM EMP A, EMP B
WHERE A.DEPTNO = B.DEPTNO
AND A.EMPNO != B.EMPNO -- AND A.EMPNO <> B.EMPNO
ORDER BY A.DEPTNO, A.ENAME, B.ENAME;


--59)10번부서에서 근무하는 사원들의 부서번호, 부서이름, 사원이름,월급,급여등급을 출력하시오.
--(emp,dept,salgrade)

SELECT 
FROM EMP E, DEPT D, SALGRADE S
WHERE E.DEPTNO = D.DEPTNO







SELECT E.DEPTNO, D.DNAME, E.ENAME, E.SAL, S.GRADE
FROM EMP E, DEPT D, SALGRADE S
WHERE E.DEPTNO = D.DEPTNO
AND E.SAL BETWEEN S.LOSAL AND S.HISAL
AND E.DEPTNO =10;