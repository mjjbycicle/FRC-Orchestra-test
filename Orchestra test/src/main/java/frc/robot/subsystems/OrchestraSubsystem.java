package frc.robot.subsystems;

import com.ctre.phoenix6.Orchestra;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class OrchestraSubsystem extends SubsystemBase{
    private final TalonFX motor;
    private final Orchestra orchestra;

    public OrchestraSubsystem(){
        motor = new TalonFX(Constants.ORCHESTA_MOTOR);
        orchestra = new Orchestra();
        orchestra.addInstrument(motor);
    }

    public void loadSong(){
        orchestra.loadMusic("Mii-Channel-Theme.chrp");
    }
    
    public void play(){
        orchestra.play();
    }

    public void pause(){
        orchestra.pause();
    }

    public void stop(){
        orchestra.stop();
    }

    public double getTime(){
        return orchestra.getCurrentTime();
    }
}
