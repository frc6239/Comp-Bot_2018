package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;

public class liftsubsystem extends Subsystem{
		
	
	protected void initDefaultCommand() {
		
	}
	
	public void liftup() {
		
		Robot.robotmap.lifterTop.set(.75);
		Robot.robotmap.lifterBottom.set(-0.65);

		
	}
	
	public void liftdown() {
		
		Robot.robotmap.lifterTop.set(-.75);
		Robot.robotmap.lifterBottom.set(0.45);

	}

	public void stop() {
		
		Robot.robotmap.lifterTop.set(-.2);
		Robot.robotmap.lifterBottom.set(-.2);
		
	}
	
	public void climbUp() {
		
		Robot.robotmap.lifterBottom.set(-.5);
		
	}

}
