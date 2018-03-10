package org.usfirst.frc.team6239.robot.swervedrive;

/**
 * Created by Eric Engelhart on 3/17/2017.
 */
public class SwerveDrive {

	public final double L = 21;
	public final double W = 22;
	
	WheelDrive frontRight, frontLeft, backLeft, backRight;
	
	public SwerveDrive(WheelDrive frontRight, WheelDrive frontLeft, WheelDrive backLeft, WheelDrive backRight) {
		this.frontRight = frontRight;
		this.frontLeft = frontLeft;
		this.backLeft = backLeft;
		this.backRight = backRight;
	}
	
	public void drive (double x, double y, double z, double speed, double angle) {
	    double r = Math.sqrt ((L * L) + (W * W));

		x = -(-y) * Math.cos(angle) + x * Math.sin(angle);
		y = -y * Math.cos(angle) + x * Math.cos(angle);
		y=-y;

	    
	    double a = x - z * (L / r);
	    double b = x + z * (L / r);
	    double c = y - z * (W / r);
	    double d = y + z * (W / r);

	    double backRightSpeed = Math.sqrt ((a * a) + (d * d));
	    double backLeftSpeed = Math.sqrt ((a * a) + (c * c));
	    double frontRightSpeed = Math.sqrt ((b * b) + (d * d));
	    double frontLeftSpeed = Math.sqrt ((b * b) + (c * c));
	    
	    double max = frontLeftSpeed;
	    if (frontLeftSpeed > max) {
	    	frontLeftSpeed = max;
		} if (frontRightSpeed > max) {
	    	frontRightSpeed = max;
		} if (backLeftSpeed > max) {
	    	backLeftSpeed = max;
		} if (backRightSpeed > max) {
	    	backRightSpeed = max;
		}
		if (max > 1) {
	    	frontLeftSpeed = frontLeftSpeed/max;
	    	frontRightSpeed = frontRightSpeed/max;
	    	backLeftSpeed = backLeftSpeed/max;
	    	backRightSpeed = backRightSpeed/max;
		}
	    
	    backRightSpeed *= speed;
	    backLeftSpeed *= speed;
	    frontRightSpeed *= speed;
	    frontLeftSpeed *= speed;

	    double backRightAngle = Math.atan2 (d, a) * (180/ Math.PI);
	    double backLeftAngle = Math.atan2 (c, a) * (180/ Math.PI);
	    double frontRightAngle = Math.atan2 (d, b) * (180/ Math.PI);
	    double frontLeftAngle = Math.atan2 (c, b) * (180/ Math.PI);
	    
//	    backRightAngle += 90;
//	    backLeftAngle += 90;
//	    frontLeftAngle += 90;
//	    frontRightAngle += 90;
	    
	    System.out.println("x1: " + x + " y1: " +  y + " x2: " + z);
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
