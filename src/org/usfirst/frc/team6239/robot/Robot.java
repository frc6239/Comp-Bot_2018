package org.usfirst.frc.team6239.robot;

import edu.wpi.first.wpilibj.Timer;

import org.usfirst.frc.team6239.robot.subsystems.DriveButtons;
import org.usfirst.frc.team6239.robot.subsystems.DriveSubsystem;
import org.usfirst.frc.team6239.robot.subsystems.grabba;
import org.usfirst.frc.team6239.robot.subsystems.liftsubsystem;
import org.usfirst.frc.team6239.robot.swervedrive.SwerveDrive;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;



public class Robot extends IterativeRobot {

	@Override
	public void testPeriodic() {
		Scheduler.getInstance().run();
	}



    public static RobotMap robotmap;
    public static grabba grabber;
    public static OI oi;
    public static DriveSubsystem DRIVE_SUB;
    public static liftsubsystem liftsub;
    public static DriveButtons drivebuttons;
	public static SwerveDrive driveTrain;
	public static NetworkTable table;
	public static NetworkTableInstance inst;
	
	public static NetworkTableEntry frontRightEnc;
	public static NetworkTableEntry backLeftEnc;
	public static NetworkTableEntry frontLeftEnc;
	public static NetworkTableEntry backRightEnc;
	public static NetworkTableEntry navXYaw;
	
	@Override
	public void robotInit() {

		robotmap = new RobotMap();
		DRIVE_SUB = new DriveSubsystem();
		liftsub = new liftsubsystem();
		grabber = new grabba();
		drivebuttons = new DriveButtons();
		oi = new OI();
		driveTrain = new SwerveDrive(robotmap.speedController,robotmap.rotationalController,robotmap.encController);
		inst = NetworkTableInstance.getDefault();
		table = inst.getTable("NET_TABLE");
		
		frontRightEnc = table.getEntry("frontRight");
		backRightEnc = table.getEntry("backRight");
		frontLeftEnc = table.getEntry("frontLeft");
		backLeftEnc = table.getEntry("backLeft");
		navXYaw = table.getEntry("Yaw");
		
		
	}
	
	@Override
	public void autonomousInit() {
		//.navX.resetDisplacement();
		robotmap.navX.reset();
		Timer.delay(4);
		driveTrain.drive(0,- .7, 0);
		Timer.delay(4.5);
		driveTrain.drive(0, 0, 0);
//		
	};
	
	@Override
	public void teleopInit() {
		//robotmap.navX.reset();
		//robotmap.navX.resetDisplacement();
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

		frontRightEnc.setDouble(robotmap.frontRightRotEnc.get());
		backLeftEnc.setDouble(robotmap.backLeftRotControl.get());
		frontLeftEnc.setDouble(robotmap.frontLeftRotControl.get());
		backRightEnc.setDouble(robotmap.backRightRotEnc.get());
		navXYaw.setDouble(robotmap.navX.getAngle());
		
	}
}
