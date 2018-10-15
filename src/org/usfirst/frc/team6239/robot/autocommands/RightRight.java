package org.usfirst.frc.team6239.robot.autocommands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class RightRight extends CommandGroup {
	
	public RightRight() {
		addSequential(new GoForward());
		addSequential(new TurnLeft());
	}

}
