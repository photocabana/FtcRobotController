package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

// @TeleOp
@Disabled
@Autonomous
public class HelloWorld extends OpMode {
    
    @Override
    public void init() {
        telemetry.addData("Hello","World");
    }

    @Override
    public void loop() {

    }

    // Single Line Comment

    /* Multi
    Line
    Comment
     */
}
