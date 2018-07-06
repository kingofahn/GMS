--member
--uid,pass,name,ssn,regidate, addr_seq ,phone,email,profile, access_num, credit_rating
---account
--money account_seq, account_num, account_type, create_date, limit
SELECT * FROM TAB;
CREATE SEQUENCE account_seq start with 1000;
CREATE TABLE account(
	account_seq DECIMAL PRIMARY KEY,
	money DECIMAL,
	account_num VARCHAR2(20),
	account_type VARCHAR2(20),
	create_date DATE,
	limit DECIMAL
);

INSERT INTO account(
	account_seq,money,account_num,account_type,create_date,limit
) VALUES(
	account_seq.nextval,0,'123-456-789','일반통장', SYSDATE, 0
);
INSERT INTO account(
	account_seq,money,account_num,account_type,create_date,limit
) VALUES(
	account_seq.nextval,1000,'123-456-790','일반통장', SYSDATE, 0
);
INSERT INTO account(
	account_seq,money,account_num,account_type,create_date,limit
) VALUES(
	account_seq.nextval,2000,'123-456-791','일반통장', SYSDATE, 0
);
INSERT INTO account(
	account_seq,money,account_num,account_type,create_date,limit
) VALUES(
	account_seq.nextval,3000,'123-456-792','일반통장', SYSDATE, 0
);
INSERT INTO account(
	account_seq,money,account_num,account_type,create_date,limit
) VALUES(
	account_seq.nextval,4000,'123-456-793','일반통장', SYSDATE, 0
);
INSERT INTO account(
	account_seq,money,account_num,account_type,create_date,limit
) VALUES(
	account_seq.nextval,5000,'123-456-794','일반통장', SYSDATE, 0
);
INSERT INTO account(
	account_seq,money,account_num,account_type,create_date,limit
) VALUES(
	account_seq.nextval,6000,'123-456-795','일반통장', SYSDATE, 0
);
INSERT INTO account(
	account_seq,money,account_num,account_type,create_date,limit
) VALUES(
	account_seq.nextval,7000,'123-456-796','일반통장', SYSDATE, 0
);
INSERT INTO account(
	account_seq,money,account_num,account_type,create_date,limit
) VALUES(
	account_seq.nextval,8000,'123-456-797','일반통장', SYSDATE, 0
);
INSERT INTO account(
	account_seq,money,account_num,account_type,create_date,limit
) VALUES(
	account_seq.nextval,9000,'123-456-798','일반통장', SYSDATE, 0
);




SELECT * FROM account;
DROP TABLE account;
DELETE from account;
DROP SEQUENCE account_seq;