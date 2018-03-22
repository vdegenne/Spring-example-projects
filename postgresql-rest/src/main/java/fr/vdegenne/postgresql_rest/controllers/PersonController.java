package fr.vdegenne.postgresql_rest.controllers;

import fr.vdegenne.postgresql_rest.domain.Person;
import fr.vdegenne.postgresql_rest.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/* @RestController est similaire à @Controller
 * sauf qu'il ajoute implicitement l'annotation @ResponseBody
 * en en-tête de chaque fonction du controller.
 */
@RestController
public class PersonController {

    @Autowired
    private PersonRepository repo;

    @RequestMapping("/hello")
    public Person hello() {
        return repo.findPersonByFirstname("Jack");
    }
}
