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
    private Servo v_servo;

    @Override
    public void init() {
        v_motorleft = hardwareMap.dcMotor.get("motor");
        v_motorright = hardwareMap.dcMotor.get("motor2");
        v_motorbkleft = hardwareMap.dcMotor.get("motor3");
        v_motorbkright = hardwareMap.dcMotor.get("motor4");
        v_servo = hardwareMap.servo.get("servo");
        v_motorleft.setDirection(DcMotor.Direction.REVERSE);
        v_motorbkleft.setDirection(DcMotor.Direction.REVERSE);
        v_servo.setPosition (Servo.MAX_POSITION);



    }

    @Override
    public void loop() {

        v_motorleft.setPower (gamepad1.left_stick_y);
        v_motorright.setPower (gamepad1.right_stick_y);
        v_motorbkleft.setPower (gamepad1.left_stick_y);
        v_motorbkright.setPower (gamepad1.right_stick_y);

        if (gamepad2.a )
        {
            v_servo.setPosition (Servo.MIN_POSITION);
        }
        if(gamepad2.b){
            v_servo.setPosition (Servo.MAX_POSITION);
        }
        telemetry.addData ("left stick" , +gamepad1.left_stick_y);
        telemetry.addData ("right stick" , +gamepad1.right_stick_y);
        telemetry.addData ("servo position" , +v_servo.getPosition ());

    }
}
