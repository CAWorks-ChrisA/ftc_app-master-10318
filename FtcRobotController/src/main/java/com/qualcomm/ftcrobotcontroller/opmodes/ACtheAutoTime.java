package com.qualcomm.ftcrobotcontroller.opmodes;

/**
 * Created by TCHS Robotics on 12/9/2015.
 */
public class ACtheAutoTime extends ACtheHardware{
    @Override public void loop(){
        if (this.time <= 1 ){
            set_drive_power(1.0, 1.0);
        }
        else if (this.time > 1 && this.time<= 2){
            set_drive_power(-1.0, 1.0);
        }
        else if (this.time >3 && this.time <= 4.75d){
            set_drive_power(0.0, 0.0);
            telemetry.addData("done", "mission accomplished");
        }
        else {
            set_drive_power(0.0, 0.0);
            telemetry.addData("Program", "stopped");
        }
        telemetry.addData("dah", "time: " + Double.toString(this.time));
    }
}
