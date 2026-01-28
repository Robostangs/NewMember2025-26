package frc.robot.commands.ShooterCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class SetDefaultShooterPosition extends Command {
  Shooter shooter;
  double rotations;
  int direction;

/**
 * A command that sets the shooter to default position
 * 
 * @param rotations the target rotation for?
 */
  public SetDefaultShooterPosition() {

  
    shooter = Shooter.getInstance();
    addRequirements(shooter);

  }
  // Start of the command, does nothing
  @Override
  public void initialize() {

  }
  
  @Override
  public void execute() {
    shooter.setShooterMotionMagic();

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {


  }

  // Immediately finishes
  @Override
  public boolean isFinished() {
    return shooter.isShooterAtTarget(0.01);

  }

}
