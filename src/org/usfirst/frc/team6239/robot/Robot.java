
package org.usfirst.frc.team6239.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;



public class Robot extends IterativeRobot {

    public static OI oi;
    public static RobotMap robotmap;
	
	public void robotInit() {
		
		oi = new OI();
		robotmap = new RobotMap();
		
	}

	
	public void autonomousInit() {
		
		
		
	}

	
	public void teleopInit() {
		
		
		
	}

	
	public void robotPeriodic() {
		Scheduler.getInstance().run();
		
		
	}
	
	
	
	public void disabledInit() {
		
		
		
	}


	public void disabledPeriodic() {
		Scheduler.getInstance().run();
		
		
	}


	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		
		
	}

	
	public void teleopPeriodic() {
		
		
		
	}

	
}
