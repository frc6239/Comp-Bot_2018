package org.usfirst.frc.team6239.robot.commands;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class grabbain extends Command {

	public grabbain() {

	}
	
	@Override
	protected void execute() {
		Robot.grabber.in();
	}

	
	@Override
	protected void interrupted() {
		Robot.grabber.stop();
		end();
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

}
