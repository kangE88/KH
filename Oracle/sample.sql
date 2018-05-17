SELECT * FROM EMP;

SELECT * FROM EMPLOYEES;

-- 한줄 주석

/*
    범위 주석
*/

/* 자료형 */
-- 문자 자료형 CHAR
-- 문자 자료형 varchar2 VARCHAR2(최적화)

-- CHAR
CREATE TABLE TB_CHAR(
    COL_CHAR1 CHAR(10 BYTE),    --컬럼생성 - 자료형 CHAR(10 BYTE) COL_CHAR1
    COL_CHAR2 CHAR(10 CHAR),
    COL_CHAR3 CHAR(10)
);

CREATE TABLE TB_CHAR1(
    컬럼1 CHAR(10 BYTE),    --컬럼생성 - 자료형 CHAR(10 BYTE) COL_CHAR1
    컬럼2 CHAR(10 CHAR),
    컬럼3 CHAR(10)
);

INSERT INTO TB_CHAR(COL_CHAR1, COL_CHAR2, COL_CHAR3)
VALUES('ABC', 'ABC', 'ABC');

INSERT INTO TB_CHAR(COL_CHAR1, COL_CHAR2, COL_CHAR3)
VALUES('가나다', '가나다', '가나다');

SELECT COL_CHAR1, COL_CHAR2, COL_CHAR3,
    LENGTHB(COL_CHAR1), LENGTHB(COL_CHAR2), LENGTHB(COL_CHAR3)
FROM TB_CHAR;
/*
    CHAR : 10 BYTE         00000   00000
    ABC                    ABC00   00000  영어는 1BYTE
    가 - 3 + 9 = 12        가0000   00000  한글은 3BYTE
    가나 - 3 + 3 + 8 = 14  가나000   00000
    가나다 - 3 + 3 + 3 + 7 가나다00   00000
*/

--  VARCHAR2

CREATE TABLE TB_VARCHAR(
    COL_VARCHAR1 VARCHAR2(10 BYTE),
    COL_VARCHAR2 VARCHAR2(10 CHAR),
    COL_VARCHAR3 VARCHAR2(10)
);

INSERT INTO TB_VARCHAR (COL_VARCHAR1, COL_VARCHAR2, COL_VARCHAR3)
VALUES ('ABC', 'ABC', 'ABC');

INSERT INTO TB_VARCHAR (COL_VARCHAR1, COL_VARCHAR2, COL_VARCHAR3)
VALUES ('가나다', '가나다', '가나다');

SELECT COL_VARCHAR1, COL_VARCHAR2, COL_VARCHAR3,
    LENGTHB(COL_VARCHAR1), LENGTHB(COL_VARCHAR2), LENGTHB(COL_VARCHAR3)
FROM TB_VARCHAR;


-- LONG 최대 2 GB 까지 저장 가능
CREATE TABLE TB_LONG(   -- 에러 LONG 자료형은 테이블당 1개만 사용가능
    COL_LONG1 LONG,
    CLO_LONG2 LONG
);

CREATE TABLE TB_LONG(
    COL_LONG1 LONG
);

INSERT INTO TB_LONG(COL_LONG1)
VALUES('ABC');

INSERT INTO TB_LONG(COL_LONG1)
VALUES('가나다');

SELECT COL_LONG1, LENGTHB(COL_LONG1) -- LENGTHB 사용 불가 (사이즈가 너무 커서)
FROM TB_LONG;


DROP TABLE TB_CHAR;
DROP TABLE TB_CHAR1;
DROP TABLE TB_LONG;
DROP TABLE TB_VARCHAR;
