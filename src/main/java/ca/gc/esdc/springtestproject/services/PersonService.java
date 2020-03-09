package ca.gc.esdc.springtestproject.services;

import ca.gc.esdc.springtestproject.dao.entities.Person;

import java.util.List;

public interface PersonService {

    public Person add(Person person);
    public List<Person>  getAllPersons();
    public Person getPersonByid(Long nId);
}
