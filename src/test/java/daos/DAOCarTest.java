package daos;
import models.DAOCar;
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
}
