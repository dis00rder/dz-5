package src.main.java.hometask21;

public class Woman extends Person {
    private String oldLastName;

    public Woman(String firstName, String lastName, int age, boolean partner) {
        super(firstName, lastName, age, partner);
    }

    public boolean isRetired() {
        return age >= 60;
    }


    public void registerPartnership(String partnerLastName) {
        oldLastName = lastName;
        lastName = partnerLastName;
        partner = true;
    }

    public void deregisterPartnership(boolean returnOldLastName) {

        if (returnOldLastName) {
            lastName = oldLastName;
        }
        partner = false;
    }
}
