package ca.gc.esdc.springtestproject.services;

import ca.gc.esdc.springtestproject.dao.Repository.CarRepository;
import ca.gc.esdc.springtestproject.dao.entities.Car;
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
