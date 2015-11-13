package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by ACtheGreat on 10/19/2015.
 * Copyright ACtheStudios Inc.
 * All Rights Reserved to ACtheGreat.
 */
public class ACtheMotor extends OpMode {
    private DcMotor v_motorleft;
    private DcMotor v_motorright;
    private DcMotor v_motorbkleft;
    private DcMotor v_motorbkright;

    @Override
    public void init() {
        v_motorleft = hardwareMap.dcMotor.get("motorleft");
        v_motorright = hardwareMap.dcMotor.get("motorright");
        v_motorbkleft = hardwareMap.dcMotor.get("motorbkleft");
        v_motorbkright = hardwareMap.dcMotor.get("motorbkright");

        v_motorright.setDirection(DcMotor.Direction.REVERSE);
        v_motorbkright.setDirection(DcMotor.Direction.REVERSE);




    }

    @Override
    public void loop() {

        v_motorleft.setPower (gamepad1.left_stick_y);
        v_motorright.setPower (gamepad1.right_stick_y);
        v_motorbkleft.setPower (gamepad1.left_stick_y);
        v_motorbkright.setPower (gamepad1.right_stick_y);


        telemetry.addData ("left stick" , +gamepad1.left_stick_y);
        telemetry.addData ("right stick" , +gamepad1.right_stick_y);


    }
}
