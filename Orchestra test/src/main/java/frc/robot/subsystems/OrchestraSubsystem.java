package frc.robot.subsystems;

import com.ctre.phoenix6.Orchestra;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class OrchestraSubsystem extends SubsystemBase{
    private final Orchestra orchestra;

    public OrchestraSubsystem(int... motorIDs){
        this.orchestra = new Orchestra();
        for (int i : motorIDs){
            orchestra.addInstrument(new TalonFX(i));
        }
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
