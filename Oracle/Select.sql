
-- 테이블의 모든 데이터를 표현
SELECT * FROM EMP;

-- 테이블의 이름을 기록한 테이블 명세
SELECT * FROM tab;

-- 테이블의 원하는 데이터만을 표현
SELECT EMPNO, ENAME, SAL FROM EMP;

SELECT ENAME FROM EMP;

-- DUAL : 가상테이블
SELECT SYSDATE FROM DUAL;
SELECT 10+2 FROM DUAL;
SELECT ROUND(10.6) FROM DUAL;

SELECT ENAME, SAL, SAL+300 FROM EMP;
SELECT ENAME, SAL, SAL*12 FROM EMP;

-- 한줄 주석
/* 범위 주석 */

-- ALIAS : 별명
-- 대소문자 구분 없음

SELECT SAL*12 연봉 FROM EMP;


-- 연결연산자 : 열이나 문자열을 다른열에 연결 ||
SELECT ENAME || ' HAS $' || SAL FROM EMP;

SELECT ENAME || ENAME FROM EMP;

-- DISTINCT : 중복행 삭제
SELECT DISTINCT DEPTNO FROM EMP;


-- 테이블 구조 표시
DESCRIBE EMP;
DESC EMP; -- 위에와 같은 표현

--[실습문제]

-- EMP 테이블에서 사원번호 사원이름 월급을 출력
-- EMP 테이블에서 사원이름과 월급을 출력하는데 컬럼명느 이름,월급으로 바꿔서 출력
-- EMP 테이블에서 사원번호 사원이름 월급 연봉을 구하고 각각 컬럼명은 사원번호, 사원이름, 월급, 연봉으로 출력
-- EMP 테이블의 업무를 중복되지 않게 표시
-- EMP 테이블의 사원명과 업무로 연결해서 표시하고 컬럼명은 EMPLOYES AND JOB으로 표시

-- SELECT * FROM EMP;
SELECT EMPNO, ENAME, SAL FROM EMP;
SELECT ENAME AS "이 름", SAL  AS "월 급" FROM EMP;
SELECT EMPNO AS 사원번호, ENAME AS 사원이름, SAL AS "월 급", SAL*12 AS "연 봉" FROM EMP;
SELECT DISTINCT JOB FROM EMP;
SELECT ENAME || ', ' || JOB "EMPLOYES AND JOB" FROM EMP;
