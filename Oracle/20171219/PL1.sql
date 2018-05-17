/*
    Procedure : 처리자   
                특정 작업을 수행하는 이름이 있는 PL/SQLBlock 이다
                매개변수를 받고 반복적으로 수행 할 수 있는 Block이다
                
    eclipse에서는 실행되지 않는다.            
*/

DROP PROCEDURE update_sal;  -- 프로시저명은 update_sal

-- update_sal 프로시저 -> 사원번호를 입력 받고 급여를 인상한다
CREATE OR REPLACE PROCEDURE update_sal
    /* IN PARAMETER  */
    (v_empno IN NUMBER)
    IS
    BEGIN
        UPDATE EMPLOYEES
        SET SALARY = SALARY * 1.1
        WHERE EMPLOYEE_ID = v_empno;
        -- COMMIT;
    END update_sal;
    /

EXECUTE update_sal(100);

SELECT * 
FROM EMPLOYEES
WHERE EMPLOYEE_ID = 100; 

ROLLBACK;


-- FUNCTION
-- 대부분 SELECT절에서 사용할 시에는 주로 FUNCTION을 사용합니다
-- INSERT, DELETE, UPDATE 사용하지 않는다
-- RETURN 값이 있는 절에만 사용한다.

DROP FUNCTION FC_UPDATE_SAL;

-- NUMBER FC_UPDATE_SAL(NUMBER v_empno)
CREATE OR REPLACE FUNCTION FC_UPDATE_SAL(v_empno IN NUMBER) RETURN NUMBER
IS    
    v_sal EMPLOYEES.SALARY%TYPE;    -- v_sal NUMBER := 0;

BEGIN
    SELECT SALARY * 1.1 INTO v_sal
    FROM EMPLOYEES
    WHERE EMPLOYEE_ID = v_empno;

RETURN v_sal;
END;
/

-- 변수선언   NUMBER salary
VAR salary NUMBER;
EXECUTE :salary := FC_UPDATE_SAL(100);
PRINT salary;

SELECT FIRST_NAME, SALARY, FC_UPDATE_SAL(100) 
FROM EMPLOYEES
WHERE EMPLOYEE_ID=100;



-- 사원번호, 사원이름, 사원급여

DROP PROCEDURE EMP_INFO;

CREATE OR REPLACE PROCEDURE EMP_INFO(p_empno IN EMPLOYEES.EMPLOYEE_ID%TYPE)

IS
    v_empno EMPLOYEES.EMPLOYEE_ID%TYPE;
    v_ename EMPLOYEES.FIRST_NAME%TYPE;
    v_sal   EMPLOYEES.SALARY%TYPE;

BEGIN
    
    DBMS_OUTPUT.ENABLE;     -- PRINTLN
    
    -- %TYPE 데이터 변수를 사용
    SELECT employee_id, FIRST_NAME, SALARY
        INTO v_empno, v_ename, v_sal
    FROM EMPLOYEES
    WHERE employee_id = p_empno;

    DBMS_OUTPUT.PUT_LINE('사원번호 : ' || v_empno); 
    DBMS_OUTPUT.PUT_LINE('사원이름 : ' || v_ename);
    DBMS_OUTPUT.PUT_LINE('사원급여 : ' || v_sal);

END;
/

SET SERVEROUTPUT ON;

EXECUTE EMP_INFO(100);


DROP PROCEDURE ROWTYPE_TEST;

CREATE OR REPLACE PROCEDURE ROWTYPE_TEST(p_empno IN EMPLOYEES.EMPLOYEE_ID%TYPE)

IS
    v_emp employees%ROWTYPE;

BEGIN
    DBMS_OUTPUT.ENABLE;
    
    -- %ROWTYPE 변수 사용
    SELECT EMPLOYEE_ID, FIRST_NAME, HIRE_DATE
        INTO v_emp.EMPLOYEE_ID, v_emp.FIRST_NAME, v_emp.HIRE_DATE
    FROM EMPLOYEES
    WHERE EMPLOYEE_ID = p_empno;
    
    DBMS_OUTPUT.PUT_LINE('사원번호 : ' || v_emp.EMPLOYEE_ID );
    DBMS_OUTPUT.PUT_LINE('사원이름 : ' || v_emp.FIRST_NAME );
    DBMS_OUTPUT.PUT_LINE('사원입사일 : ' || v_emp.HIRE_DATE );
    
END;
/

