package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by ACtheGreat on 10/19/2015.
 * Copyright ACtheStudios Inc.
 * All Rights Reserved to ACtheGreat.
 */
public class ACtheMotor extends OpMode {
    private DcMotor v_motor;
    private DcMotor v_motor2;
    @Override
    public void init() {
        v_motor = hardwareMap.dcMotor.get("motor");
        v_motor2 = hardwareMap.dcMotor.get("motor2");

    }

    @Override
    public void loop() {
        if (gamepad1.a){
            v_motor.setPower (1.0);
        }
        if (gamepad1.b) {
            v_motor.setPower (-1.0);
        }
        v_motor.setPower (gamepad1.left_stick_y);
        v_motor2.setPower (gamepad1.right_stick_y);

    }
}
