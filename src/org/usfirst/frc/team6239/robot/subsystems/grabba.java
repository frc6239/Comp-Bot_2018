package org.usfirst.frc.team6239.robot.subsystems;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team6239.robot.Robot;
import org.usfirst.frc.team6239.robot.RobotMap;

public class grabba extends Subsystem {


    public void initDefaultCommand() {
    }

    public void open() {
    	Robot.robotmap.grabberLeft.set(1);
    	Robot.robotmap.grabberRight.set(-1);
    }

    public void close() {
    	Robot.robotmap.grabberLeft.set(-1);
    	Robot.robotmap.grabberRight.set(1);
    }

    public void stop() {
    	Robot.robotmap.grabberLeft.set(0);
    	Robot.robotmap.grabberRight.set(0);
    }
}