SET SERVEROUTPUT ON;

EXECUTE ROWTYPE_TEST(101);

-- PROCEDURE (EMPLOYEE_ID, LAST_NAME, DEPARTMENT_ID, JOB_ID, EMAIL)
-- INSERT
CREATE OR REPLACE PROCEDURE INSERT_TEST(
    v_empno IN EMPLOYEES.EMPLOYEE_ID%TYPE,
    v_ename IN EMPLOYEES.LAST_NAME%TYPE,
    v_deptno IN EMPLOYEES.DEPARTMENT_ID%TYPE,
    v_jobno IN EMPLOYEES.JOB_ID%TYPE,
    v_email IN EMPLOYEES.EMAIL%TYPE,
    v_hirdate IN EMPLOYEES.HIRE_DATE%TYPE)
    
IS

BEGIN
    DBMS_OUTPUT.ENABLE;
    
    INSERT INTO EMPLOYEES(EMPLOYEE_ID, LAST_NAME, DEPARTMENT_ID, JOB_ID, EMAIL, HIRE_DATE)
    VALUES(v_empno, v_ename, v_deptno, v_jobno, v_email, v_hirdate);
    
    -- COMMIT;
    
    DBMS_OUTPUT.PUT_LINE('사원번호 : ' || v_empno);
    DBMS_OUTPUT.PUT_LINE('사원이름 : ' || v_ename);
    DBMS_OUTPUT.PUT_LINE('사원부서 : ' || v_deptno);
    DBMS_OUTPUT.PUT_LINE('사원업무 : ' || v_jobno);
    DBMS_OUTPUT.PUT_LINE('사원메일 : ' || v_email);
    
    DBMS_OUTPUT.PUT_LINE('입력성공!!');
    
END;
/
    
SET SERVEROUTPUT ON;
EXECUTE INSERT_TEST(1000, '홍', 20, 'IT_PROG', 'ABC@NAVER.COM', SYSDATE);    
SELECT * FROM EMPLOYEES;    


-- 급여를 수정할 사원의 번호 employee_id
-- 인상율 number
-- salary = salary+(salary * (급여의 인상율/100))
DROP PROCEDURE UPDATE_TEST;

CREATE OR REPLACE PROCEDURE UPDATE_TEST
    (v_empno IN EMPLOYEES.EMPLOYEE_ID%TYPE, -- 급여를 수정할 사원의 번호
    v_rate IN NUMBER)                       -- 인상율
IS
    v_emp EMPLOYEES%ROWTYPE;
    
BEGIN
    DBMS_OUTPUT.ENABLE;
    
    UPDATE EMPLOYEES
    SET SALARY = SALARY + (SALARY * (v_rate / 100)) -- 급여를 계산
    WHERE EMPLOYEE_ID = v_empno;
    
    -- COMMIT;    
    DBMS_OUTPUT.PUT_LINE('데이터 수정 성공');
    
    -- 확인
    SELECT EMPLOYEE_ID, FIRST_NAME, SALARY
        INTO v_emp.employee_id, v_emp.first_name, v_emp.salary
    FROM EMPLOYEES
    WHERE EMPLOYEE_ID = v_empno;

    DBMS_OUTPUT.PUT_LINE('-- 수정 확인 --');
    DBMS_OUTPUT.PUT_LINE('사원번호 : ' || v_emp.employee_id);
    DBMS_OUTPUT.PUT_LINE('이름 : ' || v_emp.first_name);
    DBMS_OUTPUT.PUT_LINE('급여 : ' || v_emp.salary);
    
END;
/

SET SERVEROUTPUT ON;

EXECUTE UPDATE_TEST(101, 10);   -- 10%인상

EXECUTE UPDATE_TEST(100, -10);

SELECT * FROM EMPLOYEES
ORDER BY EMPLOYEE_ID;

ROLLBACK;

/*
CURSOR
SQL문을 실행시에는 CURSOR단위로 실행된다. 
암시적 커서(자동)
SQL%ROWCOUNT        -> 변화된 ROW의 갯수
SQL%FOUND           -> 있을 때 TRUE
SQL%NOTFOUND        -> 없을 때 TRUE
SQL%ISOPEN          -> 커서가 열려있을 시
*/

CREATE OR REPLACE PROCEDURE Impl_Cursor
    (p_empno IN EMPLOYEES.EMPLOYEE_ID%TYPE)
