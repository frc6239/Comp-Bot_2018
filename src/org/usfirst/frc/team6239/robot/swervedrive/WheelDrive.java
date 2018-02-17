package org.usfirst.frc.team6239.robot.swervedrive;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.Spark;

public class WheelDrive {
	
	public Spark angleMotor;
	public Spark speedMotor;
	public PIDController pidController;
	
	private final double MAX_VOLTS = 5;
	
	public WheelDrive(Spark angleMotor, Spark speedMotor, PIDController pidController) {
		this.angleMotor = angleMotor;
		this.speedMotor = speedMotor;
		//pidController = new PIDController (.01, .001, 0, new AbsoluteEncoder(encoder), this.angleMotor);
		this.pidController = pidController;
		this.pidController.setOutputRange(-1, 1);
		this.pidController.setInputRange(-180f, 180f);
	    this.pidController.setContinuous();
	    this.pidController.enable();
	    pidController.setSetpoint(0);
	    //System.out.println("Wheeldrive working");
	}
	
	public void update (double speed, double angle) {
	    speedMotor.set(speed);
	    //angle = -90;
//	    if (angle < 0) {
//	    	angle += 360;
//	    }

//	    double setpoint = angle * (MAX_VOLTS * 0.5) + (MAX_VOLTS * 0.5); // Optimization offset can be calculated here.
//	    if (setpoint < 0) {
//	        setpoint = MAX_VOLTS + setpoint;
//	    }
//	    if (setpoint > MAX_VOLTS) {
//	        setpoint = setpoint - MAX_VOLTS;
//	    }

	    pidController.setSetpoint(angle);
	    System.out.println(angle);
	}


}
