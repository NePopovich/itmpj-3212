package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class CarService {

    private static Logger logger = Logger.getLogger(CarService.class.getName());

    private List<Car> cars = new ArrayList<>();


    public CarService() {
        cars.add(new Car("audi", "a4", 2005));
        cars.add(new Car("audi", "a6", 2008));
        cars.add(new Car("toyta", "camry", 2004));
        cars.add(new Car("toyota", "avensis", 2001));
        cars.add(new Car("audi", "a8", 2020));
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getCarsByCount(int count){
        List<Car> result = new ArrayList<>();
        if (count < cars.size() || count == cars.size()){
            for (int i = 0; i < count; i++) {
                result.add(cars.get(i));
            }
        } else {
            logger.info("Переданное количество больше списка машин!");
            result = cars;
        }
        return result;
    }
}
