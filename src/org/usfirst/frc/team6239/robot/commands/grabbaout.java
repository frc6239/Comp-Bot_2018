package org.usfirst.frc.team6239.robot.commands;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class grabbaout extends Command {
	
	public grabbaout() {
		requires(Robot.grabber);
	}

	@Override
	protected void execute() {
		Robot.grabber.out();
		
	}
	
	@Override
	protected void end() {
		Robot.grabber.stop();
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
