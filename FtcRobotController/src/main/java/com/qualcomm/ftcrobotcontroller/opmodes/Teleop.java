package com.qualcomm.ftcrobotcontroller.opmodes;

/**
 * Created by TCHS Robotics on 1/19/2016.
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
            belt.setPower(CLOCKWISE);
        }

        if (gamepad2.dpad_right) {
            belt.setPower(ANTICLOCKWISE);
        }

        //servos left side
        if (gamepad2.a) {
            left.setPosition(0.2);//up
        }

        if (gamepad2.b) {
            left.setPosition(0.7);//down
        }

        //servos right side
        if (gamepad2.x) {
            right.setPosition(0.2);//up
        }

        if (gamepad2.y) {
            right.setPosition(0.7);//down
        }

        //dunk master

        if (gamepad2.dpad_up){
            servo.setPosition(1);
        }
        else if (gamepad2.dpad_down){
            servo.setPosition(-1);
        }
        else {
            servo.setPosition(0);
        }

    }
}
