/*
    Procedure : ó����   
                Ư�� �۾��� �����ϴ� �̸��� �ִ� PL/SQLBlock �̴�
                �Ű������� �ް� �ݺ������� ���� �� �� �ִ� Block�̴�
                
    eclipse������ ������� �ʴ´�.            
*/

DROP PROCEDURE update_sal;  -- ���ν������� update_sal

-- update_sal ���ν��� -> �����ȣ�� �Է� �ް� �޿��� �λ��Ѵ�
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
-- ��κ� SELECT������ ����� �ÿ��� �ַ� FUNCTION�� ����մϴ�
-- INSERT, DELETE, UPDATE ������� �ʴ´�
-- RETURN ���� �ִ� ������ ����Ѵ�.

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

-- ��������   NUMBER salary
VAR salary NUMBER;
EXECUTE :salary := FC_UPDATE_SAL(100);
PRINT salary;

SELECT FIRST_NAME, SALARY, FC_UPDATE_SAL(100) 
FROM EMPLOYEES
WHERE EMPLOYEE_ID=100;



-- �����ȣ, ����̸�, ����޿�

DROP PROCEDURE EMP_INFO;

CREATE OR REPLACE PROCEDURE EMP_INFO(p_empno IN EMPLOYEES.EMPLOYEE_ID%TYPE)

IS
    v_empno EMPLOYEES.EMPLOYEE_ID%TYPE;
    v_ename EMPLOYEES.FIRST_NAME%TYPE;
    v_sal   EMPLOYEES.SALARY%TYPE;

BEGIN
    
    DBMS_OUTPUT.ENABLE;     -- PRINTLN
    
    -- %TYPE ������ ������ ���
    SELECT employee_id, FIRST_NAME, SALARY
        INTO v_empno, v_ename, v_sal
    FROM EMPLOYEES
    WHERE employee_id = p_empno;

    DBMS_OUTPUT.PUT_LINE('�����ȣ : ' || v_empno); 
    DBMS_OUTPUT.PUT_LINE('����̸� : ' || v_ename);
    DBMS_OUTPUT.PUT_LINE('����޿� : ' || v_sal);

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
    
    -- %ROWTYPE ���� ���
    SELECT EMPLOYEE_ID, FIRST_NAME, HIRE_DATE
        INTO v_emp.EMPLOYEE_ID, v_emp.FIRST_NAME, v_emp.HIRE_DATE
    FROM EMPLOYEES
    WHERE EMPLOYEE_ID = p_empno;
    
    DBMS_OUTPUT.PUT_LINE('�����ȣ : ' || v_emp.EMPLOYEE_ID );
    DBMS_OUTPUT.PUT_LINE('����̸� : ' || v_emp.FIRST_NAME );
    DBMS_OUTPUT.PUT_LINE('����Ի��� : ' || v_emp.HIRE_DATE );
    
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
    
    DBMS_OUTPUT.PUT_LINE('�����ȣ : ' || v_empno);
    DBMS_OUTPUT.PUT_LINE('����̸� : ' || v_ename);
    DBMS_OUTPUT.PUT_LINE('����μ� : ' || v_deptno);
    DBMS_OUTPUT.PUT_LINE('������� : ' || v_jobno);
    DBMS_OUTPUT.PUT_LINE('������� : ' || v_email);
    
    DBMS_OUTPUT.PUT_LINE('�Է¼���!!');
    
END;
/
    
SET SERVEROUTPUT ON;
EXECUTE INSERT_TEST(1000, 'ȫ', 20, 'IT_PROG', 'ABC@NAVER.COM', SYSDATE);    
SELECT * FROM EMPLOYEES;    


-- �޿��� ������ ����� ��ȣ employee_id
-- �λ��� number
-- salary = salary+(salary * (�޿��� �λ���/100))
DROP PROCEDURE UPDATE_TEST;

CREATE OR REPLACE PROCEDURE UPDATE_TEST
    (v_empno IN EMPLOYEES.EMPLOYEE_ID%TYPE, -- �޿��� ������ ����� ��ȣ
    v_rate IN NUMBER)                       -- �λ���
IS
    v_emp EMPLOYEES%ROWTYPE;
    
BEGIN
    DBMS_OUTPUT.ENABLE;
    
    UPDATE EMPLOYEES
    SET SALARY = SALARY + (SALARY * (v_rate / 100)) -- �޿��� ���
    WHERE EMPLOYEE_ID = v_empno;
    
    -- COMMIT;    
    DBMS_OUTPUT.PUT_LINE('������ ���� ����');
    
    -- Ȯ��
    SELECT EMPLOYEE_ID, FIRST_NAME, SALARY
        INTO v_emp.employee_id, v_emp.first_name, v_emp.salary
    FROM EMPLOYEES
    WHERE EMPLOYEE_ID = v_empno;

    DBMS_OUTPUT.PUT_LINE('-- ���� Ȯ�� --');
    DBMS_OUTPUT.PUT_LINE('�����ȣ : ' || v_emp.employee_id);
    DBMS_OUTPUT.PUT_LINE('�̸� : ' || v_emp.first_name);
    DBMS_OUTPUT.PUT_LINE('�޿� : ' || v_emp.salary);
    
