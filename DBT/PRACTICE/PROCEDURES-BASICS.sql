CREATE DATABASE P1;

USE P1;

CREATE TABLE TEMPP (
					FIR INT,
                    SEC CHAR(15)
                    );

-- -----------------------------
DELIMITER //
CREATE PROCEDURE ABC()
BEGIN
	INSERT INTO TEMPP VALUES(1, 'INSIDE ABC');
END; //

CALL ABC();

SELECT * FROM TEMPP;

DROP PROCEDURE ABC;

-- -----------------------------

DELIMITER //
CREATE PROCEDURE ABC()
	BEGIN
		DECLARE X INT;
        SET X = 10;
        INSERT INTO TEMPP VALUES(X, 'INSIDE ABC');
    END; //

CALL ABC();

SELECT * FROM TEMPP;

DROP PROCEDURE ABC;

-- ------------------------------

DELIMITER //
CREATE PROCEDURE ABC()
BEGIN
	DECLARE X CHAR(10) DEFAULT 'CDAC';
    INSERT INTO TEMPP VALUES(1, X);
END; //

CALL ABC();

SELECT * FROM TEMPP;

DROP PROCEDURE ABC;

-- --------------------------------

DELIMITER //
CREATE PROCEDURE ABC()
BEGIN
	DECLARE X CHAR(15) DEFAULT 'KING';
    DECLARE Y FLOAT DEFAULT 3000;
    DECLARE Z FLOAT DEFAULT 0.4;
    DECLARE HRA FLOAT;
    SET HRA = Y*Z;
    INSERT INTO TEMPP VALUES(Y, X);
    INSERT INTO TEMPP VALUES(HRA, 'HRA');
END; //

CALL ABC();

SELECT * FROM TEMPP;

TRUNCATE TABLE TEMPP;

DROP PROCEDURE ABC;

-- -------------------------------

DELIMITER //
CREATE PROCEDURE ABC(X CHAR(15), Y FLOAT, Z FLOAT)
BEGIN
	DECLARE HRA FLOAT;
    SET HRA = Y*Z;
    INSERT INTO TEMPP VALUES(Y, X);
    INSERT INTO TEMPP VALUES(HRA, 'HRA');
END; //

CALL ABC('HARSH', 3000, 0.4);
CALL ABC('AKSH', 2500, 0.3);

SELECT * FROM TEMPP;

TRUNCATE TABLE TEMPP;

DROP PROCEDURE ABC;

-- ----------------------------------

CREATE TABLE EMP(ENAME VARCHAR(10), SAL INT, JOB VARCHAR(10));

INSERT INTO EMP VALUES('SCOTT', 3000, 'CLERK'),
					  ('KING', 5000, 'MANAGER');

DELIMITER //
CREATE PROCEDURE ABC()
BEGIN
	DECLARE X INT;
    SELECT SAL 
    INTO X
    FROM EMP 
    WHERE ENAME = 'KING';
    /* PROCESSING EX. SET HRA = X*0.4 */
    INSERT INTO TEMPP VALUES(X, 'KING');
END; //

CALL ABC();

SELECT * FROM TEMPP;

DROP PROCEDURE ABC;

-- -----------------------------------

DELIMITER //
CREATE PROCEDURE ABC(Y CHAR (15))
BEGIN
	DECLARE X INT;
    SELECT SAL 
    INTO X 
    FROM EMP
    WHERE ENAME = 'Y';
    /* PROCESSING EX. SET HRA = X*0.4 */
    INSERT INTO TEMPP VALUES(X, 'KING');
END; //

CALL ABC('KING');
CALL ABC('SCOTT');

SELECT * FROM TEMPP;

DROP PROCEDURE ABC;

-- -----------------------------------

DELIMITER //
CREATE PROCEDURE ABC()
BEGIN
	DECLARE X INT;
    DECLARE Y CHAR(15);
    SELECT SAL, JOB INTO X, Y FROM EMP 
    WHERE ENAME = 'KING';
    /* PROCESSING EX. SET HRA = X*0.4; SET Y = LOWER(Y) */
    INSERT INTO TEMPP VALUES(X, Y);
END; //

CALL ABC();

SELECT * FROM TEMPP;

DROP PROCEDURE ABC;

-- ------------------------------------

SHOW PROCEDURE STATUS;
