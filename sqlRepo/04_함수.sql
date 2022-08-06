--함수
/*
    <함수>
        칼럼값을 읽어서 계산 결과를 반환
        - 단일행 함수 : N 개의 값을 읽고 N 개의 결과 리턴 (매 행 마다, 함수 실행 -> 결과 반환)
        - 그룹   함수 : N 개의 값을 읽고 1 개의 결과 리턴 (하나의 그룹별로 함수 실행 -> 결과 반환)
        
        SELECT 절에 단일행 함수와 그룹 함수를 함께 사용할 수 없음 (결과 행의 갯수가 다르므로)
        함수를 기술할 수 있는 위치는 SELECT, WHERE, ORDER BY, HAVING 절에 기술할 수 있다.

*/

------------------------ 단일행 함수 ------------------------

/*
    <문자 관련 함수>
    1) LENGTH / LENGTHB
    - LENGTH(칼럼|'문자열') : 글자 수 반환
    - LENGTHB(칼럼|'문자열') : 글자의 바이트 수 반환
    - 한글 : 3 BYTE
    - 영문자, 숫자, 특수문자 : 1 BYTE
    
    * DUAL 테이블
    - SYS 사용자가 소유하는 테이블
    - SYS 사용자가 소유하지만, 모든 사용자가 접근이 가능하다
    - 한 행, 한 칼럼을 가지고 있는 DUMMY 테이블이다
    - 사용자가 함수를 사용할 때 임시로 사용하는 테이블
*/

SELECT * FROM DUAL;

SELECT LENGTH('안녕'), LENGTHB('안녕')
FROM DUAL;

SELECT LENGTH(EMPNO), LENGTHB(ENAME)
FROM EMP;

/*
    2) INSTR
        - INSTR(칼럼|'문자열', 찾을값 [, POSITION[, OCCURENCE] )
        - 지정한 위치부터 지정된 숫자 번째로 나타나는 문자의 시작 위치를 반환
*/

SELECT INSTR('AABAACAABBAA' , 'B') FROM DUAL; -- 실행 결과 3 : B의 위치
SELECT INSTR('AABAACAABBAA' , 'B' , 1) FROM DUAL; -- 실행 결과 3 : 1번째 B의 위치
SELECT INSTR('AABAACAABBAA' , 'B' , 1 , 2) FROM DUAL; -- 실행 결과 9 : 2번째 B의 위치
SELECT INSTR('AABAACAABBAA' , 'B' , -1) FROM DUAL; -- 실행 결과 10 : 뒤에서 1번째 B의 위치
SELECT INSTR('AABAACAABBAA' , 'B' , -1, 3) FROM DUAL; -- 실행 결과 3 : 뒤에서 3번째 B의 위치

SELECT INSTR('AABAACAABBAA' , 'B' , 5) FROM DUAL; -- 실행 결과 9 : 5번째부터 탐색을 하겠다는 뜻, B의 위치
SELECT INSTR('AABAACAABBAA' , 'B' , 5, 1) FROM DUAL; -- 실행 결과 9 : 5번째부터 탐색을 해서 1번째로 발생한 B의 위치
SELECT INSTR('AABAACAABBAA' , 'B' , 5, 2) FROM DUAL; -- 실행 결과 10 : 5번째부터 탐색을 해서 2번째로 발생한 B의 위치

SELECT INSTR('AABAACAABBAA' , 'B' , -4) FROM DUAL; -- 실행 결과 9 : 뒤에서부터 4번째 글자부터 탐색을 해서 나오는 B의 위치
SELECT INSTR('AABAACAABBAA' , 'B' , -4, 4) FROM DUAL; -- 실행 결과 0 : 없는 값을 조회하면 0이 나옴

/*
    3) LPAD / RPAD
        - LPAD|RPAD(칼럼|문자열, 길이(바이트)[, 문자])
        - 제시된 칼럼|문자값 에 임의의 문자를 왼쪽 또는 오른쪽에 덧붙여 최종 N 길이 만큼의 문자열 반환
        - 문자에 대해 통일감 있게 표시하고자 할 때 사용한다
*/