IS
    v_sal EMPLOYEES.SALARY%TYPE;
    v_update_row NUMBER;

BEGIN
    DBMS_OUTPUT.ENABLE;
    
    SELECT SALARY INTO v_sal
    FROM EMPLOYEES
    WHERE EMPLOYEE_ID = p_empno;

    
    -- 검색된 데이터가 있는 경우
    IF SQL%FOUND THEN 
        DBMS_OUTPUT.PUT_LINE('검색한 데이터가 존재합니다 : ' || v_sal);
    END IF;    
    
    -- 급여를 인상
    UPDATE EMPLOYEES
    SET SALARY = SALARY * 1.1
    WHERE EMPLOYEE_ID = p_empno;
    
    v_update_row := SQL%ROWCOUNT;
    DBMS_OUTPUT.PUT_LINE('급여가 인상된 사원 수 : ' || v_update_row);
    
    EXCEPTION
    WHEN NO_DATA_FOUND THEN
    DBMS_OUTPUT.PUT_LINE('검색한 데이터가 없습니다');
    
END;
/

EXECUTE Impl_Cursor(101);


CREATE OR REPLACE PROCEDURE Impl_Cursor11
    (p_jobno IN EMPLOYEES.JOB_ID%TYPE)
IS
    v_sal EMPLOYEES.SALARY%TYPE;
    v_update_row NUMBER;

BEGIN
    DBMS_OUTPUT.ENABLE;
    
    SELECT count(*) INTO v_sal
    FROM EMPLOYEES
    WHERE JOB_ID = p_jobno
    GROUP by JOB_ID;
    
    -- 검색된 데이터가 있는 경우
    IF SQL%FOUND THEN 
        DBMS_OUTPUT.PUT_LINE('검색한 데이터가 존재합니다 : ' || v_sal);
    END IF;    
--    
--    -- 급여를 인상
--    UPDATE EMPLOYEES
--    SET SALARY = SALARY * 1.1
--    WHERE JOB_ID = p_jobno;
--    
--    v_update_row := SQL%ROWCOUNT;
--    DBMS_OUTPUT.PUT_LINE('급여가 인상된 사원 수 : ' || v_update_row);
--    
--    EXCEPTION
--    WHEN NO_DATA_FOUND THEN
--    DBMS_OUTPUT.PUT_LINE('검색한 데이터가 없습니다');
    
END;
/

EXECUTE Impl_Cursor11('IT_PROG');




-- 명시적 커서(수동)
CREATE OR REPLACE PROCEDURE EXPCURSOR_TEST
    (v_deptno IN DEPARTMENTS.DEPARTMENT_ID%TYPE)
IS
    CURSOR dept_avg IS
        SELECT D.DEPARTMENT_NAME, COUNT(E.EMPLOYEE_ID) CNT,
            ROUND(AVG(E.SALARY), 3) SAL            
        FROM EMPLOYEES E, DEPARTMENTS D
        WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID
            AND D.DEPARTMENT_ID = v_deptno
        GROUP BY D.DEPARTMENT_NAME;    

    -- 커서를 패치하기 위한 변수 선언
    v_dname DEPARTMENTS.DEPARTMENT_NAME%TYPE;
    emp_cnt NUMBER;
    sal_avg NUMBER;

BEGIN
    DBMS_OUTPUT.ENABLE;

    OPEN dept_avg;    
    FETCH dept_avg INTO v_dname, emp_cnt, sal_avg;
    
    DBMS_OUTPUT.PUT_LINE('부서명 : ' || v_dname);
    DBMS_OUTPUT.PUT_LINE('사원수 : ' || emp_cnt);
    DBMS_OUTPUT.PUT_LINE('평균급여 : ' || sal_avg);    
    
    CLOSE dept_avg;    
END;
/

EXECUTE EXPCURSOR_TEST(60);



-- TRIGGER(자동호출) -> PROCEDURE, FUNCTION(수동호출)

DROP TRIGGER T;

CREATE OR REPLACE TRIGGER T
BEFORE
    INSERT OR 
    UPDATE OF SALARY, DEPARTMENT_ID OR
    DELETE
    ON EMPLOYEES FOR EACH ROW
