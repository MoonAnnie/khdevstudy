--�Լ�
/*
    <�Լ�>
        Į������ �о ��� ����� ��ȯ
        - ������ �Լ� : N ���� ���� �а� N ���� ��� ���� (�� �� ����, �Լ� ���� -> ��� ��ȯ)
        - �׷�   �Լ� : N ���� ���� �а� 1 ���� ��� ���� (�ϳ��� �׷캰�� �Լ� ���� -> ��� ��ȯ)
        
        SELECT ���� ������ �Լ��� �׷� �Լ��� �Բ� ����� �� ���� (��� ���� ������ �ٸ��Ƿ�)
        �Լ��� ����� �� �ִ� ��ġ�� SELECT, WHERE, ORDER BY, HAVING ���� ����� �� �ִ�.

*/

------------------------ ������ �Լ� ------------------------

/*
    <���� ���� �Լ�>
    1) LENGTH / LENGTHB
    - LENGTH(Į��|'���ڿ�') : ���� �� ��ȯ
    - LENGTHB(Į��|'���ڿ�') : ������ ����Ʈ �� ��ȯ
    - �ѱ� : 3 BYTE
    - ������, ����, Ư������ : 1 BYTE
    
    * DUAL ���̺�
    - SYS ����ڰ� �����ϴ� ���̺�
    - SYS ����ڰ� ����������, ��� ����ڰ� ������ �����ϴ�
    - �� ��, �� Į���� ������ �ִ� DUMMY ���̺��̴�
    - ����ڰ� �Լ��� ����� �� �ӽ÷� ����ϴ� ���̺�
*/

SELECT * FROM DUAL;

SELECT LENGTH('�ȳ�'), LENGTHB('�ȳ�')
FROM DUAL;

SELECT LENGTH(EMPNO), LENGTHB(ENAME)
FROM EMP;

/*
    2) INSTR
        - INSTR(Į��|'���ڿ�', ã���� [, POSITION[, OCCURENCE] )
        - ������ ��ġ���� ������ ���� ��°�� ��Ÿ���� ������ ���� ��ġ�� ��ȯ
*/

SELECT INSTR('AABAACAABBAA' , 'B') FROM DUAL; -- ���� ��� 3 : B�� ��ġ
SELECT INSTR('AABAACAABBAA' , 'B' , 1) FROM DUAL; -- ���� ��� 3 : 1��° B�� ��ġ
SELECT INSTR('AABAACAABBAA' , 'B' , 1 , 2) FROM DUAL; -- ���� ��� 9 : 2��° B�� ��ġ
SELECT INSTR('AABAACAABBAA' , 'B' , -1) FROM DUAL; -- ���� ��� 10 : �ڿ��� 1��° B�� ��ġ
SELECT INSTR('AABAACAABBAA' , 'B' , -1, 3) FROM DUAL; -- ���� ��� 3 : �ڿ��� 3��° B�� ��ġ

SELECT INSTR('AABAACAABBAA' , 'B' , 5) FROM DUAL; -- ���� ��� 9 : 5��°���� Ž���� �ϰڴٴ� ��, B�� ��ġ
SELECT INSTR('AABAACAABBAA' , 'B' , 5, 1) FROM DUAL; -- ���� ��� 9 : 5��°���� Ž���� �ؼ� 1��°�� �߻��� B�� ��ġ
SELECT INSTR('AABAACAABBAA' , 'B' , 5, 2) FROM DUAL; -- ���� ��� 10 : 5��°���� Ž���� �ؼ� 2��°�� �߻��� B�� ��ġ

SELECT INSTR('AABAACAABBAA' , 'B' , -4) FROM DUAL; -- ���� ��� 9 : �ڿ������� 4��° ���ں��� Ž���� �ؼ� ������ B�� ��ġ
SELECT INSTR('AABAACAABBAA' , 'B' , -4, 4) FROM DUAL; -- ���� ��� 0 : ���� ���� ��ȸ�ϸ� 0�� ����

/*
    3) LPAD / RPAD
        - LPAD|RPAD(Į��|���ڿ�, ����(����Ʈ)[, ����])
        - ���õ� Į��|���ڰ� �� ������ ���ڸ� ���� �Ǵ� �����ʿ� ���ٿ� ���� N ���� ��ŭ�� ���ڿ� ��ȯ
        - ���ڿ� ���� ���ϰ� �ְ� ǥ���ϰ��� �� �� ����Ѵ�
*/

--10��ŭ�� ���� �� ENAME ���� ������ ����, ������ �������� ä���
SELECT LPAD(ENAME, 10)
FROM EMP;

--10��ŭ�� ���� �� ENAME ���� ������ ����, ������ '#'���� ä���
SELECT LPAD(ENAME, 10, '#')
FROM EMP;

--10��ŭ�� ���� �� ENAME ���� ���� ����, �������� �������� ä���
SELECT RPAD(ENAME, 10)
FROM EMP;

--10��ŭ�� ���� �� ENAME ���� ���� ����, �������� '@'���� ä���
SELECT RPAD(ENAME, 10, '@')
FROM EMP;

/*
    4) LTRIM / RTRIM
        - LTRIM/RTRIM(Į��|���ڰ�[, ���Ź���])
        - ���ڿ��� ���� Ȥ�� �����ʿ��� �����ϰ��� �ϴ� ���ڵ��� ã�Ƽ� ������ ��� ��ȯ
        - �����ϰ��� �ϴ� ���ڰ��� ���� �� �⺻ ������ ���� ����
*/

SELECT LTRIM('                  HELLO                 ') FROM DUAL;
SELECT RTRIM('                  HELLO                 ') FROM DUAL;

SELECT LTRIM('0000012300000', 0) FROM DUAL;
SELECT RTRIM('0000012300000', 0) FROM DUAL;

SELECT LTRIM('12345', 3) FROM DUAL;
SELECT RTRIM('12345', 4) FROM DUAL;

/*
    5) TRIM
        - TRIM([LEADING]|TRAILING|BOTH] ���Ź��� FROM Į��|����)
        - ���ڰ� ��/��/���� ������ ���ڸ� �����ϰ� ������ ��ȯ
        - �����ϰ��� �ϴ� ���� ���� ��, ������ ����
*/

SELECT '    �ȳ�     ' FROM DUAL;
SELECT TRIM('    �ȳ�     ') FROM DUAL;

SELECT TRIM('H' FROM 'HELLO     ') FROM DUAL;
SELECT TRIM('Z' FROM 'ZZZHELLOZZZ') FROM DUAL;
SELECT TRIM(LEADING'Z' FROM 'ZZZHELLOZZZ') FROM DUAL;
SELECT TRIM(TRAILING'Z' FROM 'ZZZHELLOZZZ') FROM DUAL;

/*
    6) SUBSTR
        - SUBSTR(Į��|���ڰ�, POSITION [, LENGTH])
        - ���� �����Ϳ��� ������ ��ġ���� ������ ������ŭ�� ���ڿ� �����ؼ� ��ȯ
*/

SELECT 'HELLO WORLD' FROM DUAL;
SELECT SUBSTR('HELLO WORLD', 3) FROM DUAL;
SELECT SUBSTR('HELLO WORLD', 3 , 5) FROM DUAL;
SELECT SUBSTR('HELLO WORLD', -5) FROM DUAL;
SELECT SUBSTR('HELLO WORLD', -5, 3) FROM DUAL;

/*
    7) LOWER / UPPER / INITCAP
*/

SELECT 'Hello World !' FROM DUAL;

SELECT LOWER('Hello World !') FROM DUAL;
SELECT UPPER('Hello World !') FROM DUAL;
SELECT INITCAP('abc !') FROM DUAL;
SELECT initcap('hello world !')from dual;
SELECT initcap('hello world abc-abc.abc,abc,zzz123zzz������zzz!')from dual;