--10만큼의 길이 중 ENAME 값은 오른쪽 정렬, 왼쪽은 공백으로 채우기
SELECT LPAD(ENAME, 10)
FROM EMP;

--10만큼의 길이 중 ENAME 값은 오른쪽 정렬, 왼쪽은 '#'으로 채우기
SELECT LPAD(ENAME, 10, '#')
FROM EMP;

--10만큼의 길이 중 ENAME 값은 왼쪽 정렬, 오른쪽은 공백으로 채우기
SELECT RPAD(ENAME, 10)
FROM EMP;

--10만큼의 길이 중 ENAME 값은 왼쪽 정렬, 오른쪽은 '@'으로 채우기
SELECT RPAD(ENAME, 10, '@')
FROM EMP;

/*
    4) LTRIM / RTRIM
        - LTRIM/RTRIM(칼럼|문자값[, 제거문자])
        - 문자열의 왼쪽 혹은 오른쪽에서 제거하고자 하는 문자들을 찾아서 제거한 결과 반환
        - 제거하고자 하는 문자값을 생략 시 기본 값으로 공백 제거
*/

SELECT LTRIM('                  HELLO                 ') FROM DUAL;
SELECT RTRIM('                  HELLO                 ') FROM DUAL;

SELECT LTRIM('0000012300000', 0) FROM DUAL;
SELECT RTRIM('0000012300000', 0) FROM DUAL;

SELECT LTRIM('12345', 3) FROM DUAL;
SELECT RTRIM('12345', 4) FROM DUAL;

/*
    5) TRIM
        - TRIM([LEADING]|TRAILING|BOTH] 제거문자 FROM 칼럼|문자)
        - 문자값 앞/뒤/양쪽 지정한 문자를 제거하고 나머지 반환
        - 제거하고자 하는 문자 생력 시, 공백을 제거
*/

SELECT '    안녕     ' FROM DUAL;
SELECT TRIM('    안녕     ') FROM DUAL;

SELECT TRIM('H' FROM 'HELLO     ') FROM DUAL;
SELECT TRIM('Z' FROM 'ZZZHELLOZZZ') FROM DUAL;
SELECT TRIM(LEADING'Z' FROM 'ZZZHELLOZZZ') FROM DUAL;
SELECT TRIM(TRAILING'Z' FROM 'ZZZHELLOZZZ') FROM DUAL;

/*
    6) SUBSTR
        - SUBSTR(칼럼|문자값, POSITION [, LENGTH])
        - 문자 데이터에서 지정한 위치부터 지정한 갯수만큼의 문자열 추출해서 반환
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
SELECT initcap('hello world abc-abc.abc,abc,zzz123zzz가나다zzz!')from dual;


/*
    8) CONCAT
        - CONCAT(칼럼|문자값, 칼럼|문자값)
        - 문자데이터 두 개를 받아서 합쳐줌
*/

SELECT CONCAT('AAA', 'BBB')
FROM DUAL;

SELECT 'AAA'||'BBB'
FROM DUAL;

/*
    9) REPLACE
        - REPLACE(칼럼|문자값, TARGET, STR)
        - 칼럼 또는 문자값에서 TARGET 을 STR 로 변경하여 반환
*/

SELECT '서울시 강남구 역삼동' FROM DUAL;

SELECT REPLACE('서울시 강남구 역삼동', '강남구', '강북구') FROM DUAL;
SELECT REPLACE('서울시 강남구 역삼동', '서울시', '서울특별시') FROM DUAL;

SELECT '안녕하세요 안녕히가세요' FROM DUAL;
SELECT REPLACE('안녕하세요 안녕히가세요', '안녕', '') FROM DUAL;

SELECT initcap('hello world !')from dual;

-------------------------------------------------
/*
    1) ABX
        - ABS(NUMBER)
        - 절대값 구하는 함수
*/

SELECT ABS(-7) FROM DUAL;

/*
    2) MOD
        - MOD(NUMBER , NUMBER)
*/

SELECT 10/3 FROM DUAL;
--SELECT 10%3 FROM DUAL; --에러 발생
SELECT MOD (10,3) FROM DUAL; --나머지 구하기

