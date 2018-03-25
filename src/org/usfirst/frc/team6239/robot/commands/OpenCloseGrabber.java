package org.usfirst.frc.team6239.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class OpenCloseGrabber extends Command {

	boolean open;
	
	public OpenCloseGrabber(boolean open) {
		this.open = open;
	}
	
	@Override
	protected void initialize() {
		if (open) {
			//Robot.grabber.
		} else {
			//Robot.grabba.close();
		}
	}

	@Override
	protected void execute() {
		if (open) {
			//Robot.grabber.open();
		} else {
			//Robot.grabber.close();
		}
	}

	@Override
	protected void end() {
		//Robot.grabber.stoparm();
	}

	
	@Override
	protected void interrupted() {
		end();
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

}
