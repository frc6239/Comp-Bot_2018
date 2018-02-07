package org.usfirst.frc.team6239.robot;

import org.usfirst.frc.team6239.robot.swervedrive.AbsoluteEncoder;
import org.usfirst.frc.team6239.robot.swervedrive.SwerveDrive;
import org.usfirst.frc.team6239.robot.swervedrive.WheelDrive;

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
	public Spark lifter;
	
	//Declaring all encoders
	public AbsoluteEncoder frontRightRotEnc;
	public AbsoluteEncoder frontLeftRotEnc;
	public AbsoluteEncoder backRightRotEnc;
	public AbsoluteEncoder backLeftRotEnc;
	//Declare SwerveWheels
	public static WheelDrive frontRight;
	public static WheelDrive frontLeft;
	public static WheelDrive backRight;
	public static WheelDrive backLeft;
	//Declare SwerveDrive
	public SwerveDrive driveTrain;
	private Robot robot = new Robot();
	
	RobotMap() {
		
		//Finalize Spark declaration in constructor
		//probably have to use navx for extra pwm ports too
		
		frontRightSpeedControl = new Spark(0);
		frontRightRotControl = new Spark(1);
		frontLeftSpeedControl = new Spark(2);
		frontLeftRotControl = new Spark(3);
		backRightSpeedControl = new Spark(4);
		backRightRotControl = new Spark(5);
		backLeftSpeedControl = new Spark(6);
		backLeftRotControl = new Spark(7);
		grabber = new Spark(8);
		lifter = new Spark(9);
		//If we use the navx we will be able to have enough DIO Ports to support all the encoders
		//Finalize Encoder Declaration in constructor
		//Finalize declaration of WheelDrives
		frontRight = new WheelDrive(frontRightRotControl, frontRightSpeedControl, 0);
		frontLeft = new WheelDrive(frontLeftRotControl, frontLeftSpeedControl, 1);
		backRight = new WheelDrive(backRightRotControl, backRightSpeedControl, 2);
		backLeft = new WheelDrive(backLeftRotControl, backLeftSpeedControl, 3);
		//Finalize declaration of SwerveDrive
		driveTrain = new SwerveDrive(frontRight, frontLeft, backLeft, backRight);
		
		
	}
}
