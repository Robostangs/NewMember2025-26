package frc.robot.commands.ShooterCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class SetShooterPosition extends Command {
  Shooter shooter;
  double rotations;

/**
 * A command that sets the arm to a target rotation
 * 
 * @param rotations the target rotation for motion magic
 */
  public SetShooterPosition(double rotations) {

    this.rotations = rotations;
    shooter = Shooter.getInstance();
    addRequirements(shooter);

  }
  // Start of the command, sets the arm to the setpoint
  @Override
  public void initialize() {
    shooter.setShooterPosition(rotations);
    //shooter.postStatus("Arm going to this rotation:" + rotations);
  }
  
  @Override
  public void execute() {
    //shooter.setShooterMotionMagic();

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    //shooter.postStatus("Arm at this rotation:" + rotations);

  }

  // Returns true when the arm is within the tolerence 
  @Override
  public boolean isFinished() {
    return shooter.isShooterAtTarget(0.01);
  }

}
