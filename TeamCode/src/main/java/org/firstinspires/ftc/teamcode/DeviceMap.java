package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import java.util.ArrayList;


public class DeviceMap {
    public DcMotorEx leftFront = null;
    public DcMotorEx leftBack = null;
    public DcMotorEx rightFront = null;
    public DcMotorEx rightBack = null;
    private DcMotorEx[] driveMotors;


    HardwareMap hwMap = null;

    public void init(HardwareMap hwMap) {
        // Initialize variables for each motor
        leftFront = hwMap.get(DcMotorEx.class, "left_front");
        leftBack = hwMap.get(DcMotorEx.class, "left_back");
        rightFront = hwMap.get(DcMotorEx.class, "right_front");
        rightBack = hwMap.get(DcMotorEx.class, "right_back");

        this.driveMotors = new DcMotorEx[] {leftFront, leftBack, rightFront, rightBack};
        leftFront.setDirection(DcMotor.Direction.FORWARD);
        leftBack.setDirection(DcMotor.Direction.FORWARD);
        rightFront.setDirection(DcMotor.Direction.REVERSE);
        rightBack.setDirection(DcMotor.Direction.REVERSE);

        for(DcMotorEx motor: this.driveMotors){
            motor.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
            motor.setMode(DcMotorEx.RunMode.RUN_WITHOUT_ENCODER);
            motor.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
            motor.setPower(0);
        }
    }
}
