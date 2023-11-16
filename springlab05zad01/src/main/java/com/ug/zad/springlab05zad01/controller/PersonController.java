package com.ug.zad.springlab05zad01.controller;

import com.ug.zad.springlab05zad01.domain.Person;
import com.ug.zad.springlab05zad01.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> getAllUsers() {
        return personService.getAllPersons();
    }

    @GetMapping("/{id}")
    public Person getUserById(@PathVariable int id) {
        return personService.getPersonById(id);
    }

    @PostMapping
    public Person addUser(@RequestBody Person person) {
        return personService.addPerson(person);
    }

    @PutMapping("/{id}")
    public Person updateUser(@PathVariable int id, @RequestBody Person updatedPerson) {
        return personService.updatePerson(id, updatedPerson);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        personService.deletePerson(id);
    }
}
