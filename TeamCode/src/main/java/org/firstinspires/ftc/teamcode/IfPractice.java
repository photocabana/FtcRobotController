package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class IfPractice extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        /*  boolean aButton = gamepad1.a;  // press TRUE, depress FALSE
        // true or false
        if (aButton){
            telemetry.addData("A Button", "Pressed!");
        }
        else {  // otherwise
            telemetry.addData("A Button", "Not Pressed");
        }
        telemetry.addData("A Button State", aButton);
         */


        double leftY = gamepad1.left_stick_y;

        if (leftY < 0.1 && leftY > -0.1) {
            telemetry.addData("Left Stick", "In Dead Zone");
        }
/*
        if (leftY < 0){
            telemetry.addData("Left Stick", "is Negative");
        }
        else if (leftY > 0.5) {
        telemetry.addData("Left Stick", "Greater than 50%");
        }
        else if (leftY > 0) {
            telemetry.addData("Left Stick", "Is greater that O");
        }
        else {
            telemetry.addData("Left Stick", "is Zero!");
        } */


        telemetry.addData("Left Stick value", leftY);
    }
}


/*
And - &&
Or - ||
Not - !
 */