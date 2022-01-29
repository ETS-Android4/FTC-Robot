package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="ExNihilo Op Mode")
public class TeleOpMode extends OpMode {
    DeviceMap robot = new DeviceMap();

    @Override
    public void init() {
        robot.init(hardwareMap);
        telemetry.addData("Say, ", "Bruh moment");
        telemetry.update();
    }

    @Override
    public void init_loop() {
    }

    @Override
    public void start() {
    }

    @Override
    public void loop() {
        double right = gamepad1.right_stick_y;
        double left = gamepad1.left_stick_y;

        robot.leftFront.setPower(left);
        robot.leftBack.setPower(left);
        robot.rightFront.setPower(right);
        robot.rightBack.setPower(right);

    }
}