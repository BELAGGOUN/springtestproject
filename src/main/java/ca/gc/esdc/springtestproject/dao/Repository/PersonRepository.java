package ca.gc.esdc.springtestproject.dao.Repository;

import ca.gc.esdc.springtestproject.dao.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer>  {

}
