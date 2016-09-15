--drop des tables
DROP TABLE if exists reservation;
DROP TABLE if exists abonne;
DROP TABLE if exists creneau;
DROP TABLE if exists terrain;
--FIN DROP
CREATE TABLE terrain(
	tno Serial,
	type text,
	nom text,
	constraint pk_terrain primary key(tno)
);
CREATE TABLE creneau(
	jour Date,
	heure Time,
	primary key(jour,heure)

);
CREATE TABLE abonne(
	ano Serial,
	parrain Integer,
	nom VARCHAR(30),
	prenom VARCHAR(30),
	dateFinAb Date,
	tel text,
	constraint pk_abonne primary key(ano),
	constraint fk_abonne foreign key(parrain) references abonne(ano)on update cascade

);
CREATE TABLE reservation(
	tno Integer,
	ano1 Integer,
	ano2 Integer,
	jour Date,
	heure Time,
	utile boolean,
	primary key(tno,jour,heure,ano1,ano2),
	foreign key(tno)references terrain(tno) on update cascade,
	foreign key(jour,heure)references creneau(jour,heure) on update cascade,
	foreign key(ano1)references abonne(ano) on update cascade,
	foreign key(ano2)references abonne(ano) on update cascade
);
--INSERT DE CHAQUE TABLE
INSERT INTO terrain(tno,type,nom) values(1,'tennis','T1');
INSERT INTO terrain(tno,type,nom) values(2,'tennis','T2');
INSERT INTO terrain(tno,type,nom) values(3,'tennis','T3');

INSERT INTO creneau(jour,heure) values('2016-12-29','12:00:00');
INSERT INTO creneau(jour,heure) values('2016-11-29','13:00:00');

INSERT INTO abonne values (1,null,'toto','jacky',null,null);
INSERT INTO abonne values (2,null,'toto','michel',null,null);

INSERT INTO reservation values(1,1,2,'2016-12-29','12:00:00',false);
INSERT INTO reservation values(1,2,1,'2016-12-29','12:00:00',false);


-- REQUETES
--Q3
	SELECT tno, jour ,heure from reservation group by tno,jour,heure having Count(*)>1;
--Q6