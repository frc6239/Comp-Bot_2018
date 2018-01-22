package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.Robot;
import org.usfirst.frc.team6239.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSubsystem extends Subsystem {

	protected void initDefaultCommand() {
		//Link to command and keep it running throughout the match, so it doesn't need a
		//button bound to it
		setDefaultCommand(new DriveCommand());


	}
	//Start driving
	public void drive() {
		Robot.robotmap.driveTrain.drive(Robot.oi.stickcontrollerL, Robot.oi.stickcontrollerR);
	}
}