/*
    8) CONCAT
        - CONCAT(Į��|���ڰ�, Į��|���ڰ�)
        - ���ڵ����� �� ���� �޾Ƽ� ������
*/

SELECT CONCAT('AAA', 'BBB')
FROM DUAL;

SELECT 'AAA'||'BBB'
FROM DUAL;

/*
    9) REPLACE
        - REPLACE(Į��|���ڰ�, TARGET, STR)
        - Į�� �Ǵ� ���ڰ����� TARGET �� STR �� �����Ͽ� ��ȯ
*/

SELECT '����� ������ ���ﵿ' FROM DUAL;

SELECT REPLACE('����� ������ ���ﵿ', '������', '���ϱ�') FROM DUAL;
SELECT REPLACE('����� ������ ���ﵿ', '�����', '����Ư����') FROM DUAL;

SELECT '�ȳ��ϼ��� �ȳ���������' FROM DUAL;
SELECT REPLACE('�ȳ��ϼ��� �ȳ���������', '�ȳ�', '') FROM DUAL;

SELECT initcap('hello world !')from dual;

-------------------------------------------------
/*
    1) ABX
        - ABS(NUMBER)
        - ���밪 ���ϴ� �Լ�
*/

SELECT ABS(-7) FROM DUAL;

/*
    2) MOD
        - MOD(NUMBER , NUMBER)
*/

SELECT 10/3 FROM DUAL;
--SELECT 10%3 FROM DUAL; --���� �߻�
SELECT MOD (10,3) FROM DUAL; --������ ���ϱ�

/*
    3) ROUND
        - ROUND(NUMBER[, ��ġ])
        - �ݿø�
*/

SELECT ROUND(123.456) FROM DUAL;
SELECT ROUND(123.456, 0) FROM DUAL;
SELECT ROUND(123.456, 1) FROM DUAL;
SELECT ROUND(123.456, 4) FROM DUAL;
SELECT ROUND(123.456, -1) FROM DUAL;
SELECT ROUND(123.456, -2) FROM DUAL;
SELECT ROUND(123.456, -3) FROM DUAL;
SELECT ROUND(789.456, -3) FROM DUAL;

/*
    4) CEIL
        - CEIL(NUMBER)
        - �Ҽ��� �Ʒ� �ø�
*/

SELECT CEIL(123.456) FROM DUAL;

/*
    5) FLOOR
        - �Ҽ��� �Ʒ� ����
*/

SELECT FLOOR(123.456) FROM DUAL;

/*
    6) TRUNC
        - ��ġ �����Ͽ� ����
        - ������ ������ ����
*/

SELECT TRUNC(123.456) FROM DUAL;
SELECT TRUNC(123.456, 1) FROM DUAL;
SELECT TRUNC(123.456, 2) FROM DUAL;
SELECT TRUNC(123.456, -2) FROM DUAL;

----------------------------------------
/*
    ��¥ ���� �Լ�
    
    1) SYSDATE
        - �ý����� ���� ��¥�� �ð� ��ȯ
*/

SELECT SYSDATE FROM DUAL;

/*
    2) MONTHS_BETWEEN
        - �� ��¥ ������ ���� ���� ����
        - ���� �� : NUMBER
*/

SELECT ENAME, FLOOR(MONTHS_BETWEEN(SYSDATE ,HIREDATE)) �ٹ�������, HIREDATE �Ի���
FROM EMP;

/*
    3) ADD_MONTHS
        - ���� ���� ������
        - ���� �� : DATE
*/

SELECT ADD_MONTHS(SYSDATE, 6) FROM DUAL;
SELECT ADD_MONTHS('2002/12/31', 6) FROM DUAL;

/*
    4) NEXT_DAY
        [����]
            NEXT_DAY(DATE, ����(����|����))
        - ���� �Ķ���� DATE ���� ���� ����� ���� ���� ����
*/

