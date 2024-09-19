CREATE TABLE STUDENT_DATA(
	NO INT,
	NAME VARCHAR(50),
	CITY VARCHAR(25),
	DID INT
);
INSERT INTO STUDENT_DATA VALUES(101,'RAJU','RAJKOT',10)
INSERT INTO STUDENT_DATA VALUES(102,'AMIT','AHMEDABAD',20)
INSERT INTO STUDENT_DATA VALUES(103,'SANJAY','BARODA',40)
INSERT INTO STUDENT_DATA VALUES(104,'NEHA','RAJKOT',20)
INSERT INTO STUDENT_DATA VALUES(105,'MEERA','AHMEDABAD',30)
INSERT INTO STUDENT_DATA VALUES(106,'MAHESH','BARODA',10)
SELECT * FROM STUDENT_DATA

CREATE TABLE Academic (
    Rno INT,
    SPI DECIMAL(3, 1),
    Bklog INT
);

INSERT INTO Academic (Rno, SPI, Bklog) VALUES
(101, 8.8, 0),
(102, 9.2, 2),
(103, 7.6, 1),
(104, 8.2, 4),
(105, 7.0, 2),
(106, 8.9, 3);

CREATE TABLE Department (
    DID INT,
    DName VARCHAR(50)
);

INSERT INTO Department (DID, DName) VALUES
(10, 'Computer'),
(20, 'Electrical'),
(30, 'Mechanical'),
(40, 'Civil');

--Part � A:
--1. Display details of students who are from computer department.
 SELECT NAME FROM STUDENT_DATA WHERE DID =(
 SELECT DID FROM  Department WHERE DNAME='COMPUTER')

--2. Displays name of students whose SPI is more than 8.
SELECT NO,NAME FROM STUDENT_DATA WHERE NO IN
(SELECT RNO FROM ACADEMIC WHERE SPI>8)

--3. Display details of students of computer department who belongs to Rajkot city.
SELECT NAME FROM STUDENT_DATA WHERE DID =(
 SELECT DID FROM  Department WHERE DNAME='COMPUTER') AND CITY='RAJKOT'

--4. Find total number of students of electrical department.
SELECT COUNT(NO) FROM STUDENT_DATA WHERE DID IN (
SELECT DID FROM DEPARTMENT WHERE DNAME='ELECTRICAL')

--5. Display name of student who is having maximum SPI.
SELECT * FROM STUDENT_DATA WHERE NO = 
(SELECT TOP 1 RNO FROM ACADEMIC ORDER BY SPI DESC) 

--6. Display details of students having more than 1 backlog.
SELECT * FROM STUDENT_DATA WHERE NO IN(
SELECT RNO FROM ACADEMIC WHERE BKLOG>1)

--Part � B:
--1. Display name of students who are either from computer department or from mechanical department.
SELECT NAME FROM STUDENT_DATA WHERE DID IN (
 SELECT DID FROM  Department WHERE DNAME='COMPUTER' OR DNAME='MECHANICAL') 

--2. Display name of students who are in same department as 102 studying in.
SELECT * FROM STUDENT_DATA WHERE DID IN(
SELECT DID FROM STUDENT_DATA WHERE NO=102)

--Part � C:
--1. Display name of students whose SPI is more than 9 and who is from electrical department.
SELECT * FROM STUDENT_DATA WHERE NO IN 
(SELECT RNO FROM ACADEMIC WHERE SPI>9)
AND DID=(SELECT DID FROM DEPARTMENT WHERE DNAME='ELECTRICAL')

--2. Display name of student who is having second highest SPI.
SELECT NAME FROM STUDENT_DATA WHERE
NO =(SELECT RNO FROM ACADEMIC WHERE 
SPI=(SELECT MAX(SPI) FROM ACADEMIC WHERE 
SPI!= (SELECT MAX(SPI) FROM ACADEMIC)))
