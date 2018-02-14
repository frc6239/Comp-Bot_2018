package org.usfirst.frc.team6239.robot.commands;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class grabbain extends Command {

	public grabbain() {
		//requires(Robot.grabber);
	}
	
	protected void execute() {
		Robot.grabber.in();
	}

	
	protected void interrupted() {
		Robot.grabber.stop();
		end();
	}

	protected boolean isFinished() {
		return false;
	}

}
