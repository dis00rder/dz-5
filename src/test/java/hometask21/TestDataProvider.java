package src.test.java.hometask21;

import org.testng.annotations.DataProvider;
import src.main.java.hometask21.Man;
import src.main.java.hometask21.Woman;

public class TestDataProvider {

    @DataProvider(name = "people")
    public static Object[][] people() {
        return new Object[][]{
                {new Man("Bill","Longer",50,false)},
                {new Woman("Ill","Longer",50,false)}
        };
    }

    @DataProvider(name = "peopleNotRetired")
    public static Object[][] peopleNotRetired() {
        return new Object[][]{
                {new Man("Bill","Longer",64,false)},
                {new Man("Bill","Longer",50,false)},
                {new Woman("Ill","Longer",50,false)},
                {new Woman("Ill","Longer",59,false)}
        };
    }

    @DataProvider(name = "peopleIsRetired")
    public static Object[][] peopleIsRetired() {
        return new Object[][]{
                {new Man("Bill","Longer",65,false)},
                {new Man("Bill","Longer",70,false)},
                {new Woman("Ill","Longer",60,false)},
                {new Woman("Ill","Longer",100,false)}
        };
    }
}
