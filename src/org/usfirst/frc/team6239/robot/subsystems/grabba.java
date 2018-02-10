package org.usfirst.frc.team6239.robot.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team6239.robot.Robot;

public class grabba extends Subsystem {


    public void initDefaultCommand() {
    		
    }

    public void in() {
    	Robot.robotmap.grabber.set(1);
    }

    public void out() {
    	Robot.robotmap.grabber.set(-1);
    }

    public void stop() {
    	Robot.robotmap.grabber.set(0);
    }
    
    public void open() {
    	Robot.robotmap.armEncoder.reset();
    	Robot.armscontroller.enable();
    	Robot.armscontroller.setSetpoint(20);
    }
    
    public void close() {
    	Robot.robotmap.armEncoder.reset();
    	Robot.armscontroller.enable();
    	Robot.armscontroller.setSetpoint(-20);
    }
    
    public void stoparm() {
    	Robot.robotmap.armEncoder.reset();
    	Robot.armscontroller.enable();
    	Robot.armscontroller.setSetpoint(0);
    }
}
