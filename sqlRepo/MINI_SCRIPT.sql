-- MINI SCRIPT

-----------------------------------------------------------------
-- MEMBER
-----------------------------------------------------------------
DROP TABLE MEMBER CASCADE CONSTRAINTS; --CREATE ���� �׻� DROP ����� --������ ���̺� ���� �� CASCADE CONSTRAINTS �ֱ�
CREATE TABLE MEMBER(
    NO NUMBER PRIMARY KEY
    , ID VARCHAR2(100) NOT NULL UNIQUE
    , PWD VARCHAR2(100) NOT NULL
    , NICK VARCHAR2(100) NOT NULL
    , ENROLL_DATE TIMESTAMP DEFAULT SYSDATE
    , MODIFY_DATE TIMESTAMP DEFAULT SYSDATE
    , QUIT_YN CHAR(1) DEFAULT 'N' CHECK( QUIT_YN IN('Y', 'N') ) NOT NULL
);

DROP SEQUENCE SEQ_MEMBER_NO;
CREATE SEQUENCE SEQ_MEMBER_NO NOCACHE NOCYCLE;

INSERT INTO MEMBER (NO, ID, PWD, NICK) VALUES(SEQ_MEMBER_NO.NEXTVAL, 'ADMIN', '1234', '������');
COMMIT;

-----------------------------------------------------------------
-- BOARD
-----------------------------------------------------------------

--�� ��ȣ, ����, ����, �ۼ��� ȸ�� ��ȣ, �ۼ��Ͻ�, �����Ͻ�, ����
DROP TABLE BOARD CASCADE CONSTRAINTS;  --�ٸ� ����� �Ʒ� ���̺��� ���������� ������ �� �ֱ� ����
CREATE TABLE BOARD (
    NO NUMBER PRIMARY KEY
    , TITLE VARCHAR2(100) NOT NULL 
    , CONTENT VARCHAR2(100) NOT NULL
    , WRITER_NO NUMBER NOT NULL
    , ENROLL_DATE TIMESTAMP DEFAULT SYSDATE
    , MODIFY_DATE TIMESTAMP DEFAULT SYSDATE
    , STATUS CHAR(1) DEFAULT 'Y' CHECK(STATUS IN('Y', 'N'))
);

DROP SEQUENCE SEQ_BOARD_NO;
CREATE SEQUENCE SEQ_BOARD_NO NOCACHE NOCYCLE;

--�ܷ�Ű
ALTER TABLE BOARD ADD CONSTRAINT BOARD_MEMBER_FK FOREIGN KEY(WRITER_NO) REFERENCES MEMBER;

--���� ������
INSERT INTO BOARD(NO, TITLE, CONTENT, WRITER_NO) --�������� DEFAULT ���� �� ��
VALUES(SEQ_BOARD_NO.NEXTVAL, '�̰� ����', '�ȳ��ϼ��� ���� ����� ����~~', 1);
COMMIT;

---TEST ����. ��� �� �����----------------
SELECT
    B.NO
    , B.TITLE
    , B.CONTENT
    , B.WRITER_NO
    , B.ENROLL_DATE
    , B.MODIFY_DATE
    , M.NICK
FROM BOARD B
JOIN MEMBER M ON B.WRITER_NO = M.NO
WHERE B.NO = 3
AND B.STATUS = 'Y'
;











