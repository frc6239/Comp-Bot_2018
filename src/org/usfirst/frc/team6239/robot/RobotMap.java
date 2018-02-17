package org.usfirst.frc.team6239.robot;

import org.usfirst.frc.team6239.robot.swervedrive.AbsoluteEncoder;
import org.usfirst.frc.team6239.robot.swervedrive.SwerveDrive;
import org.usfirst.frc.team6239.robot.swervedrive.WheelDrive;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.Spark;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	//Declaring all sparks
	
	public Spark frontRightRotControl;
	public Spark frontRightSpeedControl;
	public Spark frontLeftRotControl;
	public Spark frontLeftSpeedControl;
	public Spark backRightRotControl;
	public Spark backRightSpeedControl;
	public Spark backLeftRotControl;
	public Spark backLeftSpeedControl;
	public Spark grabber;
	public Spark movearms;
	public Spark lifter;
	public Spark lifter2;
    //public static PIDController frontRightController;
    
	//Declaring all encoders
	public AbsoluteEncoder frontRightRotEnc;
	public AbsoluteEncoder frontLeftRotEnc;
	public AbsoluteEncoder backRightRotEnc;
	public AbsoluteEncoder backLeftRotEnc;
	public Encoder armEncoder;
	//Declare SwerveWheels
	
	public PIDController frontRightController;
	public PIDController frontLeftController;
	public PIDController backRightController;
	public PIDController backLeftController;
	
	public static WheelDrive frontRight;
	public static WheelDrive frontLeft;
	public static WheelDrive backRight;
	public static WheelDrive backLeft;
	//Declare SwerveDrive
	public SwerveDrive driveTrain;
	
	RobotMap() {
		
		//Finalize Spark declaration in constructor
		//probably have to use navx for extra pwm ports too
		
		frontRightSpeedControl = new Spark(0);
		frontRightRotControl = new Spark(1);
		frontLeftSpeedControl = new Spark(2);
		frontLeftRotControl = new Spark(3);
		backRightSpeedControl = new Spark(6);
		backRightRotControl = new Spark(7);
		backLeftSpeedControl = new Spark(4);
		backLeftRotControl = new Spark(5);
		
		grabber = new Spark(8);
		movearms = new Spark(11);
		lifter2 = new Spark(10);
		lifter = new Spark(9);
		//System.out.println("Wheeldrive working");
		//If we use the navx we will be able to have enough DIO Ports to support all the encoders
		
		frontRightRotEnc = new AbsoluteEncoder(0);
		frontLeftRotEnc = new AbsoluteEncoder(1);
		backRightRotEnc = new AbsoluteEncoder(3);
		backLeftRotEnc = new AbsoluteEncoder(2);
		
		frontRightController = new PIDController(.006, .004, 0, frontRightRotEnc, frontRightRotControl);
		frontLeftController = new PIDController(.006, .004, 0, frontLeftRotEnc, frontLeftRotControl);
		backRightController = new PIDController(.006, .004, 0, backRightRotEnc, backRightRotControl);
		backLeftController = new PIDController(.006, .004, 0, backLeftRotEnc, backLeftRotControl);
		
		//Finalize Encoder Declaration in constructor
		//armEncoder = new Encoder(0, 1);
		//Finalize declaration of WheelDrives
		frontRight = new WheelDrive(frontRightRotControl, frontRightSpeedControl, frontRightController);
		frontLeft = new WheelDrive(frontLeftRotControl, frontLeftSpeedControl, frontLeftController);
		backRight = new WheelDrive(backRightRotControl, backRightSpeedControl, backRightController);
		backLeft = new WheelDrive(backLeftRotControl, backLeftSpeedControl, backLeftController);
		//Finalize declaration of SwerveDrive
		driveTrain = new SwerveDrive(frontRight, frontLeft, backLeft, backRight);
		
		
	}
}
