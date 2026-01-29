package frc.robot.commands;
Public class RunIntakeCommand extends command {
    //Declare Intake Subsystem
    Private intakeSubsystem intakesubsystem;
    public runIntakeCommand(intakeSubsystem intakeSubsystem) {
        this.intakeSubsystem = intakeSubsystem;
        addRequirements(intakeSubsystem);
    }
    
public void execute() {
    //Run intake at 50% power
    intakesubsystem.runIntake(-0.5);
}
