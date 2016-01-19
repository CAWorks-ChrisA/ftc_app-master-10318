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
        try {   //"try" when the phone sends a message to the core motor controller.
            leftMotor = hardwareMap.dcMotor.get("motorleft");
        }
        catch (Exception p_exeception) {
            //if the motor is not detected, the telemetry will send information back to the phone saying the motor is not detected
            leftMotor = null;
            telemetry.addData("ERROR", " left motor not detected  ):  ");
        }
        //repeat the same concept for all the other motors, sensors, and servos
        try {
            rightMotor = hardwareMap.dcMotor.get("motorleft");
        }
        catch (Exception p_exeception) {
            rightMotor = null;
            telemetry.addData("ERROR", " right motor not detected  ):  ");
        }
        //left back motor
        try {
            leftBackMotor = hardwareMap.dcMotor.get("motorleft");
        }
        catch (Exception p_exeception) {
            leftBackMotor = null;
            telemetry.addData("ERROR", " left back motor not detected  ):  ");
        }
        // right back motor
        try {
            rightBackMotor = hardwareMap.dcMotor.get("motorleft");
        }
        catch (Exception p_exeception) {
            rightBackMotor = null;
            telemetry.addData("ERROR", " right back motor not detected  ):  ");
        }
        // bucket system
        try {
<<<<<<< HEAD
            debrisbelt = hardwareMap.dcMotor.get("motorleft");
        } catch (Exception p_exeception) {
            debrisbelt = null;
=======
            bucket = hardwareMap.dcMotor.get("motorleft");
        }
        catch (Exception p_exeception) {
            bucket = null;
>>>>>>> origin/Green-V0.0.1-Alpha
            telemetry.addData("ERROR", " bucket not detected  ):  ");
        }
        //conveyer belt system
        try {
<<<<<<< HEAD
            debriscollect = hardwareMap.dcMotor.get("motorleft");
        } catch (Exception p_exeception) {
            debriscollect = null;
=======
            conveyerBelt = hardwareMap.dcMotor.get("motorleft");
        }
        catch (Exception p_exeception) {
            conveyerBelt = null;
>>>>>>> origin/Green-V0.0.1-Alpha
            telemetry.addData("ERROR", " convyerbelt not detected  ):  ");
        }
        // servo 1
        try {
<<<<<<< HEAD
            leftlever = hardwareMap.servo.get("servo1");
        } catch (Exception p_exception) {
            leftlever = null;
            telemetry.addData("ERROR", "leftlever not detected ): ");
=======
            servo1 = hardwareMap.servo.get("servo1");
        }
        catch (Exception p_exception) {
            servo1 = null;
            telemetry.addData("ERROR", "servo1 not detected ): ");
        }
        // servo 2
        try {
            servo2 = hardwareMap.servo.get("servo2");
        }
        catch (Exception p_exception) {
            servo2 = null;
            telemetry.addData("ERROR", "servo2 not detected ): ");
        }
        // servo 3
        try {
            servo3 = hardwareMap.servo.get("servo3");
        }
        catch (Exception p_exception) {
            servo3 = null;
            telemetry.addData("ERROR", "servo3 not detected ): ");

        }
        // servo 4
        try {
            servo4 = hardwareMap.servo.get("servo 4");
        }
        catch (Exception p_exception) {
            servo4 = null;
            telemetry.addData("ERROR", "servo4 not detected ):");
>>>>>>> origin/Green-V0.0.1-Alpha
        }
        // servo 5
        try {
<<<<<<< HEAD
            rightlever = hardwareMap.servo.get("servo2");
        } catch (Exception p_exception) {
            rightlever = null;
            telemetry.addData("ERROR", "left lever not detected ): ");
        }
=======
            bucket = hardwareMap.dcMotor.get("bucket motor");
        }
        catch (Exception p_exception) {
            bucket = null;
            telemetry.addData("ERROR", "Bucket Motor not detected ):");
        }
        // Optical Distance Sensor
        //Not sure if it is needed in our robot pending from the hardware team
        try {
            ODS = hardwareMap.opticalDistanceSensor.get("ODS");
        }
        catch (Exception p_exception) {
            ODS = null;
            telemetry.addData("ERROR", "ODS is not detected ):");
        }
        // Touch Sensor
        //Not sure if it is needed in our robot pending from the hardware team
        try {
            touch = hardwareMap.touchSensor.get("touch");
        }
        catch (Exception p_exception) {
            touch = null;
            telemetry.addData("Error", "Touch is not detected ):");
        }

>>>>>>> origin/Green-V0.0.1-Alpha

        if (leftMotor != null){leftMotor.setDirection(DcMotor.Direction.REVERSE);}
        if (rightBackMotor != null){rightBackMotor.setDirection(DcMotor.Direction.REVERSE);}
    }
    @Override
    public void start ()
    {
        //
        // Only actions that are in common to all our Op-Modes (ex. both automatic and
        // manual) should be implemented here.
        //
        // This method is is empty right now
        // It is designed to be overridden in other OpModes that extend the hardware opmode
    }
    @Override
    public void loop (){
        //nothing to put in here.
    }
    @Override
    public void telemetry_update ( ) {
        telemetry.addData("left drive stick" , +gamepad1.left_stick_y);
        telemetry.addData("right drive stick" , +gamepad1.right_stick_y);
        //telemetry.addData ("touch sensor", ac_touch.isPressed());
        // telemetry.addData ("Optical Distance", ac_ods.getLightDetected());
        //telemetry.addData ("Color.Red", +ac_color.red());
        //telemetry.addData ("Color.Green", +ac_color.green());
        //telemetry.addData ("Color.Blue", +ac_color.blue());
    }
    public void set_drive_power (double lt , double rt){
        leftMotor.setPower (lt);
        rightMotor.setPower (rt);
        leftBackMotor.setPower (lt);
        rightBackMotor.setPower (rt);
    }
    public synchronized void runningon(){
        c++;
    }
    public synchronized void runningoff(){
        c--;
    }
}
