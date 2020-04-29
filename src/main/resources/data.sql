DROP TABLE IF EXISTS Account;
DROP TABLE IF EXISTS Transaction;
CREATE TABLE Account (
  account_number numeric(10) PRIMARY KEY,
  account_name VARCHAR(25),
  account_type VARCHAR(25),
  balance_date date,
  currency   VARCHAR(3),
  open_available_balance numeric(20,3)
);

CREATE TABLE Transaction
( 
account_number numeric(10),
debit_ammount numeric(20,3),
  credit_ammount numeric(20,3),
  debit_credit VARCHAR(10),
  transaction VARCHAR(10),
  CONSTRAINT fk_account
    FOREIGN KEY (account_number)
    REFERENCES Account(account_number)
);
 
INSERT INTO Terminal (account_number,account_name,account_type,balance_date,currency,open_available_balance) VALUES
  (1001,'SGSavings','Savings','10/12/2019','SGD',84900.89),
  (1002,'DCSavings','Savings','1/12/2019','DCD',134900.89),
  (1003,'USSavings','Savings','18/12/2019','USD',674900.89),
  (1004,'DUSavings','Savings','22/12/2019','DUD',854900.89),
  (1005,'SZSavings','Savings','31/12/2019','SZD',849600.89);