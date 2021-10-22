package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.utils.VersionInfo;

/**
 * Just for driving
 */
@VersionInfo(
        version = "1.0",
        releaseDate = "10/22/2021",
        since = "1.0",
        contributors = {
                "Washieu Anan"
        }
)
@TeleOp(name = "TeleOp Demo")
public class Driving extends LinearOpMode
{


    @Override
    public void runOpMode()
    {
        DcMotor leftDrive = hardwareMap.get(DcMotor.class, "leftDrive");
        leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        // set direction of motor
        leftDrive.setDirection(DcMotor.Direction.REVERSE);

        DcMotor rightDrive = hardwareMap.get(DcMotor.class, "rightDrive");
        rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        // set direction of motor
        rightDrive.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();

        while(opModeIsActive())
        {
            // set power to the controller
            leftDrive.setPower(gamepad1.left_stick_y);
            rightDrive.setPower(gamepad1.right_stick_y);

            telemetry.addLine("Working");
            telemetry.update();
        }
    }

}
