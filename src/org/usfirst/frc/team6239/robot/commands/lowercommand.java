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


    protected void initialize() {
    }


    protected void execute() {
    	Robot.liftsub.liftdown();
    }


    protected boolean isFinished() {
        return false;
    }


    protected void end() {
    	Robot.liftsub.stop();
    }

    protected void interrupted() {
    	end();
    }
}
