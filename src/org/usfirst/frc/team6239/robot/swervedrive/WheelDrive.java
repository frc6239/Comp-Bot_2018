package org.usfirst.frc.team6239.robot.swervedrive;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.Spark;

public class WheelDrive {
	
	public Spark angleMotor;
	public Spark speedMotor;
	public PIDController pidController;
	
	private final double MAX_VOLTS = 4.95;
	
	public WheelDrive(Spark angleMotor, Spark speedMotor, PIDController pidController) {
		this.angleMotor = angleMotor;
		this.speedMotor = speedMotor;
		//pidController = new PIDController (.01, .001, 0, new AbsoluteEncoder(encoder), this.angleMotor);
		this.pidController = pidController;
		this.pidController.setOutputRange(-1, 1);
		this.pidController.setInputRange(0f, 360f);
	    this.pidController.setContinuous();
	    this.pidController.enable();
	    pidController.setSetpoint(0);
	    //System.out.println("Wheeldrive working");
	}
	
	public void update (double speed, double angle) {
	    speedMotor.set(speed);

	    double setpoint = angle * (MAX_VOLTS * 0.5) + (MAX_VOLTS * 0.5); // Optimization offset can be calculated here.
//	    if (setpoint < 0) {
//	        setpoint = MAX_VOLTS + setpoint;
//	    }
//	    if (setpoint > MAX_VOLTS) {
//	        setpoint = setpoint - MAX_VOLTS;
//	    }

	    pidController.setSetpoint(setpoint);
	    //System.out.println("Wheeldrive working");
	}


}
