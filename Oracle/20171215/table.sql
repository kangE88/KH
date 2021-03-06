
/*
    무결성(CONSTRAINT) 제약조건
    PRIMARY KEY : 기본키, NULL을 허용하지 않음. 중복을 허용하지 않음. 일반적으로 하나만 사용함. EX) ID 주민번호
    UNIQUE KEY : 고유키, NULL은 허용, 중복을 허용하지 않음. EX) EMAIL
    CHEAK : 
    FOREION KEY : 외래키, 다른테이블에서 PRIMARY KEY인 경우가 자주 있다.
    NOT NULL : 
*/

DROP TABLE TB_TEST;

CREATE TABLE TB_TEST (
    COL_01 VARCHAR2(10) NOT NULL,
    COL_02 VARCHAR2(20)
);

-- NOT NULL 
INSERT INTO TB_TEST(COL_01, COL_02)
VALUES('AAA', 'aaa');

INSERT INTO TB_TEST(COL_01, COL_02)
VALUES('AAA', '');

-- ERROR 발생
INSERT INTO TB_TEST(COL_01, COL_02)
VALUES('', '');
-- NOT NULL END

SELECT * FROM TB_TEST;


--PRIMARY KEY = NOT NULL + UNIQUE
-- 유일하게 식별할 수 있는 정의된 규칙
-- 최대 32개 컬럼까지 지정가능

DROP TABLE TEST_01;

CREATE TABLE TEST_01(
    KEY_01 VARCHAR2(10) CONSTRAINT PK_TEST_01 PRIMARY KEY,
    KEY_02 VARCHAR2(10), -- CONSTRAIN PK_TEST_T02 PRIMARY KEY
    COL_01 VARCHAR2(20),
    COL_02 VARCHAR2(20)
);

INSERT INTO TEST_01(KEY_01, KEY_02, COL_01, COL_02)
VALUES('AAA','aaa','111','111');

INSERT INTO TEST_01(KEY_01, KEY_02, COL_01, COL_02)
VALUES('','aaa','111','111'); -- PRIMARY KEY가 NULL이면 에러 발생 ORA-01400: cannot insert NULL into ("HR"."TEST_01"."KEY_01")
--
INSERT INTO TEST_01(KEY_01, KEY_02, COL_01, COL_02)
VALUES('AAA','BBB','222','222'); -- PRIMARY KEY에 동일한 값을 넣으면 에러 발생 ORA-00001: unique constraint (HR.PK_TEST_01) violated

INSERT INTO TEST_01(KEY_01, KEY_02, COL_01, COL_02)
VALUES('bbb','BBB','222','222'); 

-- PRIMARY KEY 복수설정
DROP TABLE TEST_01  -- 테이블 삭제
CASCADE CONSTRAINTS; -- 위에 절만 실행하면 PRIMARY KEY가 다른데서 사용되면 제대로 삭제되지 않는 경우가 있다. 아래 절 까지 실행 해 주어야 전부 삭제 PRIMARY KEY까지 전부삭제

CREATE TABLE TEST_01(
    KEY_O1 VARCHAR2(10),
    KEY_O2 VARCHAR2(10),
    COL_01 VARCHAR2(10),
    COL_02 VARCHAR2(10),
    CONSTRAINT PK_TEST_01 PRIMARY KEY(KEY_O1, KEY_O2) -- 
        USING INDEX TABLESPACE USERS
);

CREATE TABLE TEST_01(
    KEY_O1 VARCHAR2(10),
    KEY_O2 VARCHAR2(10),
    COL_01 VARCHAR2(10),
    COL_02 VARCHAR2(10)
);

-- 기본키 추가
ALTER TABLE TEST_01
ADD 
CONSTRAINT PK_TEST_01
PRIMARY KEY (KEY_O1, KEY_O2);


-- 기본키 삭제
ALTER TABLE TEST_01
DROP
CONSTRAINT PK_TEST_01;

--PRIMARY KEY 확인 QUERY

SELECT *
FROM USER_CONSTRAINTS
WHERE TABLE_NAME ='TEST_01'
    AND CONSTRAINT_TYPE='P';
    
    
-- 고유키 UNIQUE KEY
-- NULL값을 제외한 유일하게 식별할 수 있는 규칙

DROP TABLE TEST_01
CASCADE CONSTRAINTS;

CREATE TABLE TEST_01(
    UKEY_01 VARCHAR2(10) CONSTRAINT UK_TEST_01 UNIQUE,
    KEY_01 VARCHAR2(10) CONSTRAINT UK_TEST_02 UNIQUE,
    COL_01 VARCHAR2(20)
);


CREATE TABLE TEST_01(
    UKEY_01 VARCHAR2(10),
    UKEY_02 VARCHAR2(10),
    KEY_01 VARCHAR2(10),
    COL_01 VARCHAR2(20),
    CONSTRAINT UK_TEST_01 UNIQUE(UKEY_01, UKEY_02)
);

INSERT INTO TEST_01(UKEY_01, UKEY_02, COL_01)
VALUES('AAA','BBB','111');

INSERT INTO TEST_01(UKEY_01, UKEY_02, COL_01)
VALUES('AAA','','111'); -- PRIMARY KEY 와는 다르게 UNIQUE KEY가 2개일때 NULL값 허용하고 'AAA', 'BBB' INSERT 후 'AAA', '' INSERT 시 등록이 된다.  
                        -- UNIQUE KEY가 두개인데 두개를 한 세트로 인지하기때문, 'AAA','BBB' 등록 시 오류 발생 ORA-00001: unique constraint (HR.UK_TEST_01) violated

