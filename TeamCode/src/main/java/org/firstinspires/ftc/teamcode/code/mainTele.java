package org.firstinspires.ftc.teamcode.code;


import com.acmerobotics.roadrunner.Pose2d;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.MecanumDrive;
import org.firstinspires.ftc.teamcode.tuning.TuningOpModes;

@TeleOp(name = "mainTele")
public class mainTele extends LinearOpMode {

    boolean toggle = false;

	@Override


	public void runOpMode() throws InterruptedException {
		if (TuningOpModes.DRIVE_CLASS.equals(MecanumDrive.class)) {
			MecanumDrive drive = new MecanumDrive(hardwareMap, new Pose2d(0, 0, 0));
            intake intakeSystem = new intake(gamepad2, hardwareMap);

			waitForStart();

			while (opModeIsActive()) {


                    if (gamepad1.xWasPressed() && gamepad1.triangleWasPressed() && gamepad1.squareWasPressed() && gamepad1.circleWasPressed()){
                        toggle = !toggle;
                }

                    if(toggle) {
                        Driving.drive(drive, gamepad1);
                    }else{
                          Driving2.drive(drive,gamepad1);
                    }

                intakeSystem.run();

			}

		}
	}
}
