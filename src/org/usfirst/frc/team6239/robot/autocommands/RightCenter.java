package org.usfirst.frc.team6239.robot.autocommands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class RightCenter extends CommandGroup {
	
	public RightCenter() {
		addSequential(new GoRight(5));
		addSequential(new GoForward());
		addSequential(new TurnLeft());
	}

}
