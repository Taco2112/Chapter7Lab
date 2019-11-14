import java.awt.*;
import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
//this is where all the magic happens
public class paintit extends Applet
{
	public void paint(Graphics g)
	{




 	//order matters and should not be moved 	


  		background.drawSky(g);
				house.drawChimney(g);
  		background.drawGrass(g);
				house.drawFloors(g);
				house.drawRoof(g);
				house.drawDoor(g);
					house.drawWindows(g);
						Tree.drawTrunk(g);
							Tree.drawLeaves(g);
	}
}
