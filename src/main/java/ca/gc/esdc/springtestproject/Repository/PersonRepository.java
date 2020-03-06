package ca.gc.esdc.springtestproject.Repository;

import ca.gc.esdc.springtestproject.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer>  {

}
