package com.qualcomm.ftcrobotcontroller.opmodes;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;


/**
 * Created by ACtheGreat on 2015/9/24.
 * Copyright ACtheStudios Inc. All Rights Reserved to ACtheGreat
 * Created and managed by ACtheManager Version 1.0.1
 * Written in ACtheScript Platform Android Branch Version 1.0.1
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
        telemetry.addData
                ( "This file" , "is a test file, shows how this works");
        telemetry.addData
                ( "Copyright" , "ACtheStudio Inc.");
        telemetry.addData
                ( "All rights reserves to" , "ACtheGreat");
                //this is the loop, it will go in after u press start on the driver phone
    }//ends public void loop

}//ends the class ACtheTest
//just a few notes
//This is the first program ACtheGreat aka Adam Chen has creaded on Android
//The purpose of this program is to just send a message back to the driver phone from the robot phone.
//Copyright ACtheStudios Inc. All rights reserves to ACtheGreat
//Please do not delete, add, or make ANY changes to this document.
