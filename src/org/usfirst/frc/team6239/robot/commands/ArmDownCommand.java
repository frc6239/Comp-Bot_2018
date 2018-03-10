package org.usfirst.frc.team6239.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6239.robot.Robot;

public class ArmDownCommand extends Command {

    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void execute() {
        Robot.grabber.armDown();
    }

    @Override
    protected void end() {
        Robot.grabber.stopArms();
    }

    @Override
    protected void interrupted() {
        Robot.grabber.stopArms();
    }
}
