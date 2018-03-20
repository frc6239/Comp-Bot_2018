package org.usfirst.frc.team6239.robot;

import edu.wpi.first.wpilibj.Timer;

import org.usfirst.frc.team6239.robot.subsystems.DriveButtons;
import org.usfirst.frc.team6239.robot.subsystems.DriveSubsystem;
import org.usfirst.frc.team6239.robot.subsystems.grabba;
import org.usfirst.frc.team6239.robot.subsystems.liftsubsystem;
import org.usfirst.frc.team6239.robot.swervedrive.SwerveDrive;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;



public class Robot extends IterativeRobot {

	@Override
	public void testPeriodic() {
		Scheduler.getInstance().run();
	}



    public  static RobotMap robotmap;
    public static  grabba grabber;
    public  static OI oi;
    public static  DriveSubsystem DRIVE_SUB;
    public  static liftsubsystem liftsub;
    public  static DriveButtons drivebuttons;
	public static SwerveDrive driveTrain;
	@Override
	public void robotInit() {

		robotmap = new RobotMap();
		DRIVE_SUB = new DriveSubsystem();
		liftsub = new liftsubsystem();
		grabber = new grabba();
		drivebuttons = new DriveButtons();
		oi = new OI();
		driveTrain = new SwerveDrive(robotmap.speedController,robotmap.rotationalController,robotmap.encController);

		
	}
	
	@Override
	public void autonomousInit() {
		robotmap.navX.resetDisplacement();
		robotmap.navX.reset();
		Timer.delay(4);
		driveTrain.drive(.6, 0, 0);
		Timer.delay(2);
		driveTrain.drive(0, 0, 0);
//		
	};
	
	@Override
	public void teleopInit() {

	}
	
	@Override
	public void robotPeriodic() {
		Scheduler.getInstance().run();
		
		
	}

	@Override
	public void disabledInit() {
		
		
		
	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
		
		
	}


	@Override
	public void autonomousPeriodic() {

		
		
		
		
		
		
		Scheduler.getInstance().run();
		
	}

	
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();

		
		
	}
}
