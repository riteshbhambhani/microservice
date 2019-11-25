DROP TABLE  IF EXISTS MEDICINES;
CREATE TABLE MEDICINES AS SELECT * FROM CSVREAD('D:\Practise\medicines\src\main\resources\medicines.csv');