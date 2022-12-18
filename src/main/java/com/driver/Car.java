package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name,int currentGear, int gears, boolean isManual ,int wheels, int doors, String type, int seats ) {
        super(name);
        this.isManual=isManual;
        this.gears=gears;
        this.wheels=wheels;
        this.seats=seats;
        this.doors=doors;
        this.type=type;
        this.currentGear=1;
        //Hint: Car extends Vehicle
    
         
    }
     


    public void changeGear(int newGear){
         this.currentGear=newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
         move(newSpeed,newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
