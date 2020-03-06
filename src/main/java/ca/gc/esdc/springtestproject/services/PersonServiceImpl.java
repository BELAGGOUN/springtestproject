package ca.gc.esdc.springtestproject.services;


import ca.gc.esdc.springtestproject.Repository.PersonRepository;
import ca.gc.esdc.springtestproject.entities.Car;
import ca.gc.esdc.springtestproject.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    PersonRepository personRepository;

    @Override
    public Object add(Person person) {

        return personRepository.save(person);

    }
}
