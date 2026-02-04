// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.IntakeCommands;

import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.Command;

public class RunIntakeCommand extends Command {
 @Override
    public void periodic() {
        // Called once per scheduler run.
    }

    @Override
    public void simulationPeriodic() {
        // Called once per scheduler run during simulation.
        SmartDashboard.putNumber("Intake Percent Output:", intakemotor.get());
    }
    
    public void runIntake(double speed) {
        intakemotor.set(speed);
    }
}

}