package ca.gc.esdc.springtestproject.DataLoader;

import ca.gc.esdc.springtestproject.Repository.AddressRepository;
import ca.gc.esdc.springtestproject.Repository.PersonRepository;
import ca.gc.esdc.springtestproject.Repository.ProjectRepository;
import ca.gc.esdc.springtestproject.entities.Address;
import ca.gc.esdc.springtestproject.entities.Car;
import ca.gc.esdc.springtestproject.entities.Person;
import ca.gc.esdc.springtestproject.services.AddressService;
import ca.gc.esdc.springtestproject.services.CarService;
import ca.gc.esdc.springtestproject.services.PersonService;
import ca.gc.esdc.springtestproject.services.ProjectService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Getter @Setter
@Component
public class DataLoader  implements CommandLineRunner
{



   // @Autowired
    private CarService carService;
    private PersonService personService;
    private AddressService addressService;
    private ProjectService projectService;

    public DataLoader(CarService carService, PersonService personService, AddressService addressService, ProjectService projectService) {
        this.carService = carService;
        this.personService = personService;
        this.addressService = addressService;
        this.projectService = projectService;
    }

    @Override
    public void run(String... args) throws Exception {

        Address address1 = new Address();
        Person person1 = new Person();
        Car car1= new Car();

        address1.setCity("Ottawa");
        address1.setStreet("22 Paul yell Ontario");
        addressService.add(address1);
        person1.setAddress(address1);
        person1.setFirstName("Salah");
        person1.setLastName("Belaggoun");
      person1.setNas("2222");
      //  person.setDateBirth();
        personService.add(person1);

        car1.setOwner(person1);
        car1.setVinNumber("123");
        carService.add(car1);
    }


}
