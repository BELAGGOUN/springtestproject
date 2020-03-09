package ca.gc.esdc.springtestproject.presentation.controllers;

import ca.gc.esdc.springtestproject.dao.Repository.AddressRepository;
import ca.gc.esdc.springtestproject.dao.entities.Address;
import ca.gc.esdc.springtestproject.dao.entities.Person;
import ca.gc.esdc.springtestproject.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.net.www.MimeTable;

import java.util.List;
@RestController
@RequestMapping("/person")
public class PersonApiControllerImpl implements PersonApiController {

    @Autowired
    private PersonService personServiceimpl;
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Person> getPersons() {

        return personServiceimpl.getAllPersons();
    }

    @Override
    public Person getPersonById(long nId) {
        return personServiceimpl.getPersonByid(nId);
    }

    @Override
    public Person addPersons(Person person ) {
        Address a = Address.builder().city(person.getAddress().getCity())
                .street(person.getAddress().getStreet()).build();
        addressRepository.save(a);
        return personServiceimpl.add(person );
    }
}
