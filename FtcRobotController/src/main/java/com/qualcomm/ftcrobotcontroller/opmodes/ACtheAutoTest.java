package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

/**
 * Created by TCHS Robotics on 12/9/2015.
 */
public class ACtheAutoTest extends OpMode{

    @Override
    public void init() {

    }

    @Override
    public void loop() {

        if (this.time <= 5){
            telemetry.addData("01:", "code01");
        }
        else if(this.time > 5 && this.time<= 10)
        {
            telemetry.addData("02:", "code02");
        }
        else {
            telemetry.addData("program:", "ended");
        }
        telemetry.addData("dah", "time: " + Double.toString(this.time));


    }
}
