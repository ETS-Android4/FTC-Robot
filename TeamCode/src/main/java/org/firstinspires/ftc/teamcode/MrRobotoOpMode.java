package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.utils.VersionInfo;

import org.firstinspires.ftc.teamcode.MecanumDrive;

@VersionInfo(
        version = "1.0",
        releaseDate = "10/22/2021",
        since = "1.0",
        contributors = {
                "Washieu Anan"
        }
)

@TeleOp(name="Mr Roboto Op Mode", group="TeleOp")
public class MrRobotoOpMode extends OpMode
{

    public MecanumDrive mecanumDrive;
    public DeviceMap map;

    @Override
    public void init()
    {
        mecanumDrive = new MecanumDrive();
        map = new DeviceMap();
        map.init(hardwareMap);
    }

    @Override
    public void start()
    {

    }

    @Override
    public void loop()
    {
        double x = gamepad1.left_stick_x;
        double y = gamepad1.left_stick_y;
        double right_stick_x = -gamepad1.right_stick_x;
        double multiplier = gamepad1.left_trigger + 1;

        mecanumDrive.move(map, x / multiplier, y / multiplier, right_stick_x / multiplier);
        map.getIntakeMotor().setPower(gamepad2.left_stick_y);
    }

    @Override
    public void stop()
    {

    }

}