import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot bob=new Robot();
		bob.setSpeed(1000);
		bob.turn(180);
		bob.penDown();
		bob.move(200);
		bob.turn(180);
		bob.move(200);
		bob.turn(90);
		for(int i=0;i<180;i++) {
			bob.turn(1);
			bob.move(1);
			
		}
		bob.turn(240);
		bob.move(110);
	}
	

}
