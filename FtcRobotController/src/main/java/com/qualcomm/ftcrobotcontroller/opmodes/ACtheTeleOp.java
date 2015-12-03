package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Administrator on 2015/10/28.
 */
public class ACtheTeleOp  extends ACtheHardware {
    @Override
    public void loop() {
        ac_motorleft.setPower (gamepad1.left_stick_y);
        ac_motorright.setPower (gamepad1.right_stick_y);
        ac_motorbkleft.setPower (gamepad1.left_stick_y);
        ac_motorbkright.setPower(gamepad1.right_stick_y);
        if (gamepad2.a){
            ac_servo.setPosition (Servo.MAX_POSITION);
        }
        if (gamepad2.b){
            ac_servo.setPosition (Servo.MIN_POSITION);
        }

        telemetry_update();
    }
}
