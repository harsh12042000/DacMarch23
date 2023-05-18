-- 1 . Display the Supplier name and the Quantity sold
SELECT sname, qty FROM spj, s;  -- fast

--  2. Display the Part name and Quantity sold
SELECT pname, qty FROM p, spj; -- slow

-- 3. Display the Project name and Quantity sold
SELECT jname, qty FROM j, spj; -- slow

-- 4. Display the Supplier name, Part name, Project name and Quantity sold
SELECT sname, pname, jname, qty FROM s, p, j, spj;

-- 5. Display the Supplier name, Supplying Parts to a Project in the same City. 
SELECT * FROM spj;
SELECT s.sname, p.pname, j.city FROM s, p, j, spj
WHERE spj.`s#` = s.`s#` AND spj.`p#` = p.`p#` AND spj.`j#` = j.`j#` AND j.city = s.city;  

-- 6. Display the Part name that is ‘Red’ is color, and the Quantity sold. 
SELECT pname, color, qty FROM p, spj
WHERE color = 'red';

-- 7. Display all the Quantity sold by Suppliers with the Status = 20.


-- 8. Display all the Parts and Quantity with a Weight > 14.

-- 9. Display all the Project names and City, which has bought more than 500 Parts.

-- 10. Display all the Part names and Quantity sold that have a Weight less than 15.

-- 11. Display all the Employee names and the name of their Managers. 