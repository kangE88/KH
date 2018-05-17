--  ���� �Լ�
--  CHR(N) : ASCII ���� ���ڷ� ��ȯ

SELECT 1 FROM DUAL;     --  DUAL : �������̺� : ���� �˾ƺ��� ���� ���δ�.

SELECT CHR(65) FROM DUAL;

SELECT 'AAAA' || CHR(97) || 'BBBB'
FROM DUAL;

--  LPAD(RPAD) �������� Ư�� ���ڷ� ä���
SELECT LPAD('BBB',10, ) FROM DUAL;  --      BBB

SELECT LPAD('BBB',10, '-') FROM DUAL;   -- ------BB

SELECT RPAD('BBB',10) FROM DUAL;   -- BBB

SELECT RPAD('BBB',10, '-') FROM DUAL; -- BBB------

--INSTR : INDEXOF

-- ã�� ���ڿ�
SELECT INSTR('A1234B5678A1234B', 'A')
FROM DUAL;

-- ã�� ���ڿ� , ã����ġ
SELECT INSTR('A1234B5678A1234B', 'A', 2)
FROM DUAL;

SELECT INSTR('A1234B5678A1234B', 'B', 7)
FROM DUAL;

-- ã�� ���ڿ� ,ù��° ��ġ, ù��°��ġ ���� ã����ġ
SELECT INSTR('A1234B5678A1234B', 'B', 1, 1)
FROM DUAL;

SELECT INSTR('A1234B5678A1234B', 'A', 1, 1)
FROM DUAL;

-- REPLACE : ���ڿ� ġȯ(���ڿ�)
SELECT REPLACE('AAAAAAAAAAAAASCACDA','A')
FROM DUAL;

SELECT REPLACE('AAAAAAAAAAAAASCACDA','A', '��')
FROM DUAL;

SELECT REPLACE('AAAAAAVVVVVVASCACDA','AA', '��')
FROM DUAL;

-- TRANSLATE : ���� ġȯ(����) �ѹ��ھ��ۿ� �ٲܼ��� ����.
SELECT TRANSLATE('AAAAAAAAAAAAASCACDA','A','��')
FROM DUAL;

SELECT TRANSLATE('AAAAAAVVVVVVASCACDA','AA', '��') -- X �ѹ��ھ� �ٲ�
FROM DUAL;

--  ���� �Լ�
SELECT CEIL(13.5) -- 14 �ø�
FROM DUAL;

SELECT ROUND(13.5) -- 14 �ݿø� 
FROM DUAL;

SELECT FLOOR(13.5) -- 13 ������ ����
FROM DUAL;

SELECT MOD(5, 3) -- 2 ���� ������ ��
FROM DUAL;

SELECT MOD(5, 7) -- 7 ���� ������ ��
FROM DUAL;

SELECT POWER(2, 3) -- 8  2�� 3�� �� 
FROM DUAL;

-- ��ȣ +, 0, -
SELECT SIGN(13.4) -- 1 
FROM DUAL;

SELECT SIGN(0) -- 0
FROM DUAL;

SELECT SIGN(-1.4) -- -1
FROM DUAL;

-- ����

SELECT TRUNC(13.123456) -- 13 �Ҽ��� �Ʒ� ����
FROM DUAL;

SELECT TRUNC(13.123456, 3) -- 13 �Ҽ��� 3��° ���ķ� ����
FROM DUAL;

SELECT TRUNC(13.123456, -1) -- 10 �Ҽ��� -1��° ���ķ� ����
FROM DUAL;


SELECT ASCII('A') -- CHR�� �ݴ� ASCII�ڵ� ���� ���ڷ� ��ȯ
FROM DUAL;


--  ��ȯ �Լ� DATE --> STRING ��ȯ�Ҷ� ���� ���δ�.

--TO_CHAR

SELECT TO_CHAR(SYSDATE) FROM DUAL;

SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD HH:MI:SS') -- ��¥�� ���ڿ��� ��ȯ
FROM DUAL;

SELECT TO_CHAR(100000000, '999,999,999') -- ����, �ݾ� ������ ����
FROM DUAL;

SELECT TO_DATE('20180424') -- ��¥ ������ ����
FROM DUAL;

SELECT TO_DATE('20180424', 'YYYYMMDD') -- ��¥ ������ ����
FROM DUAL;

SELECT TO_DATE('04242018', 'MMDDYYYY') -- ��¥ ������ ����
FROM DUAL;

--PARSEINT()
SELECT TO_NUMBER('100')+1
FROM DUAL;

--  ��¥ �Լ�
SELECT SYSDATE, ADD_MONTHS(SYSDATE, 1) -- ��¥�� N��ŭ ���� ����
FROM DUAL;

-- �ش��ϴ� ���� ������ ����
SELECT LAST_DAY(SYSDATE) FROM DUAL;

-- 4���� ������ ����
SELECT LAST_DAY(TO_DATE('2018-04-24', 'YYYY-MM-DD')) FROM DUAL;

--SUBSTRING 
SELECT SUBSTR('ABCDEFG',3) FROM DUAL; -- 3��° ���ڿ�����
SELECT SUBSTR('ABCDEFG',3,1) FROM DUAL; -- 3��° ���ڿ����� 1��

--LENGTH
SELECT LENGTH('ABCDEFG') FROM DUAL; -- ���ڿ� ����


