import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
	public static void main(String[] args) {
		Robot bob=new Robot();
		String color=JOptionPane.showInputDialog("What is your favorite color?");
		JOptionPane.showMessageDialog(null, color+" is also my favorite color!");
		bob.penDown();
		bob.setSpeed(1000);
		bob.hide();
		if(color.equals("red")) {
			bob.setPenColor(255, 0, 0);
		}
		else if(color.equals("green")) {
			bob.setPenColor(0,255, 0);
		}
		else if(color.equals("blue")) {
			bob.setPenColor(0,0,255);
		}
		else {
			JOptionPane.showMessageDialog(null, "Since your color isn't in the database, a random color will be selected.");
			bob.setRandomPenColor();
		}
		for(int i=0; i<3; i++) {
		bob.turn(120);
		bob.move(50);
		}
	}
}
