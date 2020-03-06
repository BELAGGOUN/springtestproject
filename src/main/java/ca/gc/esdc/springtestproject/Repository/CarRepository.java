package ca.gc.esdc.springtestproject.Repository;

import ca.gc.esdc.springtestproject.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Integer> {
}
