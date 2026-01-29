// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

// Base placeholder for any Phoenix-related subsystem.
public class Phoenix6Subsystem extends SubsystemBase {
  
    final TalonFX leftleader;
    final TalonFX rightleader;
    final TalonFX leftfollower;
    final TalonFX rightfollower;
    final DifferentialDrive drive;

  
}

public Phoenix6Subsystem() {
    leftleader = new TalonFX(Driveconstants.LEFT_LEADER_ID, Motortype.kbrushed);
    rightleader = new TalonFX(Driveconstants.RIGHT_LEADER_ID, Motortype.kbrushed);
    leftfollower = new TalonFX(Driveconstants.LEFT_FOLLOWER_ID, Motortype.kbrushed);
    rightfollower = new TalonFX(Driveconstants.RIGHT_FOLLOWER_ID, Motortype.kbrushed
    );
    drive = new DifferentialDrive(leftleader, rightleader);
}