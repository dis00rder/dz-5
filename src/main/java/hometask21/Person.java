package src.main.java.hometask21;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isPartner() {
        return partner;
    }
}
