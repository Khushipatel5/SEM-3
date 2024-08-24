CREATE TABLE STU_INFO(
	Rno int ,
	Name varchar(25),
	Branch varchar(25)
);

insert into STU_INFO values(101,'Raju','CE');
insert into STU_INFO values(102,'Amit','CE');
insert into STU_INFO values(103,'Sanjay','ME');
insert into STU_INFO values(104,'Neha','EC');
insert into STU_INFO values(105,'Meera','EE');
insert into STU_INFO values(106,'Mahesh','ME');
select * from stu_info

CREATE TABLE RESULT(
	Rno INT ,
	SPI DECIMAL(4,2)
);
insert into result values(101,8.8);
insert into result values(102,9.2);
insert into result values(103,7.6);
insert into result values(104,8.2);
insert into result values(105,7.0);
insert into result values(107,8.9);

CREATE TABLE EMPLOYEE_MASTER(
	EMPLOYEENO VARCHAR(10),
	NAME VARCHAR(25),
	MANAGERNO VARCHAR(10)
);
SELECT * FROM EMPLOYEE_MASTER;


--PART A
--1. Combine information from student and result table using cross join or Cartesian product. 
SELECT * FROM 
STU_INFO CROSS JOIN RESULT 

--2. Perform inner join on Student and Result tables
SELECT * FROM 
STU_INFO  INNER JOIN RESULT  
ON  STU_INFO.RNO=RESULT.RNO

--3. Perform the left outer join on Student and Result tables. 
SELECT * FROM 
STU_INFO LEFT OUTER JOIN RESULT
ON  STU_INFO.RNO=RESULT.RNO

--4. Perform the right outer join on Student and Result tables. 
SELECT * FROM 
STU_INFO RIGHT OUTER JOIN RESULT
ON  STU_INFO.RNO=RESULT.RNO

--5. Perform the full outer join on Student and Result tables.  
SELECT * FROM 
STU_INFO FULL OUTER JOIN RESULT
ON  STU_INFO.RNO=RESULT.RNO

--6. Display Rno, Name, Branch and SPI of all students. 
SELECT STU_INFO.Rno,STU_INFO.Name,STU_INFO.Branch,RESULT.SPI FROM 
STU_INFO FULL OUTER JOIN RESULT 
ON  STU_INFO.RNO=RESULT.RNO

--7. Display Rno, Name, Branch and SPI of CE branch’s student only. 
SELECT STU_INFO.Rno,STU_INFO.Name,STU_INFO.Branch,RESULT.SPI FROM 
STU_INFO FULL OUTER JOIN RESULT 
ON  STU_INFO.RNO=RESULT.RNO
WHERE STU_INFO.Branch='CE'

--8. Display Rno, Name, Branch and SPI of other than EC branch’s student only. 
SELECT STU_INFO.Rno,STU_INFO.Name,STU_INFO.Branch,RESULT.SPI FROM 
STU_INFO FULL OUTER JOIN RESULT 
ON  STU_INFO.RNO=RESULT.RNO
WHERE NOT STU_INFO.Branch='EC' 

--9. Display average result of each branch.
SELECT AVG(RESULT.SPI) AS AVG,STU_INFO.Branch FROM 
STU_INFO LEFT OUTER JOIN  RESULT 
ON STU_INFO.RNO=RESULT.RNO 
GROUP BY STU_INFO.Branch;

--10. Display average result of CE and ME branch.
SELECT AVG(RESULT.SPI) AS AVG,STU_INFO.Branch FROM 
STU_INFO LEFT OUTER JOIN  RESULT 
ON STU_INFO.RNO=RESULT.RNO 
GROUP BY STU_INFO.Branch
HAVING STU_INFO.BRANCH='CE' OR STU_INFO.BRANCH='ME';

--Part – B: 
--1. Display average result of each branch and sort them in ascending order by SPI. 

SELECT AVG(RESULT.SPI) AS AVERAGE ,STU_INFO.Branch FROM 
STU_INFO LEFT OUTER JOIN  RESULT 
ON STU_INFO.RNO=RESULT.RNO 
GROUP BY STU_INFO.Branch
ORDER BY AVERAGE ASC;


--2. Display highest SPI from each branch and sort them in descending order. 
SELECT MAX(RESULT.SPI) AS MAX_SPI ,STU_INFO.Branch FROM 
STU_INFO  LEFT OUTER JOIN  RESULT
ON STU_INFO.RNO=RESULT.RNO 
GROUP BY STU_INFO.Branch
ORDER BY MAX_SPI DESC;
--Part – C: 
--1. Retrieve the names of employee along with their manager’s name from the Employee table.
SELECT E1.NAME AS EMPLOYEE,E2.NAME AS MANAGER FROM 
EMPLOYEE_MASTER E1 LEFT JOIN EMPLOYEE_MASTER E2
ON E1.MANAGERNO=E2.EMPLOYEENO
