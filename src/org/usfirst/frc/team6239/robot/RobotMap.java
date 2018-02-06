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
	public WheelDrive frontRight;
	public WheelDrive frontLeft;
	public WheelDrive backRight;
	public WheelDrive backLeft;
	//Declare SwerveDrive
	public SwerveDrive driveTrain;
	
	RobotMap() {
		//Finalize Spark declaration in constructor
		//probably have to use navx for extra pwm ports too
		frontRightRotControl = new Spark(0);
		frontRightSpeedControl = new Spark(1);
		frontLeftRotControl = new Spark(2);
		frontLeftSpeedControl = new Spark(3);
		backRightRotControl = new Spark(4);
		backRightSpeedControl = new Spark(5);
		backLeftRotControl = new Spark(6);
		backLeftSpeedControl = new Spark(7);
		grabber = new Spark(8);
		lifter = new Spark(9);
		//If we use the navx we will be able to have enough DIO Ports to support all the encoders
		//Finalize Encoder Declaration in constructor
		frontRightRotEnc = new AbsoluteEncoder(0);
		frontLeftRotEnc = new AbsoluteEncoder(1);
		backRightRotEnc = new AbsoluteEncoder(2);
		backLeftRotEnc = new AbsoluteEncoder(3);
		//Finalize declaration of SwerveWheels
		frontRight = new WheelDrive(frontRightRotControl, frontRightSpeedControl, Robot.frontRightRotation);
		frontLeft = new WheelDrive(frontLeftRotControl, frontLeftSpeedControl, Robot.frontLeftRotation);
		backRight = new WheelDrive(backRightRotControl, backRightSpeedControl, Robot.backRightRotation);
		backLeft = new WheelDrive(backLeftRotControl, backLeftSpeedControl, Robot.backLeftRotation);
		//Finalize declaration of SwerveDrive
		driveTrain = new SwerveDrive(frontRight, frontLeft, backLeft, backRight);
		
	}
}
