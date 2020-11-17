import javax.swing.JOptionPane;

public class primeOrNot {
public static void main(String[] args) {
String boot = JOptionPane.showInputDialog("Type in a number (example: 10)");	
int rock = Integer.parseInt(boot);
boolean isPrime = false;
for (int i = 2; i < rock; i++) {
if (rock%i == 0) {
isPrime = false;	
break;
}
else {
	isPrime = true;
}
}	

if (isPrime==false) {
	JOptionPane.showMessageDialog(null, "That number is composite");
}
else if (isPrime==true) {
	JOptionPane.showMessageDialog(null, "That number is prime");
}		
}	
}
