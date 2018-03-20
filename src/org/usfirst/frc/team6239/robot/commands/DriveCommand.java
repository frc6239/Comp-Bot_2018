package org.usfirst.frc.team6239.robot.commands;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveCommand extends Command {

	public DriveCommand() {


		requires(Robot.DRIVE_SUB);
	}

	@Override
	protected void initialize() {

	}

	@Override
	protected void execute() {

		Robot.DRIVE_SUB.drive();
		Robot.DRIVE_SUB.arms();

	}

	@Override
	protected boolean isFinished() {
		return false;
	}

}
