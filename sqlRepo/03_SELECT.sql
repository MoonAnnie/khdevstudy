--SELECT
/*
    <SELECT ��>
        [����]
            SELECT Į��1, Į��2, Į��3 .... Į��
            FROM ���̺��;
            
        - �����͸� ��ȸ�ϰ��� �� �� ���
        - SELECT �� ���ؼ� ��ȸ�� ����� RESULT SET �̶�� �Ѵ�. (��ȸ�� ����� ����)
        - ��ȸ�ϰ��� �ϴ� Į������ �ݵ�� FROM ���� ����� ���̺� �����ϴ� Į���̾�� �Ѵ�.
*/

--EMP ���̺� ��ȸ
SELECT * FROM EMP;
SELECT EMPNO, ENAME, JOB, SAL FROM EMP;

--EMP ���̺���, �����ȣ, ����̸�, ���� ��ȸ�ϱ�
SELECT EMPNO, ENAME, SAL FROM EMP;

--EMP ���̺��� ��� Į�� ��ȸ�ϱ�
SELECT * 
FROM EMP;

--��ҹ��� �������� ���� (but ���ʻ� �빮�ڷ� ��)
select empno, ename
from emp;

/*
    �������
        SELECT ���� Į���� �Է� �κп��� ��� ������ �̿��ؼ� ����� ��ȸ�� �� �ִ�.
*/

--EMP ���̺��� �����̸�, �������� ��ȸ�ϱ�
SELECT ENAME, SAL * 12
FROM EMP;

--NULL �� ������ �ص� NULL ���� ���´�
SELECT ENAME, COMM * 12
FROM EMP;

--���� �� NULL ���� �ϳ��� �ִٸ� NULL
SELECT ENAME, (SAL + COMM) * 12
FROM EMP;

--DATE ����
SELECT ENAME, FLOOR(SYSDATE - HIREDATE)
FROM EMP;

--Į���� ��Ī ����
SELECT ENAME, FLOOR(SYSDATE - HIREDATE) �ٹ��Ⱓ
FROM EMP;

--��ü ������ �̸�, 1��ġ (�޿�+COMM) ����Ͽ� ��ȸ
SELECT ENAME, (SAL + COMM) * 12 AS ���ҵ�
FROM EMP;

/*
    <���ͷ�>
        SELECT ���� ���ͷ��� ����ϸ� ���̺� �����ϴ� ������ó�� ��ȸ�� �����ϴ�.
        ���ͷ��� RESULT SET �� ��� �࿡ �ݺ� ��µȴ�.
*/

--EMP ���̺��� ���, �̸�, �޿�(��) ��ȸ
SELECT EMPNO, ENAME, SAL, '�� �Դϴ�.' AS "����(����)"
FROM EMP;

/*
    <DISTINCT>
        Į���� ���Ե� �ߺ� ���� �� ������ ǥ���ϰ��� �� �� ����Ѵ�.
        SELECT ���� �� ���� ��� ����
        Į���� ���� ���̸� Į�� ������ ��� �����ؾ� �ߺ� ������ �ǴܵǾ� �ߺ��� ���ŵȴ�.
*/

--EMP ���̺��� ������ ��ȸ (�ߺ�����)
SELECT DISTINCT JOB FROM EMP;

--
SELECT DISTINCT JOB, DEPTNO FROM EMP;
--SELECT DISTINCT JOB, DISTINCT DEPTNO FROM EMP; --�����߻� (DISTINCT �� �� ���� ��� ����)


/*
    <���� ������>
        ���� Į�� ���� �ϳ��� Į���� ��ó�� �����ϰų� Į���� ���ͷ��� ������ �� �ִ�.
*/

--EMP ���̺���, ���, �����, �޿��� �����ؼ� ��ȸ
SELECT EMPNO || ENAME || SAL
FROM EMP;

--EMP ���̺���, �����, �޿��� ���ͷ��� �����Ͽ� ��ȸ
SELECT ENAME || ' �� ������ ' || SAL || ' �Դϴ�'
FROM EMP;

/*
    <WHERE ��>
        [����]
            SELECT Į��1, Į��2, ... Į��
            FROM ���̺��
            WHERE ���ǽ�;
            
        - ��ȸ�ϰ��� �ϴ� ���̺��� �ش� ���ǿ� �����ϴ� ������� ��ȸ�ϰ��� �� �� ����Ѵ�.
        - ���ǽĿ��� �پ��� �����ڵ��� ����� �� �ִ�.
        
    <�� ������>
        <, >, <=, >= : ��Һ�
        =            : �����
        !=, ^=, <>   : �����ʴ�
*/

