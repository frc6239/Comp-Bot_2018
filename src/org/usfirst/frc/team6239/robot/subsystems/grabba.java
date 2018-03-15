package org.usfirst.frc.team6239.robot.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team6239.robot.Robot;

public class grabba extends Subsystem {


    public void initDefaultCommand() {
    		
    }

    public void in() {
    	Robot.robotmap.grabberLeft.set(0.5);
    	Robot.robotmap.grabberRight.set(0.5);
    }

    public void out() {
    	Robot.robotmap.grabberLeft.set(-0.5);
    	Robot.robotmap.grabberRight.set(-0.5);
    }

    public void stop() {
    	Robot.robotmap.grabberLeft.set(0);
    	Robot.robotmap.grabberRight.set(0);
    }
    
    public void goLeft() {
    	Robot.robotmap.grabberLeft.set(.5);
    }
    
    public void goRight() {
    	Robot.robotmap.grabberRight.set(.5);
    }
}
