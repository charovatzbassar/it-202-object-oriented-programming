package week4.lab.shapes;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, FillType fillType, double radius) {
        super(color, fillType);
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public double calculateCircumference(double r, double PI) {
        return 2*r*PI;
    }

    public double calculateCircumference(double r) {
        return 2*r*Math.PI;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius + Math.PI;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Radius: " + this.radius);
    }
}
