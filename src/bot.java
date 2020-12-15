import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class bot {
public static void main(String[] args) {
	String A = JOptionPane.showInputDialog("What shape should be drawn (triangle, square, of circle)?");	
	if (A.equals("triangle")){
	drawTriangle();	
	}
	if (A.equals("square")){
		drawSquare();	
		}
	else if (A.equals("circle")){
		drawCircle();	
		}
	
}
public static void drawSquare() {
	Robot rob = new Robot();
	rob.penDown();
	rob.setRandomPenColor();
	rob.setSpeed(15);
	
	for (int i = 0; i < 4; i++) {
		
		
		rob.move(100);
		rob.turn(360/4);
		
	}
	rob.hide();
}
	public static void drawTriangle() {
		Robot rob = new Robot();
		rob.penDown();
		rob.setRandomPenColor();
		rob.setSpeed(15);
		for (int i = 0; i < 3; i++) {
		
			rob.move(100);
			rob.turn(360/3);
		
		}
		rob.hide();
	}
		public static void drawCircle() {
			Robot rob = new Robot();
			rob.penDown();
			rob.setRandomPenColor();
	
			for (int i = 0; i < 347; i++) {
				
				rob.setSpeed(500);
				rob.move(1);
				rob.turn(360/347);
			
			
			}
			rob.hide();
		}
}

