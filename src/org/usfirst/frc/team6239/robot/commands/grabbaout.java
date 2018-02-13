package org.usfirst.frc.team6239.robot.commands;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class grabbaout extends Command {
	
	public grabbaout() {
		requires(Robot.grabber);
	}

	protected void execute() {
		Robot.grabber.out();
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
