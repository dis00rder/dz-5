package src.test.java.hometask21;

import org.testng.Assert;
import org.testng.annotations.Test;
import src.main.java.hometask21.Woman;

public class WomanTest {

//    @Test
//    public void testIsRetiredNot() {
//        Woman woman = new Woman("Alina", "Vasylets", 40, true);
//        Assert.assertFalse(woman.isRetired(), "Is not retired");
//    }

//    @Test
//    public void testIsRetiredYes() {
//        Woman woman = new Woman("Alina", "Vasylets", 70, true);
//        Assert.assertTrue(woman.isRetired(), "Is retired");
//    }

    @Test
    public void testPartnership() {
        String lastName = "Larin";
        Woman woman = new Woman("Alina", "Vasylets", 70, false);
        woman.registerPartnership(lastName);
        Assert.assertEquals(woman.getLastName(),lastName);
        Assert.assertTrue(woman.isPartner());

    }

    @Test
    public void testPartnershipDeregister() {
        String originalLastName = "Vasylets";
        Woman woman = new Woman("Alina", originalLastName, 70, false);
        woman.registerPartnership("lastname");
        woman.deregisterPartnership(true);
        Assert.assertEquals(woman.getLastName(),originalLastName);
        Assert.assertFalse(woman.isPartner());

    }
}
