
package org.usfirst.frc.team6239.robot;

import org.usfirst.frc.team6239.robot.subsystems.DriveSubsystem;
import org.usfirst.frc.team6239.robot.subsystems.grabba;
import org.usfirst.frc.team6239.robot.subsystems.liftsubsystem;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;



public class Robot extends IterativeRobot {

	//declare subsystems
    public static RobotMap robotmap;
    public static PIDController armscontroller;
	public static grabba grabber;
    public static OI oi;
    public static DriveSubsystem DRIVE_SUB;
    public static liftsubsystem liftsub;
    //declare PIDControllers
    //variables for drive, google it if you want to know what they mean
    public static double wheelbase = 0;
    public static double trackwidth = 0;
	public void robotInit() {
		robotmap = new RobotMap();
		armscontroller = new PIDController(1, 0, 0, robotmap.armEncoder, robotmap.movearms);
		DRIVE_SUB = new DriveSubsystem();
		liftsub = new liftsubsystem();
		grabber = new grabba();
		oi = new OI();
		System.out.println("Wheeldrive working");
		//Declare Subsystems in robotInit, like a constructor
		//Declare PIDControllers in robotInit, /\
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
