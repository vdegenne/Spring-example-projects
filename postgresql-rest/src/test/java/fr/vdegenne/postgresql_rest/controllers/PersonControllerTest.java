package fr.vdegenne.postgresql_rest.controllers;

import fr.vdegenne.postgresql_rest.domain.Person;
import fr.vdegenne.postgresql_rest.repositories.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonControllerTest {

    @Autowired
    private PersonRepository repo;

    @Test
    public void test() {
        Person jean = repo.save(new Person("Jean", "Frites"));
        assertThat(repo.findPersonByFirstname("Jean").getId(), is(jean.getId()));
    }
}