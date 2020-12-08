import javax.swing.JOptionPane;

public class AwsomeYetBoring {
public static void main(String[] args) {
for (int i = 0; i < 101; i++) {
System.out.println(i);	
}	
for (int i = 100; i > -1; i--) {
System.out.println(i);	
}
for (int i = 2; i < 101; i++) {
if (i%2 == 0) {
	System.out.println(i);	
}
}	
for (int i = 1; i < 100; i++) {
if (i%2 == 0) {
	}
else {
	System.out.println(i);
}
}
for (int i = 1; i < 501; i++) {
if (i%2 == 0) {
	System.out.println(i + " is even");	
}
else {
	System.out.println(i + " is odd");
}
}
int j = 2009;
for (int i = 0; i < 12; i++) {
	System.out.println("in " + j + " I was/am  " + i);
	j ++;
}
	

for (int i = 0; i < 3; i++) {
	int T = 0;
	for (int k = 0; k < 3; k++) {
	System.out.println(i + " " + T);
	T++;
	}
}
int X = 1;
int Y = 2;
int Z = 3;

for (int i = 0; i < 3; i++) {

	System.out.println(X + " " + Y+ " " + Z);
	X +=3;
	Y +=3;
	Z +=3;
}
int M = 1;
int N = 2;
int O = 3;
int P = 4;
int Q = 5;
int R = 6;
int S = 7;
int T = 8;
int U = 9;
int V = 10;
for (int i = 0; i < 10; i++) {
	System.out.println(M + " " + N+ " " + O + " " + P + " " + Q+ " " + R + " " + S + " " + T+ " " + U + " " + "" + V);
M += 10;
 N += 10;
 O += 10;
 P += 10;
 Q += 10;
 R += 10;
 S += 10;
 T += 10;
 U += 10;
 V += 10;	
}
String B = "*";
for (int i = 0; i < 6; i++) {

System.out.println(B);
B += " *";
}
}
}