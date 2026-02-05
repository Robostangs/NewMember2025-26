package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class EjectCommand extends Command {
  

    @Override
    public void initialize() {
        m_intakeSubsystem.setPercentOutput(-Constants.IntakeConstants.kDefaultIntakeSpeed); 
    }

    @Override
    public void end(boolean interrupted) {
        m_intakeSubsystem.setPercentOutput(0);
    }

    @Override
    public boolean isFinished() {
        return false;



}