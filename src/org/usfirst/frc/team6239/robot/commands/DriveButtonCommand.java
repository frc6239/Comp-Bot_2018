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
	protected void execute(){
		
		
		Robot.drivebuttons.robotCentric();
		//System.out.println("Robotcentirco");
	}
	protected void end(){
		Robot.drivebuttons.fieldCentric();
		//System.out.println("fieldcentirco");
	}
	

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
