package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.IrSeekerSensor;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.TouchSensor;

/**
 * Created by Administrator on 2015/11/4.
 */
public class ACtheSensors  extends OpMode {
private TouchSensor touch;
private OpticalDistanceSensor dds;
private ColorSensor color;
private IrSeekerSensor ir;
    @Override
    public void init() {
        touch = hardwareMap.touchSensor.get ("touch");
        dds = hardwareMap.opticalDistanceSensor.get ("dds");
        color = hardwareMap.colorSensor.get ("color");
        ir = hardwareMap.irSeekerSensor.get ("ir");


    }

    @Override
    public void loop() {
        if (touch.isPressed()){
            telemetry.addData ("gg", "wp");
        }
       dds.enableLed(touch.isPressed());
        telemetry.addData("distance....", +dds.getLightDetected());
        telemetry.addData("color", color.argb());
        telemetry.addData ("ir", ir.signalDetected());
        telemetry.addData ("color2", color.alpha());
        telemetry.addData ("color3 blue", color.blue());
        telemetry.addData ("color4 green", color.green());
        telemetry.addData ("color5 red", color.red());

    }

}
