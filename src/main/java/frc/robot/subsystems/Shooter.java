package frc.robot.subsystems;

import com.ctre.phoenix6.controls.MotionMagicTorqueCurrentFOC;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants;

import com.ctre.phoenix6.hardware.CANcoder;

import com.ctre.phoenix6.hardware.TalonFX;

public class Shooter extends SubsystemBase {
    

    //variable creation
    private static Shooter mInstance;
    private MotionMagicTorqueCurrentFOC shooterControl;
   //private CANcoder shooterEncoderShoot;
    private TalonFX shooterMotorShoot;

    //gets an active instance of the shooter
    public static Shooter getInstance() {
        if (mInstance == null) {
            mInstance = new Shooter();
        }
        return mInstance;
    }
    
    public void ShootFuel (double force) {
        //code to shoot the ball
        shooterControl.Position += force;
    }

    public void stopShooter() {
        shooterMotorShoot.setControl(shooterControl);
        shooterControl.FeedForward = 0;
    }   
}

