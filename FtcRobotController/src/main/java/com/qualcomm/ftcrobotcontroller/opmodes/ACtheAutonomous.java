package com.qualcomm.ftcrobotcontroller.opmodes;

/**
 * Created by Administrator on 2015/10/28.
 */
public class ACtheAutonomous  extends ACtheHardware
{



    private int ac_state = 0;

    @Override public void loop () {

        switch (ac_state) {
            case 0:
                set_drive_power(-1.0, -1.0);
                new ACtheCounter (2);
                ac_state++;
                break;
            case 1:

            default:
                //
                // The autonomous actions have been accomplished (i.e. the state has
                // transitioned into its final state.
                //
                break;
        }


    }

}
