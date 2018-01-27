package org.usfirst.frc.team6239.robot.autocommands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class RightLeft extends CommandGroup {
	
	public RightLeft() {
		addSequential(new GoRight(10));
		addSequential(new GoForward());
		addSequential(new TurnLeft());
	}

}
