package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;

/**
 * Created by TCHS Robotics on 11/16/2015.
 */
public class ACtheColor  extends OpMode {
    ColorSensor ac_color;
    @Override
    public void init() {
        ac_color = hardwareMap.colorSensor.get("color");

    }

    @Override
    public void loop() {
        ac_color.enableLed(true);
        telemetry.addData("R", ac_color.red());
        telemetry.addData("G", ac_color.green());
        telemetry.addData("B", ac_color.blue());

    }
}
