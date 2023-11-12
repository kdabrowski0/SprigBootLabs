package com.ug.zad.springlab04zad03.service;

import com.ug.zad.springlab04zad03.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

    @Bean(name = "prezes")
    public Person prezes() {
        return new Person("Chrystal", "Havoc", "chavocr@yahoo.com", "Mymm");
    }

    @Bean(name = "wiceprezes")
    public Person wiceprezes() {
        return new Person("Halley", "Gadaud", "hgadaud9@sohu.com", "Oyope");
    }

    @Bean(name = "sekretarka")
    public Person sekretarka() {
        return new Person("Kirbie", "Wrettum", "kwrettumj@slideshare.net", "Browsetype");
    }
}
