package com.app.controller;

import com.app.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping({ "/", "" })
    public Person defaultPerson() {
        return Person.builder().name("ADAM").age(10).build();
    }

    @GetMapping("/person")
    public Person getPerson() {
        return Person.builder().name("EWA").age(20).build();
    }

}
