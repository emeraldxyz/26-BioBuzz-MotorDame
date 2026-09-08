package org.firstinspires.ftc.teamcode.code;

import com.acmerobotics.roadrunner.PoseVelocity2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.MecanumDrive;

public class Driving {
	public static MecanumDrive drive;

	public static void drive(MecanumDrive drive, Gamepad gamepad1) {

		double xInputLeft = -gamepad1.left_stick_x;
		double yInputLeft = -gamepad1.left_stick_y;
		double xInputRight = gamepad1.right_stick_x;
		drive.setDrivePowers(new PoseVelocity2d(
				new Vector2d(
						-gamepad1.left_stick_x,
						gamepad1.left_stick_y
				),
				-gamepad1.right_stick_x
		));
	}
}
