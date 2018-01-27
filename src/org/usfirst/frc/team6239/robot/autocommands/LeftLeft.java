package org.usfirst.frc.team6239.robot.autocommands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftLeft extends CommandGroup {
	
	public LeftLeft() {
		addSequential(new GoForward());
		addSequential(new TurnRight());
	}
}
