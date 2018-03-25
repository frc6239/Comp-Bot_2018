package org.usfirst.frc.team6239.robot.commands;



import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ResetNavCommand extends Command {

	@Override
	protected boolean isFinished() {
	
		return false;
	}
	@Override
	protected void execute() {
	//	Robot.robotmap.navX.resetDisplacement();
		Robot.robotmap.navX.reset();

	}

}
