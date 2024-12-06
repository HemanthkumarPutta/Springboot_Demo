package org.example.springbootdemo.service;

import org.example.springbootdemo.model.Laptop;
import org.example.springbootdemo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;
    public void addLaptop(Laptop lap) {
        laptopRepository.save(lap);
    }

    public boolean isGoodforProgramming(Laptop lap){
        return true;
    }
}
