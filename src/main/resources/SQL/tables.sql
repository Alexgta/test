CREATE TABLE IF NOT EXISTS cardholder (
    id          SERIAL,
    c_name      CHARACTER VARYING(50),
    email       CHARACTER VARYING(50),
    c_name_encr CHARACTER VARYING(200),
    email_encr  CHARACTER VARYING(200),
    CONSTRAINT cardholder_pk PRIMARY KEY (id),
    CONSTRAINT cardholder_email_unq UNIQUE (email),
    CONSTRAINT cardholder_email_encr_unq UNIQUE (email_encr)
);
INSERT INTO cardholder (c_name, email, c_name_encr, email_encr) VALUES('Jhon Smith', 'email@net.com', 'Jhon Smith', 'email@net.com');
INSERT INTO cardholder (c_name, email, c_name_encr, email_encr) VALUES('Jack Lee',  'jack@net.com', 'Jack Lee', 'jack@net.com');



CREATE TABLE IF NOT EXISTS card (
    id               SERIAL,
    pan              CHARACTER(16),
    expiry_date      CHARACTER(4),
    cvv              CHARACTER(3),
    pan_encr         CHARACTER VARYING(200),
    expiry_date_encr CHARACTER VARYING(200),
    cvv_encr         CHARACTER(200),
    cardholder_id    int,
    CONSTRAINT card_pk PRIMARY KEY (id)
);
ALTER TABLE card ADD CONSTRAINT card_fk_01 FOREIGN KEY (cardholder_id)  REFERENCES cardholder (id);

INSERT INTO card(pan, expiry_date, pan_encr, expiry_date_encr, cvv, cvv_encr, cardholder_id) VALUES( '1234567890123456', '0120', '1234567890123456', '0120', '123', '123', 1);
INSERT INTO card(pan, expiry_date, pan_encr, expiry_date_encr, cvv, cvv_encr, cardholder_id) VALUES( '1234567890123456', '0125', '1234567890123456', '0125', '123', '123', 1);
INSERT INTO card(pan, expiry_date, pan_encr, expiry_date_encr, cvv, cvv_encr, cardholder_id) VALUES( '1234567890123450', '0220', '1234567890123450', '0220', '123', '123', 2);
INSERT INTO card(pan, expiry_date, pan_encr, expiry_date_encr, cvv, cvv_encr, cardholder_id) VALUES( '1234567890123450', '0225', '1234567890123450', '0225', '123', '123', 2);


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

