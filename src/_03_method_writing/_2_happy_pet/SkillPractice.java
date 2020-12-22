package _03_method_writing._2_happy_pet;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {
	SkillPractice skills = new SkillPractice();
    skills.skill1();
    skills.skill2();
    skills.skill3();
    skills.skill4();
    skills.skill5();
}
    void skill1() {
    	// Use pop-ups for the following.
    	// Ask the user how many dimes they have
String UNO1 = JOptionPane.showInputDialog("How many dimes do you have?");
int UNO2 = Integer.parseInt(UNO1);
    	UNO2 *=10; 
    	JOptionPane.showMessageDialog(null, "You have " + UNO2 + " cents");
// Tell them how many cents they have (hint multiply by 10)
    	// Ask the user how tall they are (inches)
    	String UNO3 = JOptionPane.showInputDialog("How tall are you (in inches)?");
    	int UNO4 = Integer.parseInt(UNO3);
    	    	if (UNO4 < 32) {
    	    	JOptionPane.showMessageDialog(null, "You need to eat more protein!!!");
    	    	}
    	// If they are shorter than 36 inches, tell them to eat their Wheaties


    	}

    	void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
for (int i = 0; i < 30; i++) {
	if (i%3 ==0) {
		System.out.println(i);
	}
}




    	}

    	void skill3() { // Get a random number that is less than 20 and print it to the console 
    		Random ran = new Random();
   Random dom = new Random();
  int TRES1 = ran.nextInt(20);
System.out.println(TRES1);
  int TRES2 = ran.nextInt(10);
System.out.println(TRES2);
    	// Get another random number that is less than 10 and print it to the console 
int TRES3 = TRES1 - TRES2;
JOptionPane.showMessageDialog(null, " " + TRES3 + " ");
    	// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 



    	}

    	void skill4() { // In a pop-up, ask the user for the city they live in 
String $1 = JOptionPane.showInputDialog("What city do you live in?");
if ($1.equals("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in Ameirica's Finest City");
}
else {
	JOptionPane.showMessageDialog(null, "Move to San Diego.");
}
    	// If they answered "San Diego", tell them they live in America's Finest City  

    	// Otherwise, tell them to move to San Diego 
String $2 = JOptionPane.showInputDialog("How many cars do your family have?");
int $3 == Integer.parseInt($2);
if ($3 == 0) {
	JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
}
else if ($3 == 1) {
	JOptionPane.showInputDialog(null, "What model is it?");
}
else if ($3 > 1) {
	JOptionPane.showInputDialog(null, "I bet your cars have" + x4 + "wheels.");
}

    	// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 



    	// If there is 1 car, use a pop-up to display the make/model of the car 



    	// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 



    	}

    	void skill5() { // In a pop-up, ask the user for the name of their school 



    	// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 



    	}
    	}

