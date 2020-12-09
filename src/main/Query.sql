CREATE TABLE Car(
    ID INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
    Make VARCHAR(50) NOT NULL,
    Model VARCHAR(255) NOT NULL,
    Year INTEGER NOT NULL,
    Color  VARCHAR(50) NOT NULL,
    Vin VARCHAR(50) NOT NULL);


INSERT INTO Car(Make,Model,Year,Color,VIN) values ("Honda" , "PILOT" ,2015,"BLACK","VIN234234234"),
("Toyota" , "Corola" ,2012,"WHITE","VIN23423Corola"),
("Maruti" , "Halmark" ,1988,"BLUE","VIN234234MARUTI"));

Select * from cars;


create table Car (
	Id INT,
	Make VARCHAR(50),
	Model VARCHAR(50),
	Year VARCHAR(50),
	Color VARCHAR(50),
	Vin VARCHAR(50)
);
insert into Car (Id, Make, Model, Year, Color, Vin) values (18, 'Toyota', 'Avalon', 2003, 'Indigo', '1G6DJ8EY5B0296411');
insert into Car (Id, Make, Model, Year, Color, Vin) values (54, 'Hyundai', 'Elantra', 2002, 'Purple', 'WVWAP7AN2EE075263');
insert into Car (Id, Make, Model, Year, Color, Vin) values (76, 'Mercury', 'Grand Marquis', 1990, 'Mauv', 'WVWED7AJ1CW039109');
insert into Car (Id, Make, Model, Year, Color, Vin) values (8, 'Mitsubishi', 'Starion', 1984, 'Maroon', 'SCBFU7ZA5DC316018');
insert into Car (Id, Make, Model, Year, Color, Vin) values (53, 'Ford', 'Freestar', 2005, 'Maroon', 'WAUFEAFM0AA826223');
insert into Car (Id, Make, Model, Year, Color, Vin) values (41, 'Maybach', '57', 2005, 'Mauv', 'WAUSF78E16A547505');
insert into Car (Id, Make, Model, Year, Color, Vin) values (29, 'Audi', '4000CS Quattro', 1987, 'Pink', 'JM1GJ1T69E1235323');
insert into Car (Id, Make, Model, Year, Color, Vin) values (93, 'Ford', 'F250', 2008, 'Crimson', '3MZBM1U75EM327456');
insert into Car (Id, Make, Model, Year, Color, Vin) values (65, 'GMC', '2500', 1999, 'Mauv', '1N6AA0EC9EN648772');
insert into Car (Id, Make, Model, Year, Color, Vin) values (83, 'Mercedes-Benz', 'S-Class', 1989, 'Crimson', '1GYEC63TX4R221235');