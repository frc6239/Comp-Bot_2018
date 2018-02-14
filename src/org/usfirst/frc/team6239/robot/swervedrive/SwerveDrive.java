package org.usfirst.frc.team6239.robot.swervedrive;

public class SwerveDrive {
	//TODO Change these values to proper lengths
	public double L = 22;
	public double W = 22;
	
	private WheelDrive backRight;
	private WheelDrive backLeft;
	private WheelDrive frontRight;
	private WheelDrive frontLeft;

	
	public SwerveDrive(WheelDrive frontRight, WheelDrive frontLeft, WheelDrive backLeft, WheelDrive backRight) {
		
		this.backRight = backRight;
	    this.backLeft = backLeft;
	    this.frontRight = frontRight;
	    this.frontLeft = frontLeft;
		
	}
	
	public void drive(double x1, double y1, double x2) {
		
		double r = Math.sqrt ((L * L) + (W * W));
	    y1 *= -1;

	    double a = x1 - x2 * (L / r);
	    double b = x1 + x2 * (L / r);
	    double c = y1 - x2 * (W / r);
	    double d = y1 + x2 * (W / r);
	    
	    double backRightSpeed = Math.sqrt ((a * a) + (d * d));
	    double backLeftSpeed = Math.sqrt ((a * a) + (c * c));
	    double frontRightSpeed = Math.sqrt ((b * b) + (d * d));
	    double frontLeftSpeed = Math.sqrt ((b * b) + (c * c));
	    
	    double backRightAngle = Math.atan2 (a, d) / Math.PI;
	    double backLeftAngle = Math.atan2 (a, c) / Math.PI;
	    double frontRightAngle = Math.atan2 (b, d) / Math.PI;
	    double frontLeftAngle = Math.atan2 (b, c) / Math.PI;
//	    System.out.println(frontRightSpeed);
//	    System.out.println(frontRightAngle);
//	    System.out.println(frontLeftSpeed);
//	    System.out.println(frontLeftAngle);
//	    System.out.println(backLeftSpeed);
//	    System.out.println(backLeftAngle);
//	    System.out.println(backRightSpeed);
//	    System.out.println(backRightAngle);
//	    System.out.println("asdihfa");
	    
	    //backRight.drive (backRightSpeed, backRightAngle);
	    //backLeft.drive (backLeftSpeed, backLeftAngle);
	    //frontRight.drive (frontRightSpeed, frontRightAngle);
	    frontLeft.drive (frontLeftSpeed, frontLeftAngle);
	    
	}
	
	
	public void setWheelbaseTrackwidth(double L, double W) {
		this.L = L;
		this.W = W;
	}
	
}
