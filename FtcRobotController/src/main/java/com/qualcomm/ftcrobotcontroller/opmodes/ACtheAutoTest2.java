package com.qualcomm.ftcrobotcontroller.opmodes;

/**
 * Created by TCHS Robotics on 12/9/2015.
 */
public class ACtheAutoTest2 extends ACtheHardware {
    //fwd: 21 inch per second, 3.6 second to 6ft
    //turning: full speed .72 second (0.8 in case)

    //@Override
    //public void init() {
//ac_climberdropper = hardwareMap.dcMotor.get("climber");
    //}

    @Override
    public void loop() {

        if (this.time <= 5){
            telemetry.addData("01:", "code01");
        }
        else if(this.time > 5 && this.time<= 5.12)
        {
            telemetry.addData("02:", "code02");

        }
        else if (this.time >5.12 && this.time<= 8.52){
            set_drive_power(-1,-1);
        }
        else if (this.time >8.52 && this.time<= 9.32){
            set_drive_power(-1,1);
        }
        else {
            telemetry.addData("program:", "ended");
            set_drive_power(0,0);
        }
        telemetry.addData("dah", "time: " + Double.toString(this.time));


    }
}
