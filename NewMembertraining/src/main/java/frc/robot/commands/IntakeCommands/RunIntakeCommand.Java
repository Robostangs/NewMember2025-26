// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ExampleSubsystem;
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

public void RunIntakeCommand(IntakeSubsystem intakeSubsystem) {
    intakesubsystem.runIntake(Contants.IntakeConstants.kDefaultIntakeSpeed);
}
}