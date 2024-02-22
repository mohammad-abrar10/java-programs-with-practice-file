// // Base class (superclass) representing a Vehicle
// class Vehicle {
//     // Properties
//     String brand;
//     int year;

//     // Constructor
//     public Vehicle(String brand, int year) {
//         this.brand = brand;
//         this.year = year;
//     }

//     // Method
//     void start() {
//         System.out.println("Starting the vehicle");
//     }
// }

// // Derived class (subclass) representing a Car, inheriting from Vehicle
// class Car extends Vehicle {
//     // Additional property specific to Car
//     int numberOfDoors;

//     // Constructor
//     public Car(String brand, int year, int numberOfDoors) {
//         // Calling the superclass constructor using "super"
//         super(brand, year);
//         this.numberOfDoors = numberOfDoors;
//     }

//     // Overriding the start method from the superclass
//     @Override
//     void start() {
//         System.out.println("Starting the car's engine");
//     }

//     // Additional method specific to Car
//     void drive() {
//         System.out.println("Driving the car");
//     }
// }

// // Main class to demonstrate inheritance
// public class InheritanceExample {
//     public static void main(String[] args) {
//         // Creating an instance of the Car class
//         Car myCar = new Car("Toyota", 2022, 4);

//         // Accessing properties from the superclass
//         System.out.println("Brand: " + myCar.brand);
//         System.out.println("Year: " + myCar.year);

//         // Accessing properties and methods from the derived class
//         System.out.println("Number of doors: " + myCar.numberOfDoors);
//         myCar.start(); // Calls the overridden start method in Car
//         myCar.drive();
//     }
// }

class Vehicle{
    String brand;
    int year;
    public Vehicle(String brand,int year){
        this.brand=brand;
        this.year=year;
    }
    void start(){
        System.out.println("vehicle is startng");
    }
}

class Car extends Vehicle{
    int doors;
    public Car(String brand,int year,int doors){
        super(brand,year);
        this.doors=doors;
    }
    @Override
    void start(){
        System.out.println("car is startng"); 
    }
    void drive(){
         System.out.println("driving a car");
    }
}
public class InheritanceExample{
    public static void main(String[] args){
        Car myCar=new Car("toyota",2023,4);

       System.out.println("brand= \t" + myCar.brand);
       System.out.println("year= \t" + myCar.year);
       System.out.println("doors= \t" + myCar.doors);

       myCar.start();
       myCar.drive();
    }
}

