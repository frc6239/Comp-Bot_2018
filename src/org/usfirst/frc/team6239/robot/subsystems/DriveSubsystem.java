package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.Robot;
import org.usfirst.frc.team6239.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSubsystem extends Subsystem {

	protected void initDefaultCommand() {

		setDefaultCommand(new DriveCommand());



	}

	public void drive() {

		Robot.driveTrain.drive(Robot.oi.stickcontrollerL.getX(), Robot.oi.stickcontrollerL.getY(), Robot.oi.stickcontrollerR.getX());
		
	}

	public void arms() {
		Robot.robotmap.movearms.set(-Robot.oi.gamepad.getRawAxis(1) * .5);
	}

}
