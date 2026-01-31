package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.IntakeSubsystem;

/** Instant command that toggles the intake on/off. */
public class ToggleIntake extends InstantCommand {
  private final IntakeSubsystem m_intake;

  public ToggleIntake(IntakeSubsystem intake) {
    m_intake = intake;
    addRequirements(m_intake);
  }

  @Override
  public void initialize() {
    m_intake.toggle();
  }
}
