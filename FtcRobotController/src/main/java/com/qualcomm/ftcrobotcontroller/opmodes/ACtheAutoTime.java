package com.qualcomm.ftcrobotcontroller.opmodes;

/**
 * Created by TCHS Robotics on 12/9/2015.
 */
public class ACtheAutoTime extends ACtheHardware{
    @Override public void loop(){
        if (this.time > 1 && this.time<= 2.25 ){
            set_drive_power(1.0, 1.0);
        }
        else if (this.time >2.25 && this.time<= 3.15){
          set_drive_power(-1.0, 1.0);
        }
        else if (this.time >3.15 && this.time <= 4.40){
            set_drive_power(1.0, 1.0);
        }
        else if (this.time >4.40 && this.time <= 5.30){
            set_drive_power(1.0, -1.0);
        }
        else if (this.time >5.30 && this.time <= 6.55){
            set_drive_power(1.0, 1.0);
        }
        else if (this.time >6.55 && this.time <= 7.45){
            set_drive_power(-1.0, 1.0);
        }
        else if (this.time >7.45 && this.time <= 8.35){
            set_drive_power(1.0, 1.0);
        }
        else {
            set_drive_power(0.0, 0.0);
            telemetry.addData("Program", "stopped");
        }
        telemetry.addData("dah", "time: " + Double.toString(this.time));
    }
}
