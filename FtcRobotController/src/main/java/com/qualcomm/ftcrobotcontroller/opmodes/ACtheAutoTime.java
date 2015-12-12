package com.qualcomm.ftcrobotcontroller.opmodes;

/**
 * Created by TCHS Robotics on 12/9/2015.
 */
public class ACtheAutoTime extends ACtheHardware{
    @Override public void loop(){
        //OK, this is ACtheGreat, fwd speed: 1.25 per 2 ft. turning speed.. ?
        // Tast for Wesley, test for turning speed:
        // last time, last result was 0.9 sec for 95-100 degrees, and please, test 0.8-0.85 seconds
        if (this.time > 1 && this.time<= 1.8 ){
            set_drive_power(-1.0, 1.0);
        }

        else {
            set_drive_power(0.0, 0.0);
            telemetry.addData("Program", "stopped");
        }
        telemetry.addData("dah", "time: " + Double.toString(this.time));
    }
}
