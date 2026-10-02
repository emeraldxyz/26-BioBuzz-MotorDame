package org.firstinspires.ftc.teamcode.code;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Trajectory;
import com.acmerobotics.roadrunner.TrajectoryBuilder;
import com.acmerobotics.roadrunner.Vector2d;
import com.acmerobotics.roadrunner.ftc.Actions;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.MecanumDrive;
import org.firstinspires.ftc.teamcode.tuning.TuningOpModes;

@Autonomous(name = "AutoRR")

public class autoRR extends LinearOpMode {

    DcMotorEx shooter;
    Doorman doorman = new Doorman();
    public void fire(){

        shooter.setVelocity(1500);
        sleep(1500);
        doorman.run();

    }

    public void runOpMode() throws InterruptedException {

        shooter = hardwareMap.get(DcMotorEx.class,"shooter");
        Pose2d beginPose = new Pose2d(0, 0, 0);

        doorman.door(hardwareMap, this);
                MecanumDrive drive = new MecanumDrive(hardwareMap, beginPose);

                waitForStart();
                shooter.setVelocity(1500);

                Actions.runBlocking(
                        drive.actionBuilder(beginPose)
                                .strafeToConstantHeading(new Vector2d(10, 10))

                                .build());
                                fire();


                Actions.runBlocking(
                        drive.actionBuilder(beginPose)
                                .strafeToConstantHeading(new Vector2d(10, 10))

                                .build());


        }
}
