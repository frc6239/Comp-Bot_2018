package org.usfirst.frc.team6239.robot;

import org.usfirst.frc.team6239.robot.swervedrive.AbsoluteEncoder;
import org.usfirst.frc.team6239.robot.swervedrive.SwerveDrive;
import org.usfirst.frc.team6239.robot.swervedrive.WheelDrive;

import edu.wpi.first.wpilibj.DigitalInput;
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
	public Spark grabberRight;
	public Spark grabberLeft;
	public Spark movearms;
	public Spark lifterBottom;
	public Spark lifterTop;
    //public static PIDController frontRightController;
    
	//Declaring all encoders
	public AbsoluteEncoder frontRightRotEnc;
	public AbsoluteEncoder frontLeftRotEnc;
	public AbsoluteEncoder backRightRotEnc;
	public AbsoluteEncoder backLeftRotEnc;
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
	
	public DigitalInput grabberArmLimit;
	
	RobotMap() {
		
		//Finalize Spark declaration in constructor
		//probably have to use navx for extra pwm ports too
		
		frontRightSpeedControl = new Spark(2);
		frontRightRotControl = new Spark(3);
		frontLeftSpeedControl = new Spark(6);
		frontLeftRotControl = new Spark(7);
		backRightSpeedControl = new Spark(0);
		backRightRotControl = new Spark(1);
		backLeftSpeedControl = new Spark(4);
		backLeftRotControl = new Spark(5);
		
		grabberRight = new Spark(9);
		grabberLeft = new Spark(8);
		movearms = new Spark(getChannelFromPin(PinType.PWM, 2));
		lifterTop = new Spark(getChannelFromPin(PinType.PWM, 1));
		lifterBottom = new Spark(getChannelFromPin(PinType.PWM, 0));
		movearms.setSafetyEnabled(false);
		lifterTop.setSafetyEnabled(false);
		lifterBottom.setSafetyEnabled(false);
		//System.out.println("Wheeldrive working");
		//If we use the navx we will be able to have enough DIO Ports to support all the encoders
		
		frontRightRotEnc = new AbsoluteEncoder(1);
		frontLeftRotEnc = new AbsoluteEncoder(3);
		backRightRotEnc = new AbsoluteEncoder(0);
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
		
		grabberArmLimit = new DigitalInput(0);
		
		
	}
	
    public enum PinType { DigitalIO, PWM, AnalogIn, AnalogOut };
    
    public final int MAX_NAVX_MXP_DIGIO_PIN_NUMBER      = 9;
    public final int MAX_NAVX_MXP_ANALOGIN_PIN_NUMBER   = 3;
    public final int MAX_NAVX_MXP_ANALOGOUT_PIN_NUMBER  = 1;
    public final int NUM_ROBORIO_ONBOARD_DIGIO_PINS     = 10;
    public final int NUM_ROBORIO_ONBOARD_PWM_PINS       = 10;
    public final int NUM_ROBORIO_ONBOARD_ANALOGIN_PINS  = 4;
    
    /* getChannelFromPin( PinType, int ) - converts from a navX MXP */
    /* Pin type and number to the corresponding RoboRIO Channel     */
    /* Number, which is used by the WPI Library functions.          */
    
    public int getChannelFromPin( PinType type, int io_pin_number ) throws IllegalArgumentException {
        int roborio_channel = 0;
        if ( io_pin_number < 0 ) {
            throw new IllegalArgumentException("Error:  navX MXP I/O Pin #");
        }
        switch ( type ) {
        case DigitalIO:
            if ( io_pin_number > MAX_NAVX_MXP_DIGIO_PIN_NUMBER ) {
                throw new IllegalArgumentException("Error:  Invalid navX MXP Digital I/O Pin #");
            }
            roborio_channel = io_pin_number + NUM_ROBORIO_ONBOARD_DIGIO_PINS + 
                              (io_pin_number > 3 ? 4 : 0);
            break;
        case PWM:
            if ( io_pin_number > MAX_NAVX_MXP_DIGIO_PIN_NUMBER ) {
                throw new IllegalArgumentException("Error:  Invalid navX MXP Digital I/O Pin #");
            }
            roborio_channel = io_pin_number + NUM_ROBORIO_ONBOARD_PWM_PINS;
            break;
        case AnalogIn:
            if ( io_pin_number > MAX_NAVX_MXP_ANALOGIN_PIN_NUMBER ) {
                throw new IllegalArgumentException("Error:  Invalid navX MXP Analog Input Pin #");
            }
            roborio_channel = io_pin_number + NUM_ROBORIO_ONBOARD_ANALOGIN_PINS;
            break;
        case AnalogOut:
            if ( io_pin_number > MAX_NAVX_MXP_ANALOGOUT_PIN_NUMBER ) {
                throw new IllegalArgumentException("Error:  Invalid navX MXP Analog Output Pin #");
            }
            roborio_channel = io_pin_number;            
            break;
        }
        return roborio_channel;
    }
}
