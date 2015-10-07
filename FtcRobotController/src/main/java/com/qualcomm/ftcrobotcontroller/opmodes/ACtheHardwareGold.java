package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

//------------------------------------------------------------------------------
//
// PushBotHardware
//
/**
 * Provides a single hardware access point between custom op-modes and the
 * OpMode class for the Push Bot.
 *
 * This class prevents the custom op-mode from throwing an exception at runtime.
 * If any hardware fails to map, a warning will be shown via telemetry data,
 * calls to methods will fail, but will not cause the application to crash.
 *
 * @author SSI Robotics
 * @version 2015-08-13-20-04
 */
public class ACtheHardwareGold extends OpMode

{
    //--------------------------------------------------------------------------
    //
    // PushBotHardware
    //

    /**
     * Construct the class.
     * <p/>
     * The system calls this member when the class is instantiated.
     */
    public ACtheHardwareGold()

    {
        //
        // Initialize base classes.
        //
        // All via self-construction.

        //
        // Initialize class members.
        //
        // All via self-construction.

    } // PushBotHardware

    //--------------------------------------------------------------------------
    //
    // init
    //

    /**
     * Perform any actions that are necessary when the OpMode is enabled.
     * <p/>
     * The system calls this member once when the OpMode is enabled.
     */
    @Override
    public void init()

    {
        v_motor = hardwareMap.dcMotor.get("left_drive");






    }
    private DcMotor v_motor;
    public void loop ()
    {
        float v_motor_speed = scale_motor_power (-gamepad1.left_stick_y);
        telemetry.addData ("05", "GP1 Left: " + -gamepad1.left_stick_y);
        if (gamepad2.x){
            set_drive_power ( 1, 1);
        }
    }
    float scale_motor_power (float p_power)
    {
        //
        // Assume no scaling.
        //
        float l_scale = 0.0f;

        //
        // Ensure the values are legal.
        //
        float l_power = Range.clip (p_power, -1, 1);

        float[] l_array =
                { 0.00f, 0.05f, 0.09f, 0.10f, 0.12f
                        , 0.15f, 0.18f, 0.24f, 0.30f, 0.36f
                        , 0.43f, 0.50f, 0.60f, 0.72f, 0.85f
                        , 1.00f, 1.00f
                };

        //
        // Get the corresponding index for the specified argument/parameter.
        //
        int l_index = (int)(l_power * 16.0);
        if (l_index < 0)
        {
            l_index = -l_index;
        }
        else if (l_index > 16)
        {
            l_index = 16;
        }

        if (l_power < 0)
        {
            l_scale = -l_array[l_index];
        }
        else
        {
            l_scale = l_array[l_index];
        }

        return l_scale;

    } // scale_motor_power
    void set_drive_power (double p_left_power, double p_right_power)

    {
        if (v_motor != null)
        {
            v_motor.setPower (p_left_power);
        }
        if (v_motor != null)
        {
            v_motor.setPower (p_right_power);
        }

    } // set_drive_power

    //--------------------------------------------------------------------------
    //
}
