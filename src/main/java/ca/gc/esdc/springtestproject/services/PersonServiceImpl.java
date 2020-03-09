package ca.gc.esdc.springtestproject.services;



import ca.gc.esdc.springtestproject.dao.Repository.AddressRepository;
import ca.gc.esdc.springtestproject.dao.Repository.PersonRepository;
import ca.gc.esdc.springtestproject.dao.entities.Address;
import ca.gc.esdc.springtestproject.dao.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;
    @Autowired
    AddressRepository addressRepository;

    @Override
    public Person add(Person person) {

        return personRepository.save(person);

    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @Override
    public Person getPersonByid(Long nId)  {
        Optional<Person> p = personRepository.findById(  nId);

        return p.orElse(null);
    }
}
