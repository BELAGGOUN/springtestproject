package ca.gc.esdc.springtestproject.services;

import ca.gc.esdc.springtestproject.dao.Repository.AddressRepository;
import ca.gc.esdc.springtestproject.dao.entities.Address;
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
