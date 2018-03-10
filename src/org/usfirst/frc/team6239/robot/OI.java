package org.usfirst.frc.team6239.robot;

import org.usfirst.frc.team6239.robot.commands.grabbain;
import org.usfirst.frc.team6239.robot.commands.grabbaout;
import org.usfirst.frc.team6239.robot.commands.liftcommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	//Declare the Joysticks for the drive.
	public Joystick stickcontrollerL;
	public Joystick stickcontrollerR;
	public Joystick gamepad;
	public Button liftup;
	public Button liftdown;
	public Button grabin;
	public Button grabout;
	public Button armUp;
	public Button armDown;

	OI() {
		stickcontrollerL = new Joystick(1);
		stickcontrollerR = new Joystick(2);
		gamepad = new Joystick(0);
		liftup = new JoystickButton(gamepad, 6);
		liftup.whileHeld(new liftcommand(true));
		liftdown = new JoystickButton(gamepad, 5);
		liftdown.whileHeld(new liftcommand(false));
		grabin = new JoystickButton(gamepad, 8);
		grabout = new JoystickButton(gamepad, 7);
		grabout.whileHeld(new grabbaout());
		grabin.whileHeld(new grabbain());
	}
}
