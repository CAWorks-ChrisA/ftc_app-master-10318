package com.qualcomm.ftcrobotcontroller.opmodes;

/**
 * Created by TCHS Robotics on 12/9/2015.
 */
public class ACtheAutoTime4 extends ACtheHardware{
    @Override public void loop(){
        // turning speed: 0.6 spd for 0.8 second for 90 degrees
        // forward speed: 1.0 spd for 1.25 second for 2 ft ( 1 block)



        //Overall Plan:Start from Right side (3,1)
        //goes for left hill

        if (this.time > 9 && this.time<= 12.75 ) {
            set_drive_power(1.0, 1.0);
        }
        else if (this.time>12.75 && this.time<= 13.55){
            set_drive_power(0.6, -0.6);
        }
        else if (this.time>13.55 && this.time<= 17.3){
            set_drive_power(1.0, 1.0);
        }
        else if (this.time>17.3 && this.time<= 20.3){
            drop_climbers();
        }
        else if (this.time>20.3 && this.time<= 24.05){
            set_drive_power(-1.0, -1.0);
        }
        else if (this.time>24.05 && this.time <= 24.45){
            set_drive_power(-0.6,0.6);
        }
        else if(this.time>24.45 && this.time <= 25.05){
            set_drive_power(-1.0,-1.0);
        }
        else if(this.time>25.05 && this.time<= 25.85){
            set_drive_power (-0.6, 0.6);
        }
        else if (this.time>25.85 && this.time<= 30){
            set_drive_power(1.0, 1.0);
        }

        else {
            set_drive_power(0.0, 0.0);
            telemetry.addData("Program", "stopped");
        }
        telemetry.addData("dah", "time: " + Double.toString(this.time));
    }
}
