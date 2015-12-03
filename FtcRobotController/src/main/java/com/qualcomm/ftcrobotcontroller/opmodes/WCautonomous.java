package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Wesley Chou TCHS  on 11/4/2015.
 */
public class TCHSautonomous extends WChardware {
DcMotor leftMotor;
    DcMotor rightMotor;
    DcMotor leftBackMotor;
    DcMotor rightBackMotor;
    @Override
    public void init() {
leftMotor= hardwareMap.dcMotor.get("motor_1");
        rightMotor= hardwareMap.dcMotor.get("motor_2");
        leftBackMotor= hardwareMap.dcMotor.get("Motor_3");
        rightBackMotor= hardwareMap.dcMotor.get("Motor_4");

                rightMotor.setDirection(DcMotor.Direction.REVERSE);
rightBMotor.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {
leftMotor.setPower(0.5);
        rightMotor.setPower(0.5);


    }
}
