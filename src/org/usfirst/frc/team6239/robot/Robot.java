
package org.usfirst.frc.team6239.robot;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.Timer;
import org.usfirst.frc.team6239.robot.subsystems.DriveSubsystem;
import org.usfirst.frc.team6239.robot.subsystems.grabba;
import org.usfirst.frc.team6239.robot.subsystems.liftsubsystem;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

import static edu.wpi.first.wpilibj.SerialPort.Port.kMXP;

public class Robot extends IterativeRobot {

	@Override
	public void testPeriodic() {
		Scheduler.getInstance().run();
	}


	//declare subsystems
    public static RobotMap robotmap;
    public static PIDController armscontroller;
	public static grabba grabber;
    public static OI oi;
    public static DriveSubsystem DRIVE_SUB;
    public static liftsubsystem liftsub;
    public static AHRS navX;
    //public static NetworkTable table;  
    public static double P;
    //declare PIDControllers
    //variables for drive, google it if you want to know what they mean
    public static double wheelbase = 0;
    public static double trackwidth = 0;

	public void robotInit() {

		navX = new AHRS(kMXP);

		robotmap = new RobotMap();
		//armscontroller = new PIDController(1, 0, 0, robotmap.armEncoder, robotmap.movearms);
		DRIVE_SUB = new DriveSubsystem();
		liftsub = new liftsubsystem();
		grabber = new grabba();
		oi = new OI();
		//table = NetworkTable.getTable("Smartdashboard");
		System.out.println(DRIVE_SUB);
		//Declare Subsystems in robotInit, like a constructor
		//Declare PIDControllers in robotInit, /\
		//RobotMap.driveTrain.setWheelbaseTrackwidth(wheelbase, trackwidth);
		
		//table.putDouble("P_CONTROL", 0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void autonomousInit() {

		Robot.robotmap.driveTrain.drive(0, .4, 0,
				1 , 0);
		Timer.delay(4);
		Robot.robotmap.driveTrain.drive(0, 0, 0,
				1 , 0);
		
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
		//P = table.getDouble("P_CONTROL", 0);
		
		
	}
	


	
	
	
	//Robot
	//speed = NetworkTable.getTable("Super awesome coolness Xtreme").getDouble("speed", 0);
}
