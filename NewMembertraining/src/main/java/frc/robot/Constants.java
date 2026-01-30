package frc.robot;

public final class Constants {

  public static final class OperatorConstants {
    // Change this to whatever USB port your Xbox controller is on (usually 0)
    public static final int kDriverControllerPort = 0;
  }

  public static final class IntakeConstants {
    public static final int kIntakeMotorID = 5; // The CAN ID, the # is temporary for now
    public static final double kDefaultIntakeSpeed = 0.6; // 60% speed 
  }
  // You can add other constant groups here later, like:
  // public static final class IntakeConstants { ... }
}