import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import java.applet.*;

class background{
// This is my background
  public static void drawSky(Graphics g){
//This draws the blue sky
  g.drawRect(0, 0, 640, 400);
  g.setColor(new Color(128, 127, 255));
  g.fillRect(0, 0, 640, 400);

}

public static void drawGrass(Graphics g){
//This draws the green grass
//g.setColor(Color.green);
  g.drawRect(0, 200, 640, 400);
  g.setColor(new Color(0, 128, 1));
  g.fillRect(0, 200, 640, 400);
}



}
