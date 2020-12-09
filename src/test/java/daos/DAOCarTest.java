package daos;
import models.DAOCar;
import models.DTOCar;
import org.junit.Assert;
import org.junit.Test;

public class DAOCarTest {

    @Test
    public void readToQuit() {
        DAOCar dao= new DAOCar();
        DTOCar car= dao.findById(18);
        Integer expected=18;

        Assert.assertEquals(expected , car.getId());
    }

}
