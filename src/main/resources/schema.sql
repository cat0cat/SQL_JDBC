create table customers
(
    id int primary key auto_increment,
    name varchar(255),
    surname varchar(255),
    age int check ( age > 0 ),
    phone_number int
);

create table orders
(
    id int primary key auto_increment,
    date timestamp not null default now(),
    customer_id int references customers (id),
    product_name varchar(255),
    amount int not null
);