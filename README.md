CREATE DATABASE "PravniFakultet"
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'English_United States.1252'
       LC_CTYPE = 'English_United States.1252'
       CONNECTION LIMIT = -1;
GRANT ALL ON DATABASE "PravniFakultet" TO postgres;
GRANT ALL ON DATABASE "PravniFakultet" TO public;


CREATE TABLE student(
	id VARCHAR(10) NOT NULL,
	ime VARCHAR(20),
	prezime VARCHAR(20),
	program VARCHAR(3),
	rb_upisa INT,
	god_upisa INT,
	jmbg VARCHAR(13),
	datum_rodjenja VARCHAR (10),
	password VARCHAR (20),
	semestar INT,
	PRIMARY KEY (id)
);

CREATE TABLE predmet(
	oznaka VARCHAR(10) NOT NULL,
	naziv VARCHAR(20),
	eps INT,
	PRIMARY KEY (oznaka)
);


CREATE TABLE nastavnik(
	jmbg VARCHAR(13) NOT NULL,
	ime VARCHAR(20),
	prezime VARCHAR(20),
	datum_rodjenja VARCHAR(10),
	password VARCHAR (20),
	PRIMARY KEY (jmbg)
);
 
Tabela koja slika Nastavnik  <->  Predmet
	CREATE TABLE ispit(
	id SERIAL PRIMARY KEY,
	predmet VARCHAR(10),
	nastavnik VARCHAR(13),
	PRIMARY KEY (id),
	FOREIGN KEY (predmet) REFERENCES predmet(oznaka),
	FOREIGN KEY (nastavnik) REFERENCES nastavnik(jmbg)
);
CREATE TABLE termin(
	id SERIAL,
	datum VARCHAR(10),
	vreme VARCHAR(5),
	ispit INT,
	PRIMARY KEY (id),
	FOREIGN KEY (ispit) REFERENCES ispit(id) 
);

CREATE TABLE prijava_ispita(
	id SERIAL,
	student VARCHAR(10),
	predmet VARCHAR(10),
	termin INT,
	ocena INT,
	PRIMARY KEY (id),
	FOREIGN KEY (student) REFERENCES student(id),
	FOREIGN KEY (predmet) REFERENCES predmet(oznaka),
	FOREIGN KEY (nastavnik) REFERENCES nastavnik(jmbg),
	FOREIGN KEY (termin) REFERENCES termin(id)
); 
DEMO DATA:
	INSERT INTO student
VALUES ('126/2015','Milan', 'Perić', 'NB', 126, 2015, '0309870450656','03.02.1987','password',8);
	INSERT INTO student
VALUES ('127/2015','Petar', 'Petrović', 'NB', 127, 2015, '0302987040656','03.02.1987','pass',8);
	INSERT INTO student
VALUES ('12/2017','Dejan', 'Perić', 'MP', 12, 2017, '0302870450656','03.02.1987','123',2);
	INSERT INTO student
VALUES ('261/2016','Lazar', 'Nedić', 'SB', 126, 2015, '0309870450656','03.02.1987','pa221',4);
	INSERT INTO student (id, ime, prezime, program, rb_upisa, god_upisa, jmbg, datum_rodjenja, password, semestar ) VALUES ('126/2014', 'Nedeljko', ' Jovanov', 'NB', 126, 2015, '03029870450656','03.02.1987','password',8);

	INSERT INTO predmet
VALUES ('02.0031А', 'Prekršajno pravo', 200);
	INSERT INTO predmet
VALUES ('01.0001А', 'Rimsko pravo', 200);
	INSERT INTO predmet
VALUES ('04.0001А', 'Međunarodno pravo', 180);
	INSERT INTO predmet
VALUES ('08.0001А', 'Krivično pravo', 120)

	INSERT INTO nastavnik
VALUES ('0302870450656', 'Nikola', 'Nikolov','19.03.1955','parabela');
	INSERT INTO nastavnik
VALUES ('0302871450656', 'Miloš', 'Marković','19.03.1955','123');
	INSERT INTO nastavnik
VALUES ('0302370450656', 'Danijel', 'Jovanović','19.03.1955','osmanaga');
	INSERT INTO nastavnik
VALUES ('3028704506526', 'Sandra', 'Domazet','19.03.1955','marela');

	INSERT INTO ispit
VALUES (DEFAULT,'04.0001А','0302370450656');
	INSERT INTO ispit
VALUES (DEFAULT,'08.0001А','0302871450656');
	INSERT INTO ispit
VALUES (DEFAULT,'02.0031А','0302870450656');
	INSERT INTO ispit
VALUES (DEFAULT,'08.0001А','3028704506526');

	INSERT INTO termin
VALUES (DEFAULT, '18.9.2018', '18:00',1);
	INSERT INTO termin
VALUES (DEFAULT, '18.9.2018', '12:00',1);
	INSERT INTO termin
VALUES (DEFAULT, '18.9.2018', '8:00',2);
	INSERT INTO termin
VALUES (DEFAULT, '18.9.2018', '13:00',3);
	INSERT INTO termin
VALUES (DEFAULT, '19.9.2018', '12:00',1);
	INSERT INTO termin
VALUES (DEFAULT, '17.9.2018', '11:00',1);
	INSERT INTO termin
VALUES (DEFAULT, '15.9.2018', '9:00',3);
	INSERT INTO termin
VALUES (DEFAULT, '11.9.2018', '16:00',4);
	INSERT INTO termin
VALUES (DEFAULT, '11.9.2018', '18:00',4);
	INSERT INTO termin
VALUES (DEFAULT, '12.9.2018', '12:00',1);
	INSERT INTO termin
VALUES (DEFAULT, '11.9.2018', '8:00',3);

	INSERT INTO prijava_ispita
VALUES (DEFAULT, '126/2015',4,NULL);
	INSERT INTO prijava_ispita
VALUES (DEFAULT, '127/2015',6,NULL);
	INSERT INTO prijava_ispita
VALUES (DEFAULT, '12/2017',5,NULL);
	INSERT INTO prijava_ispita
VALUES (DEFAULT, '126/2014',1,NULL);

 
Query:
SELECT 
  ispit.predmet, 
  termin.datum,
  termin.vreme, 
  public.student.ime,
  public.student.prezime,
  student.id,
  nastavnik.ime,
  nastavnik.prezime
FROM 
  student, 
  prijava_ispita, 
  ispit, 
  nastavnik, 
  public.predmet, 
  public.termin
WHERE 
  student.id = prijava_ispita.student AND
  prijava_ispita.termin = termin.id AND
  ispit.predmet = predmet.oznaka AND
  ispit.nastavnik = nastavnik.jmbg AND
  termin.ispit = ispit.id;
