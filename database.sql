create table user(
    id integer primary key auto_increment,
    first_name varchar(50),
    last_name varchar(50),
    email varchar(100) unique,
    password varchar(250),
    mobile varchar(20),
    role varchar(10),
    insert_ts timestamp DEFAULT CURRENT_TIMESTAMP
);

insert into user
(id, first_name, last_name, email, password, mobile, role)
values
(1, "Abhijeet", "Gurav", "abhi@mail.com", "abhi@123", "9850909703", "admin");

insert into user
(first_name, last_name, email, password, mobile, role)
values
("Abhilasha", "Angaitkar", "abhil@mail.com", "abhi@123", "9898505090", "admin"),
("Ajit", "Hirave", "ajit@mail.com", "ajit@123", "9850509009","admin");

create table flight(
    id integer primary key auto_increment,
    flight_name varchar(50),
    arrival_time time,
    departure_time time,
    source varchar(100),
    destination varchar(100),
    flight_type varchar(10),
    flight_fare double(7,2),
	no_of_seats integer default 132,
    is_available bool default true
);

insert into flight
(id, flight_name, arrival_time, departure_time, source, destination, flight_type, flight_fare)
values
(101, "Vistara", "12:30:00", "23:30:00","pune", "mumbai", "Business", 24569.65),
(102, "Vistara", "08:30:00", "23:30:00","pune", "delhi", "Economy", 24569.65),
(103, "Vistara", "06:30:00", "14:30:00","pune", "kolkata", "Economy", 14569.65);

create table booking(
    id integer primary key auto_increment,
    schedule_date date,
    no_of_passengers integer,
    user_id integer,
    flight_id integer,
    foreign key (user_id) references user(id),
    foreign key (flight_id) references flight(id),
    insert_ts timestamp DEFAULT CURRENT_TIMESTAMP
);

insert into booking
(id, schedule_date, no_of_passengers, user_id, flight_id)
values
(2022001, "4", 1, 101),
(2022002, "2", 2, 101),
(2022003, "3", 3, 103);

create table passenger(
	id integer primary key auto_increment,
	first_name varchar(50),
	last_name varchar(50),
	user_id integer,
	foreign key (user_id) references user(id)
);

create table feedback(
	id integer primary key auto_increment,
	user_id integer,
    	booking_id integer,
	rating integer default 1,
	description varchar(300),
	issue varchar(300),
    	foreign key (user_id) references user(id),
    	foreign key (booking_id) references booking(id),
   	insert_ts timestamp DEFAULT CURRENT_TIMESTAMP
);






