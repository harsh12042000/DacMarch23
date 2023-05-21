CREATE TABLE TEMPP(NUM int);

DELIMITER //
CREATE PROCEDURE Counter()
BEGIN
	DECLARE I int DEFAULT 1;
    WHILE I <= 1000 DO
		IF I%100 = 0
        THEN
			INSERT INTO TEMPP VALUES(I);
        END IF;
		SET I = I + 1;
    END WHILE;
END //
DELIMITER ;

CALL Counter();

SELECT * FROM TEMPP;

-- -----------------------------------------------

-- A palindrome is a word that is spelled the same Write forward and backward, such as level, radar, etC. a program to Selects from any table a five letter Word and determine whether it is a palindrome

DELIMITER //
DROP PROCEDURE IF EXISTS Palindrome;
CREATE PROCEDURE Palindrome(str varchar(10))
BEGIN
	DECLARE flag boolean DEFAULT TRUE;
    DECLARE I int DEFAULT 1;
    DECLARE len int;
    
    SET len = LENGTH(str); 
    WHILE len != 0 DO
		IF (SUBSTR(str,I,1) != SUBSTR(str,-I,1))
        THEN
			SET flag = FALSE;
        END IF;
        SET I = I + 1;
		SET len = len - 1;
    END WHILE;
    IF flag
    THEN
		SELECT str, 'String is Palidrome' FROM DUAL;
	ELSE
		SELECT str, 'String is not Palindrome' FROM DUAL;
    END IF;
END //
DELIMITER ;

CALL Palindrome('Pune');
CALL Palindrome('racecar');
Call Palindrome('madam');
Call Palindrome('Mumbai');