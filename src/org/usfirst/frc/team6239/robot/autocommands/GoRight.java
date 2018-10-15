package org.usfirst.frc.team6239.robot.autocommands;

import edu.wpi.first.wpilibj.command.Command;

public class GoRight extends Command {
	int distance;
	
	public GoRight(int distance) {
		this.distance = distance;
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