SELECT SYSDATE, NEXT_DAY(SYSDATE, '�ݿ���') FROM DUAL;
SELECT SYSDATE, NEXT_DAY(SYSDATE, '��') FROM DUAL;
SELECT SYSDATE, NEXT_DAY(SYSDATE, 6) FROM DUAL;
--SELECT SYSDATE, NEXT_DAY(SYSDATE, 'FRIDAY') FROM DUAL; --��� ������ ����� �����ؾ� ��
SELECT SYSDATE, NEXT_DAY(SYSDATE, '������') FROM DUAL;

ALTER SESSION SET NLS_LANGUAGE = KOREAN; --��� ����
--SELECT SYSDATE, NEXT_DAY(SYSDATE, 'FRIDAY') FROM DUAL;
--SELECT SYSDATE, NEXT_DAY(SYSDATE, 'FRI') FROM DUAL;

/*
    5) LAST_DAY
        - �ش� ���� ������ �� ����
    
*/

SELECT LAST_DAY(SYSDATE) FROM DUAL;
SELECT LAST_DAY('22/08/08') FROM DUAL;
SELECT LAST_DAY('22/12/01') FROM DUAL;

/*
    6) EXTRACT
        - EXTRACT(YEAR | MONTH | DAY FROM DATE)
        - ����Ÿ�� : NUMBER
*/

SELECT EXTRACT(YEAR FROM SYSDATE) FROM DUAL;
SELECT EXTRACT(MONTH FROM SYSDATE) FROM DUAL;
SELECT EXTRACT(DAY FROM SYSDATE) FROM DUAL;

--��¥ ���� ����
SELECT SYSDATE FROM DUAL;

ALTER SESSION SET NLS_DATE_FORMAT = 'YYYY-MM-DD HH:MI:SS';
ALTER SESSION SET NLS_DATE_FORMAT = 'YYYY-MM-DD HH:MI:SS AM';
ALTER SESSION SET NLS_DATE_FORMAT = 'YYYY#MM#DD# HH:MI:SS';

ALTER SESSION SET NLS_DATE_FORMAT = 'RR/MM/DD'; --���� ���·� SESSION ����

-----------------------------------------------------------------------------

/*
    ����ȯ �Լ�
    
    1) TO_CHAR
*/

--���� -> ����
SELECT TO_CHAR(1234) FROM DUAL;
SELECT TO_CHAR(1234 , '999999') AS ZZZZZZ FROM DUAL; --6ĭ�� ���� Ȯ��, �� ĭ�� �������� ä��
SELECT TO_CHAR(1234 , '000000') AS ZZZZZZ FROM DUAL; --6ĭ�� ���� Ȯ��, �� ĭ�� 0���� ä��
SELECT TO_CHAR(1234 , 'L999999') AS ZZZZZZ FROM DUAL; --���� ������ ������ ȭ����� (LOCATION)
SELECT TO_CHAR(1234 , '$999999') AS ZZZZZZ FROM DUAL; -- 
SELECT TO_CHAR(1234 , 'L999,999') AS ZZZZZZ FROM DUAL;
SELECT TO_CHAR(123456789 , 'L999,999,999,999') AS ZZZZZZ FROM DUAL;

--��� ���̺� �޿� ��ȸ
SELECT EMPNO, ENAME, TO_CHAR(SAL , 'L99,999,999')
FROM EMP
;

--��¥ -> ����
SELECT SYSDATE FROM DUAL;
SELECT TO_CHAR(SYSDATE) FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD HH:MI:SS') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD HH:MI:SS AM') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'MON DY, YYYY') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'MON DAY, YYYY') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD(DY)') FROM DUAL;

/*
    2) TO_DATE
*/

--���� -> ��¥
SELECT TO_DATE(20220706) FROM DUAL;

