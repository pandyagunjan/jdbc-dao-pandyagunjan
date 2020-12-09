package models;

import daos.ConnectionFactory;
import daos.DAO;
import models.DTOCar;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOCar implements DAO {
    Connection connection = ConnectionFactory.getConnection();

    public DTOCar findById(int id) {
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM CAR WHERE Id="+id);
            if (resultSet.next()){
                return extractCarFromResultSet(resultSet);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

   // @org.jetbrains.annotations.NotNull
    private DTOCar extractCarFromResultSet(ResultSet resultSet) throws SQLException {
        DTOCar car = new DTOCar();
        car.setId(resultSet.getInt(1));
        car.setMake(resultSet.getString("Make"));
        car.setModel(resultSet.getString("Model"));
        car.setYear(resultSet.getString("Year"));
        car.setColor(resultSet.getString("Color"));
        car.setVIN(resultSet.getString("Vin"));

        return car;
    }


    public List findAll() {
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM CAR");
            List<DTOCar> cars = new ArrayList<DTOCar>();
            if (resultSet.next()){
                DTOCar car = extractCarFromResultSet(resultSet);
                cars.add(car);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public DTOCar update(DTOCar dto) {
        return null;
    }

    public DTOCar create(DTOCar dto) {
        return null;
    }

    public void delete(int id) {

    }
}
