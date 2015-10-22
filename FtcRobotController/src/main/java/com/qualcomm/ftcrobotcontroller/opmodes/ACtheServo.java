package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by TCHS Robotics on 10/12/2015.
 */
public class ACtheServo extends OpMode{

    //--------------------------------------------------------------------------
    //
    // init
    //

    /**
     * Perform any actions that are necessary when the OpMode is enabled.
     * <p/>
     * The system calls this member once when the OpMode is enabled.
     */
    @Override
    public void init()

    {
        v_servo = hardwareMap.servo.get("servo1");
        v_servo.setPosition (Servo.MIN_POSITION);





    }
    private Servo v_servo;
    public void loop ()
    {

        telemetry.addData ("05", "GP1 Left: " + -gamepad1.left_stick_y);
        if (gamepad1.x){
            v_servo.setPosition (Servo.MAX_POSITION);
            telemetry.addData ("10", "dfsdlfhsdofuksdhgliadhlfibsdlijfhsdilh");

        }
        if (gamepad1.y){
            v_servo.setPosition (Servo.MAX_POSITION);
            telemetry.addData ("10", "dfsdlfhsdofuksdhgliadhlfibsdlijfhsdilh");
        }
        if (gamepad1.a){
            v_servo.setPosition (Servo.MIN_POSITION);
            telemetry.addData ("10", "dfsdlfhsdofuksdhgliadhlfibsdlijfhsdilh");
        }
        if (gamepad1.b){
            v_servo.setPosition(Servo.MIN_POSITION);}

            telemetry.addData ("05", "GP1 Left: " + -gamepad1.left_stick_y);
            telemetry.addData ("06", "GP1 Right: " + -gamepad1.right_stick_y);
            telemetry.addData ("07", "GP2 Left: " + -gamepad1.left_stick_y);
            telemetry.addData ("08", "GP2 X: " + gamepad1.x);
            telemetry.addData ("09", "GP2 Y: " + gamepad1.y);
            telemetry.addData("10", "GP1 LT: " + gamepad1.left_trigger);
            telemetry.addData ("11", "GP1 RT: " + gamepad1.right_trigger);


        }


    double position ()
    {
        double l_return = 0.0;

        if (v_servo!= null)
        {
            l_return = v_servo.getPosition ();
        }

        return l_return;

    } // a_hand_position


    //--------------------------------------------------------------------------
    //
}
