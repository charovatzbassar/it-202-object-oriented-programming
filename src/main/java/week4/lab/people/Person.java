package week4.lab.people;

public class Person {
    private String fullName;
    private String homeAddress;
    private int age;
    private String country;

    public Person(String fullName, String homeAddress, int age, String country) {
        this.fullName = fullName;
        this.homeAddress = homeAddress;
        this.age = age;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return this.fullName + "\n" + this.homeAddress;
    }
}
