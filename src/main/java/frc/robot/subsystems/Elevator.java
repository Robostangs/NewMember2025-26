package frc.robot.subsystems;

import com.revrobotics.sim.SparkMaxSim;
import com.revrobotics.spark.SparkLowlevel;
import com.revrobotics.spark.SparkMax;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.math.system.plant.DCMotor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
public class Elevator {
    private static Elevator mInstance;
    private final DCMotor m_elevatorGearbox = DCMotor.getNEO(1);
    private final SparkMaxSim m_motor = new SparkMax(13, SparkLowlevel.MotorType.kBrushless);

}
