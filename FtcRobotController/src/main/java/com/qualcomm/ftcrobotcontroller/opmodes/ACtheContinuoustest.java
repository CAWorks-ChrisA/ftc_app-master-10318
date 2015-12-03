package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by TCHS Robotics on 12/2/2015.
 */
public class ACtheContinuoustest extends OpMode{
    Servo ac_servo;
    @Override
    public void init() {
        ac_servo = hardwareMap.servo.get("servo");

    }

    @Override
    public void loop() {
        ac_servo.setPosition (1);

    }
}