BEGIN
    DBMS_OUTPUT.ENABLE;

    CASE
        WHEN INSERTING THEN -- INSERT
            DBMS_OUTPUT.PUT_LINE('INSERT--------');
        WHEN UPDATING('SALARY') THEN -- UPDATE
            DBMS_OUTPUT.PUT_LINE('UPDATE SALARY');
        WHEN UPDATING('DEPRATMENT_ID') THEN -- UPDATE
            DBMS_OUTPUT.PUT_LINE('UPDATE DEPRATMENT_ID');
        WHEN DELETING THEN
            DBMS_OUTPUT.PUT_LINE('DELETE');
    END CASE;
END;
/

INSERT INTO EMPLOYEES(EMPLOYEE_ID, LAST_NAME, HIRE_DATE, DEPARTMENT_ID, 
    JOB_ID, SALARY, EMAIL)
VALUES(303, '임', SYSDATE, 60, 'IT_PROG', 10000, 'EEEEE');

ROLLBACK;

SELECT * FROM EMPLOYEES;

DROP TRIGGER trigger_test;

CREATE OR REPLACE TRIGGER trigger_test
BEFORE
    UPDATE ON DEPARTMENTS
    FOR EACH ROW

BEGIN 
    DBMS_OUTPUT.ENABLE;
    
    DBMS_OUTPUT.PUT_LINE('변경전 컬럼 값 : ' || :old.department_name );
    DBMS_OUTPUT.PUT_LINE('변경후 컬럼 값 : ' || :new.department_name );    
END;
/

UPDATE DEPARTMENTS
SET DEPARTMENT_NAME='개발부'
WHERE DEPARTMENT_ID=60;

ROLLBACK;


CREATE OR REPLACE TRIGGER sum_trigger
BEFORE
    INSERT ON EMPLOYEES
    FOR EACH ROW
    
DECLARE
    avg_sal NUMBER;
    
BEGIN
    --SELECT ROUND(AVG(SALARY), 3) INTO avg_sal  
    --FROM EMPLOYEES;
    --INSERT INTO EMPLOYEES(EMPLOYEE_ID, LAST_NAME, HIRE_DATE, DEPARTMENT_ID, JOB_ID, SALARY, EMAIL)
    --VALUES(400, '김영숙', SYSDATE, 60, 'IT_PROG', 20000, 'EE');
    
    UPDATE EMPLOYEES
    SET SALARY = 1111
    WHERE LAST_NAME = '일';
    
    --DBMS_OUTPUT.PUT_LINE('급여 평균 : ' || avg_sal);
END;
/
    
INSERT INTO EMPLOYEES(EMPLOYEE_ID, LAST_NAME, HIRE_DATE, DEPARTMENT_ID, JOB_ID, SALARY, EMAIL)
VALUES(306, '김', SYSDATE, 60, 'IT_PROG', 10000, 'AAA');

ROLLBACK;

SELECT * FROM EMPLOYEES;



/*

4) emp테이블을 이용해서 사원번호를 입력하면 해당 사원의 관리자 이름을 구하는 함수를
   정의하시오.(함수명 get_mgr_name)

5) emp테이블을 이용해서 사원번호를 입력하면 급여 등급을 구하는 함수를 정의하시오.
(4000~5000 A, 3000~4000미만 B, 2000~3000미만 C, 1000~200미만 D, 1000미만 F,
 함수명 get_sal_grade)
 */

--1) 두 숫자를 제공하면 덧셈을 해서 결과값을 반환하는 함수를 정의하시오.(함수명 add_num)
DROP PROCEDURE ADD_NUM;

CREATE OR REPLACE PROCEDURE ADD_NUM(v_num1 INT, v_num2 INT)
IS
    v_result INT;
BEGIN
    DBMS_OUTPUT.ENABLE;
    
    v_result := v_num1+v_num2;
    
    DBMS_OUTPUT.PUT_LINE('결과 :'||v_result);
END;
/

SET SERVEROUTPUT ON;

EXECUTE ADD_NUM(1,2);

/*
CREATE OR REPLACE FUNCTION ADD_NUM(v_num1 INT, v_num2 INT) RETURN INT
IS
    v_result INT;
BEGIN
    v_result := v_num1+v_num2;    
    RETURN v_result;
END;
/

SELECT ADD_NUM(1,2) FROM DUAL;
*/
-- 2) 부서번호를 입력하면 해당 부서에서 근무하는 사원 수를 반환하는 함수를 정의하시오.
--   (함수명 get_emp_count)

DROP PROCEDURE GET_EMP_COUNT;


