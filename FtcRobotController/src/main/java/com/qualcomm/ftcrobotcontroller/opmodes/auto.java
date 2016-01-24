package com.qualcomm.ftcrobotcontroller.opmodes;

/**
 * Created by Administrator on 2016/1/20.
 */
public class auto extends hardware{
    int state = 0;
    static final double fwdtime = 1;
    static final double turntime = 0;
    double desttime = 4;
    double inittime = 0;
    public void forward(){
        desttime = inittime + fwdtime;//sets next dest time according to current
    }
    public void turn(){
        desttime = inittime + turntime;//sets next dest time according to current
    }
    public void nextstep() {
        inittime = desttime;//sets next init time for current
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void loop() {
        switch (state){
            case 0:
                resetStartTime();//resets the timer
                state++;
                break;
            case 1:

                if (this.time > inittime && this.time<= desttime){//forward for 1 sec
                    set_drive_power(0.5,0.5);
                }
                else {

                    nextstep();//sets init time(next step)
                    forward();//sets dest time(next step)
                    state++;
                }
                break;
            /*case 2:

                if (this.time > inittime && this.time <= desttime) {//backward for 1 sec
                    set_drive_power(0, 0);
                }
                else {

                    nextstep();
                    forward();
                    state++;
                }
                break;
            case 3:
                if (this.time > inittime && this.time <= desttime) {//backward for 1 sec
                    set_drive_power(0, 0);
                }
                else {

                    nextstep();
                    forward();
                    state++;
                }
                break;*/
            default:
                set_drive_power(0,0);
                telemetry.addData("ugh", "program stopped");
                break;











        }
    }
}
