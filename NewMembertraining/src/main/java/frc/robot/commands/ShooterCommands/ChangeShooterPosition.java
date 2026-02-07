package frc.robot.commands.ShooterCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class ChangeShooterPosition extends Command {
    Shooter shooter;
    double speed;

    //gets an active instance of the shooter and adds it as a requirement for this command
    public ChangeShooterPosition() {
        shooter = Shooter.getInstance();
        addRequirements(shooter);
    }
    @Override
    public void initialize() {
        //changes the shooter position by adding the speed to the shooter's position
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
        //runs until the command is interrupted, which will be when the button is released
        return true;
    }
}
