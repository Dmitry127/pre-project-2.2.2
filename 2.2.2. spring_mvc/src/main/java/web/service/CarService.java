package web.service;

import org.springframework.stereotype.Service;
import web.CarUtil;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {


    public List<Car> getNumberOfCars(int count) {
        return CarUtil.getCars().stream().limit(count).collect(Collectors.toList());
    }
}
