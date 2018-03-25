package org.usfirst.frc.team6239.robot.swervedrive;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.Spark;

public class WheelDrive {
	
	public Spark angleMotor;
	public Spark speedMotor;
	public PIDController pidController;
	public double rotationalAngle;
	private final double MAX_VOLTS = 5;
	
	public WheelDrive(Spark angleMotor, Spark speedMotor, PIDController pidController) {
		this.angleMotor = angleMotor;
		this.speedMotor = speedMotor;

		this.pidController = pidController;
		this.pidController.setOutputRange(-1, 1);
		this.pidController.setInputRange(-180f, 180f);
	    this.pidController.setContinuous();
	    this.pidController.enable();
	    this.pidController.setSetpoint(0);

	}
	
	public void setSpeed (double speed) {
		
	    this.speedMotor.set((speed*.7));


	    
	}
	public void setAngle(double Ang){
	this.pidController.setSetpoint(Ang);

	}
	public double getSpeed(){
		return this.speedMotor.get();

	}
	public double getRAngle(){

		return rotationalAngle;
	}
	public void setRAngle(double RA){
		rotationalAngle = RA;
	}

}
