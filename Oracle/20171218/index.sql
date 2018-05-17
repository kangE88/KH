/*
    INDEX(색인)
    INDEX는 원하는 정보의 위치를 빠르고 정확하게 알아낼수 있는 방법
    자동생성 : PRIMARY, UNIQUE
    수동생성 : QUERY

    생성해야 좋은 경우
    WHERE 절이나 JOIN조건 안에 자주 사용되는 컬럼
    NULL값이 많이 포함되어 있는 컬럼
    WHERE 절이나 JOIN조건 안에 자주 사용되는 2개 이상의 컬럼들
    
    생성해서 나쁜 경우
    테이블이 작을 때 (10000개 이하일때)
    테이블이 자주 갱신될 때
*/

CREATE TABLE EMP_COPY
AS
SELECT * FROM EMPLOYEES;


--
ALTER TABLE EMP_COPY
ADD
CONSTRAINT PK_EMP_01 PRIMARY KEY(EMPLOYEE_ID);


--
SELECT * FROM ALL_INDEXES
WHERE INDEX_NAME IN ('PK_EMP_01');


--강제 생성
CREATE INDEX EMP_INDEX1
ON EMP_COPY(MANAGER_ID);


--삭제
DROP INDEX EMP_INDEX1;


