package org.usfirst.frc.team6239.robot.swervedrive;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.Spark;

public class WheelDrive {
	
	private Spark angleMotor;
	private Spark speedMotor;
	private PIDController pidController;
	
	private final double MAX_VOLTS = 4.95;
	
	public WheelDrive(Spark angleMotor, Spark speedMotor, PIDController pidController) {
		this.angleMotor = angleMotor;
		this.speedMotor = speedMotor;
		this.pidController = pidController;
		
	}
	
	public void wheelInit() {
		pidController.setOutputRange(-1, 1);
	    pidController.setContinuous();
	    pidController.enable();
	}
	
	public void drive (double speed, double angle) {
	    speedMotor.set(speed);

	    double setpoint = angle * (MAX_VOLTS * 0.5) + (MAX_VOLTS * 0.5); // Optimization offset can be calculated here.
	    if (setpoint < 0) {
	        setpoint = MAX_VOLTS + setpoint;
	    }
	    if (setpoint > MAX_VOLTS) {
	        setpoint = setpoint - MAX_VOLTS;
	    }

	    pidController.setSetpoint (setpoint);
	}


}
