--From the above given table perform the following queries: 
--Part – A:
--1. Find all persons with their department name & code.
select person.personname,person.DepartmentID,dept.departmentcode
from person join dept 
on person.departmentid=dept.departmentid

--2. Find the person's name whose department is in C-Block.
select person.personname from 
person join dept
on person.departmentid=dept.departmentid 
where dept.Location='C-Block'

--3. Retrieve person name, salary & department name who belongs to Jamnagar city.
select person.personname, person.salary,dept.departmentname 
from person join dept
on person.departmentid=dept.departmentid 
where person.city='jamnagar'

--4. Retrieve person name, salary & department name who does not belong to Rajkot city.
select person.personname,person.salary,dept.departmentname
from person join dept
on person.departmentid=dept.departmentid 
where not person.city='Rajkot'
--5. Retrieve person’s name of the person who joined the Civil department after 1-Aug-2001.
select person.personname
from person join dept
on person.departmentid=dept.departmentid 
where dept.departmentname='civil' and person.joiningdate>'2000-08-01'

--6. Find details of all persons who belong to the computer department.
select p.personname
from person p join dept d
on p.departmentid=d.departmentid 
where d.departmentname='computer'
--7. Display all the person's name with the department whose joining date difference with the current date is more than 365 days.

select p.personname,d.departmentname
from person p join dept d
on p.departmentid=d.departmentid 
where datediff(dd,GETDATE(),p.joiningdate)>365

--8. Find department wise person counts.
select d.departmentname,count(personname)
from person p join dept d
on p.departmentid=d.departmentid 
group by d.departmentname

--9. Give department wise maximum & minimum salary with department name.
select d.departmentname,max(p.salary) as maximium ,min(p.salary) as minimum
from person p join dept d
on p.departmentid=d.departmentid 
group by d.departmentname

--10. Find city wise total, average, maximum and minimum salary.
select p.city,max(p.salary) as maximium ,min(p.salary) as minimum,avg(salary) as average
from person p 
group by p.city

--11. Find the average salary of a person who belongs to Ahmedabad city.
select avg(p.salary) as average 
from person p 
where p.city='ahmedabad'

--12. Produce Output Like: <PersonName> lives in <City> and works in <DepartmentName> Department. (In single column)
select p.personname +' lives in'+p.city+' and works in'+d.departmentname from 
person p join dept d
on p.departmentid=d.departmentid 



--Part – B:
--1. Produce Output Like: <PersonName> earns <Salary> from <DepartmentName> department monthly. (In single column)
select p.personname +' earns '+convert(varchar(50),p.salary)+' from '+d.departmentname +' department monthly' from 
person p join dept d
on p.departmentid=d.departmentid 


--2. Find city & department wise total, average & maximum salaries.
select p.city,max(p.salary) as maximium ,sum(p.salary) as minimum,avg(salary) as average
from person p join dept d
on p.departmentid=d.departmentid 
group by p.city,d.departmentname;

--3. Find all persons who do not belong to any department.
select p.personname
from person p full outer join dept d
on p.departmentid=d.departmentid 
where p.departmentID is null;

--4. Find all departments whose total salary is exceeding 100000.
select  d.departmentname ,sum(p.salary) as totalsalary from 
person p join dept d
on p.departmentid=d.departmentid 
group by d.departmentname 
having sum(p.salary)>100000

--Part – C:
--1. List all departments who have no person.
select d.departmentname
from person p full outer join dept d 
on p.departmentid=d.departmentid 
group by d.departmentname 
having count(p.personname)=0

--2. List out department names in which more than two persons are working.
select d.departmentname
from person p full outer join dept d 
on p.departmentid=d.departmentid 
group by d.departmentname 
having count(p.personname)>2

--3. Give a 10% increment in the computer department employee’s salary. (Use Update)update  person set salary=salary+(0.1*salary)from person join depton person.departmentId=dept.departmentIdwhere dept.departmentname='Computer'select * from person
