CREATE TABLE CATEGORIE(
	idCat INT,
	libCat varchar(100),
	CONSTRAINT categorie_pk PRIMARY KEY (idCat))
	ENGINE=INNODB;

CREATE TABLE CLIENT(
	idClt INT,
	nomClt varchar(30),
	emailClt varchar(100),
	telClt varchar(10),
	CONSTRAINT client_pk PRIMARY KEY (idClt))
	ENGINE=INNODB;

CREATE TABLE PLATS(
	idPla INT,
	nomPla varchar(100),
	prixPla decimal(10, 2),
	idCat INT,
	CONSTRAINT plats_pk PRIMARY KEY (idPla),
	CONSTRAINT plats_categorie_fk FOREIGN KEY (idCat) REFERENCES categorie(idCat))
	ENGINE=INNODB;

CREATE TABLE COMMANDES(
	idCde INT,
	DateCde DATE,
	idClt INT,
	CONSTRAINT commandes_pk PRIMARY KEY (idCde),
	CONSTRAINT commandes_client_fk FOREIGN KEY (idClt) REFERENCES client(idClt))
	ENGINE=INNODB;

CREATE TABLE CONTENIR(
	Qte INT,
	idPla INT,
	idCde INT,
	CONSTRAINT contenir_pk PRIMARY KEY (idPla, idCde),
	CONSTRAINT contenir_plats_fk FOREIGN KEY (idPla) REFERENCES plats(idPla),
	CONSTRAINT contenir_commanndes_fk FOREIGN KEY (idCde) REFERENCES commandes(idCde))
	ENGINE=INNODB;