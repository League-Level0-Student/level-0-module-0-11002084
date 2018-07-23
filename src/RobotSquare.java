package strings_and_dialogs;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot bob=new Robot();
bob.moveTo(-200, 300);



        // 3. Put the robot's pen down
bob.penDown();

        // 6. Make the robot move as fast as possible
bob.setSpeed(1000);
for(int i=0; i<100; i++) {

        // 5. Do everything below here 4 times
for(int k=0; k<360; k++) {
	bob.setRandomPenColor();
	bob.setPenWidth(5);

        //         2. Move your robot 200 pixels
bob.move(3);

        //         4. Turn the robot 90 degrees to the right (90 degrees)
bob.turn(1);

    }
bob.penUp();
bob.turn(90);
bob.move(150);
bob.turn(270);
bob.penDown();
}
    }
}
