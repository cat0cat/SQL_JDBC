# Задача Две таблицы с Hibernate

## Описание
Перепишем приложение из [задания по JDBC](https://github.com/cat0cat/SQL_JDBC.git) на Hibernate.

1. Вам необходимо будет написать две `Entity`, соответствующие двум таблицам из задания. Учтите, что вам надо будет верно выбрать логику отношений этих Entity: `OneToOne`, `OneToMany`, `ManyToOne`, `ManyToMany`

2. Перепишите репозиторий, чтобы он теперь работал с `EntityManager`, а не через `NamedParameterJdbcTemplate`.

3. Написанные код выложите в тот же репозиторий, что и задача [DAO слой](https://github.com/cat0cat/SQL_JDBC.git) на гитхабe, только создайте под нее другую ветку `hibernate` и прикрепите ссылку на нее в домашнем задании.