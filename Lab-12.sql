select * from PERSON

------------------------------------------------------PART A------------------------------------------------------------------

--1. Find all persons with their department name & code.
select personname, departmentname, departmentcode
from person p full outer join dept d 
on d.departmentid = p.departmentid 

--2. Find the person's name whose department is in C-Block.
select personname from person p join dept d 
on p.departmentid = d.departmentid 
where location = 'c-block'

--3. Retrieve person name, salary & department name who belongs to Jamnagar city.
select personname, salary, departmentname from person p join dept d 
on d.departmentid = p.departmentid 
where city = 'jamnagar' 

--4. Retrieve person name, salary & department name who does not belong to Rajkot city.
select personname, salary, departmentname from person p join dept d 
on p.departmentid = d.departmentid 
where city != 'rajkot'

--5. Retrieve person’s name of the person who joined the Civil department after 1-Aug-2001.
select personname, joiningdate from person p join dept d 
on d.departmentid = p.departmentid 
where departmentname = 'civil' and joiningdate > '2001-08-01'

--6. Find details of all persons who belong to the computer department.
select * from person p join dept d 
on p.departmentid = d.departmentid 
where departmentname = 'computer'

--7. Display all the person's name with the department whose joining date difference with the current date is more than 365 days.
select personname, departmentname from person p full outer join dept d 
on d.departmentid = p.departmentid 
where joiningdate < (getdate()-365)

--8. Find department wise person counts.
select departmentname, count(personname) from person p join dept d 
on d.departmentid = p.departmentid 
group by departmentname

--9. Give department wise maximum & minimum salary with department name.
select max(salary), min(salary), departmentname from person p join dept d
on d.departmentid  = p.departmentid 
group by departmentname

--10. Find city wise total, average, maximum and minimum salary.
select sum(salary) as total, avg(salary) as average, max(salary) as max, min(salary) as min 
from person p join dept d on p.departmentid= d.departmentid 

--11. Find the average salary of a person who belongs to Ahmedabad city.
select avg(salary) from person 
where city = 'ahmedabad'

--12. Produce Output Like: <PersonName> lives in <City> and works in <DepartmentName> Department. (In single column)
select personname + ' lives in ' + city + ' and works in ' + departmentname + ' department.'
from person p full outer join dept d 
on d.departmentid = p.departmentid 

--------------------------------------------------PART-B-------------------------------------------------------------------
--1 Produce Output Like: <PersonName> earns <Salary> from <DepartmentName> department monthly. (In single column)
SELECT P.PersonName+' earns '+CAST(P.Salary AS VARCHAR)+' from '+D.departmentName+' department monthly' FROM PERSON AS P JOIN DEPT AS D ON P.DepartmentID=D.DepartmentID

--2 Find city & department wise total, average & maximum salaries.
SELECT P.City,D.DepartmentName,SUM(P.SALARY),AVG(P.SALARY),MAX(P.SALARY) FROM PERSON AS P INNER JOIN DEPT AS D ON P.DepartmentID=D.DepartmentID GROUP BY P.City,D.DepartmentName;

--3  Find all persons who do not belong to any department.
SELECT P.PersonName FROM PERSON AS P LEFT JOIN DEPT AS D ON P.DepartmentID=D.DepartmentID WHERE D.DepartmentID IS NULL;

--4 Find all departments whose total salary is exceeding 100000.
SELECT D.DepartmentName,SUM(P.SALARY) FROM PERSON AS P INNER JOIN DEPT AS D ON P.DepartmentID=D.DepartmentID GROUP BY D.DepartmentName HAVING SUM(P.SALARY)>100000

-----------------------------------------------PART-C----------------------------------------------------------------------
--1 List all departments who have no person
SELECT D.DepartmentName,COUNT(P.PersonName) FROM PERSON AS P JOIN DEPT AS D ON P.DepartmentID=D.DepartmentID GROUP BY D.DepartmentName HAVING COUNT(P.PersonName)=0;

--2 List out department names in which more than two persons are working.
SELECT D.DepartmentName,COUNT(P.PersonName) FROM PERSON AS P JOIN DEPT AS D ON P.DepartmentID=D.DepartmentID GROUP BY D.DepartmentName HAVING COUNT(P.PersonName)>2

--3 Give a 10% increment in the computer department employee’s salary. (Use Update)
Update P
SET P.SALARY=1.1*P.SALARY
FROM PERSON AS P INNER JOIN DEPT AS D
ON P.DepartmentID=D.DepartmentID
WHERE D.DepartmentName='Computer'