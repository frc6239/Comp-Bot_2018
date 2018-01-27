package org.usfirst.frc.team6239.robot;

import org.usfirst.frc.team6239.robot.swervedrive.AbsoluteEncoder;
import org.usfirst.frc.team6239.robot.swervedrive.SwerveDrive;
import org.usfirst.frc.team6239.robot.swervedrive.SwerveWheel;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.PIDController;

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
	public Spark grabberLeft;
	public Spark grabberRight;
	public Spark lifter;
	
	//Declaring all encoders
	public Encoder frontRightRotEnc;
	public AbsoluteEncoder frontRightSpeedEnc;
	public Encoder frontLeftRotEnc;
	public AbsoluteEncoder frontLeftSpeedEnc;
	public Encoder backRightRotEnc;
	public AbsoluteEncoder backRightSpeedEnc;
	public Encoder backLeftRotEnc;
	public AbsoluteEncoder backLeftSpeedEnc;
	//Declare SwerveWheels
	public SwerveWheel frontRight;
	public SwerveWheel frontLeft;
	public SwerveWheel backRight;
	public SwerveWheel backLeft;
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
		grabberLeft = new Spark(8);
		grabberRight = new Spark(9);
		lifter = new Spark(10);
		//If we use the navx we will be able to have enough DIO Ports to support all the encoders
		//Finalize Encoder Declaration in constructor
		frontRightRotEnc = new Encoder(0, 1);
		frontRightSpeedEnc = new AbsoluteEncoder(2);
		frontLeftRotEnc = new Encoder(3, 4);
		frontLeftSpeedEnc = new AbsoluteEncoder(5);
		backRightRotEnc = new Encoder(6, 7);
		backRightSpeedEnc = new AbsoluteEncoder(8);
		backLeftRotEnc = new Encoder(9, 10);
		backLeftSpeedEnc = new AbsoluteEncoder(11);
		//Finalize declaration of SwerveWheels
		frontRight = new SwerveWheel(Robot.frontRightRotation, Robot.frontRightSpeed);
		frontLeft = new SwerveWheel(Robot.frontLeftRotation, Robot.frontLeftSpeed);
		backRight = new SwerveWheel(Robot.backRightRotation, Robot.backRightSpeed);
		backLeft = new SwerveWheel(Robot.backLeftRotation, Robot.backLeftSpeed);
		//Finalize declaration of SwerveDrive
		driveTrain = new SwerveDrive(frontRight, frontLeft, backLeft, backRight);
		
	}
}
