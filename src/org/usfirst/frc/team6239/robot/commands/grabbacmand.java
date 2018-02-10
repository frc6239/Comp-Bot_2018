package org.usfirst.frc.team6239.robot.commands;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class grabbacmand extends Command {

	boolean in;
	
	public grabbacmand(boolean in) {
		this.in = in;
	}
	
	protected void initialize() {
		Robot.grabber.open();
	}

	protected void execute() {
		if (in) {
			Robot.grabber.in();
		} else {
			Robot.grabber.out();
		}
	}
	
	protected void end() {
		Robot.grabber.stop();
	}
	
	protected void interrupted() {
		end();
	}

	protected boolean isFinished() {
		
		return false;
	}

}
