package web;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarUtil {
    private static final List<Car> carsList = new ArrayList<>();


    public static List<Car> getCars() {
        carsList.add(new Car("Ford", "Focus", 150));
        carsList.add(new Car("Ford", "SuperFocus", 170));
        carsList.add(new Car("Lada", "Nelada", 50));
        carsList.add(new Car("Kamaz", "Truck", 1000));
        carsList.add(new Car("Car", "Generic", 100));
        return carsList;
    }

}
