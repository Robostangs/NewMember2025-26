// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
/**
 * Intake subsystem: contains motor constants and simple control methods.
 *
 * Note: CTRE Phoenix6 motor wiring is intentionally left out of this initial
 * implementation to avoid compile-time coupling to the vendor API in this
 * environment. To wire to a TalonFX, replace the placeholder methods with
 * a real motor controller instance using the Phoenix6 Java API.
 */
public class IntakeSubsystem extends SubsystemBase {
    // --- Constants local to this subsystem ---
    private static final int kIntakeMotorID = 5; // moved from Constants

    public IntakeSubsystem() {
        // Constructor: initialize hardware here when Phoenix6 is available.
    }

    /** Run the intake at a percent output [-1.0, 1.0]. Placeholder implementation. */
    public void setPercentOutput(double percent) {
        // TODO: set motor output via CTRE Phoenix6 TalonFX when available.
    }

    /** Convenience: run intake inward at default speed. */
    public void run() {
        setPercentOutput(0.6);
    }

    /** Stop the intake motor. */
    public void stop() {
        setPercentOutput(0.0);
    }

    @Override
    public void periodic() {
        // Called once per scheduler run.
    }

    @Override
    public void simulationPeriodic() {
        // Called once per scheduler run during simulation.
    }
}