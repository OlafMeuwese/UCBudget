--liquibase formatted sql

--changeset Olaf Meuwese:006_create_mutation_table failOnError:true
CREATE TABLE ucbudget.mutations (
id int ,
account_id int NOT NULL,
dr_cr varchar(2) NOT NULL,
type varchar(10) NOT NULL,
amount decimal(19,4) NOT NULL,
record_date date NOT NULL,
counter_name varchar(200),
counter_account_number varchar(200),
description text,
CONSTRAINT PK_MUTATIONS PRIMARY KEY (id),
CONSTRAINT FK_MUTATIONS_ACCOUNT_ID FOREIGN KEY (account_id) REFERENCES ucbudget.accounts
);

--rollback drop table ucbudget.mutations;


