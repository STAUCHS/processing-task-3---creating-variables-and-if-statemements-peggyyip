
import processing.core.PApplet;

/**
 * Generate ice cream scoop in random locations, and output a different message for different quadrants.
 * @author: P .Yip
 *
 */

public class Sketch extends PApplet {
	
   // naming base variables
   float iceCreamX;
   float iceCreamY;

  public void settings() {
	// put your size call here
    size(500, 500);
  }

  public void setup() {
    background(random(255), random(255), random(255));
    
    // randomize variables
    iceCreamX = random(80, 400);
    iceCreamY = random(160, 400);
  }
    public void draw() {
      // chocolate
      fill(77, 65, 47);
      stroke(77, 65, 47);
      circle(iceCreamX, iceCreamY, 175);
      ellipse(iceCreamX - 50, iceCreamY + 70, 100, 60);
      ellipse(iceCreamX + 50, iceCreamY + 70, 160, 30);

      // Change colours of ice cream for different locations
      if (iceCreamX >= 240 && iceCreamY >= 280 ) {
        fill(227, 217, 188);
        stroke(227, 217, 188);
        ellipse(iceCreamX - 50, iceCreamY + 70, 100, 60);
        ellipse(iceCreamX + 50, iceCreamY + 70, 160, 30);
        circle(iceCreamX, iceCreamY, 175);
      }
      else if (iceCreamX < 240 && iceCreamY >= 280) {
        fill(232, 162, 174);
        stroke(232, 162, 174);
        circle(iceCreamX, iceCreamY, 175);
        ellipse(iceCreamX - 50, iceCreamY + 70, 100, 60);
        ellipse(iceCreamX + 50, iceCreamY + 70, 160, 30);
      }
      else if (iceCreamX >= 240 && iceCreamY < 280) {
        fill(168, 141, 131);
        stroke(168, 141, 131);
        circle(iceCreamX, iceCreamY, 175);
        ellipse(iceCreamX - 50, iceCreamY + 70, 100, 60);
        ellipse(iceCreamX + 50, iceCreamY + 70, 160, 30);
      }
      else if (iceCreamX < 240 && iceCreamY < 280) {
        fill(89,158,60);
        stroke(89,158,60);
        ellipse(iceCreamX - 50, iceCreamY + 70, 100, 60);
        ellipse(iceCreamX + 50, iceCreamY + 70, 160, 30);
        circle(iceCreamX, iceCreamY, 175);
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

      fill(0);

      // Write out messages for each ice cream
      if (iceCreamX >= 240 && iceCreamY >= 280 ) {
        textSize(30);
        text("Your ice cream flavour is vanilla!", 50, 250);
      }
      else if (iceCreamX < 240 && iceCreamY >= 280) {
        textSize(30);
        text("Your ice cream flavour is strawberry!", 30, 250);
      }
      else if (iceCreamX >= 240 && iceCreamY < 280) {
        textSize(30);
        text("Your ice cream flavour is chocolate!", 30, 250);
      }
      else if (iceCreamX < 240 && iceCreamY < 280) {
        textSize(30);
        text("Your ice cream flavour is matcha!", 50, 250);
      }

      // define time variables
      int intCurrentHour = hour();
      int intCurrentMinute = minute();
      int intCurrentMonth = month();
      int intCurrentDate = day();
      int intCurrentYear = year();
      
      // special colour case for time
      boolean blnIsSpecialX = iceCreamX < 120;
      boolean blnIsSpecialY = iceCreamY > 350;
      boolean blnIsSpecialCase = blnIsSpecialX || blnIsSpecialY;
      if (blnIsSpecialCase) {
        fill(random(255), random(255), random(255));
        }
      else if (!blnIsSpecialCase) {
        fill(0);
      }

      // position of time
      textSize(30);
      text("Year: " + intCurrentYear, 20, 90);
      text("Day: " + intCurrentDate, 20, 65);
      text("Month: " + intCurrentMonth, 20, 40);
      text("Hour: " + intCurrentHour, 360, 40);
      text("Minute: " + intCurrentMinute, 360, 65);

    }

}