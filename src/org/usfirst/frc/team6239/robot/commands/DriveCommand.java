package org.usfirst.frc.team6239.robot.commands;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveCommand extends Command {

	public DriveCommand() {
		//Link to subsystem
		//TODO maybe remove this if not work, had problems in past
		requires(Robot.DRIVE_SUB);
	}

	@Override
	protected void initialize() {

	}

	@Override
	protected void execute() {
		//Execute the drive command in subsystem
		Robot.DRIVE_SUB.drive();
		Robot.DRIVE_SUB.arms();
		//System.out.println("Working");
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

}
