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
        Robot.robotmap.grabberRight.set(-.5);
    }

    protected void end() {
        Robot.robotmap.grabberRight.set(0);
    }

    protected void interrupted() {
        Robot.robotmap.grabberRight.set(0);
        end();
    }
}
