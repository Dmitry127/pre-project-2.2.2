package web.dao;

import org.springframework.stereotype.Repository;
import web.CarUtil;
import web.model.Car;

import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {

    public List<Car> getCars() {
        return CarUtil.getCars();
    }
}
