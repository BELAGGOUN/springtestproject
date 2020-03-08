package ca.gc.esdc.springtestproject.dao.Repository;

import ca.gc.esdc.springtestproject.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Integer> {
}
