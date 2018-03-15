package org.usfirst.frc.team6239.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6239.robot.Robot;

public class GrabberRight extends Command {

    public GrabberRight() {
        requires(Robot.grabber);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void execute() {
        Robot.grabber.goRight();
    }

    protected void end() {
        Robot.grabber.stop();
    }

    protected void interrupted() {
    	Robot.grabber.stop();
        end();
    }
}
