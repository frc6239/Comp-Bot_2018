package org.usfirst.frc.team6239.robot.commands;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ClimbUpCommand extends Command {

	@Override
	protected void execute() {
		Robot.liftsub.climbUp();
	}

	@Override
	protected void end() {
		Robot.liftsub.stop();
	}

	@Override
	protected void interrupted() {
		Robot.liftsub.stop();
		end();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
