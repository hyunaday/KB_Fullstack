use sqldb;
select * from buytbl;

START TRANSACTION;
DELETE FROM buytbl WHERE num = 1;
DELETE FROM buytbl WHERE num = 2;

SELECT * FROM buytbl;

rollback;

SELECT * FROM buytbl;