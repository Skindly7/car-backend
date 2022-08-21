insert into Car (ID, MAKE, MODEL, GEN, BODY_TYPE, NUMBER_OF_DOORS, RELEASE_YEAR_RANGE, COUNTRY_OF_ORIGIN,
                 TOP_SPEED, ZERO_TO_SIXTY, HORSE_POWER, MPG) values
(1001, 'Mazda', 'MX-5', 'MK1', 'Convertible', 3, '1991-1998', 'Japan', 120, 7.7, 110, 34.0),
(1002, 'Honda', 'S2000', 'AP2', 'Convertible', 3,'2003-2009', 'Japan', 148, 6.9, 155, 32.7),
(1003, 'Toyota', 'MR2', 'MK1', 'Coupe', 3, '1984-1988', 'Japan', 115, 8.3, 138, 33.5),
(1004, 'Ford', 'Fiesta', 'MK5', 'Hatchback', 5, '2002-2008', 'USA', 112, 10.1, 74, 37.0),
(1005, 'Jeep', 'Wrangler', 'TJ', 'SUV', 2, '1996-2006', 'USA', 99, 11.7, 109, 30.2),
(1006, 'Mazda', 'RX-8', '1st Gen', 'Hatchback', 5, '2003-2008', 'Japan', 153, 6.8, 144, 24.4),
(1007, 'Mercedes-Benz', 'C-Class', 'W205', 'Coupe', 3, '2014-2021', 'Germany', 132, 7.1, 129, 42.6),
(1008, 'Renault', 'Megane', 'IV', 'Hatchback', 5, '2016-2022', 'France', 120, 8.2, 125, 44.1),
(1009, 'BMW', 'X6', 'F16', 'SUV', 5,  '2015-2019', 'Germany', 141, 9.9, 134, 33.7),
(1010, 'Volkswagen', 'Passat', 'MK6', 'Seden', 5, '2006-2010', 'Germany', 121, 8.9, 116, 42.0),
(1011, 'Ford', 'Focus', 'MK3', 'Hatchback', 5, '2011-2018', 'USA', 134, 11.0, 108, 40.9),
;

insert into Car_Stock (ID, CAR_ID, COLOUR, PRICE, MILEAGE, TRANSMISSION, ENGINE_SIZE, FUEL_TYPE,
                       RELEASE_YEAR, DESCRIPTION) values
(200, 1003, 'Red', 7499.00, 74346, 'Manual', '1.8L', 'Petrol', 1988, 'Great Condition - Kept in a garage')
;