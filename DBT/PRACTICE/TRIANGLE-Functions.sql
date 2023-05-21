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