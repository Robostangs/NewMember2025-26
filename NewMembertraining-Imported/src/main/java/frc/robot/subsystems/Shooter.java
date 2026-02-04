
 
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
    private CANcoder shooterEncoderAim;
    private CANcoder shooterEncoderShoot;
    private TalonFX shooterMotorAim;
    private TalonFX shooterMotorShoot;


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
        shooterEncoderAim = new CANcoder(Constants.ShooterConstants.kShooterEncoderAimId);
        shooterEncoderShoot = new CANcoder(Constants.ShooterConstants.kShooterEncoderShootId);
    }


    public void ShootFuel (double force) {
        //code to shoot the ball
        shooterControl.Position += force;
    }

    public void ChangeShooterPosition (double speed) {
        //code to set the shooter position
        shooterControl.Position += (speed);
    }

    public void setDefaultShooterPosition() {
        //code to set the shooter to the default position
        shooterControl.Position = Constants.ShooterConstants.kShooterRestSetpoint;
    }

    public boolean isShooterPositionAtTarget (double tolerance) {
        //code to check if the shooter is at the target position
        return Math.abs(shooterControl.Position - shooterEncoderAim.getAbsolutePosition().getValueAsDouble()) < tolerance;
    }

    public boolean isShooterShooterAtTarget (double tolerance) {
        //code to check if the shooter is at the target position
        return Math.abs(shooterControl.Position - shooterEncoderShoot.getAbsolutePosition().getValueAsDouble()) < tolerance;
    }

    public void setShooterAimMotionMagic() {
        //code to set the shooter using motion magic
        shooterMotorAim.setControl(shooterControl);
    }

    public void setShooterShootMotionMagic() {
        //code to set the shooter using motion magic
        shooterMotorShoot.setControl(shooterControl);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
    
    
}

