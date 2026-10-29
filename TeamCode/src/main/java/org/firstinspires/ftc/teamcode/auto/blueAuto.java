package org.firstinspires.ftc.teamcode.auto;

import com.pedropathing.follower.Follower;
import org.firstinspires.ftc.teamcode.pedro.Constants;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.pedropathing.api.PoseFactory;
import com.pedropathing.math.Pose;

@Autonomous
public class blueAuto extends OpMode {

    private Follower follower;
    private final PoseFactory p = PoseFactory.degrees();
    private final Pose startPose = p.of(24, 24, 0);
    private final Pose park = p.of(48, 48, 90);

    @Override
    public void init() {
        follower = Constants.create(hardwareMap);
        follower.setPose(startPose);
    }

    @Override
    public void start() {

    }

    @Override
    public void loop() {

    }
}