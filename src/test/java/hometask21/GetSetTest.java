package src.test.java.hometask21;

import org.testng.Assert;
import org.testng.annotations.Test;
import src.main.java.hometask21.Woman;

public class GetSetTest {


    @Test (groups = { "set" })
    public void testGetAge() {
        int age = 20;
        Woman woman = new Woman("Alina", "Vasylets", age, true);
        Assert.assertEquals(woman.getAge(), age);
    }

    @Test (groups = { "get" })
    public void testSetAge() {
        int age = 20;
        Woman woman = new Woman("Alina", "Vasylets", 70, true);
        woman.setAge(age);
        Assert.assertEquals(woman.getAge(), age);
    }

}