END;
/

SET SERVEROUTPUT ON;

EXECUTE UPDATE_TEST(101, 10);   -- 10%�λ�

EXECUTE UPDATE_TEST(100, -10);

SELECT * FROM EMPLOYEES
ORDER BY EMPLOYEE_ID;

ROLLBACK;

/*
CURSOR
SQL���� ����ÿ��� CURSOR������ ����ȴ�. 
�Ͻ��� Ŀ��(�ڵ�)
SQL%ROWCOUNT        -> ��ȭ�� ROW�� ����
SQL%FOUND           -> ���� �� TRUE
SQL%NOTFOUND        -> ���� �� TRUE
SQL%ISOPEN          -> Ŀ���� �������� ��
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

    
    -- �˻��� �����Ͱ� �ִ� ���
    IF SQL%FOUND THEN 
        DBMS_OUTPUT.PUT_LINE('�˻��� �����Ͱ� �����մϴ� : ' || v_sal);
    END IF;    
    
    -- �޿��� �λ�
    UPDATE EMPLOYEES
    SET SALARY = SALARY * 1.1
    WHERE EMPLOYEE_ID = p_empno;
    
    v_update_row := SQL%ROWCOUNT;
    DBMS_OUTPUT.PUT_LINE('�޿��� �λ�� ��� �� : ' || v_update_row);
    
    EXCEPTION
    WHEN NO_DATA_FOUND THEN
    DBMS_OUTPUT.PUT_LINE('�˻��� �����Ͱ� �����ϴ�');
    
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
    
    -- �˻��� �����Ͱ� �ִ� ���
    IF SQL%FOUND THEN 
        DBMS_OUTPUT.PUT_LINE('�˻��� �����Ͱ� �����մϴ� : ' || v_sal);
    END IF;    
--    
--    -- �޿��� �λ�
--    UPDATE EMPLOYEES
--    SET SALARY = SALARY * 1.1
--    WHERE JOB_ID = p_jobno;
--    
--    v_update_row := SQL%ROWCOUNT;
--    DBMS_OUTPUT.PUT_LINE('�޿��� �λ�� ��� �� : ' || v_update_row);
--    
--    EXCEPTION
--    WHEN NO_DATA_FOUND THEN
--    DBMS_OUTPUT.PUT_LINE('�˻��� �����Ͱ� �����ϴ�');
    
END;
/

EXECUTE Impl_Cursor11('IT_PROG');




-- ����� Ŀ��(����)
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

    -- Ŀ���� ��ġ�ϱ� ���� ���� ����
    v_dname DEPARTMENTS.DEPARTMENT_NAME%TYPE;
    emp_cnt NUMBER;
    sal_avg NUMBER;

BEGIN
    DBMS_OUTPUT.ENABLE;

    OPEN dept_avg;    
    FETCH dept_avg INTO v_dname, emp_cnt, sal_avg;
    
    DBMS_OUTPUT.PUT_LINE('�μ��� : ' || v_dname);
    DBMS_OUTPUT.PUT_LINE('����� : ' || emp_cnt);
    DBMS_OUTPUT.PUT_LINE('��ձ޿� : ' || sal_avg);    
    
    CLOSE dept_avg;    
END;
/

EXECUTE EXPCURSOR_TEST(60);



-- TRIGGER(�ڵ�ȣ��) -> PROCEDURE, FUNCTION(����ȣ��)

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
VALUES(303, '��', SYSDATE, 60, 'IT_PROG', 10000, 'EEEEE');

ROLLBACK;

SELECT * FROM EMPLOYEES;

DROP TRIGGER trigger_test;

CREATE OR REPLACE TRIGGER trigger_test
BEFORE
    UPDATE ON DEPARTMENTS
    FOR EACH ROW

BEGIN 
    DBMS_OUTPUT.ENABLE;
    
    DBMS_OUTPUT.PUT_LINE('������ �÷� �� : ' || :old.department_name );
    DBMS_OUTPUT.PUT_LINE('������ �÷� �� : ' || :new.department_name );    
END;
/

UPDATE DEPARTMENTS
SET DEPARTMENT_NAME='���ߺ�'
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
    --VALUES(400, '�迵��', SYSDATE, 60, 'IT_PROG', 20000, 'EE');
    
    UPDATE EMPLOYEES
    SET SALARY = 1111
    WHERE LAST_NAME = '��';
    
    --DBMS_OUTPUT.PUT_LINE('�޿� ��� : ' || avg_sal);
END;
/
    
INSERT INTO EMPLOYEES(EMPLOYEE_ID, LAST_NAME, HIRE_DATE, DEPARTMENT_ID, JOB_ID, SALARY, EMAIL)
VALUES(306, '��', SYSDATE, 60, 'IT_PROG', 10000, 'AAA');

ROLLBACK;

SELECT * FROM EMPLOYEES;



/*

4) emp���̺��� �̿��ؼ� �����ȣ�� �Է��ϸ� �ش� ����� ������ �̸��� ���ϴ� �Լ���
   �����Ͻÿ�.(�Լ��� get_mgr_name)

5) emp���̺��� �̿��ؼ� �����ȣ�� �Է��ϸ� �޿� ����� ���ϴ� �Լ��� �����Ͻÿ�.
(4000~5000 A, 3000~4000�̸� B, 2000~3000�̸� C, 1000~200�̸� D, 1000�̸� F,
 �Լ��� get_sal_grade)
 */

