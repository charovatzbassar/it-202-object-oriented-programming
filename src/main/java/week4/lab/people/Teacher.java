package week4.lab.people;

public class Teacher extends Person {
    private int salary;

    public Teacher(String fullName, String homeAddress, int age, String country, int salary) {
        super(fullName, homeAddress, age, country);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "salary " + this.salary + " euros/month";
    }
}
