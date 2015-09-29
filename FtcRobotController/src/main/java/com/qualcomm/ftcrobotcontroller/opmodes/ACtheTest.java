package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.ftcrobotcontroller.R;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;


/**
 * Created by ACtheGreat on 2015/9/24.
 */
public class ACtheTest extends OpMode
//this is where u classify this program, and it extends on the original OpMode
{
    public ACtheTest() {
// just to call this program again :D:D
    }//ends calling

    @Override
    public void init() {
// this is the initialization process, you map all ur hardware here.
    }//ends initialize

    @Override
    public void loop() {
        telemetry.addData
                ( "ACtheGreat", "is the MVP of the day");
                //this is the loop it will go in after u press start on the driver phone
    }//ends public void loop
    public void update_telemetry ()// this is just a useless command, ignore this statement
    {

        telemetry.addData
                ( "ACtheGreat", "is the MVP of the day");
    }//ends update_telemetry, line 28-33 are useless
}//ends the class ACtheTest
