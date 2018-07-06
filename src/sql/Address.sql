-- address
-- addrs_seq(DECIMAL, PK)
CREATE SEQUENCE add_seq start with 2000;
CREATE TABLE address(
	add_seq DECIMAL PRIMARY KEY,
	zipcode VARCHAR2(20),
	province VARCHAR2(20),
	city VARCHAR2(20),
	gugun VARCHAR2(20),
	doro VARCHAR2(20)
);


INSERT INTO address(
add_seq,zipcode,province,city,gugun,doro
)
VALUES(
add_seq.nextval,'02582','경기도','고양시','덕양구','통일로 3-1'
);
INSERT INTO address(
add_seq,zipcode,province,city,gugun,doro
)
VALUES(
add_seq.nextval,'03582','','서울시','강서구','발산로 3-1'
);
INSERT INTO address(
add_seq,zipcode,province,city,gugun,doro
)
VALUES(
add_seq.nextval,'04582','','서울시','은평구','갈현로 3-1'
);
INSERT INTO address(
add_seq,zipcode,province,city,gugun,doro
)
VALUES(
add_seq.nextval,'05582','경기도','고양시','일산동구','일산로 3-1'
);
INSERT INTO address(
add_seq,zipcode,province,city,gugun,doro
)
VALUES(
add_seq.nextval,'06582','경기도','고양시','평화구','평화로 3-1'
);
INSERT INTO address(
add_seq,zipcode,province,city,gugun,doro
)
VALUES(
add_seq.nextval,'05582','','인천시','계양구','계양로 3-1'
);
INSERT INTO address(
add_seq,zipcode,province,city,gugun,doro
)
VALUES(
add_seq.nextval,'12582','','부산시','해운대구','헤은로 3-1'
);
INSERT INTO address(
add_seq,zipcode,province,city,gugun,doro
)
VALUES(
add_seq.nextval,'22592','경기도','이천시','이천구','이천로 3-1'
);
INSERT INTO address(
add_seq,zipcode,province,city,gugun,doro
)
VALUES(
add_seq.nextval,'32582','경기도','파주시','교하읍','교하로 3-1'
);
INSERT INTO address(
add_seq,zipcode,province,city,gugun,doro
)
VALUES(
add_seq.nextval,'52582','경기도','고양시','덕양구','통일로 5-1'
);

SELECT * FROM address;
SELECT * FROM TAB;

DROP TABLE address;
DELETE FROM address;
DROP SEQUENCE add_seq;
