
  /*** Go to the recipe to run the demonstration before starting this program ***/

void setup() {
  /* Set the size of your sketch to be a rectangle like in the recipe demonstration */
  
  size (800, 800);
  
  /* Call the noFill() command so all the ellipses will be transparent */


}
int speed = 3;
int ex = 125;
int ex2 = 700;
void draw() {

        /* Use a for loop to make the first set of rings that will start in the left half of the window
        (you can use the code from your Bullseye program).*/          

    background (920);    
        /*Make this set of rings move across the sketch to the right 
        Hint: make two variables, one for x and another for the speed. 
        Then increase x by the amount in speed */
  for (int i = 100; i > 0; i-=9) {
    noFill ();
    
      ellipse(ex2,125, i + 30, i + 30);
}
  //Use an if statement and modulo to alternate the color of your rings.
  
  

for (int i = 100; i > 0; i-=9) {
   noFill ();
      ellipse(ex ,125, i + 30, i + 30);
}
  //Use an if statement and modulo to alternate the color of your rings.
ex+=speed;  
ex2-=speed;

        
        /*When the rings reach the right side of the sketch, reverse the direction so they move
        Hint: speed = -speed */

         
        /*When the rings reach the left side of the sketch, reverse the direction again */
        
         
 //CHALLENGE - to finish the Amazing Rings 
 
        /*Add another for loop to draw the second set of rings that will start in the right half of the window */
        
        
        /*Make this set of rings move in the opposite direction to the other rings 
        These rings must also "bounce" off the sides of the window.*/
}
