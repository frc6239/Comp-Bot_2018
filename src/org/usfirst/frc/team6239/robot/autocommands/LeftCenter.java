package org.usfirst.frc.team6239.robot.autocommands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftCenter extends CommandGroup {
	
	public LeftCenter() {
		addSequential(new GoLeft(5));
		addSequential(new GoForward());
		addSequential(new TurnRight());
	}
	
}
