package frc.robot.commands.ShooterCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class ChangeShooterPosition extends Command {
    Shooter shooter;
    double speed;

    public ChangeShooterPosition() {
        shooter = Shooter.getInstance();
        addRequirements(shooter);
    }
    @Override
    public void initialize() {

        shooter.ChangeShooterPosition(speed);
    }

    @Override
    public void execute() {
    
    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
