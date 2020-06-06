--Drop all tables if they exist
ALTER TABLE DEPARTMENTS DROP CONSTRAINT "DEPT_MGR_FK";
DROP TABLE job_grades;
DROP TABLE job_history;
DROP TABLE employees;
DROP TABLE jobs;
DROP TABLE departments;
DROP TABLE locations;
DROP TABLE countries;
DROP TABLE regions;


CREATE TABLE  "REGIONS"
   ("REGION_ID" NUMBER CONSTRAINT "REGION_ID_NN" NOT NULL ENABLE,
    "REGION_NAME" VARCHAR2(25),
    CONSTRAINT "REG_ID_PK" PRIMARY KEY ("REGION_ID")
    USING INDEX  ENABLE
   );
   
CREATE TABLE  "COUNTRIES"
   ("COUNTRY_ID" CHAR(2) CONSTRAINT "COUNTRY_ID_NN" NOT NULL ENABLE,
    "COUNTRY_NAME" VARCHAR2(40),
    "REGION_ID" NUMBER,
     CONSTRAINT "COUNTRY_C_ID_PK" PRIMARY KEY ("COUNTRY_ID") ENABLE
   );

ALTER TABLE  "COUNTRIES" ADD CONSTRAINT "COUNTR_REG_FK" FOREIGN KEY ("REGION_ID")
	REFERENCES  "REGIONS" ("REGION_ID") ENABLE;
   
CREATE TABLE  "LOCATIONS"
   ("LOCATION_ID" NUMBER(4,0),
    "STREET_ADDRESS" VARCHAR2(40),
    "POSTAL_CODE" VARCHAR2(12),
    "CITY" VARCHAR2(30) CONSTRAINT "LOC_CITY_NN" NOT NULL ENABLE,
    "STATE_PROVINCE" VARCHAR2(25),
    "COUNTRY_ID" CHAR(2),
    CONSTRAINT "LOC_ID_PK" PRIMARY KEY ("LOCATION_ID")
    USING INDEX  ENABLE
   );
   
ALTER TABLE  "LOCATIONS" ADD CONSTRAINT "LOC_C_ID_FK" FOREIGN KEY ("COUNTRY_ID")
	REFERENCES  "COUNTRIES" ("COUNTRY_ID") ENABLE;
CREATE INDEX  "LOC_CITY_IX" ON  "LOCATIONS" ("CITY");
CREATE INDEX  "LOC_COUNTRY_IX" ON  "LOCATIONS" ("COUNTRY_ID");
CREATE INDEX  "LOC_STATE_PROVINCE_IX" ON  "LOCATIONS" ("STATE_PROVINCE");

CREATE TABLE  "DEPARTMENTS"
   ("DEPARTMENT_ID" NUMBER(4,0),
    "DEPARTMENT_NAME" VARCHAR2(30) CONSTRAINT "DEPT_NAME_NN" NOT NULL ENABLE,
    "MANAGER_ID" NUMBER(6,0),
    "LOCATION_ID" NUMBER(4,0),
     CONSTRAINT "DEPT_ID_PK" PRIMARY KEY ("DEPARTMENT_ID")
  USING INDEX  ENABLE
   );
 
ALTER TABLE  "DEPARTMENTS" ADD CONSTRAINT "DEPT_LOC_FK" FOREIGN KEY ("LOCATION_ID")
	REFERENCES  "LOCATIONS" ("LOCATION_ID") ENABLE;

CREATE INDEX  "DEPT_LOCATION_IX" ON  "DEPARTMENTS" ("LOCATION_ID");
	
CREATE TABLE  "JOBS"
   ("JOB_ID" VARCHAR2(10),
    "JOB_TITLE" VARCHAR2(35) CONSTRAINT "JOB_TITLE_NN" NOT NULL ENABLE,
    "MIN_SALARY" NUMBER(6,0),
    "MAX_SALARY" NUMBER(6,0),
     CONSTRAINT "JOB_ID_PK" PRIMARY KEY ("JOB_ID")
  USING INDEX  ENABLE
   );
	