SELECT * FROM TEST_01;

-- CHECK
-- 데이터의 값의 범위, 특정한 값의 지정이 가능
-- NULL 허용

DROP TABLE TEST_01
CASCADE CONSTRAINT;

CREATE TABLE TEST_01(
    KEY_01 VARCHAR2(10),
    KEY_02 VARCHAR2(10),
    COL_01 VARCHAR2(10),
    COL_02 NUMBER,
    CONSTRAINT CHK_TEST_01 CHECK(COL_01 IN('남자', '여자', '기타')), -- NULL까지 허용
    CONSTRAINT CHK_TEST_02 CHECK(COL_02 >= 1 AND COL_02 <= 999)
);

INSERT INTO TEST_01(KEY_01, KEY_02, COL_01, COL_02)
VALUES('AAA','aaa','','');

INSERT INTO TEST_01(KEY_01, KEY_02, COL_01, COL_02)
VALUES('AAA','aaa','',1);

INSERT INTO TEST_01(KEY_01, KEY_02, COL_01, COL_02)
VALUES('AAA','aaa','남자',1);

INSERT INTO TEST_01(KEY_01, KEY_02, COL_01, COL_02)
VALUES('AAA','aaa','여자',1);

--TABLE 생성 후 나중에 CHECK 추가하는방법

-- TABLE 생성
CREATE TABLE TEST_01(
    KEY_01 VARCHAR2(10),
    KEY_02 VARCHAR2(10),
    COL_01 VARCHAR2(10),
    COL_02 NUMBER
);

-- CHECK 추가
ALTER TABLE TEST_01
ADD
    (CONSTRAINT CHK_TEST_01 CHECK(COL_01 IN('위', '촉', '오')),
     CONSTRAINT CHK_TEST_02 CHECK(COL_02 >= 1 AND COL_02 <=9));

-- 행추가 후 확인 
INSERT INTO TEST_01(KEY_01, KEY_02, COL_01, COL_02)
VALUES('AAA','aaa','위',1);

--CHECK 삭제
ALTER TABLE TEST_01
DROP 
    CONSTRAINT CHK_TEST_01;

--검증
INSERT INTO TEST_01(KEY_01, KEY_02, COL_01, COL_02)
VALUES('AAA','aaa','가나다',9); --등록 된다  CHECK 는 중복값과 NULL 허용됨



/*
    FOREGIN KEY (외래키)
    다른 테이블의 기본키이거나 고유키를 참조하는 속성 또는 속성들의 집합
    NULL 허용
    부모테이블, 자식테이블
*/

CREATE TABLE TEST_PAR(
    KEY_01 VARCHAR2(10),
    KEY_02 VARCHAR2(10),
    COL_01 VARCHAR2(10),
    COL_02 VARCHAR2(10),
    CONSTRAINT PK_TEST_PAR PRIMARY KEY(KEY_01, KEY_02)
);

--
DROP TABLE TEST_PAR
CASCADE CONSTRAINTS;
--


CREATE TABLE TEST_CHD(
    KEY_01 VARCHAR2(10) CONSTRAINT PK_TEST_CHD PRIMARY KEY,
    KEY_02 VARCHAR2(10),
    FK_KEY_01 VARCHAR2(10),
    FK_KEY_02 VARCHAR2(10),
    CONSTRAINT FK_TEST_CHD FOREIGN KEY(FK_KEY_01, FK_KEY_02)
        REFERENCES TEST_PAR(KEY_01, KEY_02)
);


INSERT INTO TEST_PAR(KEY_01, KEY_02, COL_01, COL_02)
VALUES('AAA','aaa','AAA','111');

INSERT INTO TEST_PAR(KEY_01, KEY_02, COL_01, COL_02)
VALUES('BBB','aaa','AAA','111');


INSERT INTO TEST_CHD(KEY_01, KEY_02, FK_KEY_01, FK_KEY_02)
VALUES('CCC','ccc','','');

INSERT INTO TEST_CHD(KEY_01, KEY_02, FK_KEY_01, FK_KEY_02)
VALUES('DDD','EEE','AAA','aaa');


/*
    로그인 테이블 ID -- PAR
    커피 테이블   ID -- CHD
*/

CREATE TABLE TEST_CHD(
    KEY_01 VARCHAR2(10) CONSTRAINT PK_TEST_CHD PRIMARY KEY,
    KEY_02 VARCHAR2(10),
    FK_KEY_01 VARCHAR2(100),
    FK_KEY_02 VARCHAR2(5)
);

ALTER TABLE TEST_CHD
MODIFY(FK_KEY_01 VARCHAR2(10), FK_KEY_02 VARCHAR2(10))
ADD 
    CONSTRAINT FK_TEST_CHD FOREIGN KEY(FK_KEY_01, FK_KEY_02)
    REFERENCES TEST_PAR(KEY_01, KEY_02);


SELECT * FROM TEST_CHD;



/*
    테이블 수정 -- ALTER
    데이터 수정 -- UPDATE
*/

CREATE TABLE TB_JOBS_BK
AS
SELECT * FROM JOBS;

SELECT * FROM TB_JOBS_BK;

UPDATE TB_JOBS_BK
SET MIN_SALARY = 0
WHERE JOB_ID LIKE 'AD_%';


COMMIT -- 적용
ROLLBACK -- 되돌림

SELECT * FROM TB_JOBS_BK;





--
UPDATE TB_JOBS_BK
SET MIN_SALARY=NULL, MAX_SALARY=NULL   --( 처리 )
WHERE JOB_ID LIKE 'AC_%';               -- IF(JOB_ID == 'AC_%')


--
DELETE
