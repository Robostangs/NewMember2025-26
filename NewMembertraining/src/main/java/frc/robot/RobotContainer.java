// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.ShooterCommands.ChangeShooterPosition;
import frc.robot.commands.ShooterCommands.SetDefaultShooterPosition;
import frc.robot.commands.ShooterCommands.ShootFuel;
import frc.robot.subsystems.ExampleSubsystem;
//import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.Shooter;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */


public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  //@SuppressWarnings("unused")
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  private final Shooter m_Shooter = new Shooter();

  // Intake subsystem: Creates intake subsystem. This makes the intake exist. 
  //@SuppressWarnings("unused")


  //private final IntakeSubsystem m_intakeSubsystem = new IntakeSubsystem();

  private final Shooter m_shooter = new Shooter();



    // Xbox Controller: Creates xbox controller. This lets us read button presses.
  //@SuppressWarnings("unused")
  private final CommandXboxController m_driverController =
      new CommandXboxController(OperatorConstants.kDriverControllerPort);

  public RobotContainer() {
    configureBindings();
  }


  

  private void configureBindings() {
    // Schedule `ExampleCommand` when `exampleCondition` changes to `true`
    new Trigger(m_exampleSubsystem::exampleCondition)
        .onTrue(new ExampleCommand(m_exampleSubsystem));

    // Schedule `exampleMethodCommand` when the Xbox controller's B button is pressed,
    // cancelling on release.
    m_driverController.b().whileTrue(m_exampleSubsystem.exampleMethodCommand());

    m_driverController.x().whileTrue(m_Shooter.setDefaultShooterPosition());
    m_driverController.y().whileTrue(m_Shooter.ShootFuel(50));
    m_driverController.rightStick().whileTrue(m_Shooter.ChangeShooterPosition(m_driverController.getRawAxis(1)));


  // Toggle intake when A is pressed
  m_driverController.a().toggleOnTrue(new ExampleCommand(m_exampleSubsystem) );
}

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }

  public void update() {
    //SmartDashboard.putNumber("Memory/GC Time MS", (double) accumtime);
    //SmartDashboard.putNumber("Memory/GCCounts", (double) accumCounts);
    //SmartDashboard.putNumber("Memory/GC Time MS", (double) memBean.getHeapMemoryUsage().getUsed());

  }

  
}
