package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;
//shows the sdk that we are importing
/**
 * Created by Wesley Chou on 12/9/2015.
 */
public class TCHS10318Hardware extends OpMode {
    DcMotor leftMotor;
    DcMotor rightMotor;
    DcMotor leftBackMotor;
    DcMotor rightBackMotor;
    DcMotor debrisbelt;
    DcMotor debriscollect;
    Servo leftlever;
    Servo rightlever;
    //Servo servo3;
    //Servo servo4;
    // we are no longer using servo 3/4. and sensors/ encoders due to hardware issues and technical dificulties
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
            debrisbelt = hardwareMap.dcMotor.get("motorleft");
        } catch (Exception p_exeception) {
            debrisbelt = null;
            telemetry.addData("ERROR", " bucket not detected  ):  ");
        }
        try {
            debriscollect = hardwareMap.dcMotor.get("motorleft");
        } catch (Exception p_exeception) {
            debriscollect = null;
            telemetry.addData("ERROR", " convyerbelt not detected  ):  ");
        }
        try {
            leftlever = hardwareMap.servo.get("servo1");
        } catch (Exception p_exception) {
            leftlever = null;
            telemetry.addData("ERROR", "leftlever not detected ): ");
        }
        try {
            rightlever = hardwareMap.servo.get("servo2");
        } catch (Exception p_exception) {
            rightlever = null;
            telemetry.addData("ERROR", "left lever not detected ): ");
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
