--TCL (COMMIT, ROLLBACK)

/*
    <TCL(Transaction Control Language)>
        트랜잭션을 제어하는 언어이다.
        
        * 트랜잭션
          - 하나의 논리적인 작업 단위를 트랜잭션이라고 한다.
          - 각각의 작업들을 묶어서 하나의 작업 단위로 만들어 버리는 것을 트랜잭션이라고 한다.
          - 하나의 트랜잭션으로 이루어진 작업들은 반드시 한꺼번에 완료가 되어야 하며, 그렇지 않을 경우에는 한꺼번에 취소되어야 한다.
          - 데이터의 변경 사항(DML(INSERT, UPDATE, DELETE))들을 묶어서 하나에 트랜잭션에 담아 처리한다.
          - COMMIT(트랜잭션 종료 처리 후 저장), ROLLBACK(트랜잭션 취소), SAVEPOINT(임시저장)를 통해서 트랜잭션을 제어한다.
*/

DROP TABLE BOARD;
CREATE TABLE BOARD(
    NO NUMBER
    , TITLE VARCHAR2(100)
);

--COMMIT 이 자동으로 진행됨

INSERT INTO BOARD VALUES(1, '첫번째');
COMMIT;
INSERT INTO BOARD VALUES(2, '두번째');
INSERT INTO BOARD VALUES(3, '세번째');

SELECT * FROM BOARD;

SAVEPOINT SP_INSERT; --3개 행 삽입 후 생성

DELETE BOARD
WHERE NO=2;

SAVEPOINT SP_DELETE; --(1번은 커밋, 2,3번은 SP) > 이렇게 3개 행이 있었으나, 2번 행 삭제한 후 생성

DELETE BOARD;

SELECT * FROM BOARD;

ROLLBACK TO SP_DELETE;
ROLLBACK;
