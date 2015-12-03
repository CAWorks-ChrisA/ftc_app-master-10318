package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.robocol.Telemetry;

/**
 * Created by Wesley Chou TCHS on 11/4/2015.
 */
public class TCHSHardware extends OpMode
{

    DcMotor leftMotor;
    DcMotor rightMotor;
    DcMotor leftBackMotor;
    DcMotor rightBackMotor;
    DcMotor conveyerBelt;
    DcMotor bucket;
    OpticalDistanceSensor ODS;
    TouchSensor touch;
    Servo servo1;
    Servo servo2;
    Servo servo3;
    Servo servo4;
    // defining the hardware on our robot
    @Override
    public void init() {
        //assigning the variables to their motors
        try {
            leftMotor = hardwareMap.dcMotor.get("motorleft");
        } catch (Exception p_exeception) {
            leftMotor = null;
            telemetry.addData("ERROR", " motorleft (front) not detected  ):  ");
        }
        try {
            rightMotor = hardwareMap.dcMotor.get("motorleft");
        } catch (Exception p_exeception) {
            rightMotor = null;
            telemetry.addData("ERROR", " motorleft (front) not detected  ):  ");
        }
        try {leftBackMotor = hardwareMap.dcMotor.get ("motorleft");}
        catch (Exception p_exeception) {
            leftBackMotor = null;
            telemetry.addData("ERROR", " motorleft (front) not detected  ):  ");
        }
        try {rightBackMotor = hardwareMap.dcMotor.get ("motorleft");}
        catch (Exception p_exeception) {
            rightBackMotor = null;
            telemetry.addData("ERROR", " motorleft (front) not detected  ):  ");
        }
        try {bucket = hardwareMap.dcMotor.get ("motorleft");}
        catch (Exception p_exeception) {
            bucket = null;
            telemetry.addData("ERROR", " motorleft (front) not detected  ):  ");
        }
        try {conveyerBelt = hardwareMap.dcMotor.get ("motorleft");}
        catch (Exception p_exeception) {
            conveyerBelt = null;
            telemetry.addData("ERROR", " motorleft (front) not detected  ):  ");
        }
        if (leftMotor != null){leftMotor.setDirection(DcMotor.Direction.REVERSE);}
        if (rightBackMotor != null){rightBackMotor.setDirection(DcMotor.Direction.REVERSE);}
    }
    @Override
    public void loop() {

    }
}
