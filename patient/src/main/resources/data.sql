DROP TABLE  IF EXISTS PATIENT;
CREATE TABLE IF NOT EXISTS PATIENT AS SELECT * FROM CSVREAD('D:\Practise\patient\src\main\resources\patient.csv');
