package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/*
 * Created by TCHS Robotics on 1/19/2REST16.
 */
public class Teleop extends hardware {


    @Override
    public void loop() {
        //front is away from the bucket
        set_drive_power(CLOCKWISE * gamepad1.left_stick_y, CLOCKWISE * gamepad1.right_stick_y);

        //front is the bucket
        if (gamepad1.dpad_up) {
            set_drive_power(CLOCKWISE, CLOCKWISE);
        }

        if (gamepad1.dpad_down) {
            set_drive_power(ANTICLOCKWISE, ANTICLOCKWISE);
        }

        if (gamepad1.dpad_left) {
            set_drive_power(CLOCKWISE, ANTICLOCKWISE);
        }

        if (gamepad1.dpad_right) {
            set_drive_power(ANTICLOCKWISE, CLOCKWISE);
        }

        //belt
        if (gamepad2.dpad_left) {
            belt.setPower(ANTICLOCKWISE);
        }

        else if (gamepad2.dpad_right) {

            belt.setPower(CLOCKWISE);
        }
        else {
            belt.setPower(REST);
        }

        //servos left side
        if (gamepad2.a) {
            left.setPosition(0.2);//up
        }

        else if (gamepad2.b) {
            left.setPosition(0.8);//down
        }

        //servos right side
        if (gamepad2.x) {
            right.setPosition(0.2);//up
        }

        else if (gamepad2.y) {
            right.setPosition(0.8);//down
        }

        //dunk master

        if (gamepad2.dpad_down){

            climber.setPosition(1);
        }
        else if (gamepad2.dpad_up){

            climber.setPosition(0);
        }
        else {
            climber.setPosition(0.5);
        }

        //bucket
        if (gamepad1.a) {
            bucket.setPower(0.2);
        }

        else if (gamepad1.b) {
            bucket.setPower(-0.2);
        }
        else {
            bucket.setPower(REST);
        }

        // tape if needed
        /*
        tape.setPower(0.5 * gamepad2.left_stick_y)
        turn.setPower(0.2 * gamepad2.right_stick_y)
         */
    }
}
