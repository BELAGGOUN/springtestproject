package ca.gc.esdc.springtestproject.Repository;

import ca.gc.esdc.springtestproject.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer>  {

}
