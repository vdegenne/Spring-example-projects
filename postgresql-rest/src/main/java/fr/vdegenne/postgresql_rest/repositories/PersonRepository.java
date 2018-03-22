package fr.vdegenne.postgresql_rest.repositories;

import fr.vdegenne.postgresql_rest.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

    Person findPersonByFirstname (String name);
}
