package org.firstinspires.ftc.teamcode.tuning;


import com.acmerobotics.roadrunner.Pose2d;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.MecanumDrive;

@TeleOp(name = "mainTele")
public class mainTele extends LinearOpMode {
	@Override

	public void runOpMode() throws InterruptedException {
		if (TuningOpModes.DRIVE_CLASS.equals(MecanumDrive.class)) {
			MecanumDrive drive = new MecanumDrive(hardwareMap, new Pose2d(0, 0, 0));


			waitForStart();

			while (opModeIsActive()) {

				Driving.drive(drive,gamepad1);


			}

		}
	}
}
