
package org.usfirst.frc.team6239.robot;

import org.usfirst.frc.team6239.robot.subsystems.DriveSubsystem;
import org.usfirst.frc.team6239.robot.subsystems.liftsubsystem;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.command.Scheduler;



public class Robot extends IterativeRobot {

	public static PIDController frontRightRotation;
    public static PIDController frontLeftRotation;
    public static PIDController backRightRotation;
    public static PIDController backLeftRotation;

	//declare subsystems
    public static OI oi;
    public static RobotMap robotmap;
    public static DriveSubsystem DRIVE_SUB;
    public static liftsubsystem liftsub;
    //declare PIDControllers
    //variables for drive, google it if you want to know what they mean
    public static double wheelbase = 0;
    public static double trackwidth = 0;
	
	public void robotInit() {
		robotmap = new RobotMap();

		frontRightRotation = new PIDController(0.1, 0.1, 0, robotmap.frontRightRotEnc, robotmap.frontRightRotControl);
		frontLeftRotation = new PIDController(0.1, 0.1, 0, robotmap.frontLeftRotEnc, robotmap.frontLeftRotControl);
		backRightRotation = new PIDController(0.1, 0.1, 0, robotmap.backRightRotEnc, robotmap.backRightRotControl);
		backLeftRotation = new PIDController(0.1, 0.1, 0, robotmap.backLeftRotEnc, robotmap.backLeftRotControl);
		//Declare Subsystems in robotInit, like a constructor
		oi = new OI();
		DRIVE_SUB = new DriveSubsystem();
		liftsub = new liftsubsystem();
		//Declare PIDControllers in robotInit, /\
		robotmap.frontRight.wheelInit();
		robotmap.frontLeft.wheelInit();
		robotmap.backRight.wheelInit();
		robotmap.backLeft.wheelInit();
		robotmap.driveTrain.setWheelbaseTrackwidth(wheelbase, trackwidth);
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
		Scheduler.getInstance().run();
		
		
	}

	
}
