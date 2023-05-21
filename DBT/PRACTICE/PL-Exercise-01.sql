DELIMITER //
CREATE FUNCTION Perimeter(L FLOAT, W FLOAT)
RETURNS FLOAT
DETERMINISTIC
BEGIN
	RETURN 2*(L + W);
END //
DELIMITER ;

DELIMITER //
CREATE FUNCTION Area1(L FLOAT, W FLOAT)
RETURNS FLOAT
DETERMINISTIC
BEGIN
	RETURN L * W;
END //
DELIMITER ;

SELECT Perimeter(10, 10), Area1(10, 10) FROM DUAL;

drop function Perimeter;
drop function Area1;

-- -------------------------------------------------------------------------