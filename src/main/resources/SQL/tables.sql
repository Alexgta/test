CREATE TABLE IF NOT EXISTS cardholder (
    id          SERIAL,
    c_name      CHARACTER VARYING(50),
    email       CHARACTER VARYING(50),
    c_name_encr CHARACTER VARYING(100),
    email_encr  CHARACTER VARYING(100),
    CONSTRAINT cardholder_pk PRIMARY KEY (id)
);

INSERT INTO cardholder (c_name, email, c_name_encr, email_encr) VALUES('Jhon', 'Smith', 'email@net.com', 'email@net.com');
INSERT INTO cardholder (c_name, email, c_name_encr, email_encr) VALUES('Jack', 'Lee', 'jack@net.com', 'jack@net.com');


CREATE TABLE IF NOT EXISTS card (
    id               SERIAL,
    pan              CHARACTER VARYING(16),
    expiry_date      CHARACTER VARYING(4),
    pan_encr         CHARACTER VARYING(100),
    expiry_date_encr CHARACTER VARYING(100),
    cardholder_id    int,
    CONSTRAINT card_pk PRIMARY KEY (id)
);
ALTER TABLE card ADD CONSTRAINT card_fk_01 FOREIGN KEY (cardholder_id)  REFERENCES cardholder (id);


INSERT INTO card(pan, expiry_date, pan_encr, expiry_date_encr, cardholder_id) VALUES( '1234567890123456', '0120', '1234567890123456', '0120', 1);
INSERT INTO card(pan, expiry_date, pan_encr, expiry_date_encr, cardholder_id) VALUES( '1234567890123456', '0125', '1234567890123456', '0125', 1);
INSERT INTO card(pan, expiry_date, pan_encr, expiry_date_encr, cardholder_id) VALUES( '1234567890123450', '0220', '1234567890123450', '0220', 2);
INSERT INTO card(pan, expiry_date, pan_encr, expiry_date_encr, cardholder_id) VALUES( '1234567890123450', '0225', '1234567890123450', '0225', 2);


CREATE TABLE IF NOT EXISTS transactions (
    invoice         int,
    amount          int,
    currency        CHARACTER(3),
    card_id         int,
    CONSTRAINT transactions_pk PRIMARY KEY (invoice)
);
ALTER TABLE transactions ADD CONSTRAINT transactions_fk_02 FOREIGN KEY (card_id)  REFERENCES card (id);

INSERT INTO transactions VALUES (100, 10, 'USD', 2);
INSERT INTO transactions VALUES (101, 20, 'EUR', 2);
INSERT INTO transactions VALUES (102, 30, 'CAN', 4);
INSERT INTO transactions VALUES (103, 40, 'IRD', 4);

