use human_friends;

drop table form_сommands;
drop table forms;
drop table animal_сommands;
drop table animals;
drop table sub_animal_сommands;
drop table sub_animals;
drop table donkeys;
drop table horses;
drop table camels;
drop table dog_сommands;
drop table dogs;
drop table cats;
drop table hamsters;
drop table сommands;

# сommands
create table сommands (id int, name varchar(100));
alter table сommands add primary key (id);
insert into сommands (id, name) values 
(1, 'Есть'), (2, 'Пить'), (3, 'Спать'), (4, 'Носить'), (5, 'Играть'), 
(6, 'Ловить мышей'), (7, 'Охранять'), (8, 'Бегать в колесе'), (9, 'Быть поводырем');

# forms
create table forms (id int, type varchar(100));
alter table forms add primary key (id);
insert into forms (id, type) values (1, 'Животные');

create table form_сommands (id int, animal int, command int);
alter table form_сommands add primary key (id);
insert into form_сommands (id, animal, command) values 
(1, 1, 1), (2, 1, 2), (3, 1, 3);

# animals
create table animals (id int, form int, type varchar(100));
alter table animals add primary key (id);
insert into animals (id, form, type) values (1, 1, 'Вьючные'), (2, 1, 'Домашние');

create table animal_сommands (id int, animal int, command int);
alter table animal_сommands add primary key (id);
insert into animal_сommands (id, animal, command) values (1, 1, 4), (2, 2, 5);

# sub_animals
create table sub_animals (id int, animal int, type varchar(100));
alter table sub_animals add primary key (id);
insert into sub_animals (id, animal, type) values  (1, 1, 'Лошади'), (2, 1, 'Верблюды'), (3, 1, 'Ослы'), (4, 2, 'Кошки'), (5, 2, 'Собаки'), (6, 2, 'Хомяки');

create table sub_animal_сommands (id int, sub_animal int, command int);
alter table sub_animal_сommands add primary key (id);
insert into sub_animal_сommands (id, sub_animal, command) values 
(1, 1, 4), (2, 2, 4), (3, 3, 4), 
(4, 4, 5), (5, 5, 5), (6, 6, 5);

# donkeys
create table donkeys (id int, name varchar(100), birthday date);
insert into donkeys (id, name, birthday) values  (1, 'Иа', STR_TO_DATE('02.02.2012', '%d.%m.%Y')), (2, 'Прялка', STR_TO_DATE('13.11.2007', '%d.%m.%Y'));

# horses
create table horses (id int, name varchar(100), birthday date);
insert into horses (id, name, birthday) values  (1, 'Лола', STR_TO_DATE('15.11.2010', '%d.%m.%Y')), (2, 'Изюм', STR_TO_DATE('17.05.2004', '%d.%m.%Y'));



# camels
create table camels (id int, name varchar(100), birthday date);
insert into camels (id, name, birthday) values  (1, 'Холм', STR_TO_DATE('22.01.2015', '%d.%m.%Y'));

# dogs
create table dogs (id int, name varchar(100), birthday date);
insert into dogs (id, name, birthday) values  (1, 'Лайка', STR_TO_DATE('11.02.2019', '%d.%m.%Y')), (2, 'Дружок', STR_TO_DATE('08.07.2015', '%d.%m.%Y'));

create table dog_сommands (id int, dog int, command int);
alter table dog_сommands add primary key (id);
insert into dog_сommands (id, dog, command) values (1, 2, 9);

# cats
create table cats (id int, name varchar(100), birthday date);
insert into cats (id, name, birthday) values  (1, 'Марфа', STR_TO_DATE('23.05.2022', '%d.%m.%Y')), (2, 'Мурка', STR_TO_DATE('05.12.2008', '%d.%m.%Y'));

# hamsters
create table hamsters (id int, name varchar(100), birthday date);
insert into hamsters (id, name, birthday) values  (1, 'Фома', STR_TO_DATE('10.04.2020', '%d.%m.%Y'));