CREATE OR REPLACE PROCEDURE GET_EMP_COUNT(v_deptno IN EMPLOYEES.DEPARTMENT_ID%TYPE)
IS
    d_count NUMBER;
BEGIN
    DBMS_OUTPUT.ENABLE;
    SELECT COUNT(DEPARTMENT_ID) INTO d_count FROM EMPLOYEES WHERE DEPARTMENT_ID = v_deptno GROUP BY DEPARTMENT_ID;
    DBMS_OUTPUT.PUT_LINE('인원수 :'|| d_count);
END;

SET SERVEROUTPUT ON;

EXECUTE GET_EMP_COUNT('110');

-- 3) emp테이블을 이용해서 입사일을 제공하면 근무연차를 구하는 함수를 정의하시오.(소수점 자리 절삭, 함수명 get_info_hiredate)
DROP PROCEDURE GET_INFO_HIREDATE;

CREATE OR REPLACE GET_INFO_HIREDATE(v_hiredate)

----------------------------------------------------------------------------------

-- 1) 두 숫자를 제공하면 덧셈을 해서 결과값을 반환하는 함수를 정의하시오.(함수명 add_num)
DROP FUNCTION ADD_NUM;

CREATE OR REPLACE FUNCTION ADD_NUM(NUM1 NUMBER, NUM2 NUMBER) RETURN NUMBER
IS
BEGIN
RETURN NUM1+NUM2;
END;
/

SELECT ADD_NUM(2,5) FROM DUAL;

--2) 부서번호를 입력하면 해당 부서에서 근무하는 사원 수를 반환하는 함수를 정의하시오.
--   (함수명 get_emp_count)

CREATE OR REPLACE FUNCTION GET_EMP_COUNT(dept_no EMP.DEPTNO%TYPE) RETURN NUMBER
IS
    emp_count NUMBER;
    
BEGIN
    SELECT COUNT(*) INTO emp_count FROM EMP
    WHERE DEPTNO = dept_no;
    
    RETURN emp_count;
END;
/

SELECT get_emp_count(10) 사원수
FROM DEPT;

--3) emp테이블을 이용해서 입사일을 제공하면 근무연차를 구하는 함수를 정의하시오.(소수점 
--   자리 절삭, 함수명 get_info_hiredate)

CREATE OR REPLACE FUNCTION get_info_hiredate (hire_date EMP.HIREDATE%TYPE) RETURN INTEGER
IS
BEGIN
    RETURN TRUNC(MONTHS_BETWEEN(SYSDATE,hire_date)/12);
END;
/

SELECT ENAME, get_info_hiredate(HIREDATE) AS 근무연차
FROM EMP;

-- 4) emp테이블을 이용해서 사원번호를 입력하면 해당 사원의 관리자 이름을 구하는 함수를
--   정의하시오.(함수명 get_mgr_name)

CREATE OR REPLACE FUNCTION get_mgr_name (emp_no EMP.EMPNO%TYPE) RETURN VARCHAR2
IS
    m_name VARCHAR2(10);
BEGIN
    SELECT M.ENAME INTO m_name FROM EMP A, EMP M
    WHERE A.MGR = M.EMPNO
        AND A.EMPNO = emp_no;
        
    RETURN m_name;
END;
/

SELECT EMPNO, ENAME, get_mgr_name(EMPNO) AS "관리자" FROM EMP;



--5) emp테이블을 이용해서 사원번호를 입력하면 급여 등급을 구하는 함수를 정의하시오.
-- (4000~5000 A, 3000~4000미만 B, 2000~3000미만 C, 1000~200미만 D, 1000미만 F,
-- 함수명 get_sal_grade

CREATE OR REPLACE FUNCTION get_sal_grade (emp_no EMP.EMPNO%TYPE) RETURN VARCHAR2
IS
    sgrade CHAR(1);
BEGIN
    SELECT
        CASE WHEN SAL>= 4000 AND SAL <= 5000 THEN 'A'
             WHEN SAL>= 3000 AND SAL <= 4000 THEN 'B'
             WHEN SAL>= 2000 AND SAL <= 3000 THEN 'C'
             WHEN SAL>= 1000 AND SAL <= 2000 THEN 'D'
             ELSE 'F'
        END
        INTO sgrade
        FROM EMP
        WHERE EMPNO = emp_no;
        
        RETURN sgrade;
END;
/

SELECT ENAME, SAL, get_sal_grade(EMPNO) FROM EMP;