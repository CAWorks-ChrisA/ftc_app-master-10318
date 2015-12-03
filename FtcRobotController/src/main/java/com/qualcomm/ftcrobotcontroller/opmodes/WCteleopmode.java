package com.qualcomm.ftcrobotcontroller.opmodes;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Wesley Chou TCHS Robotics on 11/3/2015.
 */
public class TCHSteleopmode extends OpMode {
DcMotor leftMotor;
    DcMotor rightMotor;

    @Override
    public void init() {
        leftMotor= hardwareMap.dcMotor.get("left_drive");
        rightMotor= hardwareMap.dcMotor.get("right_drive");

        rightMotor.setDirection (DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {
        float leftY= -gamepad1.left_stick_y;
        float rightY= -gamepad1.right_stick_y;

        leftMotor.setPower(leftY);
        rightMotor.setPower(rightY);

    }
}
