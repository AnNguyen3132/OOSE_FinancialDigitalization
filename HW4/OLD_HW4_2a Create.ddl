CREATE TABLE Account (username varchar(256) NOT NULL, accountNum varchar(256) NOT NULL, deliveryFrequency varchar(256) NOT NULL, customerName varchar(256) NOT NULL, deliveryPreference varchar(32) NOT NULL, PRIMARY KEY (accountNum));
CREATE TABLE Admin (username varchar(256) NOT NULL, PRIMARY KEY (username));
CREATE TABLE Customer (username varchar(256) NOT NULL, ssnDigits int(9) NOT NULL, PRIMARY KEY (username));
CREATE TABLE Log (username varchar(256) NOT NULL, msg varchar(256) NOT NULL, dateTime timestamp NOT NULL, severity int(10) NOT NULL);
CREATE TABLE Statement (AccountaccountNum varchar(256) NOT NULL, documentID varchar(256) NOT NULL, data blob NOT NULL, docDate timestamp NULL, PRIMARY KEY (documentID));
CREATE TABLE `User` (username varchar(256) NOT NULL, password varchar(256) NOT NULL, PRIMARY KEY (username));
ALTER TABLE Customer ADD CONSTRAINT FKCustomer38563 FOREIGN KEY (username) REFERENCES `User` (username);
ALTER TABLE Admin ADD CONSTRAINT FKAdmin665291 FOREIGN KEY (username) REFERENCES `User` (username);
ALTER TABLE Statement ADD CONSTRAINT FKStatement838363 FOREIGN KEY (AccountaccountNum) REFERENCES Account (accountNum);
ALTER TABLE Account ADD CONSTRAINT FKAccount727465 FOREIGN KEY (username) REFERENCES Customer (username);
ALTER TABLE Log ADD CONSTRAINT FKLog704853 FOREIGN KEY (username) REFERENCES `User` (username);

