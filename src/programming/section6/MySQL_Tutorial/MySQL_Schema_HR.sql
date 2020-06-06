CREATE TABLE  DEPARTMENTS
   (DEPARTMENT_ID INT PRIMARY KEY,
    DEPARTMENT_NAME VARCHAR(30) NOT NULL,
    MANAGER_ID INT,
    LOCATION_ID INT
    );
 
CREATE TABLE  JOBS
   (JOB_ID VARCHAR(10) PRIMARY KEY,
    JOB_TITLE VARCHAR(35) NOT NULL,
    MIN_SALARY INT,
    MAX_SALARY INT
   );
	
CREATE TABLE  EMPLOYEES
   (EMPLOYEE_ID INT PRIMARY KEY,
    FIRST_NAME VARCHAR(20),
    LAST_NAME VARCHAR(25) NOT NULL,
    EMAIL VARCHAR(25) NOT NULL UNIQUE,
    PHONE_INT VARCHAR(20),
    HIRE_DATE DATE NOT NULL,
    JOB_ID VARCHAR(10) NOT NULL,
    SALARY FLOAT,
    COMMISSION_PCT FLOAT,
    MANAGER_ID INT,
    DEPARTMENT_ID INT,
	BONUS VARCHAR(5),
     CHECK (salary > 0)
  );
  
 CREATE TABLE  JOB_HISTORY
   (EMPLOYEE_ID INT NOT NULL,
    START_DATE DATE NOT NULL,
    END_DATE DATE,
    JOB_ID VARCHAR(10) NOT NULL,
    DEPARTMENT_ID INT,
     CHECK (end_date > start_date),
     PRIMARY KEY (EMPLOYEE_ID, START_DATE)
  );
  
INSERT INTO departments (department_id, department_name, manager_id, location_id)
Values(10,'Administration',200,1700);
INSERT INTO departments (department_id, department_name, manager_id, location_id)
Values(20,'Marketing',201,1800);
INSERT INTO departments (department_id, department_name, manager_id, location_id)
Values(50,'Shipping',124,1500);
INSERT INTO departments (department_id, department_name, manager_id, location_id)
Values(60,'IT',103,1400);
INSERT INTO departments (department_id, department_name, manager_id, location_id)
Values(80,'Sales',149,2500);
INSERT INTO departments (department_id, department_name, manager_id, location_id)
Values(90,'Executive',100,1700);
INSERT INTO departments (department_id, department_name, manager_id, location_id)
Values(110,'Accounting',205,1700);
INSERT INTO departments (department_id, department_name, manager_id, location_id)
Values(190,'Contracting',null,1700);


INSERT INTO jobs (job_id, job_title, min_salary, max_salary)
Values('AD_PRES','President',20000,40000);
INSERT INTO jobs (job_id, job_title, min_salary, max_salary)
Values('AD_VP','Administration Vice President',15000,30000);
INSERT INTO jobs (job_id, job_title, min_salary, max_salary)
Values('AD_ASST','Administration Assistant',3000,6000);
INSERT INTO jobs (job_id, job_title, min_salary, max_salary)
Values('AC_MGR','Accounting Manager',8200,16000);
INSERT INTO jobs (job_id, job_title, min_salary, max_salary)
Values('AC_ACCOUNT','Public Accountant',4200,9000);
INSERT INTO jobs (job_id, job_title, min_salary, max_salary)
Values('SA_MAN','Sales Manager',10000,20000);
INSERT INTO jobs (job_id, job_title, min_salary, max_salary)
Values('SA_REP','Sales Representative',6000,12000);
INSERT INTO jobs (job_id, job_title, min_salary, max_salary)
Values('ST_MAN','Stock Manager',5500,8500);
INSERT INTO jobs (job_id, job_title, min_salary, max_salary)
Values('ST_CLERK','Stock Clerk',2000,5000);
INSERT INTO jobs (job_id, job_title, min_salary, max_salary)
Values('IT_PROG','Programmer',4000,10000);
INSERT INTO jobs (job_id, job_title, min_salary, max_salary)
Values('MK_MAN','Marketing Manager',9000,15000);
INSERT INTO jobs (job_id, job_title, min_salary, max_salary)
Values('MK_REP','Marketing Representative',4000,9000);

