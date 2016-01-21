package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Administrator on 2016/1/20.
 */
public class teleoptest extends OpMode{
    DcMotor left;
    DcMotor right;
    DcMotor bkleft;
    DcMotor bkright;
    int state;
    int state2;
    @Override
    public void init() {
        left = hardwareMap.dcMotor.get("left");
        right = hardwareMap.dcMotor.get("right");
        bkleft = hardwareMap.dcMotor.get("backleft");
        bkright = hardwareMap.dcMotor.get("backright");
        right.setDirection(DcMotor.Direction.REVERSE);
        bkright.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {
        left.setPower(gamepad1.left_stick_y);
        right.setPower(gamepad1.right_stick_y);
        bkleft.setPower(gamepad1.left_stick_y);
        bkright.setPower(gamepad1.right_stick_y);

        if (gamepad1.a){
            switch (state){
                case 0:
                    resetStartTime();
                    state++;
                    break;
                case 1:
                    if (this.time >=1 && this.time <= 2) {
                        left.setPower(1);
                        right.setPower(1);
                        bkleft.setPower(1);
                        right.setPower(1);
                    }
                    else {
                        state++;
                    }
                    break;
                default:
                    break;
            }
        }
        if (gamepad1.b){
            switch (state2){
                case 0:
                    resetStartTime();
                    state++;
                    break;
                case 1:
                    if (this.time >=1 && this.time <= 2) {
                        left.setPower(1);
                        right.setPower(-1);
                        bkleft.setPower(1);
                        right.setPower(-1);
                    }
                    else {
                        state++;
                    }
                    break;
                default:
                    break;
            }
        }

    }
}