CREATE TABLE  "EMPLOYEES"
   ("EMPLOYEE_ID" NUMBER(6,0),
    "FIRST_NAME" VARCHAR2(20),
    "LAST_NAME" VARCHAR2(25) CONSTRAINT "EMP_LAST_NAME_NN" NOT NULL ENABLE,
    "EMAIL" VARCHAR2(25) CONSTRAINT "EMP_EMAIL_NN" NOT NULL ENABLE,
    "PHONE_NUMBER" VARCHAR2(20),
    "HIRE_DATE" DATE CONSTRAINT "EMP_HIRE_DATE_NN" NOT NULL ENABLE,
    "JOB_ID" VARCHAR2(10) CONSTRAINT "EMP_JOB_NN" NOT NULL ENABLE,
    "SALARY" NUMBER(8,2),
    "COMMISSION_PCT" NUMBER(2,2),
    "MANAGER_ID" NUMBER(6,0),
    "DEPARTMENT_ID" NUMBER(4,0),
	"BONUS" VARCHAR2(5),
     CONSTRAINT "EMP_SALARY_MIN" CHECK (salary > 0) ENABLE,
     CONSTRAINT "EMP_ID_PK" PRIMARY KEY ("EMPLOYEE_ID")
  USING INDEX  ENABLE,
     CONSTRAINT "EMP_EMAIL_UK" UNIQUE ("EMAIL")
  USING INDEX  ENABLE
  );
  
ALTER TABLE  "EMPLOYEES" ADD CONSTRAINT "EMP_DEPT_FK" FOREIGN KEY ("DEPARTMENT_ID")
	REFERENCES  "DEPARTMENTS" ("DEPARTMENT_ID") ENABLE;
ALTER TABLE  "EMPLOYEES" ADD CONSTRAINT "EMP_JOB_FK" FOREIGN KEY ("JOB_ID")
	REFERENCES  "JOBS" ("JOB_ID") ENABLE;
ALTER TABLE  "EMPLOYEES" ADD CONSTRAINT "EMP_MANAGER_FK" FOREIGN KEY ("MANAGER_ID")
	REFERENCES  "EMPLOYEES" ("EMPLOYEE_ID") ENABLE;
ALTER TABLE  "DEPARTMENTS" ADD CONSTRAINT "DEPT_MGR_FK" FOREIGN KEY ("MANAGER_ID")
	REFERENCES  "EMPLOYEES" ("EMPLOYEE_ID") DISABLE;
CREATE INDEX  "EMP_DEPARTMENT_IX" ON  "EMPLOYEES" ("DEPARTMENT_ID");
CREATE INDEX  "EMP_JOB_IX" ON  "EMPLOYEES" ("JOB_ID");
CREATE INDEX  "EMP_MANAGER_IX" ON  "EMPLOYEES" ("MANAGER_ID");
CREATE INDEX  "EMP_NAME_IX" ON  "EMPLOYEES" ("LAST_NAME", "FIRST_NAME");

CREATE TABLE  "JOB_GRADES"
   ("GRADE_LEVEL" VARCHAR2(3),
    "LOWEST_SAL" NUMBER,
    "HIGHEST_SAL" NUMBER
   );

CREATE TABLE  "JOB_HISTORY"
   ("EMPLOYEE_ID" NUMBER(6,0) CONSTRAINT "JHIST_EMPLOYEE_NN" NOT NULL ENABLE,
    "START_DATE" DATE CONSTRAINT "JHIST_START_DATE_NN" NOT NULL ENABLE,
    "END_DATE" DATE CONSTRAINT "JHIST_END_DATE_NN" NOT NULL ENABLE,
    "JOB_ID" VARCHAR2(10) CONSTRAINT "JHIST_JOB_NN" NOT NULL ENABLE,
    "DEPARTMENT_ID" NUMBER(4,0),
     CONSTRAINT "JHIST_DATE_INTERVAL" CHECK (end_date > start_date) ENABLE,
     CONSTRAINT "JHIST_EMP_ID_ST_DATE_PK" PRIMARY KEY ("EMPLOYEE_ID", "START_DATE")
  USING INDEX  ENABLE
   );

