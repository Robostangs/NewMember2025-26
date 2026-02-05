// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
// test comment

package frc.robot.commands.IntakeCommands;

import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.Command;

public class RunIntakeCommand extends Command {
    //Declare Intake Subsystem
    IntakeSubsystem intakeSubsystem;
    public RunIntakeCommand() {
        this.intakeSubsystem = IntakeSubsystem.getInstance();
        addRequirements(intakeSubsystem);
    }
    
    @Override
    public void execute() {
        //Run intake at 60% power
        intakeSubsystem.runIntake(Constants.IntakeConstants.kDefaultIntakeSpeed);
    }
    public void end (boolean interrupted) {
        //Stop intake when command ends
        intakeSubsystem.runIntake(0.0);
    }

}