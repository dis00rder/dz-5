package dz9;

public abstract class Person {

    protected String firstName;
    protected String lastName;
    protected int age;
    protected boolean partner;

    public Person(String firstName, String lastName, int age, boolean partner) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = partner;
    }

    public abstract boolean isRetired();

    public abstract void registerPartnership(String partnerLastName);

    public abstract void deregisterPartnership(boolean returnOldLastName);

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
