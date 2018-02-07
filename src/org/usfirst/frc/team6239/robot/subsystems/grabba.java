package org.usfirst.frc.team6239.robot.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team6239.robot.Robot;

public class grabba extends Subsystem {


    public void initDefaultCommand() {
    }

    public void open() {
    	Robot.robotmap.grabber.set(1);
    }

    public void close() {
    	Robot.robotmap.grabber.set(-1);
    }

    public void stop() {
    	Robot.robotmap.grabber.set(0);
    }
}
