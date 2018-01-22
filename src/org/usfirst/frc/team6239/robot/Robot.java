
package org.usfirst.frc.team6239.robot;

import org.usfirst.frc.team6239.robot.subsystems.DriveSubsystem;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.command.Scheduler;




public class Robot extends IterativeRobot {

    public static OI oi;
    public static RobotMap robotmap;
    public static DriveSubsystem DRIVE_SUB;
    public static PIDController frontRightRotation;
    public static PIDController frontRightSpeed;
    public static PIDController frontLeftSpeed;
    public static PIDController frontLeftRotation;
    public static PIDController backRightSpeed;
    public static PIDController backRightRotation;
    public static PIDController backLeftSpeed;
    public static PIDController backLeftRotation;
    public static double wheelbase = 0;
    public static double trackwidth = 0;
	
	public void robotInit() {
		
		//Declare Subsystems in robotInit, like a constructor
		oi = new OI();
		robotmap = new RobotMap();
		DRIVE_SUB = new DriveSubsystem();
		//Declare PIDControllers in robotInit, /\
		frontRightRotation = new PIDController(0.1, 0.1, 0, robotmap.frontRightRotEnc, robotmap.frontRightRotControl);
		frontRightSpeed = new PIDController(0.1, 0.1, 0, robotmap.frontRightSpeedEnc, robotmap.frontRightSpeedControl);
		frontLeftSpeed = new PIDController(0.1, 0.1, 0, robotmap.frontLeftSpeedEnc, robotmap.frontLeftSpeedControl);
		frontLeftRotation = new PIDController(0.1, 0.1, 0, robotmap.frontLeftRotEnc, robotmap.frontLeftRotControl);
		backRightSpeed = new PIDController(0.1, 0.1, 0, robotmap.backRightSpeedEnc, robotmap.backRightSpeedControl);
		backRightRotation = new PIDController(0.1, 0.1, 0, robotmap.backRightRotEnc, robotmap.backRightRotControl);
		backLeftSpeed = new PIDController(0.1, 0.1, 0, robotmap.backLeftSpeedEnc, robotmap.backLeftSpeedControl);
		backLeftRotation = new PIDController(0.1, 0.1, 0, robotmap.backLeftRotEnc, robotmap.backLeftRotControl);
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
		
		
		
	}

	
}
