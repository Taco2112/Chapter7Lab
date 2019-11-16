import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import java.applet.*;

class Tree{
// This draws my lollipop shaped tree
public static void drawTrunk(Graphics g){
//This draws my tree trunk(AKA that box that holds the leaves up... idk(sigh))
g.setColor(new Color(148, 100, 15));
g.drawRect(500, 100, 30, 200);
g.setColor(new Color(148, 100, 15));
g.fillRect(500, 100, 30, 200);
}

public static void drawLeaves(Graphics g){
//This draws my leaves for the Tree
g.setColor(new Color(0, 255,1));
g.drawOval(465, 50, 100, 100 );
g.setColor(new Color(0, 255,1));
g.fillOval(465, 50, 100, 100);

}

}
