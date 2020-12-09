package daos;

import models.DTOCar;

import java.util.List;

public interface DAO {

    public DTOCar findById(int id);
    public List findAll();
    public DTOCar update(DTOCar dto);
    public DTOCar create(DTOCar dto);
    public void delete(int id);

}
