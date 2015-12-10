package com.qualcomm.ftcrobotcontroller.opmodes;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by TCHS Robotics on 10/29/2015.
 */
public class ACtheCounter extends ACtheHardware{
    Timer timer;

    public ACtheCounter(int miliseconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), miliseconds);
    }

    class RemindTask extends TimerTask {
        public void run() {
            set_drive_power(0.0, 0.0);
            //ac_servo.setPosition(Servo.MIN_POSITION);
            runningoff();
            timer.cancel(); //Terminate the timer thread

        }
    }
}
