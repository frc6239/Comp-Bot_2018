package org.usfirst.frc.team6239.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6239.robot.Robot;

public class GrabberLeft extends Command {

    public GrabberLeft() {
        requires(Robot.grabber);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void execute() {
        Robot.grabber.goLeft();
    }

    protected void end() {
        Robot.grabber.stop();
    }

    protected void interrupted() {
        Robot.grabber.stop();
        end();
    }
}
