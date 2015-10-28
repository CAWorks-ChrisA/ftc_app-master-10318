package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
/**
 * Created by robots on 10/23/2015.
 */
public class moter123  extends OpMode{
    private DcMotor The_Great_Motor1;
    private DcMotor The_Great_Motor2;


    @Override
    public void init() {
        The_Great_Motor1 = hardwareMap.dcMotor.get("The_Great_Motor1");
        The_Great_Motor2 = hardwareMap.dcMotor.get("The_Great_Motor2");



    }

    @Override
    public void loop() {
        if (gamepad1.a){
            The_Great_Motor1.setPower (1.0);
        }
        if (gamepad1.b) {
            The_Great_Motor2.setPower (-1.0);
        }
        The_Great_Motor1.setPower (gamepad1.left_stick_y);
        The_Great_Motor2.setPower (gamepad1.right_stick_y);



    }

}
