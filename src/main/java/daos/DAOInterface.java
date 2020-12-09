package daos;

import models.DTOCar;

import java.util.List;

public interface DAOInterface {

    public DTOCar findById(int id);
    public List findAll();
    public boolean update(DTOCar dto);
    public boolean create(DTOCar dto);
    public boolean delete(int id);

}
