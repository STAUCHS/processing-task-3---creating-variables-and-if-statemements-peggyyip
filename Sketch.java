import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  public void setup() {
    background(167, 227, 242);
   // naming base variables
   float iceCreamX = random(0, 412);
   float iceCreamY = random(0, 412);
   float iceCreamWidth = random(0, 100);
   float iceCreamHeight = random(0, 100);

   // naming add-on variables

   // chocolate
   fill(77, 65, 47);
   stroke(77, 65, 47);
   circle(iceCreamX, iceCreamY, 175);
   ellipse(iceCreamX / 2, iceCreamY * (float) 0.825, 100, 60);
   ellipse(150, 400, 160, 30);

   // whipped cream 
   fill(250, 245, 245);
   stroke(237, 209, 209);
   ellipse(100, 260, 120, 55);
   ellipse(100, 245, 105, 55);
   ellipse(100, 221, 86, 55);
   stroke(250, 245, 245);
   triangle(57, 221, 143, 221, 100, 160);

   // cherry
   fill(255, 43, 28);
   stroke(255, 43, 28);
   circle(100, 180, 64);
   strokeWeight(4);
   line(100, 180, 85, 110);
   
   /* 
   float ellipseX = random(0, 200);
   float ellipseY = random(0, 200);
   float ellipseWidth = random (10, 50);
   float ellipseHeight = random (10, 50);
   ellipse(ellipseX, ellipseY, ellipseWidth, ellipseHeight);

   float randomX = random(0, 400);
   float randomY = random(0, 400);
    if (randomX < 200 && randomY < 200){
      ellipse(randomX, randomY, ellipseWidth, ellipseHeight);
   }
    else if (randomX > 200 && randomY < 200){
      ellipse(randomX, randomY, ellipseWidth, ellipseHeight);
    }
    // show current time
    int hr = hour();
    int min = minute();
    // text size, x and y position
    fill(0);
    textSize(30);
    text(hr, 200, 200);
    text(min, 200, 225);
    */

  }
    public void draw() {
  
    }

}