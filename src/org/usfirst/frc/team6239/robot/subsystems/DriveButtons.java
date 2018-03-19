package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveButtons extends Subsystem {

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public void fieldCentric() {
		Robot.robotmap.driveTrain.setFieldCentric();
	//	System.out.println(Robot.robotmap.driveTrain.getFieldCentric());
	}
	
	public void robotCentric() {
		Robot.robotmap.driveTrain.setRobotCentric();
		//System.out.println(Robot.robotmap.driveTrain.getFieldCentric());

	}
	
	public void navXReset() {
		Robot.navX.reset();
	}

}
