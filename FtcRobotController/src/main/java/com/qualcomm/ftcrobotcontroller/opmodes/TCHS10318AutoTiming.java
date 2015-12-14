package com.qualcomm.ftcrobotcontroller.opmodes;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by wes on 12/13/2015.
 */
public class TCHS10318AutoTiming extends TCHS10318Hardware {
    Timer autonomoustimer;
    //giving the timer a name
    public TCHS10318AutoTiming (int milliseconds) {
        autonomoustimer= new Timer ();
        autonomoustimer.schedule(new RemindTask(), milliseconds);
    }

    class RemindTask extends TimerTask {
    public void run( )  {
        set_drive_power(0.0, 0.0);
        //ac_servo.setPosition(Servo.MIN_POSITION)
        runningoff();
        timer.cancel(); //Terminate the timer thread
    }



}
