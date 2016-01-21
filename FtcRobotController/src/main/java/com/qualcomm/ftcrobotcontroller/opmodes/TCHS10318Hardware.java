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
    DcMotor lefttreadMotor;
    DcMotor righttreadMotor;
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
        //lefttreadmotor
        try {   //"try" when the phone sends a message to the core motor controller.
            lefttreadMotor = hardwareMap.dcMotor.get("lefttreadmotor");
        } catch (Exception p_exception) {
            //if the motor is not detected, the telemetry will send information back to the phone saying the motor is not detected
            lefttreadMotor = null;
            telemetry.addData("ERROR", " left tread motor not detected  ):  ");
        }
        //repeat the same concept for all the other motors, sensors, and servos
        //righttread motor
        try {
            righttreadMotor = hardwareMap.dcMotor.get("rigthtreadmotor");
        } catch (Exception p_exception) {
            righttreadMotor = null;
            telemetry.addData("ERROR", " right tread motor not detected  ):  ");
        }
        //left back motor
        try {
            leftBackMotor = hardwareMap.dcMotor.get("leftbackmptror");
        } catch (Exception p_exception) {
            leftBackMotor = null;
            telemetry.addData("ERROR", " left back motor not detected  ):  ");
        }
        // right back motor
        try {
            rightBackMotor = hardwareMap.dcMotor.get("rightbackmotor");
        } catch (Exception p_exception) {
            rightBackMotor = null;
            telemetry.addData("ERROR", " right back motor not detected  ):  ");
        }
        // debris belt
        try {
            debrisbelt = hardwareMap.dcMotor.get("debrisbelt");
        } catch (Exception p_exception) {
            debrisbelt = null;
            telemetry.addData("ERROR","debris belt not detected");
        }
        //debris collector
        try {
            debriscollect = hardwareMap.dcMotor.get("debriscollect");
        } catch (Exception p_exception) {
            debriscollect = null;
            telemetry.addData("ERROR","Debris collector not detected");
        }
        //left lever
        try{
            leftlever= hardwareMap.servo.get("leftlever");
        } catch (Exception p_exception) {
            leftlever= null;
            telemetry.addData("ERROR","left lever is not detected");
        }
        //right lever
        try{
            rightlever = hardwareMap.servo.get("rightlever");
        }catch (Exception p_exception) {
            rightlever= null;
            telemetry.addData("ERROR", "right lever is not detected");
        }
    }

    @Override
    public void loop() {

    }
}