INSERT INTO employees(employee_id,first_name,last_name,email,phone_INT,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(100,'Steven','King','SKING','515.123.4567','1987-06-17','AD_PRES',24000,null,null,90);
INSERT INTO employees(employee_id,first_name,last_name,email,phone_INT,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(101,'Neena','Kochhar','NKOCHHAR','515.123.4568','1989-09-21','AD_VP',17000,null,100,90 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_INT,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(102,'Lex','De Haan','LDEHAAN','515.123.4569','1993-01-13','AD_VP',17000,null,100,90 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_INT,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(200,'Jennifer','Whalen','JWHALEN','515.123.4444','1987-09-17','AD_ASST',4400,null,101,10 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_INT,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(205,'Shelley','Higgins','SHIGGINS','515.123.8080','1994-06-07','AC_MGR',12000,null,101,110 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_INT,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(206,'William','Gietz','WGIETZ','515.123.8181','1994-06-07','AC_ACCOUNT',8300,null,205,110 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_INT,hire_date,job_id,salary,commission_pct,manager_id,department_id, bonus)
VALUES(149,'Eleni','Zlotkey','EZLOTKEY','011.44.1344.429018','2000-01-29','SA_MAN',10500,.2,100,80, '1500' );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_INT,hire_date,job_id,salary,commission_pct,manager_id,department_id, bonus)
VALUES(174,'Ellen','Abel','EABEL','011.44.1644.429267','1996-05-11','SA_REP',11000,.3,149,80,'1700' );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_INT,hire_date,job_id,salary,commission_pct,manager_id,department_id, bonus)
VALUES(176,'Jonathon','Taylor','JTAYLOR','011.44.1644.429265','1998-03-24','SA_REP',8600,.2,149,80,'1250' );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_INT,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(178,'Kimberely','Grant','KGRANT','011.44.1644.429263','1999-05-24','SA_REP',7000,.15,149,null );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_INT,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(124,'Kevin','Mourgos','KMOURGOS','650.123.5234','1999-11-16','ST_MAN',5800,null,100,50);
INSERT INTO employees(employee_id,first_name,last_name,email,phone_INT,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(141,'Trenna','Rajs','TRAJS','650.121.8009','1995-10-17','ST_CLERK',3500,null,124,50 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_INT,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(142,'Curtis','Davies','CDAVIES','650.121.2994','1997-01-29','ST_CLERK',3100,null,124,50 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_INT,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(143,'Randall','Matos','RMATOS','650.121.2874','1998-03-15','ST_CLERK',2600,null,124,50 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_INT,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(144,'Peter','Vargas','PVARGAS','650.121.2004','1998-07-09','ST_CLERK',2500,null,124,50 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_INT,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(103,'Alexander','Hunold','AHUNOLD','590.423.4567','1990-01-03','IT_PROG',9000,null,102,60 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_INT,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(104,'Bruce','Ernst','BERNST','590.423.4568','1991-05-21','IT_PROG',6000,null,103,60 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_INT,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(107,'Diana','Lorentz','DLORENTZ','590.423.5567','1999-02-07','IT_PROG',4200,null,103,60 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_INT,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(201,'Michael','Hartstein','MHARTSTE','515.123.5555','1996-02-17','MK_MAN',13000,null,100,20 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_INT,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(202,'Pat','Fay','PFAY','603.123.6666','1997-08-17','MK_REP',6000,null,201,20 );

INSERT INTO job_history(employee_id,start_date,end_date,job_id,department_id)
VALUES(200,'1987-09-17','1993-06-17','AD_ASST',90 );
INSERT INTO job_history(employee_id,start_date,end_date,job_id,department_id)
VALUES(101,'1993-10-28','1997-03-15','AC_MGR',110 );
INSERT INTO job_history(employee_id,start_date,end_date,job_id,department_id)
VALUES(200,'1994-07-01','1998-12-31','AC_ACCOUNT',90 );
INSERT INTO job_history(employee_id,start_date,end_date,job_id,department_id)
VALUES(101,'1989-09-21','1993-10-27','AC_ACCOUNT',110 );
INSERT INTO job_history(employee_id,start_date,end_date,job_id,department_id)
VALUES(176,'1999-01-01','1999-12-31','SA_MAN',80 );
INSERT INTO job_history(employee_id,start_date,end_date,job_id,department_id)
VALUES(176,'1998-03-24','1998-12-31','SA_REP',80 );
INSERT INTO job_history(employee_id,start_date,end_date,job_id,department_id)
VALUES(122,'1999-01-01','1999-12-31','ST_CLERK',50 );
INSERT INTO job_history(employee_id,start_date,end_date,job_id,department_id)
VALUES(114,'1998-03-24','1999-12-31','ST_CLERK',50 );
INSERT INTO job_history(employee_id,start_date,end_date,job_id,department_id)
VALUES(102,'1993-01-13','1998-07-24','IT_PROG',60 );
INSERT INTO job_history(employee_id,start_date,end_date,job_id,department_id)
VALUES(201,'1996-02-17','1999-12-19','MK_REP',20 );



ALTER TABLE  EMPLOYEES ADD FOREIGN KEY (DEPARTMENT_ID)
	REFERENCES  DEPARTMENTS (DEPARTMENT_ID);
ALTER TABLE  EMPLOYEES ADD FOREIGN KEY (JOB_ID)
	REFERENCES  JOBS (JOB_ID);
ALTER TABLE  EMPLOYEES ADD FOREIGN KEY (MANAGER_ID)
	REFERENCES  EMPLOYEES (EMPLOYEE_ID);
ALTER TABLE  JOB_HISTORY ADD FOREIGN KEY (DEPARTMENT_ID)
	REFERENCES  DEPARTMENTS (DEPARTMENT_ID);
ALTER TABLE  DEPARTMENTS ADD FOREIGN KEY (MANAGER_ID)
	REFERENCES  EMPLOYEES (EMPLOYEE_ID);