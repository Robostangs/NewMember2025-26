package frc.robot.commands.ShooterCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class SetDefaultShooterPosition extends Command {
    Shooter shooter;


    public SetDefaultShooterPosition() {
        shooter = Shooter.getInstance();
        addRequirements(shooter);
    }
    @Override
    public void initialize() {

        shooter.setDefaultShooterPosition();
    }

    @Override
    public void execute() {
        shooter.setShooterAimMotionMagic();
    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        return shooter.isShooterPositionAtTarget(0.01);
    }
}
