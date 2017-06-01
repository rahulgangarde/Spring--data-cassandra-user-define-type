# Spring-data-cassandra-user-define-type
This project will show how can we  use custom type in spring data cassandra with spring boot 

# Use below cassandra schema for the above example

### create keyspace
create keyspace "test" with replication = {'class': 'SimpleStrategy', 'replication_factor': '1'};

## create customtype first
create type test.address(city text,state text);

## create table 
CREATE TABLE test.employee(id bigint PRIMARY KEY, name text, age int, salary float,address frozen<address>);
