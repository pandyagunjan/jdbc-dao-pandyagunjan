import daos.ConnectionFactory;
import models.DAOCar;
import models.DTOCar;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class AppRunner {

    public static void main(String[] args) {
        DAOCar dao= new DAOCar();
        System.out.println("************* FIND BY ID *****************");
        DTOCar car= dao.findById(18);
        System.out.printf("\nId:%d,Make:%s,Model:%s,Year:%s,Color:%s,Vin:%s \n ", car.getId(),car.getMake(),car.getModel(),car.getYear(), car.getColor() ,car.getVIN());
        System.out.println("************* FIND ALL *****************");
        List<DTOCar> cars = new ArrayList<DTOCar>();
        cars=dao.findAll();
        for(int i =0 ; i <cars.size();i++)
        {
            System.out.printf("\nId:%d,Make:%s,Model:%s,Year:%s,Color:%s,Vin:%s \n ", cars.get(i).getId(),cars.get(i).getMake(),cars.get(i).getModel(),cars.get(i).getYear(), cars.get(i).getColor() ,cars.get(i).getVIN());
        }

    }

}
