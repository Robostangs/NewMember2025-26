

package frc.robot.subsystems;

import com.ctre.phoenix6.controls.MotionMagicTorqueCurrentFOC;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants;

public class Shooter extends SubsystemBase {
    

    //variable creation
    private static Shooter mInstance;
    private MotionMagicTorqueCurrentFOC shooterControl;


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
    }


    public void shoot (double force) {
        //code to shoot the ball
    }

    public void setShooterPosition (double angle) {
        //code to set the shooter position
        shooterControl.Position = (angle);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}

