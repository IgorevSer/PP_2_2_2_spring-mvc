package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Toyota", "Japan", 125));
        cars.add(new Car("Nissan", "Japan", 130));
        cars.add(new Car("BMW", "Germany", 200));
        cars.add(new Car("Hyundai", "Korea", 110));
        cars.add(new Car("Mercedes", "Germany", 250));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(Math.max(count, 0)).toList();
    }
}
