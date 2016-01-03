package com.qualcomm.ftcrobotcontroller.opmodes;

/**
 * Created by TCHS Robotics on 12/9/2015.
 */
public class ACtheAutoTime3 extends ACtheHardware{
    @Override public void loop(){
        // turning speed: 0.6 spd for 0.8 second for 90 degrees
        // forward speed: 1.0 spd for 1.25 second for 2 ft ( 1 block)



        //Overall Plan:Start from Right side (3,1)
        //goes for Right Hill
        if (this.time > 9 && this.time<= 12.75 ) {
            set_drive_power(-1.0, -1.0);
        }
        else if (this.time>12.75 && this.time<= 13.55){
            set_drive_power(0.6, -0.6);
        }
        else if (this.time>13.55 && this.time<= 16.9){
            set_drive_power(-1.0, -1.0);
        }
        /*else if (this.time>16.8 && this.time<= 17.04){
            drop_climbers();
        }*/
        else if (this.time>17.04 && this.time<= 20.29){
            set_drive_power(1.0, 1.0);
        }
        else if (this.time>20.29 && this.time <= 20.69){
            set_drive_power(-0.6,0.6);
        }
        else if(this.time>20.69 && this.time <= 21.29){
            set_drive_power(-1.0,1.0);
        }
        else if(this.time>21.29 && this.time<= 22.09){
            set_drive_power (-0.6, 0.6);
        }
        else if (this.time>22.09 && this.time<= 30){
            set_drive_power(1.0, 1.0);
        }

        else {
            set_drive_power(0.0, 0.0);
            telemetry.addData("Program", "stopped");
        }
        telemetry.addData("dah", "time: " + Double.toString(this.time));
    }
}
