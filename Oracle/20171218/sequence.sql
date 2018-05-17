/*
    SEQUENCE (시퀀스) : 유일한 값을 생성해 주는 ORACLE OBJECT 이다.
    회원번호, 게시판, 글번호 (1->2->3) 증가연산
    SEQUENCE 를 생성하면, PRIMARY KEY 와 같이 순차적으로 증가하는 COLUMN을 자동적으로 생성할 수 있다.
    독립적이다.
    SEQUENCE는 초기화는 되지 않고 지웠다가 다시 사용해야 한다.
*/

-- SEQUENCE 생성
CREATE SEQUENCE TEST_SEQ 
INCREMENT BY 1 -- INCREMENT  1씩증가
START WITH 10;

-- SEQUENCE 삭제
DROP SEQUENCE TEST_SEQ;

-- SEQUENCE 사용
-- CURRVAL 바로 사용 못함
-- 한번 NEXTVAL을 사용한 후에 사용가능하다.

SELECT TEST_SEQ.CURRVAL FROM DUAL; -- 현재의 값

SELECT TEST_SEQ.NEXTVAL FROM DUAL; -- 다음 값

-- SEQUENCE 수정
ALTER SEQUENCE TEST_SEQ
INCREMENT BY 3;

-- 동의어(SYNONYM / 객체의 별명) : 동의어(객체의 별명)를 생성하여 객체에 액세스를 단순화

CREATE SYNONYM "사원테이블"--EMSYNO
FOR EMPLOYEES;

SELECT * FROM "사원테이블";

DROP SYNONYM "사원테이블";
