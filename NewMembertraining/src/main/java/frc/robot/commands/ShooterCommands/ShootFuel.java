package frc.robot.commands.ShooterCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;
import frc.robot.Constants;

public class ShootFuel extends Command {
    Shooter shooter;

    //gets an active instance of the shooter and adds it as a requirement for this command
    public ShootFuel() {
        shooter = Shooter.getInstance();
        addRequirements(shooter);
    }
    @Override
    public void initialize() {
        //shoots the fuel by adding 20 to the shooter's position
        shooter.ShootFuel(20);
    }

    @Override
    public void execute() {
        //uses motion magic to move the shooter to the new position smoothly
        shooter.setShooterShootMotionMagic();
    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        //only finishes when shooter motor is at target
        return shooter.isShooterShooterAtTarget(Constants.ShooterConstants.kShooterShootTolerance);
    }
}