--1) �� ���ڸ� �����ϸ� ������ �ؼ� ������� ��ȯ�ϴ� �Լ��� �����Ͻÿ�.(�Լ��� add_num)
DROP PROCEDURE ADD_NUM;

CREATE OR REPLACE PROCEDURE ADD_NUM(v_num1 INT, v_num2 INT)
IS
    v_result INT;
BEGIN
    DBMS_OUTPUT.ENABLE;
    
    v_result := v_num1+v_num2;
    
    DBMS_OUTPUT.PUT_LINE('��� :'||v_result);
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
-- 2) �μ���ȣ�� �Է��ϸ� �ش� �μ����� �ٹ��ϴ� ��� ���� ��ȯ�ϴ� �Լ��� �����Ͻÿ�.
--   (�Լ��� get_emp_count)

DROP PROCEDURE GET_EMP_COUNT;


CREATE OR REPLACE PROCEDURE GET_EMP_COUNT(v_deptno IN EMPLOYEES.DEPARTMENT_ID%TYPE)
IS
    d_count NUMBER;
BEGIN
    DBMS_OUTPUT.ENABLE;
    SELECT COUNT(DEPARTMENT_ID) INTO d_count FROM EMPLOYEES WHERE DEPARTMENT_ID = v_deptno GROUP BY DEPARTMENT_ID;
    DBMS_OUTPUT.PUT_LINE('�ο��� :'|| d_count);
END;

SET SERVEROUTPUT ON;

EXECUTE GET_EMP_COUNT('110');

-- 3) emp���̺��� �̿��ؼ� �Ի����� �����ϸ� �ٹ������� ���ϴ� �Լ��� �����Ͻÿ�.(�Ҽ��� �ڸ� ����, �Լ��� get_info_hiredate)
DROP PROCEDURE GET_INFO_HIREDATE;

CREATE OR REPLACE GET_INFO_HIREDATE(v_hiredate)

----------------------------------------------------------------------------------

-- 1) �� ���ڸ� �����ϸ� ������ �ؼ� ������� ��ȯ�ϴ� �Լ��� �����Ͻÿ�.(�Լ��� add_num)
DROP FUNCTION ADD_NUM;

CREATE OR REPLACE FUNCTION ADD_NUM(NUM1 NUMBER, NUM2 NUMBER) RETURN NUMBER
IS
BEGIN
RETURN NUM1+NUM2;
END;
/

SELECT ADD_NUM(2,5) FROM DUAL;

--2) �μ���ȣ�� �Է��ϸ� �ش� �μ����� �ٹ��ϴ� ��� ���� ��ȯ�ϴ� �Լ��� �����Ͻÿ�.
--   (�Լ��� get_emp_count)

CREATE OR REPLACE FUNCTION GET_EMP_COUNT(dept_no EMP.DEPTNO%TYPE) RETURN NUMBER
IS
    emp_count NUMBER;
    
BEGIN
    SELECT COUNT(*) INTO emp_count FROM EMP
    WHERE DEPTNO = dept_no;
    
    RETURN emp_count;
END;
/

SELECT get_emp_count(10) �����
FROM DEPT;

--3) emp���̺��� �̿��ؼ� �Ի����� �����ϸ� �ٹ������� ���ϴ� �Լ��� �����Ͻÿ�.(�Ҽ��� 
--   �ڸ� ����, �Լ��� get_info_hiredate)

CREATE OR REPLACE FUNCTION get_info_hiredate (hire_date EMP.HIREDATE%TYPE) RETURN INTEGER
IS
BEGIN
    RETURN TRUNC(MONTHS_BETWEEN(SYSDATE,hire_date)/12);
END;
/

SELECT ENAME, get_info_hiredate(HIREDATE) AS �ٹ�����
FROM EMP;

-- 4) emp���̺��� �̿��ؼ� �����ȣ�� �Է��ϸ� �ش� ����� ������ �̸��� ���ϴ� �Լ���
--   �����Ͻÿ�.(�Լ��� get_mgr_name)

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

SELECT EMPNO, ENAME, get_mgr_name(EMPNO) AS "������" FROM EMP;



--5) emp���̺��� �̿��ؼ� �����ȣ�� �Է��ϸ� �޿� ����� ���ϴ� �Լ��� �����Ͻÿ�.
-- (4000~5000 A, 3000~4000�̸� B, 2000~3000�̸� C, 1000~200�̸� D, 1000�̸� F,
-- �Լ��� get_sal_grade

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