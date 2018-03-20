package org.usfirst.frc.team6239.robot.commands;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveButtonCommand extends Command {

	public DriveButtonCommand() {
		requires(Robot.drivebuttons);
	}
	
	@Override
	protected void initialize() {

	}
	@Override
	protected void execute(){
		
		
		Robot.drivebuttons.robotCentric();
		
	}
	@Override
	protected void end(){
		Robot.drivebuttons.fieldCentric();

	}
	

	@Override
	protected boolean isFinished() {

		return false;
	}

}
