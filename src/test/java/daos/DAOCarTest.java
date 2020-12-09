package daos;
import models.DTOCar;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DAOCarTest {
    DAOCar dao= new DAOCar();
    DTOCar dto=new DTOCar();
    @Test
    public void findByIdTest() {

        DTOCar car= dao.findById(18);
        Integer expected=18;

        Assert.assertEquals(expected , car.getId());
    }
    @Test
    public void findAllTest(){
        List allCards = dao.findAll();
        int actual = 10;
        int expected = allCards.size();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void updateTest(){
        String actual = "CHEVY";
        dto = dao.findById(18);
        dto.setModel(actual);
        dao.update(dto);
        String expected = dao.findById(18).getModel();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void createTest(){
        String actual = "VIN ON CREATION";
        dto = new DTOCar(99,"FAKE MAKE" , "FAKE MODEL ", "FAKE YEAR" , "FAKE COLOR" , actual);
        dao.create(dto);
        String expected = dao.findById(99).getVIN();

        Assert.assertEquals(expected, actual);
        dao.delete(99);
    }

    @Test
    public void deleteTest(){
        dto = new DTOCar(100,"FAKE MAKE" , "FAKE MODEL ", "FAKE YEAR" , "FAKE COLOR" , "FAKE VIN");
        dao.create(dto);
        int id = 100;
        Assert.assertNotNull(dao.findById(id));

        dao.delete(id);
        Assert.assertNull(dao.findById(id));
    }



}
