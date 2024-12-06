package org.example.springbootdemo.repository;

import org.example.springbootdemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop laptop) {
        System.out.println("Laptop saved");
    }
}
