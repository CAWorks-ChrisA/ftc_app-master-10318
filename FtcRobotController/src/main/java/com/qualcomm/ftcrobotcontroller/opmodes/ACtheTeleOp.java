package com.qualcomm.ftcrobotcontroller.opmodes;

/**
 * Created by Administrator on 2015/10/28.
 */
public class ACtheTeleOp  extends ACtheHardware {
    @Override
    public void loop() {
        ac_motorleft.setPower (-1*gamepad1.left_stick_y);
        ac_motorright.setPower (-1*gamepad1.right_stick_y);
        ac_motorbkleft.setPower (-1*gamepad1.left_stick_y);
        ac_motorbkright.setPower(-1*gamepad1.right_stick_y);
        if (gamepad1.a){
            ac_leftservo.setPosition (0.1);
        }
        if (gamepad1.b){
            ac_leftservo.setPosition(0.7);
        }
        if (gamepad1.x){
            ac_rightservo.setPosition (0.1);
        }
        if (gamepad1.y){
            ac_rightservo.setPosition (0.7);
        }
        telemetry_update();
    }
}
