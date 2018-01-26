package org.usfirst.frc.team6239.robot.subsystems;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6239.robot.RobotMap;

public class grabba extends Subsystem {

	Spark mauddah = RobotMap.;

    public void initDefaultCommand() {
    }

    public void open() {
    	motor.set(1);
    }

    public void close() {
    	motor.set(-1);
    }

    public void stop() {
    	motor.set(0);
    }
}
