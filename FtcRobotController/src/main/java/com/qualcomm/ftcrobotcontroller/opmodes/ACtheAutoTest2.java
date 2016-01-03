package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by TCHS Robotics on 12/9/2015.
 */
public class ACtheAutoTest2 extends ACtheHardware {
DcMotor ac_climberdropper;
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
            ac_climberdropper.setPower (-1);
        }
        else {
            telemetry.addData("program:", "ended");
            ac_climberdropper.setPower(0);
        }
        telemetry.addData("dah", "time: " + Double.toString(this.time));


    }
}
