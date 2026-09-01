package org.firstinspires.ftc.teamcode.code;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareDevice;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class intake  {

    public CRServo intakeMotor;
    boolean toggle = false;
    Gamepad controler;


    public intake(Gamepad gamepad2, HardwareMap hardwareMap){

        intakeMotor = hardwareMap.get(CRServo.class,"intakeMotor");
        controler = gamepad2;

    }
    public void run(){
        setIntakeMotor();
        motorSwitch();
    }
    public void setIntakeMotor(){



        if(toggle){
            intakeMotor.setPower(1);
        }else{
            intakeMotor.setPower(0);
        }

    }
    private void motorSwitch(){
        if (controler.rightBumperWasPressed()){
            toggle = !toggle;
        }
    }
}
