package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveButtons extends Subsystem {

	@Override
	protected void initDefaultCommand() {

		
	}
	
	public void fieldCentric() {
		Robot.driveTrain.setFieldCentric();

	}
	
	public void robotCentric() {
		Robot.driveTrain.setRobotCentric();


	}
	
	public void navXReset() {
		Robot.robotmap.navX.reset();
	}

}
