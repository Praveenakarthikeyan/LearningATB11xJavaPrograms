package dayWise_Tasks.OOPS_Inheritance;

public class Lab25_Multilevel {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        // Set values
        tesla.brand = "Tesla";
        tesla.model = "Model S";
        tesla.batteryCapacity = 100;

        // Display information from all levels
        tesla.showBrand();
        tesla.showModel();
        tesla.showBatteryCapacity();
    }
}


// Base class
class Vehicle {
    String brand;

    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Derived class (inherits from Vehicle)
class Car extends Vehicle {
    String model;

    void showModel() {
        System.out.println("Model: " + model);
    }
}

// Further derived class (inherits from Car)
class ElectricCar extends Car {
    int batteryCapacity; // in kWh

    void showBatteryCapacity() {
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}