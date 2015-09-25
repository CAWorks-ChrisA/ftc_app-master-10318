package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.ftcrobotcontroller.R;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;


/**
 * Created by ACtheGreat on 2015/9/24.
 */
public class ACtheTest extends OpMode
{
    public ACtheTest() {

    }

    @Override
    public void init() {

    }

    @Override
    public void loop() {

    }
    public void update_telemetry ()
    {

        telemetry.addData
                ( "ACtheGreat", "is the MVP of the day");
    }
}
