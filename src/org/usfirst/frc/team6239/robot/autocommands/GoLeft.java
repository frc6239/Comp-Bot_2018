package org.usfirst.frc.team6239.robot.autocommands;

import edu.wpi.first.wpilibj.command.Command;

public class GoLeft extends Command {
	
	int distance;
	
	public GoLeft(int distance) {
		this.distance = distance;
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
