package org.firstinspires.ftc.teamcode.code;

import static android.os.SystemClock.sleep;

import com.acmerobotics.roadrunner.ftc.Actions;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Doorman  {
    Servo doorman;

    public void door(HardwareMap hardwareMap){
        doorman = hardwareMap.get(Servo.class, "doorman" );

    }

    public void run(){
        doorman.setPosition(1);
        sleep(1500);
        doorman.setPosition(0);
    }

}
