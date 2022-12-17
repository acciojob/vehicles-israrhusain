package com.driver;

public class Car extends Vehicle {
    //private int wheels;
    //private String type;
    //private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    //private int seats;

    public Car(String name,int currentGear,int gears, boolean isManual ) {
       super(name, gears, gears);
          this.isManual=isManual;
          this.gears=gears;
          this.currentGear=currentGear;
        //Hint: Car extends Vehicle
    
         
    }
     public void setName(String name){
        this.name=name;
     }
     public String getName(String name){
        return this.name;
     }

     public void setisManual(boolean isManual){
        this.isManual=isManual;
     }
     public boolean getisManual(){
        return this.isManual;
     }

     public void setgears(int gears){
        this.gears=gears;
     }
     public int getgears(){
        return this.gears;
     }

    public void changeGear(int newGear){
         this.currentGear=newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){

        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
