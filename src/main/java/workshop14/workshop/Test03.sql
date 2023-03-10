/* CHANWON FACTORY 에서 생성된 제품 조회 */
SELECT *
FROM PRODUCT
JOIN FACTORY USING(FACTNO)
WHERE FACNAME = 'CHANGWON FACTORY';

/* DISCARDED_PRODUCT 테이블 생성 */
CREATE TABLE DISCARDED_PRODUCT AS
SELECT * FROM PRODUCT WHERE 1=2;

/* DISCARDED_DATE 컬럼 추가 */
ALTER TABLE DISCARDED_PRODUCT ADD DISCARDED_DATE DATE;

/* DISCARDED_PRDUCT 제약조건 추가 */
ALTER TABLE DISCARDED_PRODUCT ADD PRIMARY KEY (PDNO);
ALTER TABLE DISCARDED_PRODUCT ADD FOREIGN KEY (FACTNO) REFERENCES FACTORY (FACTNO);

/* DISCARDED_PRODUCT 테이블 조회 */
SELECT * FROM DISCARDED_PRODUCT;

/* DISCARDED_PRODUCT 테이블 데이터 삭제 */
DELETE FROM DISCARDED_PRODUCT;

/* 데이터 추가하기 */
INSERT INTO DISCARDED_PRODUCT
SELECT PDNO, PDNAME, PDSUBNAME, FACTNO, PDDATE, PDCOST, PDPRICE, PDAMOUNT, to_char(sysdate, 'YYYY-MM-DD')
FROM PRODUCT
JOIN FACTORY USING(FACTNO)
WHERE FACNAME = 'CHANGWON FACTORY';

commit;