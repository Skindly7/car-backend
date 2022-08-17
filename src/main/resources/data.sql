insert into Car (ID, MAKE, MODEL, GEN, BODY_TYPE, NUMBER_OF_DOORS, RELEASE_YEAR_RANGE, COUNTRY_OF_ORIGIN,
                 TOP_SPEED, ZERO_TO_SIXTY, HORSE_POWER, MPG) values
(1001, 'Mazda', 'MX-5', 'MK1', 'Convertible', 3, '1991-1998', 'Japan', 120, 7.7, 110, 34.0),
(1002, 'Honda', 'S2000', 'AP2', 'Convertible', 3,'2003-2009', 'Japan', 148, 6.9, 155, 32.7),
(1003, 'Toyota', 'MR2', 'MK1', 'Coupe', 3, '1984-1988', 'Japan', 115, 8.3, 138, 33.5),
(1004, 'Ford', 'Fiesta', 'MK5', 'Hatchback', 5,  '2002-2008', 'USA', 112, 10.1, 74, 37.0)
;

insert into Car_Stock (ID, CAR_ID, COLOUR, PRICE, MILEAGE, TRANSMISSION, ENGINE_SIZE, FUEL_TYPE,
                       RELEASE_YEAR, DESCRIPTION) values
(200, 1003, 'Red', 7499.00, 74346, 'Manual', '1.8L', 'Petrol', 1988, 'Great Condition - Kept in a garage')
;