package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;

public class RunIntakeCommand extends Command {
    //Declare Intake Subsystem
    IntakeSubsystem intakesubsystem;
    public runIntakeCommand() {
        this.intakeSubsystem = IntakeSubsystem.getInstance();
        addRequirements(intakeSubsystem);
    }
    
public void execute() {
    //Run intake at 60% power
    intakesubsystem.runIntake(Contants.IntakeConstants.kDefaultIntakeSpeed);
}
}