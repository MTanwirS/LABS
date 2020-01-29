select * from tab ;
create table employee(
    ssn Number(15),
    names varchar2(25),
    mobno Number(15),
    address varchar2(40),
    deptno Number(10)
    ) ;
desc employee ; 
insert into employee values(5000,'sudeep',94637380,'malleshwaram',2) ;
commit ;
select * from employee ;
insert into employee values(5010,'puneet',88947345,'rr nagar',2) ;
commit ;
insert into employee values(5011,'sachin',88947345,'rr nagar',2) ;
rollback ;
delete from employee where ssn=5010 ;
select * from employee ;
delete from employee where ssn=5011 ;
delete from employee ;
commit ;
insert into employee values(5000,'sudeep',94637380,'malleshwaram',2) ;
commit ;
insert into employee values(5011,'sachin',88947345,'rr nagar',2) ;
commit ;
insert into employee values(5010,'puneet',88346478,'rr nagar',2) ;
commit ;
select * from employee ;
update employee set mobno=76509462 where ssn=5011 ;
commit ;
select * from employee ;
