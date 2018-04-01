Program sam kreira tabele u bazi podataka PravniFakultet koju treba prethodno napraviti.
Ispod su demo podaci koje treba rucno uneti.

Svi studenti imaju password 123
user name za studenta je broj indexa 126/2015

CREATE DATABASE "PravniFakultet"
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'English_United States.1252'
       LC_CTYPE = 'English_United States.1252'
       CONNECTION LIMIT = -1;
GRANT ALL ON DATABASE "PravniFakultet" TO postgres;
GRANT ALL ON DATABASE "PravniFakultet" TO public;


INSERT INTO student (id, ime, prezime, studijski_program, broj_upisa, godina_upisa_fakulteta, jmbg, datum_rodjenja, password, semestar )
VALUES ('126/2015','Milan', 'Perić', 'NB', 126, 2015, '0309870450656','03.02.1987','123',8);
INSERT INTO student (id, ime, prezime, studijski_program, broj_upisa, godina_upisa_fakulteta, jmbg, datum_rodjenja, password, semestar )
VALUES ('127/2015','Petar', 'Petrović', 'NB', 127, 2015, '1302987040656','03.02.1987','123',8);
INSERT INTO student (id, ime, prezime, studijski_program, broj_upisa, godina_upisa_fakulteta, jmbg, datum_rodjenja, password, semestar )
VALUES ('12/2017','Dejan', 'Perić', 'MP', 12, 2017, '2302870450656','03.02.1987','123',2);
INSERT INTO student (id, ime, prezime, studijski_program, broj_upisa, godina_upisa_fakulteta, jmbg, datum_rodjenja, password, semestar )
VALUES ('261/2016','Lazar', 'Nedić', 'SB', 261, 2016, '3309870450656','03.02.1987','123',4);
INSERT INTO student (id, ime, prezime, studijski_program, broj_upisa, godina_upisa_fakulteta, jmbg, datum_rodjenja, password, semestar )
VALUES ('126/2014', 'Nedeljko', 'Jovanov', 'NB', 126, 2014, '0302987450656','03.02.1987','123',8);
INSERT INTO predmet (oznaka_predmeta,eps,naziv_predmeta)
VALUES ('02.0031А', 200, 'Istorija države i prava 2');
INSERT INTO predmet (oznaka_predmeta,eps,naziv_predmeta)
VALUES ('01.0001А', 200,  'Osnovi ekonomije');
INSERT INTO predmet (oznaka_predmeta,eps,naziv_predmeta)
VALUES ('04.0001А', 180, 'Ustavno pravo');
INSERT INTO predmet (oznaka_predmeta,eps,naziv_predmeta)
VALUES ('08.0001А', 120, 'Veliki pravni sistemi i kodifikacije I');
INSERT INTO predmet (oznaka_predmeta,eps,naziv_predmeta)
VALUES ('0.0001А', 120, 'Socijalna patologija I');
INSERT INTO ispit 
VALUES (DEFAULT,'09.04.2018', '0312870450656', '02.0031А','10:00');
INSERT INTO ispit
VALUES (DEFAULT,'10.04.2018', '0312870450656', '02.0031А','12:00');
INSERT INTO ispit
VALUES (DEFAULT,'11.04.2018', '0312870450656', '02.0031А','08:00');
INSERT INTO ispit	
VALUES (DEFAULT,'12.04.2018', '0332871450656', '01.0001А','10:00');
INSERT INTO ispit
VALUES (DEFAULT,'10.04.2018', '0332871450656', '01.0001А','11:00');
INSERT INTO ispit
VALUES (DEFAULT,'11.04.2018', '0322370450656', '04.0001А','09:00');
INSERT INTO ispit
VALUES (DEFAULT,'12.04.2018', '3028704506526', '08.0001А','13:00');
INSERT INTO ispit
VALUES (DEFAULT,'11.04.2018', '3028704506526', '08.0001А','09:00');
INSERT INTO ispit
VALUES (DEFAULT,'12.04.2018', '3023704506526', '0.0001А','13:00');
INSERT INTO nastavnik
VALUES ('0312870450656','11.2.1955', 'Gordana','parabela', 'Drakić');
INSERT INTO nastavnik
VALUES ('0332871450656', '19.03.1956', 'Goran','123', 'Milošević');
INSERT INTO nastavnik
VALUES ('0322370450656', '12.01.1957', 'Slobodan','osmanaga', ' Orlović');
INSERT INTO nastavnik
VALUES ('3028704506526', '14.03.1958', 'Maša','marela', 'Kulauzov');
INSERT INTO nastavnik
VALUES ('3023704506526','31.03.1959', ' Dušan','marela', 'Marinković');