package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;

public class liftsubsystem extends Subsystem{

	protected void initDefaultCommand() {
		
		
		
	}
	
	public void liftup() {
		
		
		
	}
	
	public void liftdown() {
		
		
		
	}
	
	public void shoot() {
		
		Robot.robotmap.grabberLeft.set(1);
		Robot.robotmap.grabberRight.set(-1);
		
	}

	public void stop() {
		
		Robot.robotmap.grabberLeft.set(0);
		Robot.robotmap.grabberRight.set(0);
		
	}

}
