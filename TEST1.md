# 1. 문제

# 1.1. 원인

1. product 테이블에 UNIQUE(serial_no)를 요구하고 있으나, 걸려있지 않음
2. SEQ_BRAND_ID 시퀀스가 `MAXVALUE 1000`으로 기술되어 있었지만, 생성 시 500으로 생성하고 있었음
3. 애플을 INSERT하는 부분에서 NEXTVAL이 아닌 CURRVAL가 작성되어 있었음.

키워드: UNIQUE, NEXTVAL, CURRVAL, MAXVALUE

# 1.2. 조치내용

1. ALTER TABLE products ADD UNIQUE(serial_no);
2. ALTER SEQUENCE seq_brand_id MAXVALUE 1000;
3. 시퀀스 CURRAVAL -> NEXTVAL로 변경

키워드: ALTER, MAXVALUE, CURRVAL, NEXTVAL

-- BRANDS 테이블 생성
CREATE TABLE BRANDS(
    BRAND_ID NUMBER PRIMARY KEY,
    BRAND_NAME VARCHAR2(100) NOT NULL
);

-- PRODUCTS 테이블 생성
CREATE TABLE PRODUCTS(
    PRODUCT_NO NUMBER PRIMARY KEY,
    PRODUCT_NAME VARCHAR2(50) NOT NULL,
    PRODUCT_PRICE NUMBER NOT NULL,
    BRAND_CODE NUMBER REFERENCES BRANDS,
    SERIAL_NO VARCHAR2(100),
    SOLD_OUT CHAR(1) DEFAULT 'N' CHECK(SOLD_OUT IN ('Y', 'N'))
);

-- SEQ_BRAND_ID : 100부터 시작하여 100씩 증가, 최대값 1000, 반복 없음.
-- SEQ_BRAND_ID 시퀀스 생성
CREATE SEQUENCE SEQ_BRAND_ID 
START WITH 100
INCREMENT BY 100
MAXVALUE 500
NOCYCLE;
-- 조치내용
ALTER SEQUENCE seq_brand_id MAXVALUE 1000;
SELECT * FROM user_sequences WHERE sequence_name = 'SEQ_BRAND_ID';

-- SEQ_PRODUCT_NO : 1부터 시작하여 1씩 증가, 최대값 10000, 반복 없음.
-- SEQ_PRODUCT_NO 시퀀스 생성
CREATE SEQUENCE SEQ_PRODUCT_NO
START WITH 1
INCREMENT BY 1
MAXVALUE 10000
NOCYCLE;

-- brands 테이블에 데이터 넣기
INSERT INTO BRANDS VALUES (SEQ_BRAND_ID.NEXTVAL, '삼성');
INSERT INTO BRANDS VALUES (SEQ_BRAND_ID.NEXTVAL, '애플');
SELECT * FROM brands;

-- products 테이블에 데이터 

-- products 테이블에 데이터 넣기
INSERT INTO PRODUCTS VALUES (SEQ_PRODUCT_NO.NEXTVAL, '갤럭시S8', 800000, 100, 'S8','Y');
INSERT INTO PRODUCTS VALUES (SEQ_PRODUCT_NO.NEXTVAL, '갤럭시S9', 900000, 100, 'S9','N');
INSERT INTO PRODUCTS VALUES (SEQ_PRODUCT_NO.NEXTVAL, '갤럭시S10', 1000000, 100, 'S10','N');
INSERT INTO PRODUCTS VALUES (SEQ_PRODUCT_NO.NEXTVAL, '아이폰9S', 900000, 200, '9S','N');
INSERT INTO PRODUCTS VALUES (SEQ_PRODUCT_NO.NEXTVAL, '아이폰10S', 1000000, 200, '10S','N');
SELECT * FROM products;

ALTER TABLE 테이블이름 ADD UNIQUE (컬럼);
ALTER TABLE products ADD UNIQUE(serial_no);

# 2. 문제

## 2.1. 원인

1. product 테이블에서 sold_out이 DEFAULT가 'N'으로 정의되어 있었으나, DEFAULT 값을 설정을 안했음.
2. seq_product_no 시퀀스 시작값(start with)이 1이고, 증가값(increment by)이 1으로 정의하기로 했으나, 100, 100으로 생성을 했죠.
3. products 테이블에서 serial_no는 UNIQUE 제약조건이 걸려있지만, INSERT 부분에서 중복되는 값을 입력함.

## 2.2. 조치내용

1. ALTER TABLE products MODIFY (sold_out DEFAULT 'N');
2. ALTER SEQUENCE seq_product_no INCREMENT BY 1;
3. 중복되지 않는 값으로 변경.

```sql
INSERT INTO PRODUCTS VALUES (SEQ_PRODUCT_NO.NEXTVAL, '아이폰10S', 1000000, 200, '10s',DEFAULT);
```

DROP TABLE brands CASCADE CONSTRAINTS;
DROP TABLE products CASCADE CONSTRAINTS;
DROP SEQUENCE SEQ_BRAND_ID;
DROP SEQUENCE SEQ_PRODUCT_NO;
Chiho Won님이 모두에게:  02:48 PM
# 3. 문제

## 3.1. 원인

1. 테이블 정의서에는 products 테이블에서 product_name 컬럼이 NN 제약조건이 있다고 표시되어 있으나, 설정하지 않음 (요구사항 불충족)
2. brands 테이블에 삼성 입력시 nextval이 아닌 currval가 insert됨.
3. producst 테이블의 FK 제약조건을 위배함. 부모 테이블에 참조할 행이 존재하지 않아요.(300)

## 3.2. 조치사항

1. ALTER TABLE products MODIFY product_name NOT NULL;
2. currval -> nextval
3. 존재하는 부모 테이블의 행을 참조하던가, 삭제하던가.

