package com.cydeo.bootstrap;

import com.cydeo.entity.Car;
import com.cydeo.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {
    public DataGenerator(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    CarRepository carRepository;
    @Override
    public void run(String... args) throws Exception {
        Car c1=new Car("BMV","M5");
        Car c2=new Car("HONDA","CIVIC");
        Car c3=new Car("TAYOTA","CAROLA");

        carRepository.save(c1);
        carRepository.save(c2);
        carRepository.save(c3);

    }
}
