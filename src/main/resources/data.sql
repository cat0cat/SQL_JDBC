
insert into customers(name, surname, age, phone_number)
values
      ('Petya', 'Ivanov', 29, 123456),
      ('Ivan', 'Belkin', 92, 901234),
      ('Alexey', 'Petrov', 24, 789012),
      ('Olya', 'Koshkina', 32, 345678);

insert into orders(customer_id, product_name, amount)
values
      (1, 'product1', 100),
      (2, 'product2', 500),
      (3, 'product3', 800),
      (4, 'product4', 200),
      (4, 'product5', 400),
      (3, 'product6', 600),
      (2, 'product7', 300),
      (1, 'product8', 700);