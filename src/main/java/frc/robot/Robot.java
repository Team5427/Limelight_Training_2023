// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.Field2d;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */

  Field2d field = new Field2d();
  LimelightMaker limelight;
  
  @Override
  public void robotInit() {
    limelight = new LimelightMaker(""); //FIXME
    SmartDashboard.putData(field);
  }

  @Override
  public void robotPeriodic() {
    field.setRobotPose(limelight.getRobotPose().toPose2d());
    SmartDashboard.putBoolean("TV", limelight.getTV());
    if (limelight.getTV()) {
      SmartDashboard.putNumber("TA", limelight.getTA());
      SmartDashboard.putNumber("TX", limelight.getTX());
      SmartDashboard.putNumber("TY", limelight.getTY());
      SmartDashboard.putNumber("Target ID", limelight.getTagID());  
      SmartDashboard.putBoolean("Is on blue side", limelight.onBlueSide());
      SmartDashboard.putBoolean("Is in community", limelight.inCommunity());
    }
  }

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {}

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
