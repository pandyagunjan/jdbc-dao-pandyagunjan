package daos;

import models.DTOCar;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOCar implements DAOInterface {
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
            while(resultSet.next()){
                DTOCar car = extractCarFromResultSet(resultSet);
                cars.add(car);
            }
            return cars;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean update(DTOCar dto) {

        try{
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE car SET Make=?, Model=?, Year=? , Color=? , Vin=?  WHERE Id=?");
            preparedStatement.setInt(6, dto.getId());
            preparedStatement.setString(1, dto.getMake());
            preparedStatement.setString(2, dto.getModel());
            preparedStatement.setString(3, dto.getYear());
            preparedStatement.setString(4, dto.getColor());
            preparedStatement.setString(5, dto.getVIN());
            int i = preparedStatement.executeUpdate();
            if (i == 1){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean create(DTOCar dto) {
        Connection connection = ConnectionFactory.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Car VALUES (?,?,?,?,?,?)");
            preparedStatement.setInt(1, dto.getId());
            preparedStatement.setString(2, dto.getMake());
            preparedStatement.setString(3, dto.getModel());
            preparedStatement.setString(4, dto.getYear());
            preparedStatement.setString(5, dto.getColor());
            preparedStatement.setString(6, dto.getVIN());
            int i  = preparedStatement.executeUpdate();
            if (i == 1){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }



    public boolean delete(int id) {
        try{
            Statement statement = connection.createStatement();
            int i = statement.executeUpdate("DELETE FROM Car WHERE Id = " + id);

            if (i == 1){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;


    }
}
