package org.firstinspires.ftc.teamcode.code;

//import static android.os.SystemClock.sleep;

import com.acmerobotics.roadrunner.ftc.Actions;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Doorman  {
    Servo doorman;
    LinearOpMode opMode;

    public void door(HardwareMap hardwareMap, LinearOpMode opMode){
        doorman = hardwareMap.get(Servo.class, "doorman" );
        this.opMode = opMode;
    }

    public void run(){
        doorman.setPosition(1);
        opMode.sleep(1500);
        doorman.setPosition(0);
    }

}
