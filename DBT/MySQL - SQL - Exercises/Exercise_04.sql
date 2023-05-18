USE Nashik;

SELECT * FROM spj;

#Display the minimum Status in the Supplier table.
SELECT MIN(Status) FROM S;

#Display the maximum Weight in the Parts table.
SELECT MAX(Weight) FROM P;

#Display the average Weight of the Parts. 
SELECT AVG(Weight) FROM P;

#Display the total Quantity sold for part ‘P1’. 
SELECT SUM(Qty) FROM spj
WHERE `P#` = 'P1';

# Display the average Quantity sold for each part.
SELECT AVG(Qty) FROM spj
GROUP BY `P#`
ORDER BY 1;

#Display the maximum Quantity sold for each part, provided the maximum Quantity
#is greater than 800. 
SELECT MAX(Qty) FROM spj
GROUP BY `S#`, `P#`, `J#`
HAVING MAX(Qty) > 800;

#Display the Status and the count of Suppliers with that Status
SELECT Status, COUNT(Status) FROM S 
GROUP BY Status
ORDER BY 1;

#Display the count of Projects going on in different cities
SELECT City, COUNT(City) FROM P
GROUP BY City;

#11
SELECT
CASE
WHEN Status = 10 THEN 'Ten'
WHEN Status = 20 THEN 'Twenty'
WHEN Status = 30 THEN 'Thirty'
END Status, COUNT(*) Count
FROM S
GROUP BY Status;



