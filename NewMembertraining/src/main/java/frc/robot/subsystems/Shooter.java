

package frc.robot.subsystems;

import com.ctre.phoenix6.controls.MotionMagicTorqueCurrentFOC;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants;

import com.ctre.phoenix6.hardware.CANcoder;

public class Shooter extends SubsystemBase {
    

    //variable creation
    private static Shooter mInstance;
    private MotionMagicTorqueCurrentFOC shooterControl;
    private CANcoder shooterEncoder;


    //gets an active instance of the shooter
    public static Shooter getInstance() {
        if (mInstance == null) {
            mInstance = new Shooter();
        }
        return mInstance;
    }
    public Shooter() {


        //variable definitions
        shooterControl = new MotionMagicTorqueCurrentFOC(Constants.ShooterConstants.kShooterRestSetpoint);
        shooterEncoder = new CANcoder(Constants.ShooterConstants.kArmEncoderId); //assuming ID 1 for the encoder
    }


    public void shoot (double force) {
        //code to shoot the ball
    }

    public void setShooterPosition (double angle) {
        //code to set the shooter position
        shooterControl.Position = (angle);
    }

    public boolean isShooterAtTarget (double tolerance) {
        //code to check if the shooter is at the target position
        return Math.abs(shooterControl.Position - shooterEncoder.getPosition.getValueAsDouble()) < tolerance;
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}

