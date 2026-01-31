package frc.robot.commands.ShooterCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class ShootFuel extends Command {
    Shooter shooter;


    public ShootFuel() {
        shooter = Shooter.getInstance();
        addRequirements(shooter);
    }
    @Override
    public void initialize() {

        shooter.ShootFuel(20);
    }

    @Override
    public void execute() {
        shooter.setShooterShootMotionMagic();
    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        return shooter.isShooterShooterAtTarget(0.01);
    }
}
