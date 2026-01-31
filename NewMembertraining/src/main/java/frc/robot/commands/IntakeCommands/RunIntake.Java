package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.Constants;

/** Run the intake while this command is scheduled (stops on end). */
public class RunIntake extends CommandBase {
    private final IntakeSubsystem m_intake = IntakeSubsystem.getInstance();

    public RunIntake() {
        addRequirements(m_intake);
    }

    @Override
    public void execute() {
        // Use the subsystem helper to run at default speed
        m_intake.run();
    }

    @Override
    public void end(boolean interrupted) {
        m_intake.stop();
    }

    @Override
    public boolean isFinished() {
        return false; // run until interrupted
    }
}