-- Insertion des données dans la table Categorie
INSERT INTO categorie (idCat, libCat) VALUES (1,'Entrée');
INSERT INTO categorie (idCat, libCat) VALUES (2,'Plat Principal');
INSERT INTO categorie (idCat, libCat) VALUES (3,'Dessert');


-- Insertion des données dans la table Plats
INSERT INTO plats (idPla, nomPla, prixPla, idCat) VALUES (1,'Salade César', 8.00, 1);
INSERT INTO plats (idPla, nomPla, prixPla, idCat) VALUES (2,'Soupe à l\'oignon', 6.50, 1);
INSERT INTO plats (idPla, nomPla, prixPla, idCat) VALUES (3, 'Spaghetti Carbonara', 12.50, 2);
INSERT INTO plats (idPla, nomPla, prixPla, idCat) VALUES (4, 'Steak Frites', 15.00, 2);
INSERT INTO plats (idPla, nomPla, prixPla, idCat) VALUES (5, 'Poulet Rôti', 14.00, 2);
INSERT INTO plats (idPla, nomPla, prixPla, idCat) VALUES (6,'Ratatouille', 10.00, 2);
INSERT INTO plats (idPla, nomPla, prixPla, idCat) VALUES (7, 'Crème Brûlée', 5.50, 3);
INSERT INTO plats (idPla, nomPla, prixPla, idCat) VALUES (8, 'Tarte Tatin', 6.00, 3);
INSERT INTO plats (idPla, nomPla, prixPla, idCat) VALUES (9, 'Mousse au Chocolat', 5.00, 3);
INSERT INTO plats (idPla, nomPla, prixPla, idCat) VALUES (10, 'Escargots', 9.00, 1);





-- Insertion des données dans la table Clients
INSERT INTO client (idClt, nomClt, emailClt, telClt) VALUES (1, 'Jean Dupont', 'jean.dupont@example.com', '0123456789');
INSERT INTO client (idClt, nomClt, emailClt, telClt) VALUES (2, 'Marie Curie', 'marie.curie@example.com', '0987654321');
INSERT INTO client (idClt, nomClt, emailClt, telClt) VALUES (3, 'Albert Kurt', 'albert.kurt@example.com', '1234567890');
INSERT INTO client (idClt, nomClt, emailClt, telClt) VALUES (4, 'Rachel Green', 'rachel.green@example.com', '2345678901');
INSERT INTO client (idClt, nomClt, emailClt, telClt) VALUES (5, 'Marc Dac', 'marc.dac@example.com', '3456789012');

-- Insertion des données dans la table Commandes
INSERT INTO commandes (idCde, dateCde, idClt) VALUES (1,'2025-03-14', 1);
INSERT INTO commandes (idCde, dateCde, idClt) VALUES (2,'2025-03-15', 2);
INSERT INTO commandes (idCde, dateCde, idClt) VALUES (3,'2025-03-16', 3);
INSERT INTO commandes (idCde, dateCde, idClt) VALUES (4,'2025-03-17', 4);
INSERT INTO commandes (idCde, dateCde, idClt) VALUES (5,'2025-03-18', 5);

-- Insertion des données dans la table CONTENIR
INSERT INTO contenir (qte, idPla, idCde) VALUES (2, 1, 1);
INSERT INTO contenir (qte, idPla, idCde) VALUES (1, 2, 1);
INSERT INTO contenir (qte, idPla, idCde) VALUES (3, 3, 2);
INSERT INTO contenir (qte, idPla, idCde) VALUES (1, 4, 2);
INSERT INTO contenir (qte, idPla, idCde) VALUES (2, 5, 3);
INSERT INTO contenir (qte, idPla, idCde) VALUES (1, 6, 3);
INSERT INTO contenir (qte, idPla, idCde) VALUES (4, 7, 4);
INSERT INTO contenir (qte, idPla, idCde) VALUES (2, 8, 4);
INSERT INTO contenir (qte, idPla, idCde) VALUES (3, 9, 5);
INSERT INTO contenir (qte, idPla, idCde) VALUES (1, 10, 5);