ALTER TABLE  "JOB_HISTORY" ADD CONSTRAINT "JHIST_DEPT_FK" FOREIGN KEY ("DEPARTMENT_ID")
	REFERENCES  "DEPARTMENTS" ("DEPARTMENT_ID") ENABLE;
-- the folowing FK constraint is disabled as table contains historical data for employees that are not in the current employees table
ALTER TABLE  "JOB_HISTORY" ADD CONSTRAINT "JHIST_EMP_FK" FOREIGN KEY ("EMPLOYEE_ID")
	  REFERENCES  "EMPLOYEES" ("EMPLOYEE_ID") DISABLE;
ALTER TABLE  "JOB_HISTORY" ADD CONSTRAINT "JHIST_JOB_FK" FOREIGN KEY ("JOB_ID")
	  REFERENCES  "JOBS" ("JOB_ID") ENABLE;
CREATE INDEX  "JHIST_DEPARTMENT_IX" ON  "JOB_HISTORY" ("DEPARTMENT_ID");
CREATE INDEX  "JHIST_EMPLOYEE_IX" ON  "JOB_HISTORY" ("EMPLOYEE_ID");
CREATE INDEX  "JHIST_JOB_IX" ON  "JOB_HISTORY" ("JOB_ID");

--populate regions table
INSERT INTO regions (region_id, region_name)
Values(1,'Europe');
INSERT INTO regions (region_id, region_name)
Values(2,'Americas');
INSERT INTO regions (region_id, region_name)
Values(3,'Asia');
INSERT INTO regions (region_id, region_name)
Values(4,'Middle East and Africa');

--populate countries table
INSERT INTO countries (country_id, country_name, region_id)
Values('CA','Canada',2);
INSERT INTO countries (country_id, country_name, region_id)
Values('DE','Germany',1);
INSERT INTO countries (country_id, country_name, region_id)
Values('UK','United Kingdom',1);
INSERT INTO countries (country_id, country_name, region_id)
Values('US','United States of America',2);

--populate locations table
INSERT INTO locations (location_id, street_address, postal_code, city, state_province, country_id)
Values(1800,'460 Bloor St. W.','ON M5S 1X8','Toronto','Ontario','CA');
INSERT INTO locations (location_id, street_address, postal_code, city, state_province, country_id)
Values(2500,'Magdalen Centre, The Oxford Science Park','OX9 9ZB','Oxford','Oxford','UK');
INSERT INTO locations (location_id, street_address, postal_code, city, state_province, country_id)
Values(1400,'2014 Jabberwocky Rd','26192','Southlake','Texas','US');
INSERT INTO locations (location_id, street_address, postal_code, city, state_province, country_id)
Values(1500,'2011 Interiors Blvd','99236','South San Francisco','California','US');
INSERT INTO locations (location_id, street_address, postal_code, city, state_province, country_id)
Values(1700,'2004 Charade Rd','98199','Seattle','Washington','US');

--populate departments table
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

--populate jobs table
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

