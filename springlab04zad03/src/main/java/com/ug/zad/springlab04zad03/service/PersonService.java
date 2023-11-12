package com.ug.zad.springlab04zad03.service;

import com.ug.zad.springlab04zad03.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private Person prezes;

    @Autowired
    private Person wiceprezes;

    @Autowired
    private Person sekretarka;

    public void printAllBeans() {
        System.out.println("Prezes: " + prezes);
        System.out.println("Wiceprezes: " + wiceprezes);
        System.out.println("Sekretarka: " + sekretarka);
    }
}
