package src.test.java.hometask21;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import src.main.java.hometask21.Man;
import src.main.java.hometask21.Person;
import src.main.java.hometask21.Woman;

public class GetSetTest {


    @Test(groups = {"get"},dataProvider = "people", dataProviderClass = TestDataProvider.class)
    public void testGetAge(Person person) {
        //int age = 20;
       // Woman woman = new Woman("Alina", "Vasylets", age, true);
        Assert.assertEquals(person.getAge(), 50);
    }

    @Test(groups = {"set"},dataProvider = "people", dataProviderClass = TestDataProvider.class)
    public void testSetAge(Person person) {
        int age = 20;
       // Woman woman = new Woman("Alina", "Vasylets", 70, true);
        person.setAge(age);
        Assert.assertEquals(person.getAge(), age);
    }



}
