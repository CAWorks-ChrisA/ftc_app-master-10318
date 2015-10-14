package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

/**
 * Created by robots on 10/9/2015.
 */
public class HelloWorld extends OpMode{
    public HelloWorld() {}
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        telemetry.addData ("Hello", "World");

    }

}
