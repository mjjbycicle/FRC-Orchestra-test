// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.OrchestraCommand;
import frc.robot.subsystems.OrchestraSubsystem;

public class RobotContainer {
  private final OrchestraSubsystem orchestraSubsystem = new OrchestraSubsystem(6, 8, 2, 4);

  public RobotContainer() {
    configureBindings();
  }
  private void configureBindings() {
    orchestraSubsystem.setDefaultCommand(new OrchestraCommand(orchestraSubsystem));
  }
}
