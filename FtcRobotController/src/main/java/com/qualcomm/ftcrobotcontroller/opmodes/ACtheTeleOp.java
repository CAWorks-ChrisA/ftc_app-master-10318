package com.qualcomm.ftcrobotcontroller.opmodes;

/**
 * Created by Administrator on 2015/10/28.
 */
public class ACtheTeleOp  extends ACtheHardware {
    @Override
    public void loop() {
        ac_motorleft.setPower (gamepad1.left_stick_y);
        ac_motorright.setPower (gamepad1.right_stick_y);
        ac_motorbkleft.setPower (gamepad1.left_stick_y);
        ac_motorbkright.setPower (gamepad1.right_stick_y);
        ac_debris.setPower (gamepad1.left_trigger);
        ac_debris.setPower (-1*gamepad1.right_trigger);
        telemetry_update();
    }
}
