package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;

/**
 * Created by Wesley Chou on 12/9/2015.
 */
public class TCHS10318Hardware extends OpMode {
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
    // defining the hardware on our robot also, we have varibles to name the motors, sensors, and servos.
    @Override
    public void init() {
        //over here, we are detecting if the motors are detected. If its is not detected, a message gets sent to the phone
        try {
            leftMotor = hardwareMap.dcMotor.get("motorleft");
        } catch (Exception p_exeception) {
            leftMotor = null;
            telemetry.addData("ERROR", " left motor not detected  ):  ");
        }
        try {
            rightMotor = hardwareMap.dcMotor.get("motorleft");
        } catch (Exception p_exeception) {
            rightMotor = null;
            telemetry.addData("ERROR", " right motor not detected  ):  ");
        }
        try {
            leftBackMotor = hardwareMap.dcMotor.get("motorleft");
        } catch (Exception p_exeception) {
            leftBackMotor = null;
            telemetry.addData("ERROR", " left back motor not detected  ):  ");
        }
        try {
            rightBackMotor = hardwareMap.dcMotor.get("motorleft");
        } catch (Exception p_exeception) {
            rightBackMotor = null;
            telemetry.addData("ERROR", " right back motor not detected  ):  ");
        }
        try {
            bucket = hardwareMap.dcMotor.get("motorleft");
        } catch (Exception p_exeception) {
            bucket = null;
            telemetry.addData("ERROR", " bucket not detected  ):  ");
        }
        try {
            conveyerBelt = hardwareMap.dcMotor.get("motorleft");
        } catch (Exception p_exeception) {
            conveyerBelt = null;
            telemetry.addData("ERROR", " convyerbelt not detected  ):  ");
        }
        try {
            servo1 = hardwareMap.servo.get("servo1");
        } catch (Exception p_exception) {
            servo1 = null;
            telemetry.addData("ERROR", "servo1 not detected ): ");
        }
        try {
            servo2 = hardwareMap.servo.get("servo2");
        } catch (Exception p_exception) {
            servo2 = null;
            telemetry.addData("ERROR", "servo2 not detected ): ");
        }
        try {
            servo3 = hardwareMap.servo.get("servo3");
        } catch (Exception p_exception) {
            servo3 = null;
            telemetry.addData("ERROR", "servo3 not detected ): ");

        }
        try {
            servo4 = hardwareMap.servo.get("servo 4");
        } catch (Exception p_exception) {
            servo4 = null;
            telemetry.addData("ERROR", "servo4 not detected ):");
        }
        try {
            bucket = hardwareMap.dcMotor.get("bucket motor");
        } catch (Exception p_exception) {
            bucket = null;
            telemetry.addData("ERROR", "Bucket Motor not detected ):");
        }
        try {
            conveyerBelt = hardwareMap.dcMotor.get("converyer belt");
        } catch (Exception p_exception) {
            conveyerBelt = null;
            telemetry.addData("ERROR", "Conveyer Belt Motor not detected ):");
        }
        try {
            ODS = hardwareMap.opticalDistanceSensor.get("ODS");
        } catch (Exception p_exception) {
            ODS = null;
            telemetry.addData("ERROR", "ODS is not detected ):");
        }
        try {
            touch = hardwareMap.touchSensor.get("touch");
        } catch (Exception p_exception) {
            touch = null;
            telemetry.addData("Error", "Touch is not detected ):");
        }


        if (leftMotor != null){leftMotor.setDirection(DcMotor.Direction.REVERSE);}
        if (rightBackMotor != null){rightBackMotor.setDirection(DcMotor.Direction.REVERSE);}
    }
    @Override
    public void start ()
    {
        //
        // Only actions that are common to all Op-Modes (i.e. both automatic and
        // manual) should be implemented here.
        //
        // This method is designed to be overridden.
        //
    }
    @Override
    public void loop (){
        //nothing to put in here.
    }
    @Override
    public void telemetry_update ( ) {

    }
}
