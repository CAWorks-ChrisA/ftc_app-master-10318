package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.IrSeekerSensor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by ACtheGreat 10/14/2015.
 */
public class ACtheIRSensor extends OpMode{
    IrSeekerSensor irSeeker;
    private Servo v_servo;

    @Override
    public void init() {
        irSeeker = hardwareMap.irSeekerSensor.get("irSeeker");
        v_servo = hardwareMap.servo.get("servo1");
        v_servo.setPosition (Servo.MIN_POSITION);


    }
    double angle = 0;
    double strength = 0;
    @Override
    public void loop() {
        telemetry.addData ("01", irSeeker.signalDetected());


        if (irSeeker.signalDetected()) {
            // an IR signal is detected

            // Get the angle and strength of the signal
            angle = irSeeker.getAngle();
            strength = irSeeker.getStrength();
            v_servo.setPosition (Servo.MAX_POSITION);
            telemetry.addData("angle", angle);
            telemetry.addData("strength", strength);

            if (angle > 10){
                v_servo.setPosition (Servo.MIN_POSITION);
            }
            if (angle <10){
                v_servo.setPosition (Servo.MAX_POSITION);
            }


        }
    }
}
