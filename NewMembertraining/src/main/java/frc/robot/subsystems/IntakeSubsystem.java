// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase {
    private static IntakeSubsystem mInstance;
    private final TalonFX intakemotor;

    /** motor ID = 5, default speed = 60% */
    private boolean running = false; // remembers whether the intake is currently on/off.

    public static IntakeSubsystem getInstance() {
        if (mInstance == null) mInstance = new IntakeSubsystem();
        return mInstance;
    }

    public IntakeSubsystem() {
        // Constructor: initialize hardware here when Phoenix6 is available.
        intakemotor = new TalonFX(Constants.IntakeConstants.kIntakeMotorID);
    }

    /** Run the intake at a percent output [-1.0, 1.0]. */
    public void setPercentOutput(double percent) {
        // Note: Phoenix6 API may differ; adapt if needed.
        intakemotor.set(percent);
        running = percent != 0.0;
    }

    /** Run at default speed. */
    public void run() {
        setPercentOutput(Constants.IntakeConstants.kDefaultIntakeSpeed);
    }

    /** Stop the intake. */
    public void stop() {
        setPercentOutput(0.0);
    }

    /** Toggle intake on/off. */
    public void toggle() {
        if (running) stop();
        else run();
    }

    @Override
    public void periodic() {
        // Called once per scheduler run.
    }

    @Override
    public void simulationPeriodic() {
        // Called once per scheduler run during simulation.
        SmartDashboard.putNumber("Intake Percent Output:", intakemotor.get());
    }
}