package dz9;

public class Man extends Person {

    public Man(String firstName, String lastName, int age, boolean partner) {
        super(firstName, lastName, age, partner);
    }

    public boolean isRetired() {
        return age >= 65;
    }

    @Override
    public void registerPartnership(String partnerLastName) {
        partner = true;
    }

    @Override
    public void deregisterPartnership(boolean returnOldLastName) {
        partner = false;
    }

}
