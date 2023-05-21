CREATE TABLE NUMBERS(NUM INT);

INSERT INTO NUMBERS VALUES (44), (2), (20), (4), (6), (90);

CREATE TABLE TEMP(NUM INT, STATUS VARCHAR(10));

DELIMITER //
CREATE PROCEDURE N()
BEGIN
	DECLARE F INT DEFAULT 0;
    DECLARE X INT;
    DECLARE C1 CURSOR FOR SELECT * FROM NUMBERS;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET F = 1;
    
    OPEN C1;
		CURSOR_C1_LOOP : LOOP
			FETCH C1 INTO X;
            IF F = 1
            THEN
				LEAVE CURSOR_C1_LOOP;
			END IF;
            IF X > 0 AND X < 11
            THEN
				INSERT INTO TEMP VALUES(X, 'IN RANGE');
			ELSE 
				INSERT INTO TEMP VALUES(X, 'NOT');
            END IF;
        END LOOP CURSOR_C1_LOOP;
    CLOSE C1;
END //
DELIMITER ;

CALL N();

SELECT * FROM TEMP;

-- ------------------------------------------------------------------


-- Write a stored function to take three parameters, the sides of a triangle. 
-- The sides of the triangle should be accepted from the user. 
-- The function should return a Boolean value:- true if the triangle is valid, false otherwise. 
-- A triangle is valid if the length of each side is less than the sum of the lengths of the other two sides. 
-- Check if the dimensions entered can form a valid triangle.

DELIMITER //
DROP FUNCTION IF EXISTS PQRS;
CREATE FUNCTION PQRS(A INT, B INT, C INT)
RETURNS BOOLEAN
DETERMINISTIC
BEGIN
	IF (A < B+C AND B < A+C AND C < A+B)
    THEN
		RETURN TRUE;
	ELSE
		RETURN FALSE;
    END IF;
	RETURN FALSE;
END //
DELIMITER ;

DELIMITER //
DROP PROCEDURE IF EXISTS ABC;
CREATE PROCEDURE ABC()
BEGIN
    IF PQRS(30, 40, 50)
    THEN
		SELECT 'VALID TRIANGLE' AS 'STATUS' FROM DUAL;
	ELSE
		SELECT 'INVALID TRIANGLE' AS 'STATUS' FROM DUAL;
	END IF;
END //
DELIMITER ;

CALL ABC();

-- -------------------------------------------------------------------------

/* Check if a given a year is a leap year. The
condition is:- year should be (divisible by 4 and not
divisible by 100) or (divisible by 4 and divisible
by 400.). The year should be Selected from some
table */
USE PRACTICE;

CREATE TABLE TEMPP(Y int, Status varchar(20));

CREATE TABLE Years(YR int);

INSERT INTO Years VALUES(2022), (2021), (1998), (2008), (2012), (2068);

DELIMITER //
CREATE PROCEDURE Leap()
BEGIN
	DECLARE a int;
	DECLARE Finished int DEFAULT 0; 
	DECLARE c1 CURSOR FOR SELECT * FROM YEARS;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET Finished = 1;
    OPEN c1;
    cursor_c1_loop : loop
		FETCH c1 into a;
        IF Finished = 1
        THEN
			LEAVE cursor_c1_loop;
        END IF;
		
        IF (a%4 = 0 AND a%400 = 0) OR (a%4 = 0 AND a%100 != 0) 
        THEN
			INSERT INTO TEMPP VALUES(a, 'LEAP YEAR');
		ELSE 
			INSERT INTO TEMPP VALUES(a, 'NOT LEAP YEAR');
        END IF;
    END loop cursor_c1_loop;
    CLOSE c1;    
END //
DELIMITER ;

CALL Leap();

SELECT * FROM TEMPP;
