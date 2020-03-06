package ca.gc.esdc.springtestproject.services;

import ca.gc.esdc.springtestproject.Repository.AddressRepository;
import ca.gc.esdc.springtestproject.entities.Address;
import ca.gc.esdc.springtestproject.entities.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService{

    @Autowired
    AddressRepository addressRepository;

    @Override
    public Object add(Address address) {

        return addressRepository.save(address);

    }
}
