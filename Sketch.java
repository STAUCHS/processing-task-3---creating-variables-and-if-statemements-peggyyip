import processing.core.PApplet;

public class Sketch extends PApplet {
	
   // naming base variables
   float iceCreamX;
   float iceCreamY;

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  public void setup() {
    background(167, 227, 242);

    iceCreamX = random(80, 400);
    iceCreamY = random(160, 400);
    
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
      // chocolate
      fill(77, 65, 47);
      stroke(77, 65, 47);
      circle(iceCreamX, iceCreamY, 175);
      ellipse(iceCreamX - 50, iceCreamY + 70, 100, 60);
      ellipse(iceCreamX + 50, iceCreamY + 70, 160, 30);

      if (iceCreamX >= 240 && iceCreamY >= 280 ) {
        fill(227, 217, 188);
        stroke(227, 217, 188);
        circle(iceCreamX, iceCreamY, 175);
        ellipse(iceCreamX - 50, iceCreamY + 70, 100, 60);
        ellipse(iceCreamX + 50, iceCreamY + 70, 160, 30);
      }
      else if (iceCreamX < 239 && iceCreamY >= 200) {
        fill(232, 162, 174);
        stroke(232, 162, 174);
        circle(iceCreamX, iceCreamY, 175);
        ellipse(iceCreamX - 50, iceCreamY + 70, 100, 60);
        ellipse(iceCreamX + 50, iceCreamY + 70, 160, 30);
        fill(0);
        textSize(19);
        text("Your ice cream flavour is strawberry!", 10, 250);
      }
      else if (iceCreamX >= 240 && iceCreamY <=190) {
        fill(77, 65, 47);
        stroke(77, 65, 47);
        circle(iceCreamX, iceCreamY, 175);
        ellipse(iceCreamX - 50, iceCreamY + 70, 100, 60);
        ellipse(iceCreamX + 50, iceCreamY + 70, 160, 30);
        fill(0);
        textSize(19);
        text("Your ice cream flavour is chocolate!", 10, 250);
      }
      else if (iceCreamX < 239 && iceCreamY <=190) {
        fill(89,158,60);
        stroke(9,158,60);
        circle(iceCreamX, iceCreamY, 175);
        ellipse(iceCreamX - 50, iceCreamY + 70, 100, 60);
        ellipse(iceCreamX + 50, iceCreamY + 70, 160, 30);
        fill(0);
        textSize(19);
        text("Your ice cream flavour is matcha!", 10, 250);
      }

      // whipped cream 
      fill(250, 245, 245);
      stroke(237, 209, 209);
      ellipse(iceCreamX, iceCreamY - 70, 120, 55);
      ellipse(iceCreamX, iceCreamY - 85, 105, 55);
      ellipse(iceCreamX, iceCreamY - 109, 86, 55);
      stroke(250, 245, 245);
      triangle(iceCreamX - 43, iceCreamY - 109, iceCreamX + 43, iceCreamY - 109, iceCreamX, iceCreamY - 170);
      
      // cherry
      fill(255, 43, 28);
      stroke(255, 43, 28);
      circle(iceCreamX, iceCreamY - 150, 64);
      strokeWeight(4);
      line(iceCreamX, iceCreamY - 150, iceCreamX - 15, iceCreamY - 220);

      if (iceCreamX >= 240 && iceCreamY >= 280 ) {
        fill(0);
        textSize(19);
        text("Your ice cream flavour is vanilla!", 10, 250);
      }
      
    }

}