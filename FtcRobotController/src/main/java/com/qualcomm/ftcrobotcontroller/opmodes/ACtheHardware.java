package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Administrator on 2015/10/28.
 */
public class ACtheHardware  extends OpMode{

    //defining the variables:

    DcMotor ac_motorleft;
    DcMotor ac_motorright;
    DcMotor ac_motorbkleft;
    DcMotor ac_motorbkright;

    @Override
    public void init() {
        //assigning the variables to their motors
        try {ac_motorleft = hardwareMap.dcMotor.get ("motorleft");}
        catch (Exception p_exeception){
            ac_motorleft = null;
            telemetry.addData ("ERROR", " motorleft (front) not detected  ):  ");
        }
        try {ac_motorright = hardwareMap.dcMotor.get("motorright");}
        catch (Exception p_exception){
            ac_motorright = null;
            telemetry.addData ("'ERROR", "motorright (front) not detected  ):  ");
        }

        try {ac_motorbkleft = hardwareMap.dcMotor.get("motorbkleft");}
        catch (Exception p_exception){
            ac_motorbkleft = null;
            telemetry.addData ("ERROR", "motorbkleft not detected  ):  " );

        }
        try {
        ac_motorbkright = hardwareMap.dcMotor.get("motorbkright");}
        catch (Exception p_exception){
            ac_motorbkright = null;
            telemetry.addData("Error", "motorbkright not detected  ):  ");
        }
        ac_motorright.setDirection(DcMotor.Direction.REVERSE);
        ac_motorbkright.setDirection(DcMotor.Direction.REVERSE);


    }
    @Override public void start ()

    {
        //
        // Only actions that are common to all Op-Modes (i.e. both automatic and
        // manual) should be implemented here.
        //
        // This method is designed to be overridden.
        //

    } // start

    @Override
    public void loop() {
        //nothing here.

    }
    @Override public void stop ()
    {
        //
        // Nothing needs to be done for this method.
        //

    } // stop
     public void telemetry_update()
    {
        telemetry.addData("left drive stick" , +gamepad1.left_stick_y);
        telemetry.addData("right drive stick" , +gamepad1.right_stick_y);


    }
}
