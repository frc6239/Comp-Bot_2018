package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;

public class liftsubsystem extends Subsystem{
	
	private boolean liftup = true;
	
	
	protected void initDefaultCommand() {
		
	}
	
	public void liftup() {
		
		Robot.robotmap.lifter.set(1);
		
	}
	
	public void liftdown() {
		
		Robot.robotmap.lifter.set(-1);
		
	}
	
	public void shoot() {
		
		Robot.robotmap.grabber.set(-1);
		
	}

	public void stop() {
		
		Robot.robotmap.grabber.set(0);
		Robot.robotmap.lifter.set(0);
		
	}

}