--���� -> ��¥
SELECT TO_DATE('20220706') FROM DUAL;
SELECT TO_DATE('2022/07/06') FROM DUAL;
SELECT TO_DATE('2022-07-06') FROM DUAL;
SELECT TO_DATE('2022.07.06') FROM DUAL;

/*
    3) TO_NUMBER
*/

--���� -> ����
SELECT TO_NUMBER('123456789') FROM DUAL;
SELECT '111' + '222' FROM DUAL; --�ڵ����� ���� Ÿ������ ����ȯ �� ����ó��
SELECT '123' + '456A' FROM DUAL; --���ڰ� ���� ������ ������ (���ڸ� �־�� ��� ����)
SELECT '10,000' + '20,000' FROM DUAL; --����
SELECT TO_NUMBER('10,000') + TO_NUMBER('20,000') FROM DUAL; --����
SELECT TO_NUMBER('10,000', '99,999,999') + TO_NUMBER('20,000','99,999') FROM DUAL; --���� ������ �ڿ� ������� ������ �ȳ�

/*
    NILL ó�� �Լ�
        [����]
            NVL(Į��, NULL ��ü��)
        - NULL �� �Ǿ��ִ� Į���� ���� ���ڷ� ������ ������ �����Ͽ� ��ȯ
        
            NVL2(Į��, ��ü��1, ��ü��2)
        - Į�� ���� NULL �� �ƴϸ� ��ü��1, Į�� ���� NULL �̸� ��ü��2 �� ��ȯ�Ѵ�
        
            NULL IF(�񱳴��1, �񱳴��2)
        - �� ���� ���� �����ϸ� NULL ��ȯ
        - �� ���� ���� �������� ������ �񱳴��1 ��ȯ
*/

--EMP ���̺��� �����, COMM ��ȸ (COMM �� NULL �̸� 0 �� ���)
SELECT ENAME, NVL(COMM,0)
FROM EMP;

SELECT ENAME, NVL(COMM,'����')
FROM EMP;

--EMP ���̺��� �����, (�޿�+COMM)*12 ��ȸ (NULL ���� 0���� ó���Ͽ� ���)
SELECT ENAME, (SAL+NVL(COMM, 0))*12
FROM EMP;

--EMP ���̺��� �����, JOB, MGR ��ȸ (MGR �� NULL �� ���, 0 ���� ��ȸ)
SELECT ENAME, JOB, NVL(MGR, 0)
FROM EMP;

--EMP ���̺��� �����, (SAL+COMM) AS �޿���ȸ (COMM �� NULL �̸� 0 ���� ó��, �װ� �ƴ϶�� 100 ���� ó��)
SELECT ENAME, COMM, NVL2(COMM, 100, 0), SAL+NVL2(COMM, 0, 100) �޿���ȸ
FROM EMP;

SELECT NULLIF(123,123)
FROM DUAL;

--EMP ���̺��� �����, (SAL+COMM) AS �޿���ȸ (COMM �� NULL �̰ų� 0 �̸�, 0 ���� ó��, �װ� �ƴ϶�� 100 ���� ó��)
SELECT ENAME, SAL, COMM, SAL+NVL2(NULLIF(COMM, 0), 100, 0) �޿���ȸ
FROM EMP;

/*
    �����Լ�
        ���� ���� ��쿡 ���� ������ �� �� �ִ� ����� �����ϴ� �Լ�
    DECODE(Į��|����, ���ǰ�1, �����1, ���ǰ�2, �����2 .....)
        ���ϰ��� �ϴ� ���� ���ǰ��� ��ġ�ϴ� ���, �׿� �ش��ϴ� ������� ��ȯ
*/

--EMP ���̺��� ���, �����, JOB ��ȸ 
--(��, JOB �� MANAGER �� ��� �Ŵ��� ��� ���, SALESMAN �� ��� ���� �̶�� ���)
SELECT EMPNO, ENAME, JOB, DECODE(JOB, 'MANAGER', '�Ŵ���', 'SALESMAN', '����', 'PRESIDENT', '��������Ʈ')
FROM EMP;

