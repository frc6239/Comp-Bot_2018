package org.usfirst.frc.team6239.robot.swervedrive;

/**
 * Created by Eric Engelhart on 3/17/2017.
 */
public class SwerveDrive {

	public final double L = 14;
	public final double W = 22;
	
	WheelDrive frontRight, frontLeft, backLeft, backRight;
	
	public SwerveDrive(WheelDrive frontRight, WheelDrive frontLeft, WheelDrive backLeft, WheelDrive backRight) {
		this.frontRight = frontRight;
		this.frontLeft = frontLeft;
		this.backLeft = backLeft;
		this.backRight = backRight;
	}
	
	public void drive (double x1, double y1, double x2) {
	    double r = Math.sqrt ((L * L) + (W * W));
	    //y1 *= -1;

	    double a = x1 - x2 * (L / r);
	    double b = x1 + x2 * (L / r);
	    double c = y1 - x2 * (W / r);
	    double d = y1 + x2 * (W / r);

	    double backRightSpeed = Math.sqrt ((a * a) + (d * d));
	    double backLeftSpeed = Math.sqrt ((a * a) + (c * c));
	    double frontRightSpeed = Math.sqrt ((b * b) + (d * d));
	    double frontLeftSpeed = Math.sqrt ((b * b) + (c * c));
	    
	    backRightSpeed *= .4;
	    backLeftSpeed *= .4;
	    frontRightSpeed *= .4;
	    frontLeftSpeed *= .4;

	    double backRightAngle = Math.atan2 (d, a) * (180/ Math.PI);
	    double backLeftAngle = Math.atan2 (c, a) * (180/ Math.PI);
	    double frontRightAngle = Math.atan2 (d, b) * (180/ Math.PI);
	    double frontLeftAngle = Math.atan2 (c, b) * (180/ Math.PI);
	    
	    System.out.println("x1: " + x1 + " y1: " +  y1 + " x2: " + x2);
	    System.out.println("a: " + a + " b: " + b + " c: " + c + " d: " + d);
	    System.out.println("PI: " + Math.PI);
	    System.out.println("atan2(a, d): " + Math.atan2(b, d));
	    System.out.println("Back Right Angle: " + backRightAngle);
	    System.out.println("Back Left Angle: " + backLeftAngle);
	    System.out.println("Front Right Angle: " + frontRightAngle);
	    System.out.println("Front Left Angle: " + frontLeftAngle);
	    
	    
	    
	    
	    backRight.update (backRightSpeed, backRightAngle);
	    backLeft.update (backLeftSpeed, backLeftAngle);
	    frontRight.update (frontRightSpeed, frontRightAngle);
	    frontLeft.update (frontLeftSpeed, frontLeftAngle);
	    
	}
}
