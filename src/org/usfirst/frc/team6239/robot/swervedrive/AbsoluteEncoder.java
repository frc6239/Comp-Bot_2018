package org.usfirst.frc.team6239.robot.swervedrive;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;


public class AbsoluteEncoder implements PIDSource {
    private AnalogPotentiometer encoder;

    public AbsoluteEncoder(int encoderPort){
        encoder = new AnalogPotentiometer(encoderPort, 360.0, 0);
    }

    public double get(){
        return encoder.get();
    }


    @Override
	public void setPIDSourceType(PIDSourceType pidSourceType) {

    }

    @Override
	public PIDSourceType getPIDSourceType() {
        return PIDSourceType.kDisplacement;
    }

    @Override
	public double pidGet() {
        return encoder.get();
    }
}
