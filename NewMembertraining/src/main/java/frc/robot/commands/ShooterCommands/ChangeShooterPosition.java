package frc.robot.commands.ShooterCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class ChangeShooterPosition extends Command {
  Shooter shooter;
  double rotations;
  int direction;

/**
 * A command that changes the shooter's shooting angle
 * 
 * @param rotations the target rotation for?
 */
  public ChangeShooterPosition(double rotations, int direction) {

    this.rotations = rotations;
    this.direction = direction;
    shooter = Shooter.getInstance();
    addRequirements(shooter);

  }
  // Start of the command, sets the shooter to the setpoint
  @Override
  public void initialize() {
    shooter.ChangeShooterPosition(rotations, direction);
    //shooter.postStatus("Arm going to this rotation:" + rotations);
  }
  
  @Override
  public void execute() {
    //shooter motor movement

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    //shooter.postStatus("Shooter at this rotation:" + rotations);

  }

  // Returns true when keybind is up
  @Override
  public boolean isFinished() {
    return true;
    //check if shooter rotation key up
    //return shooter.isShooterAtTarget(0.01);
  }

}
