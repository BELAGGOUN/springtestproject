package ca.gc.esdc.springtestproject.presentation.controllers;

import ca.gc.esdc.springtestproject.dao.entities.Person;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PersonApiController {

    @GetMapping
    public List<Person> getPersons();
    @GetMapping("/{nId}")
    public Person getPersonById(@PathVariable("nId") long nId) ;
    @PostMapping(value = "/add")

    public Person addPersons(@RequestBody Person personBody);
}
