CREATE DATABASE IF NOT EXISTS student_data;
USE student_data;
DROP TABLE IF EXISTS student;

CREATE TABLE student
(
    id               int AUTO_INCREMENT NOT NULL,
    first_name       varchar(60)        NOT NULL,
    last_name        varchar(60)        NOT NULL,
    middle_name      varchar(60)        NOT NULL,
    birth_date       date               NOT NULL,
    gradebook_number varchar(12) UNIQUE NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO student
VALUES (null, 'Avrora', 'Melnyk', 'Anatoliyivna', '2003-02-07', '455645');
INSERT INTO student
VALUES (null, 'Yana', 'Shevchenko', 'Volodymyrivna', '2002-10-09', '545643');
INSERT INTO student
VALUES (null, 'Osman', 'Kovalenko', 'Andriyovich', '2003-05-16', '564433');
INSERT INTO student
VALUES (null, 'Santa', 'Bondarenko', 'Olegivna', '2003-01-12', '256564');
INSERT INTO student
VALUES (null, 'Eneiy', 'Boiko', 'Andriyovich', '2003-09-25', '454644');

INSERT INTO student
VALUES (null, 'Kassandra', 'Tkachenko', 'Fedorovych', '2002-08-25', '565543');
INSERT INTO student
VALUES (null, 'Veronika', 'Kravchenko', 'Vitaliyivna', '2003-04-02', '453534');
INSERT INTO student
VALUES (null, 'Polina', 'Kovalchuk', 'Vitaliyovich', '2002-11-19', '454334');
INSERT INTO student
VALUES (null, 'Dmytro', 'Koval', 'Volodymyrovich', '2003-03-08', '345345');
INSERT INTO student
VALUES (null, 'Herda', 'Oliinyk', 'Vasylivna', '2003-07-18', '675654');

INSERT INTO student
VALUES (null, 'Anna', 'Shevchuk', 'Denysovich', '2003-03-09', '656453');
INSERT INTO student
VALUES (null, 'Kvitka', 'Savchenko', 'Volodymyrivna', '2003-09-19', '565644');
INSERT INTO student
VALUES (null, 'Nazar', 'Bondar', 'Andriyivna', '2002-10-16', '656434');
INSERT INTO student
VALUES (null, 'Maksym', 'Marchenko', 'Olegovich', '2003-03-12', '465466');
INSERT INTO student
VALUES (null, 'Iskra', 'Rudenko', 'Andriyovich', '2003-04-25', '656454');

INSERT INTO student
VALUES (null, 'Zlatoslava', 'Moroz', 'Fedorovych', '2003-02-10', '564545');
INSERT INTO student
VALUES (null, 'Bogdan', 'Lysenko', 'Vitaliyivna', '2003-09-02', '656455');
INSERT INTO student
VALUES (null, 'Sofia', 'Petrenko', 'Vitaliyovich', '2002-12-23', '233534');
INSERT INTO student
VALUES (null, 'Afina', 'Pavlenko', 'Volodymyrovich', '2003-04-08', '356789');
INSERT INTO student
VALUES (null, 'Madonna', 'Gavryliuk', 'Oleksandrivna', '2003-05-11', '564536');
