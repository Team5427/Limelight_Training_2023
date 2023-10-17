package frc.robot;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Pose3d;
import edu.wpi.first.math.geometry.Rotation3d;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.DriverStation.Alliance;

public class LimelightMaker {

    NetworkTable table;
    final double fieldWidthMeters = Units.feetToMeters(54.0);
    final double fieldHeightMeters = Units.feetToMeters(27.0);
    
    public LimelightMaker(String name) {
        table = null; //FIXME
    }

    public boolean getTV() {
        return false; //FIXME
    }

    public double getTX() {
        return 0.0; //FIXME
    }

    public double getTY() {
        return 0.0; //FIXME
    }

    public double getTA() {
        return 0.0; //FIXME
    }

    public void toggleLights() { // slightly different - needs to change lights - u can test with deploying, enabling, and clicking 'a' button
        return; //FIXME
    }

    public int getTagID() {
        return 0; //FIXME
    }

    public Pose3d getRobotPose() { //final boss //FIXME
        // add code to convert the "botpose_wpiblue" entry into 6 seperate values - i wonder what kind of datatype botpose_wpiblue is?
        Pose3d ret = new Pose3d(0.0, 0.0, 0.0, new Rotation3d(0.0, 0.0, 0.0));
        return ret;
    }

    public boolean onBlueSide() { //returns true if bot is on the left - do math on the robot pose
        Pose2d robotPose = getRobotPose().toPose2d();
        return false; //FIXME
    }

    public boolean inCommunity() {
        boolean teamColorIsBlue = Alliance.Blue.equals(DriverStation.getAlliance());
        Pose2d robotPose = getRobotPose().toPose2d();

        return false; //FIXME

    }

}
