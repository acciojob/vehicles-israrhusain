package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name,int currentDirection,int currentSpeed) {
         this.name=name;
         this.currentSpeed=currentSpeed;
         this.currentDirection=currentDirection;
    }
    public void getCurrentDirection(int currentDirection){
        this.currentDirection=currentDirection;
    }
    public int getCurrentDirection(){
        return currentDirection;
    }
    public void getCurrentspeed(int currentSpeed){
        this.currentSpeed=currentSpeed;
    }
    public int getCurrentspeed(){
        return currentSpeed;
    }
    public void setName(String name){
        this.name=name;
     }
     public String getName(){
        return this.name;
     }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        currentDirection=currentDirection+direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        currentSpeed=speed;
        currentDirection=direction;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){

        System.out.println("stop method called - The vehicle is stopped");
    }

}
