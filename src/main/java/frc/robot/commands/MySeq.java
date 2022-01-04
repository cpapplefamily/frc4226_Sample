// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.My_Wrist;
import frc.robot.subsystems.my_drivretrain;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class MySeq extends SequentialCommandGroup {
  /**
   * Creates a new MySeq.
   * 
   * @param m_Wrist
   * @param m_my_drivretrain
   */
  public MySeq(My_Wrist m_Wrist, my_drivretrain m_my_drivretrain) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(new my_Wrist_To_Setpoint(0, m_Wrist),
    new My_Drive_Distance(24, .3, 0, m_my_drivretrain),
    new my_Wrist_To_Setpoint(10,m_Wrist));
  }
}
