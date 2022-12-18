package com.driver;

public class Car extends Vehicle {
     private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    private int wheels;
    private int seats;

    

    public String getType() {
        return type;
    }

  public void setType(String type) {
        this.type = type;
    }


  public int getDoors() {
        return doors;
    }



    public void setDoors(int doors) {
        this.doors = doors;
    }



    public int getGears() {
        return gears;
    }



    public void setGears(int gears) {
        this.gears = gears;
    }




    public int getCurrentGear() {
        return currentGear;
    }



    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }



    public int getWheels() {
        return wheels;
    }



    public void setWheels(int wheels) {
        this.wheels = wheels;
    }



    public int getSeats() {
        return seats;
    }



    public void setSeats(int seats) {
        this.seats = seats;
    }

   


    public Car(String name, int gears, boolean isManual ,int wheels, int doors, String type, int seats ) {
        super(name);
        this.isManual=isManual;
        this.gears=gears;
        this.seats=seats;
        this.doors=doors;
        this.wheels=wheels;
        this.type=type;
        this.currentGear=1;
        //Hint: Car extends Vehicle
    
       
        
    }


    public boolean isManual(){
        return isManual;
    }
         
      public void setManual(boolean Manual){
           isManual=Manual;
      }

 

 

    public void changeGear(int newGear){
           currentGear=newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
         super.move(newSpeed,newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

    
}
