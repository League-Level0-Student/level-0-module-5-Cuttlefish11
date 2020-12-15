package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;


	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public class HappyPet {
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog("What type of pet would you like to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		int PetJoy = 0;
		JOptionPane.showMessageDialog(null, "Pet Happiness: " + PetJoy);
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			for (int i = 0; i < args.length; i++) {
int task = JOptionPane.showOptionDialog(null, "How would you like to make your pet happy?", "Pet Happieness", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Clean up the pet's poo", "Amputate the pet's wings", "Feed the pet monkey food" }, null);
if (task.equals ("Clean up the pet's poo")) {
	PetJoy ++;
}

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
JOptionPane.showMessageDialog(null, "Pet Happiness: " + PetJoy);
	}
	}
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}