--EMP ���̺��� �μ��ڵ尡 30�� ������� ��� Į�� ��ȸ
SELECT *
FROM EMP
WHERE DEPTNO = 30;

--EMP ���̺��� �μ��ڵ尡 20�� �ƴ� ������� ���, �����, �μ��ڵ� ��ȸ
SELECT EMPNO, ENAME, DEPTNO
FROM EMP
WHERE DEPTNO != 20;

--EMP ���̺��� �޿��� 1000 �̻��� �������� �̸�, �μ��ڵ�, �޿� ��ȸ
SELECT ENAME, DEPTNO, SAL
FROM EMP
WHERE SAL >= 1000;

--�ǽ�����
--1. EMP ���̺��� COMM �� 0 �ʰ��� ����� �̸�, �Ի���, �μ��ڵ� ��ȸ
SELECT ENAME, HIREDATE, DEPTNO
FROM EMP
WHERE COMM > 0;
--2. EMP ���̺��� �޿��� 1500 ������ ����� �̸�, �޿�, �μ��ڵ� ��ȸ
SELECT ENAME, SAL, DEPTNO
FROM EMP
WHERE SAL <= 1500;

/*
    <�� ������>
        AND
        OR
*/

--EMP ���̺��� �μ��ڵ尡 30 �̸鼭 �޿��� 1000 �̻��� ��� ��ȸ
SELECT * 
FROM EMP
WHERE DEPTNO = 30 
AND SAL >= 1000;

--EMP ���̺��� �޿��� 2000 �̻��̸鼭, JOB �� MANAGER �� ����� ��� Į�� ��ȸ
SELECT *
FROM EMP
WHERE SAL >= 2000
AND JOB = 'MANAGER';

--EMP ���̺��� �޿��� 2000 �̻��̸鼭 4000 ������ ����� ���, �����, �μ��ڵ�, �޿� ��ȸ
SELECT EMPNO, ENAME, DEPTNO, SAL
FROM EMP
WHERE SAL >= 2000 
AND SAL <= 4000;

/*
    <BETWEEN AND>
        [����]
            WHERE �񱳴��Į�� BETWEEN A AND B
            
        - WHERE ������ ���Ǵ� �������� ������ ���� ������ ������ �� ���
        - �񱳴��Į�� ���� A �� B ������ ��� TRUE �� ������
*/

--EMP ���̺��� �޿��� 2000 �̻��̸鼭 4000 ������ ����� ���, �����, �μ��ڵ�, �޿� ��ȸ
SELECT 
    EMPNO
    , ENAME
    , DEPTNO
    , SAL
FROM 
    EMP
WHERE SAL BETWEEN 2000 AND 4000;
--AND
--DEPTNO BETWEEN 20 AND 40;

--EMP ���̺��� �޿��� 2000 �̻��̸鼭 4000 ���ϰ� �ƴ� ����� ���, �����, �μ��ڵ�, �޿� ��ȸ
SELECT 
    EMPNO
    , ENAME
    , DEPTNO
    , SAL
FROM 
    EMP
WHERE SAL NOT BETWEEN 2000 AND 4000;
--WHERE NOT SAL BETWEEN 2000 AND 4000
--NOT �� Į�� �� �Ǵ� BETWEEN �տ� �ۼ� ����

--EMP ���̺��� �Ի����� 81/01/01 ~ 81/12/31 �� �ƴ� ����� ��� Į�� ��ȸ
SELECT *
FROM EMP
WHERE HIREDATE NOT BETWEEN '81/01/01' AND '81/12/31'
ORDER BY HIREDATE;

-- OR ������
SELECT *
FROM EMP
WHERE SAL < 1000
OR NOT SAL > 4000
;

/*
    <LIKE>
        [����]
            WHERE ��Į�� LIKE '����';
            
        - ���Ϸ��� Į���� ������ Ư�� ���Ͽ� ������ ��� TRUE ����
        - Ư�� ���Ͽ��� '%', '_' �� ���ϵ� ī��� ��� ����
            % : 0 ���� �̻�
                EX) ��Į�� LIKE '�ȳ�%' => ��Į�� �� �� '�ȳ�' ���� �����ϴ� ��� ���� ��ȸ
                EX) ��Į�� LIKE '%�ȳ�' => ��Į�� �� �� '�ȳ�' ���� ������ ��� ���� ��ȸ
                EX) ��Į�� LIKE '%�ȳ�%' => ��Į�� �� �� '�ȳ�' �� �����ϴ� ��� ���� ��ȸ
                
            _ : 1 ����
                EX) ��Į�� LIKE '_�ȳ�' => ��Į�� �� �� '�ȳ�' �տ� �� ���ڰ� ���� ���� ��ȸ
                EX) ��Į�� LIKE '�ȳ�_' => ��Į�� �� �� '�ȳ�' �ڿ� �� ���ڰ� ���� ���� ��ȸ
                EX) ��Į�� LIKE '�ȳ�__' => ��Į�� �� �� '�ȳ�' �ڿ� �� ���ڰ� ���� ���� ��ȸ
*/

