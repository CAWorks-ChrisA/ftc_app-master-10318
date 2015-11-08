package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.hardware.ModernRoboticsOpticalDistanceSensor;
import com.qualcomm.hardware.ModernRoboticsTouchSensor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Wesley Chou TCHS on 11/4/2015.
 */
public class WChardware extends OpMode {

    DcMotor leftMotor;
    DcMotor rightMotor;
    DcMotor leftBMotor;
    DcMotor rightBMotor;
    ModernRoboticsOpticalDistanceSensor distanceSensor;
    ModernRoboticsTouchSensor touchSensor;
    @Override
    public void init() {

    }

    @Override
    public void loop() {

    }
}
