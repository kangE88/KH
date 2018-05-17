/*
    SEQUENCE (������) : ������ ���� ������ �ִ� ORACLE OBJECT �̴�.
    ȸ����ȣ, �Խ���, �۹�ȣ (1->2->3) ��������
    SEQUENCE �� �����ϸ�, PRIMARY KEY �� ���� ���������� �����ϴ� COLUMN�� �ڵ������� ������ �� �ִ�.
    �������̴�.
    SEQUENCE�� �ʱ�ȭ�� ���� �ʰ� �����ٰ� �ٽ� ����ؾ� �Ѵ�.
*/

-- SEQUENCE ����
CREATE SEQUENCE TEST_SEQ 
INCREMENT BY 1 -- INCREMENT  1������
START WITH 10;

-- SEQUENCE ����
DROP SEQUENCE TEST_SEQ;

-- SEQUENCE ���
-- CURRVAL �ٷ� ��� ����
-- �ѹ� NEXTVAL�� ����� �Ŀ� ��밡���ϴ�.

SELECT TEST_SEQ.CURRVAL FROM DUAL; -- ������ ��

SELECT TEST_SEQ.NEXTVAL FROM DUAL; -- ���� ��

-- SEQUENCE ����
ALTER SEQUENCE TEST_SEQ
INCREMENT BY 3;

-- ���Ǿ�(SYNONYM / ��ü�� ����) : ���Ǿ�(��ü�� ����)�� �����Ͽ� ��ü�� �׼����� �ܼ�ȭ

CREATE SYNONYM "������̺�"--EMSYNO
FOR EMPLOYEES;

SELECT * FROM "������̺�";

DROP SYNONYM "������̺�";
