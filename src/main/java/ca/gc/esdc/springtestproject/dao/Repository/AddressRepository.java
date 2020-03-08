package ca.gc.esdc.springtestproject.dao.Repository;

import ca.gc.esdc.springtestproject.dao.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer>  {

}
