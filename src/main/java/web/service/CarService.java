package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        // Создаем 5 машин
        cars.add(new Car("Toyota Camry", "Black", 2022));
        cars.add(new Car("Honda Civic", "White", 2021));
        cars.add(new Car("BMW X5", "Blue", 2023));
        cars.add(new Car("Mercedes C-Class", "Silver", 2020));
        cars.add(new Car("Audi A4", "Red", 2022));
    }

    public List<Car> getCars(int count) {
        if (count >= 5) {
            return cars; // Возвращаем все машины если count ≥ 5
        }
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