--EMP ���̺��� �̸��� J �� �����ϴ� ����� ���, �����, �μ��ڵ� ��ȸ
SELECT EMPNO, ENAME, DEPTNO
FROM EMP
WHERE ENAME LIKE 'J%';

--EMP ���̺��� �̸��� N ���� ���� ����� ���, �����, �μ��ڵ� ��ȸ
SELECT EMPNO, ENAME, DEPTNO
FROM EMP
WHERE ENAME LIKE '%N';

--EMP ���̺��� �̸��� E �� ���ԵǴ� ����� ���, �����, �μ��ڵ� ��ȸ
SELECT EMPNO, ENAME, DEPTNO
FROM EMP
WHERE ENAME LIKE '%E%';

--EMP ���̺��� �̸��� 5������ ����� ���, ����� ��ȸ
SELECT EMPNO, ENAME
FROM EMP
WHERE ENAME LIKE '_____';
--����� �ϳ��� ���� �ϳ��� �ǹ� (����, ����, Ư������..���)

--EMP ���̺��� �����ȣ�� �� ��° �ڸ��� '5' �� ����� ���, ����� ��ȸ
SELECT EMPNO, ENAME
FROM EMP
WHERE EMPNO LIKE '_5%';
--�ڿ��� �� ���ڰ� ���� �𸣴ϱ� %�� ����


---------------------------------- �ǽ� ----------------------------------------
-- 1. EMP ���̺��� �̸��� ù ���ڰ� S �� �ƴ� ����� ���, �̸� ��ȸ
SELECT EMPNO, ENAME
FROM EMP
WHERE ENAME NOT LIKE 'S%';

/*
    <IS NULL / IS NOT NULL>
        [����]
            WHERE ��Į�� IS [NOT] NULL;
            
        - Į�� ���� NULL �� ���� ��� NULL �� �񱳿� ����
        - IS NULL : ��Į�� ���� NULL �� ��� TRUE
        - IS NOT NULL : ��Į�� ���� NULL �� �ƴ� ��� TRUE
*/

--EMP ���̺��� COMM �� NULL �� ����� ��� Į�� ��ȸ
SELECT *
FROM EMP
WHERE COMM IS NULL;

--EMP ���̺��� COMM �� NULL �� �ƴ� ����� ��� Į�� ��ȸ
SELECT * 
FROM EMP
WHERE COMM IS NOT NULL;

/*
    <IN>
        [����]
            WHERE ��Į�� IN (��, ��, ��, �� ... ��);
            
        - �� ��� �� ��ġ�ϴ� ���� ���� ��� TRUE ����
*/

--EMP ���̺��� JOB �� SALESMAN �̰ų� MANAGER �� ����� ��� Į�� ��ȸ
SELECT *
FROM EMP
WHERE JOB IN ('SALESMAN', 'MANAGER');

--SELECT *
--FROM EMP
--WHERE JOB = 'SALESMAN'
--OR 
--JOB = 'MANAGER';

/*
    <������ �켱����>
        0. ()
        1. ��� ������
        2. ���� ������
        3. �� ������
        4. IS NULL, LIKE, IN
        5. BETWEEN AND
        6. NOT
        7. AND
        8. OR
*/

/*
    <ORDER BY>
        SQL �������� �߰��Ͽ� ���� ����
        ASC, DESC ���� �������� �������� ���� ����
*/

--EMP ���̺��� ��� ������ ��ȸ (��������)
SELECT *
FROM EMP
ORDER BY SAL;

--EMP ���̺��� ��� ������ ��ȸ (��������)
SELECT *
FROM EMP
ORDER BY SAL DESC;

--EMP ���̺��� ��� ������ ��ȸ
SELECT *
FROM EMP
ORDER BY COMM
--ORDER BY COMM ASC
--ORDER BY COMM DESC
--ORDER BY COMM ASC NULLS FIRST
----NULL ���� ���� ������
--ORDER BY COMM ASC NULLS LAST
--ORDER BY DEPTNO, SAL
----�켱 DPETNO ���� �����ϰ� �� ������ SAL �� ����
;

--EMP ���̺��� EMPNO, ENAME, HIREDATE ������ ��ȸ
SELECT EMPNO ���, ENAME �����, HIREDATE �Ի���
FROM EMP
--ORDER BY HIREDATE
ORDER BY �Ի���
;










