package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by robots on 10/16/2015.
 */
public class AmazingServo extends OpMode{
    private Servo servo1;

    @Override
    public void init() {
        servo1 = hardwareMap.servo.get ("servo");
        servo1.setPosition (Servo.MIN_POSITION);

    }

    @Override
    public void loop() {
        if (gamepad1.a){
            servo1.setPosition (Servo.MAX_POSITION);
        }
        if (gamepad1.b){
            servo1.setPosition (Servo.MIN_POSITION);
        }

    }
}
