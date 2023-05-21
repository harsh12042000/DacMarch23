-- Write a function that generates a random number between1 and 10. Use any logic of your choice to achieve this.
SELECT CEIL(RAND() * 10); -- use this in function and return it.

/* Create a function that accepts a string of n
characters and exchanges the first character with
the last, the second with the next -
to-last,
and so forth until n exchanges have been made.
What will the final string look like? Write the
function to verify your conclusion */

DELIMITER //
CREATE FUNCTION Swap(str varchar(10))
RETURNS VARCHAR(10)
DETERMINISTIC
BEGIN
	DECLARE len int;
    DECLARE a char;
    DECLARE b char;
    DECLARE temp char;
    DECLARE strLength INT;
    DECLARE newString varchar(10) DEFAULT '';
    DECLARE i int DEFAULT 1;

    SET strLength = LENGTH(str);

    WHILE i <= strLength DO
        SET newString = CONCAT(SUBSTRING(str, i, 1), newString);
        SET i = i + 1;
    END WHILE;

    RETURN newString;
END //
DELIMITER ;

SELECT 'Hello' AS 'String', Swap('Hello') AS 'NewString';