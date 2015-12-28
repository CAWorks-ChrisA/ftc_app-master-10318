package com.qualcomm.ftcrobotcontroller.opmodes;

/**
 * Created by TCHS Robotics on 12/9/2015.
 */
public class ACtheAutoTime extends ACtheHardware{
    @Override public void loop(){
        // turning speed: 0.6 spd for 0.8 second for 90 degrees
        // forward speed: 1.0 spd for 1.25 second for 2 ft ( 1 block)

        if (this.time > 1 && this.time<= 2.25 ) {
            set_drive_power(1.0, 1.0);
        }
        if (this.time>2.25 && this.time<= 3.05){
            set_drive_power(0.6, -0.6);
        }
        if (this.time>3.05 && this.time<= 4.3){
            set_drive_power(1.0, 1.0);
        }

        else {
            set_drive_power(0.0, 0.0);
            telemetry.addData("Program", "stopped");
        }
        telemetry.addData("dah", "time: " + Double.toString(this.time));
    }
}
