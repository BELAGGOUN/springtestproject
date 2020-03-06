package ca.gc.esdc.springtestproject.services;

import ca.gc.esdc.springtestproject.Repository.CarRepository;
import ca.gc.esdc.springtestproject.entities.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    CarRepository carRepository;

    @Override
    public Object add(Car car) {

        return carRepository.save(car);

    }
}
