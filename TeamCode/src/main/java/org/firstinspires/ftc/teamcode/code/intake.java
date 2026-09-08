package org.firstinspires.ftc.teamcode.code;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareDevice;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class intake  {

    public CRServo intakeMotorFront;
    public CRServo intakeMotorBack;
    boolean toggle = false;
    Gamepad controler;


    public intake(Gamepad gamepad2, HardwareMap hardwareMap){

        intakeMotorFront = hardwareMap.get(CRServo.class,"intakeMotorFront");

        intakeMotorBack = hardwareMap.get(CRServo.class,"intakeMotorBack");
        controler = gamepad2;

    }
    public void run(){
        setIntakeMotor();
        motorSwitch();
    }
    public void setIntakeMotor(){



        if(toggle){
            intakeMotorFront.setPower(1);
            intakeMotorBack.setPower(-1);
        }else{
            intakeMotorFront.setPower(0);
            intakeMotorBack.setPower(0);
        }

    }
    private void motorSwitch(){
        if (controler.rightBumperWasPressed()){
            toggle = !toggle;
        }
    }
}
