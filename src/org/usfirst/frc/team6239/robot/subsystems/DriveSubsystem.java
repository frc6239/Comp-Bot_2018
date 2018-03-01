package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.Robot;
import org.usfirst.frc.team6239.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSubsystem extends Subsystem {

	protected void initDefaultCommand() {
		//Link to command and keep it running throughout the match, so it doesn't need a
		//button bound to it
		setDefaultCommand(new DriveCommand());
		//System.out.println("Working1");


	}
	//Start driving
	public void drive() {
		//System.out.println("i;fajalds;kjf;lkasjdsadg[oiasdjg[ijaseofdisa[d9if");
		//Robot.robotmap.driveTrain.drive(0, 0, 0);
		Robot.robotmap.driveTrain.drive(Robot.oi.stickcontrollerL.getX(), Robot.oi.stickcontrollerL.getY(), Robot.oi.stickcontrollerR.getX(),
				Robot.oi.stickcontrollerL.getZ() , Robot.navX.getAngle());
	}
}