/*
    CASE
        [����]
        CASE WHEN ���ǽ�1 THEN �����1
             WHEN ���ǽ�2 THEN �����2
             WHEN ���ǽ�3 THEN �����2
             ...
             ELSE �����
        END
*/

--EMP ���̺��� �����, �޿�, ���� ��ȸ (���� ? SALL �� 1000 �Ʒ��� �ʱ�, 1000 ~ 3000 ���̸� �߱�, �������� ���)
SELECT
    ENAME
    , SAL
    , CASE
        WHEN SAL < 1000 THEN '�ʱ�'
        WHEN SAL < 3000 THEN '�߱�'
        ELSE '���'
    END AS ����
FROM EMP;

------------------------------------------------------------------------------
-------------------------�׷��Լ�-------------------------------

/*
    �뷮�� �����͵�� ���質 ��� ���� �۾��� ó���ϴ� ��� ���
    ��� �׷� �Լ��� NULL ���� �ڵ����� �����ϰ� ���� �ִ� �͵鸸 ���
    ���� ������ ����, AVG �Լ� ��� �� �ݵ�� NVL() �Լ��� ����ϴ� ���� ����
*/

/*
    1) SUM
        [����]
            SUM(NUMBER)
        - �ش� Į�� ������ �� �հ踦 ��ȯ
*/

SELECT SUM(COMM)
FROM EMP;

--EMP ���̺��� �μ��ڵ尡 30 �� ������� �޿� �հ� ��ȸ
SELECT SUM(SAL)
FROM EMP
WHERE DEPTNO = 30
;

--COMM �� NULL �� �ƴ� ������� COMM �հ� ��ȸ
SELECT SUM(COMM)
FROM EMP
--WHERE COMM IS NOT NULL
;

--EMP ���̺��� ������� S�� �����ϴ� ����� SAL �հ� ��ȸ
SELECT SUM(SAL)
FROM EMP
WHERE ENAME LIKE 'S%'
;

/*
    2) AVG
        [����]
            AVG(NUMBER)
*/

--EMP ���̺��� �� ����� �޿� ����� ��ȸ
SELECT AVG(SAL)
FROM EMP
;

--EMP ���̺��� �μ��ڵ尡 30�� ����� �޿� ����� ��ȸ
SELECT AVG(SAL)
FROM EMP
WHERE DEPTNO = 30
;

--EMP ���̺��� �μ��ڵ尡 30�� ����� COMM ����� ��ȸ
SELECT AVG(COMM)
FROM EMP
WHERE DEPTNO = 30
;

--EMP ���̺��� �Ի����ڰ� 81�⵵ ������ ����� �޿� ��� ��ȸ
SELECT AVG(SAL)
FROM EMP
WHERE HIREDATE >= '81/01/01'
;
--�ٸ� Ǯ��
SELECT AVG(SAL)
FROM EMP
WHERE EXTRACT(YEAR FROM HIREDATE) >= 1981
;
--�ٸ� Ǯ�� 2
SELECT AVG(SAL)
FROM EMP
WHERE HIREDATE > '81/01/01'
;

/*
    3) MIN / MAS
*/

--EMP ���̺��� ���� ���� �޿� ��ȸ
SELECT MAX(SAL)
FROM EMP;

--EMP ���̺��� ���� ���� �޿� ��ȸ
SELECT MIN(SAL)
FROM EMP;

/*
    4) COUNT
        COUNT(..)
    - ���� ���� ��ȯ
    - COUNT(Į��) : Į���� NULL �� �ƴ� ���� ������ ��ȯ
    - COUNT(DISTINCT Į��)
*/

SELECT 
    *
--    COUNT(*)
FROM EMP
WHERE DEPTNO = 30
;

SELECT
--    COMM
    COUNT(COMM)
FROM EMP
;

SELECT
--    DISTINCT DEPTNO
    COUNT(DISTINCT DEPTNO)
FROM EMP
;












