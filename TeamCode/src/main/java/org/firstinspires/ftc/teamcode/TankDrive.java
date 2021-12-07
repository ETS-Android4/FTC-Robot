package org.firstinspires.ftc.teamcode;

public class TankDrive
{

    public void move(double left, double right, double multiplier, DeviceMap map)
    {
        map.getRightTop().setPower(right * multiplier);
        map.getRightBottom().setPower(right * multiplier);
        map.getLeftBottom().setPower(left * multiplier);
        map.getLeftTop().setPower(left * multiplier);
    }

}