/*
    3) ROUND
        - ROUND(NUMBER[, 위치])
        - 반올림
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
        - 소숫점 아래 올림
*/

SELECT CEIL(123.456) FROM DUAL;

/*
    5) FLOOR
        - 소숫점 아래 버림
*/

SELECT FLOOR(123.456) FROM DUAL;

/*
    6) TRUNC
        - 위치 지정하여 버림
        - 음수로 지정도 가능
*/

SELECT TRUNC(123.456) FROM DUAL;
SELECT TRUNC(123.456, 1) FROM DUAL;
SELECT TRUNC(123.456, 2) FROM DUAL;
SELECT TRUNC(123.456, -2) FROM DUAL;

----------------------------------------
/*
    날짜 관련 함수
    
    1) SYSDATE
        - 시스템의 현재 날짜와 시간 반환
*/

SELECT SYSDATE FROM DUAL;

/*
    2) MONTHS_BETWEEN
        - 두 날짜 사이의 개월 수를 리턴
        - 리턴 값 : NUMBER
*/

SELECT ENAME, FLOOR(MONTHS_BETWEEN(SYSDATE ,HIREDATE)) 근무개월수, HIREDATE 입사일
FROM EMP;

/*
    3) ADD_MONTHS
        - 개월 수를 더해줌
        - 리턴 값 : DATE
*/

SELECT ADD_MONTHS(SYSDATE, 6) FROM DUAL;
SELECT ADD_MONTHS('2002/12/31', 6) FROM DUAL;

/*
    4) NEXT_DAY
        [문법]
            NEXT_DAY(DATE, 요일(문자|숫자))
        - 현재 파라미터 DATE 기준 가장 가까운 다음 요일 리턴
*/

SELECT SYSDATE, NEXT_DAY(SYSDATE, '금요일') FROM DUAL;
SELECT SYSDATE, NEXT_DAY(SYSDATE, '금') FROM DUAL;
SELECT SYSDATE, NEXT_DAY(SYSDATE, 6) FROM DUAL;
--SELECT SYSDATE, NEXT_DAY(SYSDATE, 'FRIDAY') FROM DUAL; --언어 설정을 영어로 변경해야 됨
SELECT SYSDATE, NEXT_DAY(SYSDATE, '수요일') FROM DUAL;

ALTER SESSION SET NLS_LANGUAGE = KOREAN; --언어 변경
--SELECT SYSDATE, NEXT_DAY(SYSDATE, 'FRIDAY') FROM DUAL;
--SELECT SYSDATE, NEXT_DAY(SYSDATE, 'FRI') FROM DUAL;

/*
    5) LAST_DAY
        - 해당 달의 마지막 날 리턴
    
*/

SELECT LAST_DAY(SYSDATE) FROM DUAL;
SELECT LAST_DAY('22/08/08') FROM DUAL;
SELECT LAST_DAY('22/12/01') FROM DUAL;

/*
    6) EXTRACT
        - EXTRACT(YEAR | MONTH | DAY FROM DATE)
        - 리턴타입 : NUMBER
*/

SELECT EXTRACT(YEAR FROM SYSDATE) FROM DUAL;
SELECT EXTRACT(MONTH FROM SYSDATE) FROM DUAL;
SELECT EXTRACT(DAY FROM SYSDATE) FROM DUAL;

--날짜 포맷 변경
SELECT SYSDATE FROM DUAL;

ALTER SESSION SET NLS_DATE_FORMAT = 'YYYY-MM-DD HH:MI:SS';
ALTER SESSION SET NLS_DATE_FORMAT = 'YYYY-MM-DD HH:MI:SS AM';
ALTER SESSION SET NLS_DATE_FORMAT = 'YYYY#MM#DD# HH:MI:SS';

ALTER SESSION SET NLS_DATE_FORMAT = 'RR/MM/DD'; --원래 형태로 SESSION 변경

-----------------------------------------------------------------------------

/*
    형변환 함수
    
    1) TO_CHAR
*/

