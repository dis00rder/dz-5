package src.test.java.hometask21;

import org.testng.Assert;
import org.testng.annotations.Test;
import src.main.java.hometask21.Person;

public class PersonTest {

    @Test(dataProvider = "peopleNotRetired", dataProviderClass = TestDataProvider.class)
    public void testIsRetiredNot(Person person) {
        Assert.assertFalse(person.isRetired(), "Is not retired");
    }

    @Test(dataProvider = "peopleIsRetired", dataProviderClass = TestDataProvider.class)
    public void testIsRetired(Person person) {
        Assert.assertTrue(person.isRetired(), "Is retired");
    }
}
