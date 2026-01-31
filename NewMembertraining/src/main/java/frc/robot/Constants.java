package frc.robot;

public final class Constants {

  public static final class OperatorConstants {
    // Change this to whatever USB port your Xbox controller is on (usually 0)
    public static final int kDriverControllerPort = 0;
  }

    public static class IntakeConstants {
        public static final int intakeMotorID = 5;

        public static final TalonFXConfiguration configs = new TalonFXConfiguration();

    }
    public static class ShooterConstants {
        public static final int kShooterEncoderAimId = 6;
        public static final int kShooterEncoderShootId = 7;
        public static final double kShooterRestSetpoint = 0.0;
    }
}