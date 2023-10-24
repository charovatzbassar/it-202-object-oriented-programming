package week4.lecture;

enum Color {
    WHITE, RED, BLACK
}

enum FuelType {
    DIESEL, PETROL
}

class Vehicle {
    private int numOfGears;
    private int numOfWheels;
    private Color color;

    public Vehicle(int numOfGears, int numOfWheels, Color color) {
        this.numOfGears = numOfGears;
        this.numOfWheels = numOfWheels;
        this.color = color;
    }

    public int getNumOfGears() {
        return numOfGears;
    }

    public void setNumOfGears(int numOfGears) {
        this.numOfGears = numOfGears;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

class Car extends Vehicle {
    private FuelType fuelType;

    public Car(int numOfGears, int numOfWheels, Color color, FuelType fuelType) {
        super(numOfGears, numOfWheels, color);
        this.fuelType = fuelType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
}

class Bicycle extends Vehicle {
    private boolean doesItHaveDinama;

    public Bicycle(int numOfGears, int numOfWheels, Color color, boolean doesItHaveDinama) {
        super(numOfGears, numOfWheels, color);
        this.doesItHaveDinama = doesItHaveDinama;
    }

    public boolean isDoesItHaveDinama() {
        return doesItHaveDinama;
    }

    public void setDoesItHaveDinama(boolean doesItHaveDinama) {
        this.doesItHaveDinama = doesItHaveDinama;
    }
}