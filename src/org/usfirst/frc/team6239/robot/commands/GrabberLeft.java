package org.usfirst.frc.team6239.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6239.robot.Robot;

public class GrabberLeft extends Command {

    public GrabberLeft() {
        requires(Robot.grabber);
    }

    @Override
	protected boolean isFinished() {
        return false;
    }

    @Override
	protected void execute() {
        Robot.grabber.goLeft();
    }

    @Override
	protected void end() {
        Robot.grabber.stop();
    }

    @Override
	protected void interrupted() {
        Robot.grabber.stop();
        end();
    }
}
