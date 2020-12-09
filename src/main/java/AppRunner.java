import daos.ConnectionFactory;
import models.DAOCar;
import models.DTOCar;

import java.sql.Connection;

public class AppRunner {

    public static void main(String[] args) {
        DAOCar dao= new DAOCar();
        DTOCar car= dao.findById(18);
        System.out.printf("Id:%d  Make:%s  Model:%s  Year:%s  Color:%s  Vin:%s ", car.getId(),car.getMake(),car.getModel(),car.getYear(), car.getColor() ,car.getVIN());

    }

}
