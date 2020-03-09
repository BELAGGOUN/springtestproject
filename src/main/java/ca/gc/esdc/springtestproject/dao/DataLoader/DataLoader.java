package ca.gc.esdc.springtestproject.dao.DataLoader;

import ca.gc.esdc.springtestproject.dao.entities.Car;
import ca.gc.esdc.springtestproject.dao.entities.Address;
import ca.gc.esdc.springtestproject.dao.entities.Person;
import ca.gc.esdc.springtestproject.services.AddressService;
import ca.gc.esdc.springtestproject.services.CarService;
import ca.gc.esdc.springtestproject.services.PersonService;
import ca.gc.esdc.springtestproject.services.ProjectService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

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

        Address address2 = new Address();
        Person person2 = new Person();
        Car car2= new Car();

        address1.setCity("Ottawa");
        address1.setStreet("22 Paul yell Ontario");
        addressService.add(address1);
        person1.setAddress(address1);
        person1.setFirstName("Salah");
        person1.setLastName("Belaggoun");
        person1.setNas("2222");
        person1.setAge(35L);
        person1.setDateBirth(new Date("03/02/1999"));
        personService.add(person1);

        car1.setOwner(person1);
        car1.setVinNumber("123");
        carService.add(car1);

        address2.setCity("Gatineau");
        address2.setStreet("555 McCarty Str Quebec");
        addressService.add(address2);
        person2.setAddress(address2);
        person2.setFirstName("Luc");
        person2.setLastName("Breton");
        person2.setNas("3333");
        person2.setAge(25);
        person2.setDateBirth((new Date("22/02/1999")));
        //  person.setDateBirth();
        personService.add(person2);

        car2.setOwner(person2);
        car2.setVinNumber("345");
        carService.add(car2);
    }


}
