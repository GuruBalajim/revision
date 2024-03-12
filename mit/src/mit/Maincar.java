package mit;

class Vehicle {
    String brand;

    public Vehicle() {
        this.brand = "Ford";
    }

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    String modelName;

    public Car() {
        super();
        this.modelName = "Mustang";
    }
}

public class Maincar {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();  
        System.out.println(myCar.brand + " " + myCar.modelName);
       
    }
}



