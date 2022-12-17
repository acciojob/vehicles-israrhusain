package com.driver;

public class F1 extends Car {
   
   

    private static int gears;


    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
         super(name,gears, gears, isManual);
         this.gears=getgears();
        
        
     }


    public void accelerate(int rate){
        
         
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
         
         newSpeed=this.getCurrentspeed()+rate;

         if(newSpeed == 0 || (newSpeed>=1 && newSpeed<=50)) {
             
               this.gears=1;
         }
         if(newSpeed>=51 && newSpeed<=100){
             this.gears=2;
         }
         if(newSpeed>=101 && newSpeed<=150){
             this.gears=3;
          }
          if(newSpeed>=151 && newSpeed<=200){
             this.gears=4;
          }
          if(newSpeed>=201 && newSpeed<=250){
              this.gears=5;
          }
          if(newSpeed>250){
             this.gears=6;
          }
          super.changeGear(this.gears);
         //for all other cases, change the gear accordingly
         if(newSpeed==0){
            //Stop the car, set gear as 1
             stop();
             this.gears=1;
         }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
