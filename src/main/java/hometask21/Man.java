package src.main.java.hometask21;

public class Man extends Person {

    public Man(String firstName, String lastName, int age, boolean partner) {
        super(firstName, lastName, age, partner);
    }

    public boolean isRetired() {
        return age >= 65;
    }


    public void registerPartnership() {
        partner = true;
    }


    public void deregisterPartnership() {
        partner = false;
    }

}