--populate employees table
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(100,'Steven','King','SKING','515.123.4567',TO_DATE('1987-06-17','yyyy-mm-dd'),'AD_PRES',24000,null,null,90);
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(101,'Neena','Kochhar','NKOCHHAR','515.123.4568',TO_DATE('1989-09-21','yyyy-mm-dd'),'AD_VP',17000,null,100,90 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(102,'Lex','De Haan','LDEHAAN','515.123.4569',TO_DATE('1993-01-13','yyyy-mm-dd'),'AD_VP',17000,null,100,90 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(200,'Jennifer','Whalen','JWHALEN','515.123.4444',TO_DATE('1987-09-17','yyyy-mm-dd'),'AD_ASST',4400,null,101,10 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(205,'Shelley','Higgins','SHIGGINS','515.123.8080',TO_DATE('1994-06-07','yyyy-mm-dd'),'AC_MGR',12000,null,101,110 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(206,'William','Gietz','WGIETZ','515.123.8181',TO_DATE('1994-06-07','yyyy-mm-dd'),'AC_ACCOUNT',8300,null,205,110 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id, bonus)
VALUES(149,'Eleni','Zlotkey','EZLOTKEY','011.44.1344.429018',TO_DATE('2000-01-29','yyyy-mm-dd'),'SA_MAN',10500,.2,100,80, '1500' );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id, bonus)
VALUES(174,'Ellen','Abel','EABEL','011.44.1644.429267',TO_DATE('1996-05-11','yyyy-mm-dd'),'SA_REP',11000,.3,149,80,'1700' );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id, bonus)
VALUES(176,'Jonathon','Taylor','JTAYLOR','011.44.1644.429265',TO_DATE('1998-03-24','yyyy-mm-dd'),'SA_REP',8600,.2,149,80,'1250' );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(178,'Kimberely','Grant','KGRANT','011.44.1644.429263',TO_DATE('1999-05-24','yyyy-mm-dd'),'SA_REP',7000,.15,149,null );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(124,'Kevin','Mourgos','KMOURGOS','650.123.5234',TO_DATE('1999-11-16','yyyy-mm-dd'),'ST_MAN',5800,null,100,50);
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(141,'Trenna','Rajs','TRAJS','650.121.8009',TO_DATE('1995-10-17','yyyy-mm-dd'),'ST_CLERK',3500,null,124,50 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(142,'Curtis','Davies','CDAVIES','650.121.2994',TO_DATE('1997-01-29','yyyy-mm-dd'),'ST_CLERK',3100,null,124,50 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(143,'Randall','Matos','RMATOS','650.121.2874',TO_DATE('1998-03-15','yyyy-mm-dd'),'ST_CLERK',2600,null,124,50 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(144,'Peter','Vargas','PVARGAS','650.121.2004',TO_DATE('1998-07-09','yyyy-mm-dd'),'ST_CLERK',2500,null,124,50 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(103,'Alexander','Hunold','AHUNOLD','590.423.4567',TO_DATE('1990-01-03','yyyy-mm-dd'),'IT_PROG',9000,null,102,60 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(104,'Bruce','Ernst','BERNST','590.423.4568',TO_DATE('1991-05-21','yyyy-mm-dd'),'IT_PROG',6000,null,103,60 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(107,'Diana','Lorentz','DLORENTZ','590.423.5567',TO_DATE('1999-02-07','yyyy-mm-dd'),'IT_PROG',4200,null,103,60 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(201,'Michael','Hartstein','MHARTSTE','515.123.5555',TO_DATE('1996-02-17','yyyy-mm-dd'),'MK_MAN',13000,null,100,20 );
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id)
VALUES(202,'Pat','Fay','PFAY','603.123.6666',TO_DATE('1997-08-17','yyyy-mm-dd'),'MK_REP',6000,null,201,20 );

--populate job_history table
INSERT INTO job_history(employee_id,start_date,end_date,job_id,department_id)
VALUES(200,TO_DATE('09-17-1987','mm-dd-yyyy'),TO_DATE('06-17-1993','mm-dd-yyyy'),'AD_ASST',90 );
INSERT INTO job_history(employee_id,start_date,end_date,job_id,department_id)
VALUES(101,TO_DATE('10-28-1993','mm-dd-yyyy'),TO_DATE('03-15-1997','mm-dd-yyyy'),'AC_MGR',110 );
INSERT INTO job_history(employee_id,start_date,end_date,job_id,department_id)
VALUES(200,TO_DATE('07-01-1994','mm-dd-yyyy'),TO_DATE('12-31-1998','mm-dd-yyyy'),'AC_ACCOUNT',90 );
INSERT INTO job_history(employee_id,start_date,end_date,job_id,department_id)
VALUES(101,TO_DATE('09-21-1989','mm-dd-yyyy'),TO_DATE('10-27-1993','mm-dd-yyyy'),'AC_ACCOUNT',110 );
INSERT INTO job_history(employee_id,start_date,end_date,job_id,department_id)
VALUES(176,TO_DATE('01-01-1999','mm-dd-yyyy'),TO_DATE('12-31-1999','mm-dd-yyyy'),'SA_MAN',80 );
INSERT INTO job_history(employee_id,start_date,end_date,job_id,department_id)
VALUES(176,TO_DATE('03-24-1998','mm-dd-yyyy'),TO_DATE('12-31-1998','mm-dd-yyyy'),'SA_REP',80 );
INSERT INTO job_history(employee_id,start_date,end_date,job_id,department_id)
VALUES(122,TO_DATE('01-01-1999','mm-dd-yyyy'),TO_DATE('12-31-1999','mm-dd-yyyy'),'ST_CLERK',50 );
INSERT INTO job_history(employee_id,start_date,end_date,job_id,department_id)
VALUES(114,TO_DATE('03-24-1998','mm-dd-yyyy'),TO_DATE('12-31-1999','mm-dd-yyyy'),'ST_CLERK',50 );
INSERT INTO job_history(employee_id,start_date,end_date,job_id,department_id)
VALUES(102,TO_DATE('01-13-1993','mm-dd-yyyy'),TO_DATE('07-24-1998','mm-dd-yyyy'),'IT_PROG',60 );
INSERT INTO job_history(employee_id,start_date,end_date,job_id,department_id)
VALUES(201,TO_DATE('02-17-1996','mm-dd-yyyy'),TO_DATE('12-19-1999','mm-dd-yyyy'),'MK_REP',20 );

--populate job_grades table
INSERT INTO job_grades(grade_level,lowest_sal,highest_sal)
VALUES('A',1000,2999);
INSERT INTO job_grades(grade_level,lowest_sal,highest_sal)
VALUES('B',3000,5999);
INSERT INTO job_grades(grade_level,lowest_sal,highest_sal)
VALUES('C',6000,9999);
INSERT INTO job_grades(grade_level,lowest_sal,highest_sal)
VALUES('D',10000,14999);
INSERT INTO job_grades(grade_level,lowest_sal,highest_sal)
VALUES('E',15000,24999);
INSERT INTO job_grades(grade_level,lowest_sal,highest_sal)
VALUES('F',25000,40000);

ALTER TABLE  "DEPARTMENTS" ENABLE CONSTRAINT "DEPT_MGR_FK";

CREATE OR REPLACE FORCE VIEW  "EMP_DETAILS_VIEW" ("EMPLOYEE_ID", "JOB_ID", "MANAGER_ID", "DEPARTMENT_ID", "LOCATION_ID", "COUNTRY_ID", "FIRST_NAME", "LAST_NAME", "SALARY", "COMMISSION_PCT", "DEPARTMENT_NAME", "JOB_TITLE", "CITY", "STATE_PROVINCE", "COUNTRY_NAME", "REGION_NAME") 
	AS SELECT
		e.employee_id, e.job_id, e.manager_id, e.department_id,
		d.location_id,
		l.country_id,
		e.first_name, e.last_name, e.salary, e.commission_pct,
		d.department_name,
		j.job_title,
		l.city, l.state_province,
		c.country_name,
		r.region_name
    FROM
        employees e,
        departments d,
        jobs j,
        locations l,
        countries c,
        regions r
    WHERE
        e.department_id = d.department_id
        AND d.location_id = l.location_id
        AND l.country_id = c.country_id
        AND c.region_id = r.region_id
        AND j.job_id = e.job_id
    WITH READ ONLY;
	
-- Drop sequences if they exist	
DROP SEQUENCE "DEPARTMENTS_SEQ";
DROP SEQUENCE "EMPLOYEES_SEQ";
DROP SEQUENCE "LOCATIONS_SEQ";

--Create sequence for departments PK				
CREATE SEQUENCE "DEPARTMENTS_SEQ"  
	MINVALUE 1 
	MAXVALUE 9990 
	INCREMENT BY 10 
	START WITH 280 
	NOCACHE  NOORDER  NOCYCLE;

--Create sequence for employees PK	
CREATE SEQUENCE "EMPLOYEES_SEQ"  
	MINVALUE 1 
	MAXVALUE 9999999999999999999999999999 
	INCREMENT BY 1 
	START WITH 207 
	NOCACHE  NOORDER  NOCYCLE;

--Create sequence for locations PK	
CREATE SEQUENCE "LOCATIONS_SEQ"  
	MINVALUE 1 
	MAXVALUE 9900 
	INCREMENT BY 100 
	START WITH 3300 
	NOCACHE  NOORDER  NOCYCLE;