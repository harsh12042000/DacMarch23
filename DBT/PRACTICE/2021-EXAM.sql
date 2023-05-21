USE EXAM;

CREATE TABLE DEPT(DEPTNO int, DNAME varchar(15), LOC varchar(10));

INSERT INTO DEPT VALUES (10, 'ACCOUNTING', 'NEW YORK'),
						(20, 'RESEARCH', 'DALLAS'),
                        (30, 'SALES', 'CHICAGO'),
                        (40, 'OPERATIONS', 'BOSTON');
                        
CREATE TABLE EMP(EMPNO int, ENAME varchar(10), JOB varchar(9), HIREDATE date, SAL float, COMM float, DEPTNO int);

INSERT INTO EMP VALUES (7839, 'KING', 'MANAGER', '1991-11-17', 5000, NULL, 10),
					   (7898, 'BLAKE', 'CLERK', '1998-05-01', 2850, NULL, 30),
                       (7782, 'CLARK', 'MANAGER', '1981-06-09', 2450, NULL, 10),
                       (7566, 'JONES', 'CLERK', '1981-04-02', 2975, NULL, 20),
                       (7654, 'MARTIN', 'SALESMAN', '1981-09-28', 1250, 1400, 30),
                       (7499, 'ALLEN', 'SALESMAN', '1981-02-20', 1600, 300, 30);

-- ------------------------------------------------------------------
-- 1
SELECT ENAME FROM EMP WHERE MONTH(HIREDATE) = 02;

-- 2
SELECT ENAME FROM EMP WHERE ENAME = '%M';

-- 3
SELECT ENAME, JOB 
FROM EMP 
WHERE DEPTNO = (SELECT DEPTNO FROM EMP WHERE ENAME = 'KING'); 

-- 4
SELECT 0.2*SAL AS 'HRA' FROM EMP;

-- 5
SELECT DISTINCT JOB FROM EMP;

-- 6
SELECT EMP.ENAME, DEPT.DNAME 
FROM EMP, DEPT
WHERE DEPT.DEPTNO = EMP.DEPTNO;

-- 7
SELECT * FROM EMP 
ORDER BY DEPTNO DESC;

-- 8
SELECT * FROM EMP 
WHERE COMM IS NULL;

-- 9
SELECT ENAME AS 'NAME', EMPNO AS 'NUMBER' 
FROM EMP;

-- 10
SELECT ENAME FROM EMP
WHERE SAL = (SELECT MAX(SAL) FROM EMP);
-- SELECT ENAME FROM EMP
-- ORDER BY SAL
-- LIMIT 1;

-- 11
SELECT SUM(SAL) FROM EMP 
WHERE DEPTNO = 10;

-- 12
SELECT * FROM EMP 
WHERE JOB LIKE '%T';

-- ------------------------------------------------------------

CREATE TABLE TEMPP(f float, c float);

DELIMITER //
CREATE PROCEDURE temperature(f FLOAT)
BEGIN
	DECLARE c FLOAT;
    SET c = (f - 32)*5/9;
    INSERT INTO TEMPP VALUES(f, c);
END //
DELIMITER ;

CALL temperature(150);

-- -----------------------------------------------------------

DELIMITER //
CREATE FUNCTION Num_cube(N INT)
RETURNS FLOAT
DETERMINISTIC
BEGIN
	RETURN N*N*N;
END //
DELIMITER ;

SELECT Num_cube(10) FROM DUAL;