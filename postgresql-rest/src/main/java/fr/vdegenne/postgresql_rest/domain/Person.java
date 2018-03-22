package fr.vdegenne.postgresql_rest.domain;

import javax.persistence.*;

@Entity
@Table(name = "persons")
public class Person {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    @Id
    private Long id;

    private String firstname;
    private String surname;

    /* Toujours obligé de mettre un constructeur par défaut */
    public Person() {
    }

    public Person(String firstname, String surname) {
        this.firstname = firstname;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
