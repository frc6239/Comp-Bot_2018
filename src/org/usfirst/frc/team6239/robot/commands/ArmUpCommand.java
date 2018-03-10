package org.usfirst.frc.team6239.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6239.robot.Robot;

public class ArmUpCommand extends Command {

    public ArmUpCommand() {
        requires(Robot.grabber);
    }

    @Override
    protected void execute() {
        Robot.grabber.armUp();
    }

    @Override
    protected void end() {
        Robot.grabber.stopArms();
    }

    @Override
    protected void interrupted() {
        Robot.grabber.stopArms();
        end();
    }

    protected boolean isFinished() {
        return false;
    }
}
