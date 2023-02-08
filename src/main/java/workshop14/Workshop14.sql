--����1   (3��)
select pdname, pdsubname,facname,STONAME,nvl(STAMOUNT,0) 
from PRODUCT join FACTORY using(FACTNO) 
join STORE using(PDNO) 
where FACLOC='SEOUL' 
         and (STAMOUNT is null or STAMOUNT=0);


--����2  (4��)
select PDSUBNAME, PDCOST, PDPRICE 
from PRODUCT 
where pdcost > any (select pdcost from product where pdname='TV') 
                            and pdcost < any (select pdcost from PRODUCT 
                            where pdname='CELLPHONE') order by pdcost)

--����3
insert into DISCARDED_PRODUCT (select PDNO,PDNAME,PDSUBNAME,FACTNO,PDDATE,PDCOST,PDPRICE,PDAMOUNT,sysdate 
from PRODUCT
where FACTNO in(select FACTNO
                        from FACTORY 
                        where FACLOC='CHANGWON'));
--����4
delete from PRODUCT 
where pdno in (select pdno from DISCARDED_PRODUCT);




------------------- Test 01 sql
select PDNAME"제품카테고리", PDSUBNAME"제품명",
       FACNAME"공장명", STONAME"판매점명", nvl(STAMOUNT,0)"판매점재고수량"
from PRODUCT
join FACTORY using(FACTNO)
join STORE using(PDNO)
where FACNAME = 'SEOUL FACTORY' and (STAMOUNT is null or STAMOUNT = 0);


select * from PRODUCT;


select * from FACTORY;


select PDNAME, PDSUBNAME, FACNAME, STONAME, nvl(STAMOUNT, 0)
from PRODUCT
join FACTORY using(FACTNO)
join STORE using(PDNO)
where FACNAME='SEOUL FACTORY' and (STAMOUNT is null or STAMOUNT = 0)
order by PDNAME;


------------------- Test 02 sql
