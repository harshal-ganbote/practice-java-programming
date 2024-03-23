
-- Scaler Database
-- Students Tables
-- Batches Tables 

CREATE DATABASE scalerDB;

USE scalerDB;

-- Create Batches Table
CREATE TABLE batches(id INT PRIMARY KEY, name varchar(50));

-- Insert data into batch tables 
INSERT INTO batches(id, name) VALUES 
(1, "ML"),
(2, "SQL"),
(3, "DSA");

-- See all the rows of a batches table
SELECT * FROM batches;

-- Create Students Table 
CREATE TABLE students(
id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(50),
last_name VARCHAR(50),
batch_id INT,
FOREIGN KEY(batch_id) REFERENCES batches(id) 
ON DELETE CASCADE ON UPDATE CASCADE);

-- Insert data into student tables 
INSERT INTO students(first_name,last_name,batch_id) VALUES
("Khushboo","Singh",2),
("Mangesh","Kr",2),
("Ashwani","Kr",3),
("Harsh","Raj",1);

-- See all the rows of a student table
SELECT * FROM students;

-- DELETION
DELETE FROM batches WHERE id = 2;

-- Update
UPDATE batches
SET id = 100
WHERE id = 1;

-- See all the rows of a student table
select * from students;

-- See all the rows of a batches table
select * from batches;