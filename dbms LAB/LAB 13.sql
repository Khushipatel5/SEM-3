CREATE TABLE City (
    CityID INT PRIMARY KEY,
    Name VARCHAR(100) UNIQUE,
    Pincode INT NOT NULL,
    Remarks VARCHAR(255)
);

CREATE TABLE Village (
    VID INT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    CityID INT,
    FOREIGN KEY (CityID) REFERENCES City(CityID)
);

INSERT INTO City (CityID, Name, Pincode, Remarks) VALUES
(1, 'Rajkot', 360005, 'Good'),
(2, 'Surat', 335009, 'Very Good'),
(3, 'Baroda', 390001, 'Awesome'),
(4, 'Jamnagar', 361003, 'Smart'),
(5, 'Junagadh', 362229, 'Historic'),
(6, 'Morvi', 363641, 'Ceramic');

INSERT INTO Village (VID, Name, CityID) VALUES
(101, 'Raiya', 1),
(102, 'Madhapar', 1),
(103, 'Dodka', 3),
(104, 'Falla', 4),
(105, 'Bhesan', 5),
(106, 'Dhoraji', 5);

SELECT * FROM VILLAGE
SELECT * FROM CITY

--1. Display all the villages of Rajkot city. 
SELECT V.NAME FROM VILLAGE V JOIN CITY C ON V.CityID=C.CityID WHERE V.CityID=1

--2. Display city along with their villages & pin code.
SELECT C.NAME, V.NAME, C.PINCODE FROM VILLAGE V JOIN CITY C ON V.CityID=C.CityID 

--3. Display the city having more than one village.
SELECT C.Name,COUNT(V.CITYID) as total_village FROM VILLAGE V JOIN CITY C ON V.CityID=C.CityID GROUP BY C.NAME HAVING COUNT(V.CityID)>1

--4. Display the city having no village.
SELECT C.Name FROM VILLAGE V full outer JOIN CITY C ON V.CityID=C.CityID GROUP BY C.NAME HAVING COUNT(V.CityID)=0

--5. Count the total number of villages in each city.
SELECT C.Name,COUNT(V.CITYID) as total_village FROM VILLAGE V full outer JOIN CITY C ON V.CityID=C.CityID GROUP BY C.NAME 

--6. Count the number of cities having more than one village.
SELECT COUNT(*) FROM CITY C WHERE C.NAME IN 
(SELECT C.Name FROM VILLAGE V JOIN CITY C ON V.CityID=C.CityID GROUP BY C.NAME HAVING COUNT(V.CityID)>1)


--Create below table with following constraints
--1. Do not allow SPI more than 10
--2. Do not allow Bklog less than 0.
--3. Enter the default value as ‘General’ in branch to all new records IF no other value is specified.

CREATE TABLE STU_MAS (
	ROLLNO  INT PRIMARY KEY,
	Name VARCHAR(50) NOT NULL,
	Branch VARCHAR(25) DEFAULT 'GENERAL',
	SPI DECIMAL(4,2) CHECK(SPI<=10),
	Bklog INT CHECK(BKLOG>=0)
);
INSERT INTO STU_MAS(ROLLNO,Name,Branch,SPI,Bklog)VALUES
(101,'Raju','CE',8.80,0),
(102,'Amit','CE',2.20,3),
(103,'Sanjay','ME',1.50,6),
(104,'Neha','EC',7.65,0),
(105,'Meera','EE',5.52,2)
INSERT INTO STU_MAS(ROLLNO,Name,SPI,Bklog) VALUES
(106,'Mahesh',4.50,3)
SELECT * FROM STU_MAS
drop table stu_mas

--4. Try to update SPI of Raju from 8.80 to 12.
alter table stu_mas set spi='12' where name='raju',spi='8.80'

--5. Try to update Bklog of Neha from 0 to -1.
alter table STU_MAS set bklog='-1' where name='neha'
