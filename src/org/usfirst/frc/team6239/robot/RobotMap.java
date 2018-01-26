package org.usfirst.frc.team6239.robot;

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
	
	//Declaring all encoders
	public Encoder frontRightRotEnc;
	public Encoder frontRightSpeedEnc;
	public Encoder frontLeftRotEnc;
	public Encoder frontLeftSpeedEnc;
	public Encoder backRightRotEnc;
	public Encoder backRightSpeedEnc;
	public Encoder backLeftRotEnc;
	public Encoder backLeftSpeedEnc;
	//Declare SwerveWheels
	public SwerveWheel frontRight;
	public SwerveWheel frontLeft;
	public SwerveWheel backRight;
	public SwerveWheel backLeft;
	//Declare SwerveDrive
	public SwerveDrive driveTrain;
	
	RobotMap() {
		//Finalize Spark declaration in constructor
		frontRightRotControl = new Spark(0);
		frontRightSpeedControl = new Spark(1);
		frontLeftRotControl = new Spark(2);
		frontLeftSpeedControl = new Spark(3);
		backRightRotControl = new Spark(4);
		backRightSpeedControl = new Spark(5);
		backLeftRotControl = new Spark(6);
		backLeftSpeedControl = new Spark(7);
		//If we use the navx we will be able to have enough DIO Ports to support all the encoders
		//Finalize Encoder Declaration in constructor
		frontRightRotEnc = new Encoder(0, 1);
		frontRightSpeedEnc = new Encoder(2, 3);
		frontLeftRotEnc = new Encoder(4, 5);
		frontLeftSpeedEnc = new Encoder(6, 7);
		backRightRotEnc = new Encoder(8, 9);
		backRightSpeedEnc = new Encoder(10, 11);
		backLeftRotEnc = new Encoder(12, 13);
		backLeftSpeedEnc = new Encoder(14, 15);
		//Finalize declaration of SwerveWheels
		frontRight = new SwerveWheel(Robot.frontRightRotation, Robot.frontRightSpeed);
		frontLeft = new SwerveWheel(Robot.frontLeftRotation, Robot.frontLeftSpeed);
		backRight = new SwerveWheel(Robot.backRightRotation, Robot.backRightSpeed);
		backLeft = new SwerveWheel(Robot.backLeftRotation, Robot.backLeftSpeed);
		//Finalize declaration of SwerveDrive
		driveTrain = new SwerveDrive(frontRight, frontLeft, backLeft, backRight);
		
	}
}
