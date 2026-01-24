

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
    private CANcoder shooterEncoder;
    private TalonFX shooterMotor;


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
        shooterEncoder = new CANcoder(Constants.ShooterConstants.kArmEncoderId);
    }


    public void ShootFuel (double force) {
        //code to shoot the ball
    }

    public void ChangeShooterPosition (double speed, int direction) {
        //code to set the shooter position
        shooterControl.Position += (speed*direction);
    }

    public void setDefaultShooterPosition() {
        //code to set the shooter to the default position
        shooterControl.Position = Constants.ShooterConstants.kShooterRestSetpoint;
    }

    public boolean isShooterAtTarget (double tolerance) {
        //code to check if the shooter is at the target position
        return Math.abs(shooterControl.Position - shooterEncoder.getPosition.getValueAsDouble()) < tolerance;
    }

    public void setShooterMotionMagic() {
        //code to set the shooter using motion magic
        shooterMotor.setControl(shooterControl);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
    
    
}

