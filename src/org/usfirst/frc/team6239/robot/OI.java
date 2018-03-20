package org.usfirst.frc.team6239.robot;

import org.usfirst.frc.team6239.robot.commands.DriveButtonCommand;
import org.usfirst.frc.team6239.robot.commands.GrabberLeft;
import org.usfirst.frc.team6239.robot.commands.GrabberRight;
import org.usfirst.frc.team6239.robot.commands.grabbain;
import org.usfirst.frc.team6239.robot.commands.grabbaout;
import org.usfirst.frc.team6239.robot.commands.liftcommand;
import org.usfirst.frc.team6239.robot.commands.lowercommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class OI {

	public Joystick stickcontrollerL;
	public Joystick stickcontrollerR;
	public Joystick gamepad;
	public Button liftup;
	public Button liftdown;
	public Button grabin;
	public Button grabout;
	public Button grabLeft;
	public Button grabRight;
	public Button switchRobotMode;

	OI() {
		stickcontrollerL = new Joystick(1);
		stickcontrollerR = new Joystick(2);
		gamepad = new Joystick(0);
		liftup = new JoystickButton(gamepad, 6);
		liftup.whileHeld(new liftcommand());
		liftdown = new JoystickButton(gamepad, 5);
		liftdown.whileHeld(new lowercommand());
		grabin = new JoystickButton(gamepad, 3);
		grabout = new JoystickButton(gamepad, 2);
		grabout.whileHeld(new grabbaout());
		grabin.whileHeld(new grabbain());
		grabLeft = new JoystickButton(gamepad, 7);
		grabRight = new JoystickButton(gamepad, 8);
		grabLeft.whileHeld(new GrabberLeft());
		grabRight.whileHeld(new GrabberRight());
		switchRobotMode = new JoystickButton(stickcontrollerR, 1);
		switchRobotMode.whileHeld(new DriveButtonCommand());
		
	}
}
