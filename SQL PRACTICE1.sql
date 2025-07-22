use intern;

create table courses_muraliaditya(course_id varchar(20) primary key,course_name varchar(20),dept_id varchar(20)); 

create table department_muraliaditya(dept_id VARCHAR(20) primary key,dept_name varchar(20)); 

alter table courses_muraliaditya
add constraint dept_idfk FOREIGN KEY (dept_id) REFERENCES department_muraliaditya(dept_id);

create table student_muraliaditya(id varchar(20) primary key,std_name varchar(20),std_dob date,std_age int,dept_id varchar(20),
constraint dept_stdidfk foreign key(dept_id) references department_muraliaditya(dept_id),course_id int);
alter table student_muraliaditya
drop column course_id;

insert into department_muraliaditya()values
("d1","computer science"),
("d2","mathematics"),
("d3","physics");
select *from department_muraliaditya;

insert into courses_muraliaditya()values
("c1","dbms","d1"),
("c2","linear algebra","d2"),
("c3","quantum mechanics","d3");
select *from courses_muraliaditya;

insert into student_muraliaditya()values
("s1","ravi",'2002-06-10',22,"d1"),
("s2","sneha",'2001-03-15',23,"d2");
insert into student_muraliaditya()values
("s3","arjun",'2003-01-20',21,"d1");
select*from student_muraliaditya;

alter table courses_muraliaditya
add column duration int;

update student_muraliaditya set
std_name="sneha reddy"
where std_name="sneha"; 

delete from courses_muraliaditya where course_id="c3";

select std_name from student_muraliaditya where std_age>21;

select std_name,std_dob from student_muraliaditya order by std_age;

select std_name from student_muraliaditya order by std_age asc limit 2;

select dept_id,count(dept_id) from student_muraliaditya group by dept_id;

select dept_id,avg(std_age) from student_muraliaditya group by dept_id;

select min(std_age),max(std_age) from student_muraliaditya;

use intern;
create table accounts_muraliaditya(account_id varchar(50),holder_name varchar(50),balance int);
insert into accounts_muraliaditya()values
("Account 1","Alice",5000),
("Account 2","Bob",3000),
("Account 3","Charlie",4000);

select*from accounts_muraliaditya;

start transaction;
update accounts_muraliaditya
set balance=balance-1000
where account_id="Account 1";


update accounts_muraliaditya
set balance=balance+1000
where account_id="Account 2";


rollback;

begin;

update accounts_muraliaditya
set balance=balance-1000
where account_id="Account 1";


savepoint afterdebit;

update accounts_muraliaditya
set balance=balance+1000
where account_id="Account 2";


update accounts_muraliaditya
set balance=balance+500
where account_id="Account 3";

rollback to afterdebit;

commit;

select * from courses_muraliaditya;
alter table courses_muraliaditya
add column course_code varchar(50);
update courses_muraliaditya
set course_code="cs101"
where course_name="dbms";

update courses_muraliaditya
set course_code="math205"
where course_name="linear algebra";

alter table courses_muraliaditya
add unique (course_code);

alter table courses_muraliaditya
add column credits int check(credits>=1 and credits<=5);

update courses_muraliaditya
set credits=4
where course_name="dbms";

update courses_muraliaditya
set credits=3
where course_name="linear algebra";

select * from student_muraliaditya;

CREATE VIEW MarksView AS
SELECT student_muraliaditya.std_name,department_muraliaditya.dept_name
FROM student_muraliaditya,department_muraliaditya
WHERE student_muraliaditya.dept_id = department_muraliaditya.dept_id;

select*from MarksView;

select std_name,dept_name from student_muraliaditya
inner join department_muraliaditya on student_muraliaditya.dept_id=department_muraliaditya.dept_id;

select distinct dept_name from department_muraliaditya
left join student_muraliaditya on student_muraliaditya.dept_id=department_muraliaditya.dept_id;

select*FROM student_muraliaditya;


create table employee_muraliaditya(emp_id int,emp_name varchar(20),manager_id int);
insert into employee_muraliaditya() values
(11,"ram",null),
(12,"dev",11),
(13,"raj",12),
(14,"sai",12);


SELECT e1.emp_name AS e_name,e2.emp_name AS manager 
FROM employee_muraliaditya e1
LEFT JOIN employee_muraliaditya e2 ON e1.manager_id= e2.emp_id;

select std_name from student_muraliaditya
where std_age>=
(select avg(std_age) from student_muraliaditya
where student_muraliaditya.dept_id=dept_id);


with stdcountperdept as(
 select dept_id, count(id) as std_count
 from student_muraliaditya
 group by dept_id)
 select * from stdcountperdept;