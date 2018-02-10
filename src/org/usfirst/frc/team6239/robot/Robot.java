
package org.usfirst.frc.team6239.robot;

import org.usfirst.frc.team6239.robot.subsystems.DriveSubsystem;
import org.usfirst.frc.team6239.robot.subsystems.grabba;
import org.usfirst.frc.team6239.robot.subsystems.liftsubsystem;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.command.Scheduler;



public class Robot extends IterativeRobot {

	//declare subsystems
    public static OI oi;
    public static RobotMap robotmap;
    public static DriveSubsystem DRIVE_SUB;
    public static liftsubsystem liftsub;
    public static grabba grabber;
    //declare PIDControllers
    public static PIDController armscontroller;
    //variables for drive, google it if you want to know what they mean
    public static double wheelbase = 0;
    public static double trackwidth = 0;
	
	public void robotInit() {
		robotmap = new RobotMap();


		//Declare Subsystems in robotInit, like a constructor
		oi = new OI();
		DRIVE_SUB = new DriveSubsystem();
		liftsub = new liftsubsystem();
		grabber = new grabba();
		//Declare PIDControllers in robotInit, /\
		armscontroller = new PIDController(1, 0, 0, robotmap.armEncoder, robotmap.movearms);
		//RobotMap.driveTrain.setWheelbaseTrackwidth(wheelbase, trackwidth);
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
		//Scheduler.getInstance().run();
		
		
	}

	
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		
		
	}

	
}
