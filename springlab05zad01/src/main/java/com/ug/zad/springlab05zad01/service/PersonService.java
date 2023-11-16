package com.ug.zad.springlab05zad01.service;

import com.ug.zad.springlab05zad01.domain.Person;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private List<Person> persons = new ArrayList<>();
    private int nextId = 1;
    @PostConstruct
    private void init() {
        // Adding persons
        addPerson(new Person("John", "Doe", "john.doe@example.com", "Company A"));
        addPerson(new Person("Jane", "Smith", "jane.smith@example.com", "Company B"));
        addPerson(new Person("Janna", "Clark", "janna.clark@example.com", "Company C"));

        // Updating person with id 1
        Person updatedPerson = new Person("Updated", "Person", "updated.person@example.com", "Updated Company");
        updatePerson(1, updatedPerson);

        // Deleting person with id 2
        deletePerson(2);

    }

    public List<Person> getAllPersons() {
        return persons;
    }

    public Person getPersonById(int id) {
        Optional<Person> personOptional = persons.stream()
                .filter(person -> person.getId() == id)
                .findFirst();
        return personOptional.orElse(null);
    }

    public Person addPerson(Person person) {
        person.setId(nextId++);
        persons.add(person);
        return person;
    }

    public Person updatePerson(int id, Person updatedPerson) {
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getId() == id) {
                updatedPerson.setId(id);
                persons.set(i, updatedPerson);
                return updatedPerson;
            }
        }
        return null;
    }

    public void deletePerson(int id) {
        persons.removeIf(person -> person.getId() == id);
    }
}
