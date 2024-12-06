package org.example.springbootdemo;

import org.example.springbootdemo.model.Alien;
import org.example.springbootdemo.model.Laptop;
import org.example.springbootdemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringbootDemoApplication.class, args);

        LaptopService service = context.getBean(LaptopService.class);

        Laptop lap = context.getBean(Laptop.class);
        service.addLaptop(lap);

    }

}