--숫자 -> 문자
SELECT TO_CHAR(1234) FROM DUAL;
SELECT TO_CHAR(1234 , '999999') AS ZZZZZZ FROM DUAL; --6칸의 공간 확보, 빈 칸은 공백으로 채움
SELECT TO_CHAR(1234 , '000000') AS ZZZZZZ FROM DUAL; --6칸의 공간 확보, 빈 칸은 0으로 채움
SELECT TO_CHAR(1234 , 'L999999') AS ZZZZZZ FROM DUAL; --현재 설정된 나라의 화폐단위 (LOCATION)
SELECT TO_CHAR(1234 , '$999999') AS ZZZZZZ FROM DUAL; -- 
SELECT TO_CHAR(1234 , 'L999,999') AS ZZZZZZ FROM DUAL;
SELECT TO_CHAR(123456789 , 'L999,999,999,999') AS ZZZZZZ FROM DUAL;

--사원 테이블 급여 조회
SELECT EMPNO, ENAME, TO_CHAR(SAL , 'L99,999,999')
FROM EMP
;

--날짜 -> 문자
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

--숫자 -> 날짜
SELECT TO_DATE(20220706) FROM DUAL;

--문자 -> 날짜
SELECT TO_DATE('20220706') FROM DUAL;
SELECT TO_DATE('2022/07/06') FROM DUAL;
SELECT TO_DATE('2022-07-06') FROM DUAL;
SELECT TO_DATE('2022.07.06') FROM DUAL;

/*
    3) TO_NUMBER
*/

--문자 -> 숫자
SELECT TO_NUMBER('123456789') FROM DUAL;
SELECT '111' + '222' FROM DUAL; --자동으로 숫자 타입으로 형변환 후 연산처리
SELECT '123' + '456A' FROM DUAL; --문자가 같이 있으면 에러남 (숫자만 있어야 계산 가능)
SELECT '10,000' + '20,000' FROM DUAL; --에러
SELECT TO_NUMBER('10,000') + TO_NUMBER('20,000') FROM DUAL; --에러
SELECT TO_NUMBER('10,000', '99,999,999') + TO_NUMBER('20,000','99,999') FROM DUAL; --숫자 형식을 뒤에 더해줘야 에러가 안남

/*
    NILL 처리 함수
        [문법]
            NVL(칼럼, NULL 대체값)
        - NULL 로 되어있는 칼럼의 값을 인자로 지정한 값으로 변경하여 반환
        
            NVL2(칼럼, 대체값1, 대체값2)
        - 칼럼 값이 NULL 이 아니면 대체값1, 칼럼 값이 NULL 이면 대체값2 로 반환한다
        
            NULL IF(비교대상1, 비교대상2)
        - 두 개의 값이 동일하면 NULL 반환
        - 두 개의 값이 동일하지 않으면 비교대상1 반환
*/

--EMP 테이블에서 사원명, COMM 조회 (COMM 이 NULL 이면 0 을 출력)
SELECT ENAME, NVL(COMM,0)
FROM EMP;

SELECT ENAME, NVL(COMM,'없음')
FROM EMP;

--EMP 테이블에서 사원명, (급여+COMM)*12 조회 (NULL 값은 0으로 처리하여 계산)
SELECT ENAME, (SAL+NVL(COMM, 0))*12
FROM EMP;

--EMP 테이블에서 사원명, JOB, MGR 조회 (MGR 이 NULL 인 경우, 0 으로 조회)
SELECT ENAME, JOB, NVL(MGR, 0)
FROM EMP;

--EMP 테이블에서 사원명, (SAL+COMM) AS 급여조회 (COMM 이 NULL 이면 0 으로 처리, 그게 아니라면 100 으로 처리)
SELECT ENAME, COMM, NVL2(COMM, 100, 0), SAL+NVL2(COMM, 0, 100) 급여조회
FROM EMP;

SELECT NULLIF(123,123)
FROM DUAL;

--EMP 테이블에서 사원명, (SAL+COMM) AS 급여조회 (COMM 이 NULL 이거나 0 이면, 0 으로 처리, 그게 아니라면 100 으로 처리)
SELECT ENAME, SAL, COMM, SAL+NVL2(NULLIF(COMM, 0), 100, 0) 급여조회
FROM EMP;

