package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * TCHS ROBOTICS TEAM 10318
 * RAMROID HARDWARE CLASS
 */

public class hardware extends OpMode {

    //variable declaration
    //rotation constants
    final static double ANTICLOCKWISE = 1;
    final static double CLOCKWISE = -1;
    //driving:
    DcMotor frontLeft;
    DcMotor frontRight;
    DcMotor backLeft;
    DcMotor backRight;
    //belt
    DcMotor belt;
    //Servos
    Servo left;
    Servo right;
    //bucket
    DcMotor bucket;
    // cont servo
    Servo servo;


    @Override
    public void init() {
        //driving:
        frontLeft = hardwareMap.dcMotor.get("frontLeft");
        frontRight = hardwareMap.dcMotor.get("frontRight");
        backLeft = hardwareMap.dcMotor.get("backLeft");
        backRight = hardwareMap.dcMotor.get("backRight");
        frontRight.setDirection(DcMotor.Direction.REVERSE);
        backRight.setDirection(DcMotor.Direction.REVERSE);

        //belt
        belt = hardwareMap.dcMotor.get("belt");

        //servos
        left = hardwareMap.servo.get("left");
        right = hardwareMap.servo.get("right");

        //bucket
        bucket = hardwareMap.dcMotor.get("bucket");
        //servo
       servo = hardwareMap.servo.get("servo");


    }

    @Override
    public void loop() {
        //designed to override, if needed.
    }

    public void set_drive_power(double left, double right){
        frontLeft.setPower(left);
        frontRight.setPower(right);
        backLeft.setPower(left);
        backRight.setPower(right);
    }


}
