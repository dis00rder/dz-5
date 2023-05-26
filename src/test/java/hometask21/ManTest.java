package src.test.java.hometask21;

import org.testng.Assert;
import org.testng.annotations.Test;
import src.main.java.hometask21.Man;
import src.main.java.hometask21.Person;

public class ManTest {

//    @Test
//    public void testIsRetiredNot() {
//        Man man = new Man("Petr", "Selivanov", 64, true);
//        Assert.assertFalse(man.isRetired(), "Is not retired");
//    }

//    @Test
//    public void testIsRetiredYes() {
//        Man man = new Man("Petr", "Selivanov", 65, true);
//        Assert.assertTrue(man.isRetired(), "Is retired");
//    }

    @Test
    public void testPartnershipRegister() {

        Man man = new Man("Petr", "Selivanov", 64, false);
        man.registerPartnership();
        Assert.assertTrue(man.isPartner());

    }

    @Test
    public void testPartnershipDeregister() {

        Man man = new Man("Petr", "Selivanov", 64, false);
        man.registerPartnership();
        man.deregisterPartnership();
        Assert.assertFalse(man.isPartner());

    }
}
