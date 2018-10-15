package org.usfirst.frc.team6239.robot.autocommands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftRight extends CommandGroup {
	
	public LeftRight() {
		addSequential(new GoLeft(10));
		addSequential(new GoForward());
		addSequential(new TurnRight());
	}

}
