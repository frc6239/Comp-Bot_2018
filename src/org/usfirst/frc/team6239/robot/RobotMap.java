package org.usfirst.frc.team6239.robot;

import org.usfirst.frc.team6239.robot.swervedrive.AbsoluteEncoder;
import org.usfirst.frc.team6239.robot.swervedrive.SwerveDrive;
import org.usfirst.frc.team6239.robot.swervedrive.WheelDrive;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.Spark;

import static edu.wpi.first.wpilibj.SerialPort.Port.kMXP;


public class RobotMap {


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

	public AbsoluteEncoder frontRightRotEnc;
	public AbsoluteEncoder frontLeftRotEnc;
	public AbsoluteEncoder backRightRotEnc;
	public AbsoluteEncoder backLeftRotEnc;

	public  AHRS navX;

	public PIDController frontRightController;
	public PIDController frontLeftController;
	public PIDController backRightController;
	public PIDController backLeftController;
	
	public Spark[] speedController;
	public Spark[] rotationalController;
	public PIDController[] encController;



	public double P=.014;
	public double I=.0065;
	public double D=.008;


	public DigitalInput grabberArmLimit;
	
	RobotMap() {

		frontRightSpeedControl = new Spark(4);
		frontRightRotControl = new Spark(5);
		frontLeftSpeedControl = new Spark(0);
		frontLeftRotControl = new Spark(1);
		backRightSpeedControl = new Spark(6);
		backRightRotControl = new Spark(7);
		backLeftSpeedControl = new Spark(2);
		backLeftRotControl = new Spark(3);
		
		speedController = new Spark[]{ frontRightSpeedControl,frontLeftSpeedControl,backRightSpeedControl,backLeftSpeedControl};
		rotationalController = new Spark[]{frontRightRotControl,frontLeftRotControl,backRightRotControl,backLeftRotControl};






		grabberRight = new Spark(9);
		grabberLeft = new Spark(8);
		movearms = new Spark(getChannelFromPin(PinType.PWM, 2));
		lifterTop = new Spark(getChannelFromPin(PinType.PWM, 1));
		lifterBottom = new Spark(getChannelFromPin(PinType.PWM, 0));
		movearms.setSafetyEnabled(false);
		lifterTop.setSafetyEnabled(false);
		lifterBottom.setSafetyEnabled(false);

		
		frontRightRotEnc = new AbsoluteEncoder(1);
		frontLeftRotEnc = new AbsoluteEncoder(0);
		backRightRotEnc = new AbsoluteEncoder(3);
		backLeftRotEnc = new AbsoluteEncoder(2);

		frontRightController = new PIDController(P, I, D, frontRightRotEnc, frontRightRotControl);
		frontLeftController = new PIDController(P, I, D, frontLeftRotEnc, frontLeftRotControl);
		backRightController = new PIDController(P, I, D, backRightRotEnc, backRightRotControl);
		backLeftController = new PIDController(P, I, D, backLeftRotEnc, backLeftRotControl);
		
		encController = new PIDController[]{frontRightController,frontLeftController,backRightController,backLeftController};

	
		
		
		grabberArmLimit = new DigitalInput(0);
		

		navX = new AHRS(kMXP);
		
	}
	
    public enum PinType { DigitalIO, PWM, AnalogIn, AnalogOut };
    
    public final int MAX_NAVX_MXP_DIGIO_PIN_NUMBER      = 9;
    public final int MAX_NAVX_MXP_ANALOGIN_PIN_NUMBER   = 3;
    public final int MAX_NAVX_MXP_ANALOGOUT_PIN_NUMBER  = 1;
    public final int NUM_ROBORIO_ONBOARD_DIGIO_PINS     = 10;
    public final int NUM_ROBORIO_ONBOARD_PWM_PINS       = 10;
    public final int NUM_ROBORIO_ONBOARD_ANALOGIN_PINS  = 4;
    

    
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
  