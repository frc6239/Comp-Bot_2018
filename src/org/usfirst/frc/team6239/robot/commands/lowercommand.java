package org.usfirst.frc.team6239.robot.commands;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class lowercommand extends Command {

    public lowercommand() {
        requires(Robot.liftsub);
    }


    @Override
	protected void initialize() {
    }


    @Override
	protected void execute() {
    	Robot.liftsub.liftdown();
    }


    @Override
	protected boolean isFinished() {
        return false;
    }


    @Override
	protected void end() {
    	Robot.liftsub.stop();
    }

    @Override
	protected void interrupted() {
    	end();
    }
}
