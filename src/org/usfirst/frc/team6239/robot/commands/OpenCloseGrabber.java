package org.usfirst.frc.team6239.robot.commands;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class OpenCloseGrabber extends Command {

	boolean open;
	
	public OpenCloseGrabber(boolean open) {
		this.open = open;
	}
	
	protected void initialize() {
		if (open) {
			Robot.grabber.open();
		} else {
			Robot.grabber.close();
		}
	}

	protected void execute() {
		if (open) {
			Robot.grabber.open();
		} else {
			Robot.grabber.close();
		}
	}

	protected void end() {
		Robot.grabber.stoparm();
	}

	
	protected void interrupted() {
		end();
	}

	protected boolean isFinished() {
		return false;
	}

}
