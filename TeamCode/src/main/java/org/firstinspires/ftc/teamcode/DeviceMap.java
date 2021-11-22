package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import java.util.ArrayList;

public final class DeviceMap
{

    private DcMotor leftTop;
    private DcMotor rightTop;
    private DcMotor leftBottom;
    private DcMotor rightBottom;
    private DcMotor[] driveMotors;

    private DcMotor intakeMotor;

    HardwareMap map = null;

    // class
    public DeviceMap() {}

    public void init(HardwareMap map)
    {
        setUpDriveMotors(map);
        setUpIntakeMotors(map);
    }

    private void setUpDriveMotors(HardwareMap map)
    {
        leftTop = map.get(DcMotor.class, "leftTop");
        rightTop = map.get(DcMotor.class, "rightTop");
        leftBottom = map.get(DcMotor.class, "leftBottom");
        rightBottom = map.get(DcMotor.class, "rightBottom");

        this.driveMotors = new DcMotor[] {leftTop, rightTop, leftBottom, rightBottom};

        leftTop.setDirection(DcMotorSimple.Direction.FORWARD);
        leftBottom.setDirection(DcMotorSimple.Direction.FORWARD);
        rightTop.setDirection(DcMotorSimple.Direction.REVERSE);
        rightBottom.setDirection(DcMotorSimple.Direction.REVERSE);

        // set same thing to each motor
        for (DcMotor motor : this.driveMotors)
        {
            motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
            motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            motor.setPower(0);
        }
    }
    private void setUpIntakeMotors(HardwareMap map)
    {
        intakeMotor = map.get(DcMotor.class, "intakeMotor");
        intakeMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        intakeMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        intakeMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        intakeMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        intakeMotor.setPower(0);

    }


    // getters

    public DcMotor getLeftTop()
    {
        return leftTop;
    }

    public DcMotor getRightTop()
    {
        return rightTop;
    }

    public DcMotor getLeftBottom()
    {
        return leftBottom;
    }

    public DcMotor getRightBottom()
    {
        return rightBottom;
    }

    public DcMotor getIntakeMotor()
    {
        return intakeMotor;
    }

}
