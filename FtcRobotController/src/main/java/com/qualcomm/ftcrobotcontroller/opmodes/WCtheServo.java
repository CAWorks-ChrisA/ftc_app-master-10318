package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Wesley Chou on 10/28/2015.
 */
public class WCtheServo extends OpMode {

    Servo v_servo;
//gives the servo a name
    @Override

    public void init() {
v_servo= hardwareMap.servo.get("servo1")

    }

    public void loop() {

        telemetry.addData("05","GP1 Left:" + -gamepad1.left_stick_y);
//telemetry sends data to phone
        if (gamepad1.x){
            v_servo.setPosition (Servo.MAX_POSITION);
            telemetry.addData ("10", "blah blah blah")
        }
        if (gampad1.y) {
        v_servo.setPosition(Servo.MAX_POSITION);
            telemetry.addData ("10", "blah blah blah")
        }

        if(gampad1.a){
            v_servo.setPosition(Servo.MIN_POSITION);
        telemetry.addData ("10", "blah blah blah")
}

        if (gamepad1.b){
        v_servo.setPosition(Servo. MIN_POSITION);}


    }