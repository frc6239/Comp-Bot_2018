package org.usfirst.frc.team6239.robot.commands;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class liftcommand extends Command {

	//TODO PG27 Gearbox
	private boolean liftup = true;
	public liftcommand(boolean liftup) {
		this.liftup = liftup;
	}
	
	protected void initialize() {
			if(liftup = true) {
		Robot.liftsub.liftup();
		} else {
			Robot.liftsub.liftdown();
		}
	}

	
	protected void execute() {
		if(liftup = false) {
			Robot.liftsub.liftup();
			} else {
				Robot.liftsub.liftdown();
			}
	}

	
	protected void end() {
		Robot.liftsub.stop();
	}

	
	protected void interrupted() {
		end();
	}

	protected boolean isFinished() {
		
		return false;
	}

}
