/*DROP TABLE IF EXISTS TBL_EMPLOYEES;

CREATE TABLE TBL_EMPLOYEES (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL
);*/

DROP TABLE IF EXISTS SHIPMENT;

CREATE TABLE SHIPMENT (
    shipment_id INT AUTO_INCREMENT  PRIMARY KEY,
    pieces NUMBER(10) NOT NULL,
    value NUMBER(10) NOT NULL,
    weight NUMBER(10) NOT NULL,
    volume NUMBER(10) NOT NULL,
    shipper_name VARCHAR2(50) NOT NULL,
    consignee_name VARCHAR2(50) NOT NULL,
    shipped_date DATE NOT NULL,
    status VARCHAR2(50)
);

DROP TABLE IF EXISTS SHIPMENT_CLAIM;

CREATE TABLE SHIPMENT_CLAIM (
        claim_id INT  AUTO_INCREMENT NOT NULL,
        claimant VARCHAR2(50) NOT NULL,
        examiner VARCHAR2(50) NOT NULL,
        filed_by VARCHAR2(50) NOT NULL,
        amount_claimed NUMBER(10) NOT NULL,
        amount_paid NUMBER(10),
        filed_date DATE NOT NULL,
        status VARCHAR2(50),
        shipment_id INT,
        FOREIGN KEY (shipment_id) REFERENCES SHIPMENT
);