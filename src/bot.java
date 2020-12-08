import org.jointheleague.graphical.robot.Robot;

public class bot {
public static void main(String[] args) {
	Robot rob = new Robot();	
	rob.setSpeed(15);
	for (int i = 0; i < 4; i++) {
		rob.move(100);
		rob.turn(360/4);
	}
}
}
