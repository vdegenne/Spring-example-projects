# Postgresql Rest

## La base de données

Voici le code SQL pour construire la base. On utilisera aussi la base de données *testdb* et le schéma *public* par défaut dans le cadre de notre projet.

```sql
create table persons (
  person_id serial primary key,
  firstname text not null,
  surname text not null
);

insert into persons (firstname, surname)
values
('Jack', 'Sparrow'),
('Valentin', 'Degenne'),
('Pika', 'Chu');
```
# Dépendances

Pour les dépendances de Spring, on utilisera :

- spring-boot-starter-web
- spring-boot-starter-data-jpa
- spring-boot-starter-data-rest
avec `org.postgresql`.

# explications

On peut utiliser un rest-controller pour accéder à nos informations (Voir PersonController), ou alors on peut utiliser le *spring-boot-starter-data-rest* pour avoir un mappage automatique de nos entités sur des endpoints de type REST.

# Pour tester

Lancer *PostgresqlRestApplication* puis accéder à *http://localhost:8080/*.