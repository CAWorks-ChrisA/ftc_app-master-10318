package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.TouchSensor;

/**
 * Created by Administrator on 2015/11/4.
 */
public class ACtheSensors  extends OpMode {
private TouchSensor touch;
private OpticalDistanceSensor dds;
    @Override
    public void init() {
        touch = hardwareMap.touchSensor.get ("touch");
        dds = hardwareMap.opticalDistanceSensor.get ("dds");

    }

    @Override
    public void loop() {
        if (touch.isPressed()){
            telemetry.addData ("Ryan, I win", "you lose");
        }
       dds.enableLed(touch.isPressed());
        telemetry.addData ("distance....", +dds.getLightDetected());

    }
}
