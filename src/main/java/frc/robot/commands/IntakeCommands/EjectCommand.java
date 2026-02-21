package frc.robot.commands.IntakeCommands;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.subsystems.IntakeSubsystem;

public class EjectCommand extends Command {
  IntakeSubsystem m_intakeSubsystem;


    public EjectCommand(){
        m_intakeSubsystem = IntakeSubsystem.getInstance();
        addRequirements(m_intakeSubsystem);
    }

    @Override
    public void initialize() {
        m_intakeSubsystem.runIntake(-Constants.IntakeConstants.kDefaultIntakeSpeed);

    }

    @Override
    public void end(boolean interrupted) {
        m_intakeSubsystem.runIntake(0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }


}