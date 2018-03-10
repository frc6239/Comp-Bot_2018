package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;

public class liftsubsystem extends Subsystem{
		
	
	protected void initDefaultCommand() {
		
	}
	
	public void liftup() {
		
		Robot.robotmap.lifterTop.set(1);
		Robot.robotmap.lifterBottom.set(0.75);
		
	}
	
	public void liftdown() {
		
		Robot.robotmap.lifterTop.set(-1);
		Robot.robotmap.lifterBottom.set(-0.75);
		
	}

	public void stop() {
		
		Robot.robotmap.lifterTop.set(0);
		Robot.robotmap.lifterBottom.set(0);
		
	}

}
