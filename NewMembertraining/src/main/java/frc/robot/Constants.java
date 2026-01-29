// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot;
import com.ctre.phoenix6.configs.CurrentLimitsConfigs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;

public class Constants {
    public static class OperatorConstants {
        public static final int kDriverControllerPort = 0;
    }

  
    public static class ShooterConstants {
        public static final int kShooterEncoderId = 6;
        public static final double kShooterRestSetpoint = 0.0;
    }
   public static class IntakeConstants {
        public static final int intakeMotorID = 5;

        public static final TalonFXConfiguration configs = new TalonFXConfiguration();
        public static final CurrentLimitsConfigs currentLimits = new CurrentLimitsConfigs();
        //Add some current limits here later look at documentation
    }   
}
