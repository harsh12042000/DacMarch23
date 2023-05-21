USE practice;

show tables;

SELECT SUBSTRING('Harshada Sonawane', 4);

SELECT SUBSTRING('Harshada Sonawane', 4, 2);

SELECT SUBSTRING('Harshada Sonawane', 4, 0);

SELECT SUBSTRING('Harshada Sonawane', 4, -2);

SELECT SUBSTRING('Harshada Sonawane', -4);

SELECT SUBSTRING('Harshada Sonawane', -8, 4);

SELECT FLOOR(2.4);  -- 2
SELECT CEIL(2.4);   -- 3
SELECT FLOOR(-2.4); -- -3
SELECT CEIL(-2.4);  -- -2

SELECT ABS(101.123), ABS(-101.123);

SELECT ROUND(5432.23456, 3);  -- 5432.235

SELECT NULLIF('A', 'B');

SELECT NULLIF(NULL, 'B');

SELECT * FROM EMP;
