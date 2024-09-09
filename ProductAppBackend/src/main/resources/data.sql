--CREATE SEQUENCE IF NOT EXISTS product_seq START WITH 10003 INCREMENT BY 1;


insert into product (id, name, price)
values(NEXTVAL('product_seq'),'Soap',34.567);

insert into product (id, name, price)
values(NEXTVAL('product_seq'),'Powder',45.68);