/*
    선택함수
        여러 가지 경우에 따라 선택을 할 수 있는 기능을 제공하는 함수
    DECODE(칼럼|계산식, 조건값1, 결과값1, 조건값2, 결과값2 .....)
        비교하고자 하는 값이 조건값과 일치하는 경우, 그에 해당하는 결과값을 반환
*/

--EMP 테이블에서 사번, 사원명, JOB 조회 
--(단, JOB 이 MANAGER 인 경우 매니저 라고 출력, SALESMAN 인 경우 영업 이라고 출력)
SELECT EMPNO, ENAME, JOB, DECODE(JOB, 'MANAGER', '매니저', 'SALESMAN', '영업', 'PRESIDENT', '프레지던트')
FROM EMP;

/*
    CASE
        [문법]
        CASE WHEN 조건식1 THEN 결과값1
             WHEN 조건식2 THEN 결과값2
             WHEN 조건식3 THEN 결과값2
             ...
             ELSE 결과값
        END
*/

--EMP 테이블에서 사원명, 급여, 구분 조회 (구분 ? SALL 이 1000 아래면 초급, 1000 ~ 3000 사이면 중급, 나머지는 고급)
SELECT
    ENAME
    , SAL
    , CASE
        WHEN SAL < 1000 THEN '초급'
        WHEN SAL < 3000 THEN '중급'
        ELSE '고급'
    END AS 구분
FROM EMP;

------------------------------------------------------------------------------
-------------------------그룹함수-------------------------------

/*
    대량의 데이터들로 집계나 통계 같은 작업을 처리하는 경우 사용
    모든 그룹 함수는 NULL 값을 자동으로 제외하고 값이 있는 것들만 계산
    위의 이유로 인해, AVG 함수 사용 시 반드시 NVL() 함수를 사용하는 것을 권장
*/

/*
    1) SUM
        [문법]
            SUM(NUMBER)
        - 해당 칼럼 값들의 총 합계를 반환
*/

SELECT SUM(COMM)
FROM EMP;

--EMP 테이블에서 부서코드가 30 인 사원들의 급여 합계 조회
SELECT SUM(SAL)
FROM EMP
WHERE DEPTNO = 30
;

--COMM 이 NULL 이 아닌 사원들의 COMM 합계 조회
SELECT SUM(COMM)
FROM EMP
--WHERE COMM IS NOT NULL
;

--EMP 테이블에서 사원명이 S로 시작하는 사원의 SAL 합계 조회
SELECT SUM(SAL)
FROM EMP
WHERE ENAME LIKE 'S%'
;

/*
    2) AVG
        [문법]
            AVG(NUMBER)
*/

--EMP 테이블의 전 사원의 급여 평균을 조회
SELECT AVG(SAL)
FROM EMP
;

--EMP 테이블에서 부서코드가 30인 사원의 급여 평균을 조회
SELECT AVG(SAL)
FROM EMP
WHERE DEPTNO = 30
;

--EMP 테이블에서 부서코드가 30인 사원의 COMM 평균을 조회
SELECT AVG(COMM)
FROM EMP
WHERE DEPTNO = 30
;

--EMP 테이블에서 입사일자가 81년도 이후인 사원의 급여 평균 조회
SELECT AVG(SAL)
FROM EMP
WHERE HIREDATE >= '81/01/01'
;
--다른 풀이
SELECT AVG(SAL)
FROM EMP
WHERE EXTRACT(YEAR FROM HIREDATE) >= 1981
;
--다른 풀이 2
SELECT AVG(SAL)
FROM EMP
WHERE HIREDATE > '81/01/01'
;

/*
    3) MIN / MAS
*/

--EMP 테이블에서 가장 높은 급여 조회
SELECT MAX(SAL)
FROM EMP;

--EMP 테이블에서 가장 낮은 급여 조회
SELECT MIN(SAL)
FROM EMP;

/*
    4) COUNT
        COUNT(..)
    - 행의 갯수 반환
    - COUNT(칼럼) : 칼럼이 NULL 이 아닌 행의 갯수를 반환
    - COUNT(DISTINCT 칼럼)
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












