package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.OrchestraSubsystem;

public class OrchestraCommand extends Command{
    private final OrchestraSubsystem orchestraSubsystem;

    public OrchestraCommand(OrchestraSubsystem orchestraSubsystem){
        this.orchestraSubsystem = orchestraSubsystem;
    }

    @Override
    public void initialize(){
        orchestraSubsystem.pause();;
    }

    @Override
    public void execute(){
        orchestraSubsystem.play();
    }

    @Override
    public void end(boolean interrupted){
        orchestraSubsystem.pause();
    }

    @Override
    public boolean isFinished(){
        return false;
    }
}
