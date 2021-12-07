package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Mr Roboto Operation Mode", group="TeleOp")
public class MrRobotoOpMode extends OpMode
{

    public TankDrive tankDrive;
    public DeviceMap map;

    @Override
    public void init()
    {
        tankDrive = new TankDrive();
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
        double right = gamepad1.right_stick_y;
        double left = gamepad1.left_stick_y;
        double multiplier = gamepad1.left_trigger + 1;

        tankDrive.move(right, left, multiplier, map);
    }

    @Override
    public void stop()
    {

    }

}