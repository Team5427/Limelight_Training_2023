package frc.robot;

import edu.wpi.first.math.geometry.Pose3d;
import edu.wpi.first.math.geometry.Rotation3d;
import edu.wpi.first.networktables.NetworkTable;

public class LimelightMaker {

    NetworkTable table;
    
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

}
