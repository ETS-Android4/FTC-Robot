package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.DeviceMap;


@Autonomous(name="ExNihiloAuto", group="MainRobot")
public class ExNihiloAuto extends LinearOpMode {

    DeviceMap robot = new DeviceMap();

    static final double FORWARD_SPEED = 0.6;
    static final double TURN_SPEED = 0.4;

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);

        telemetry.addData("Status", "Ready to ඞඞඞඞඞ");
        telemetry.update();

        waitForStart();

        // Move forward for 3 sec towards warehouse
        robot.leftFront.setPower(FORWARD_SPEED);
        robot.leftBack.setPower(FORWARD_SPEED);
        robot.rightFront.setPower(FORWARD_SPEED);
        robot.rightBack.setPower(FORWARD_SPEED);
        sleep(3000);

        // Turn in warehouse for 2 sec
        robot.leftFront.setPower(TURN_SPEED);
        robot.leftBack.setPower(TURN_SPEED);
        robot.rightFront.setPower(-TURN_SPEED);
        robot.rightBack.setPower(-TURN_SPEED);
        sleep(2000);

        // Move forward in warehouse for 2 sec
        robot.leftFront.setPower(FORWARD_SPEED);
        robot.leftBack.setPower(FORWARD_SPEED);
        robot.rightFront.setPower(FORWARD_SPEED);
        robot.rightBack.setPower(FORWARD_SPEED);
        sleep(2000);

        // Stop
        robot.leftFront.setPower(0);
        robot.leftBack.setPower(0);
        robot.rightFront.setPower(0);
        robot.rightBack.setPower(0);
    }
}
