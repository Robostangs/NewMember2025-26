package frc.robot.commands.ShooterCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;
import frc.robot.Constants;

public class SetDefaultShooterPosition extends Command {
    Shooter shooter;

    //gets an active instance of the shooter and adds it as a requirement for this command
    public SetDefaultShooterPosition() {
        shooter = Shooter.getInstance();
        addRequirements(shooter);
    }
    @Override
    public void initialize() {
        //sets shooter aim to default setpoint
        shooter.setDefaultShooterPosition();
    }

    @Override
    public void execute() {
        //uses motion magic to move the shooter to the new position smoothly
        shooter.setShooterAimMotionMagic();
    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        //only finishes when shooter aim is at target
        return shooter.isShooterPositionAtTarget(Constants.ShooterConstants.kShooterAimTolerance);
    }
}
