SELECT * FROM cardholder;
DELETE FROM transactions WHERE card_id > 100;
commit;


CREATE TABLE IF NOT EXISTS transactions
(
    id                  SERIAL,
    invoice             int,
    amount              int,
    currency            CHARACTER(3),
    email               CHARACTER VARYING(50),
    name_encr           CHARACTER VARYING(200),
    pan_encr            CHARACTER(200),
    expiry_encr    CHARACTER(200),
    CONSTRAINT transactions_pk PRIMARY KEY (id)
);

INSERT INTO transactions(invoice, amount, currency, name_encr, email, pan_encr, expiry_encr) VALUES (100, 10, 'USD', 'Jhon Smith', 'email@net.com', '4000000000000001', '0120');
INSERT INTO transactions(invoice, amount, currency, name_encr, email, pan_encr, expiry_encr) VALUES (101, 20, 'USD', 'Jack Lee',   'jack@net.com' , '4000000000000001', '0120');
INSERT INTO transactions(invoice, amount, currency, name_encr, email, pan_encr, expiry_encr) VALUES (102, 30, 'USD', 'Mr Foo',     'foo@net.com'  , '4000000000000001', '0120');
INSERT INTO transactions(invoice, amount, currency, name_encr, email, pan_encr, expiry_encr) VALUES (103, 40, 'USD', 'Ms Smith',   'ms@net.com'   , '4000000000000001', '0120');



----------- Old solution:

/*CREATE TABLE IF NOT EXISTS transactions (
    id              SERIAL,
    invoice         int,
    amount          int,
    currency        CHARACTER(3),
    CONSTRAINT transactions_pk PRIMARY KEY (id)
);
INSERT INTO transactions(invoice, amount, currency) VALUES (100, 10, 'USD');
INSERT INTO transactions(invoice, amount, currency) VALUES (101, 20, 'EUR');
INSERT INTO transactions(invoice, amount, currency) VALUES (102, 30, 'CAN');
INSERT INTO transactions(invoice, amount, currency) VALUES (103, 40, 'IRD');


CREATE TABLE IF NOT EXISTS cardholder (
    id               SERIAL,
    transactions_id  int,
    name_encr        CHARACTER VARYING(250),
    email            CHARACTER VARYING(100),
    CONSTRAINT cardholder_pk PRIMARY KEY (id)
);
ALTER TABLE cardholder ADD CONSTRAINT cardholder_fk_01 FOREIGN KEY (transactions_id)  REFERENCES transactions (id);

INSERT INTO cardholder(transactions_id, name_encr, email)  VALUES(1, 'Jhon Smith', 'email@net.com');
INSERT INTO cardholder(transactions_id, name_encr, email)  VALUES(2, 'Jack Lee',   'jack@net.com' );
INSERT INTO cardholder(transactions_id, name_encr, email)  VALUES(3, 'Mr Foo',     'foo@net.com'  );
INSERT INTO cardholder(transactions_id, name_encr, email)  VALUES(4, 'Ms Smith',   'ms@net.com'   );


CREATE TABLE IF NOT EXISTS card (
    id               SERIAL,
    transactions_id  int,
    pan_encr              CHARACTER(250),
    expiry_date_encr      CHARACTER(250),
    CONSTRAINT card_pk PRIMARY KEY (id)
);
ALTER TABLE card ADD CONSTRAINT card_fk_01 FOREIGN KEY (transactions_id)  REFERENCES transactions (id);

INSERT INTO card(transactions_id, pan_encr, expiry_date_encr) VALUES(1, '4000000000000001', '0120');
INSERT INTO card(transactions_id, pan_encr, expiry_date_encr) VALUES(2, '4000000000000002', '0125');
INSERT INTO card(transactions_id, pan_encr, expiry_date_encr) VALUES(3, '4000000000000003', '0220');
INSERT INTO card(transactions_id, pan_encr, expiry_date_encr) VALUES(4, '4000000000000004', '0225');

*/
