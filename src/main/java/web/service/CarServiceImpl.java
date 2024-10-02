package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add( new Car("Toyota","Red", 140));
        cars.add( new Car("BMW","Black", 190));
        cars.add( new Car("Mercedes-benz","White", 200));
        cars.add( new Car("Volkswagen","Blue", 220));
        cars.add( new Car("Skoda","Sparkling White", 999));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}