/*
    INDEX(����)
    INDEX�� ���ϴ� ������ ��ġ�� ������ ��Ȯ�ϰ� �˾Ƴ��� �ִ� ���
    �ڵ����� : PRIMARY, UNIQUE
    �������� : QUERY

    �����ؾ� ���� ���
    WHERE ���̳� JOIN���� �ȿ� ���� ���Ǵ� �÷�
    NULL���� ���� ���ԵǾ� �ִ� �÷�
    WHERE ���̳� JOIN���� �ȿ� ���� ���Ǵ� 2�� �̻��� �÷���
    
    �����ؼ� ���� ���
    ���̺��� ���� �� (10000�� �����϶�)
    ���̺��� ���� ���ŵ� ��
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


--���� ����
CREATE INDEX EMP_INDEX1
ON EMP_COPY(MANAGER_ID);


--����
DROP INDEX EMP_INDEX1;


