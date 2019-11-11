
import java.awt.*;
import java.applet.*;
 
public class Paintit extends Applet
{
	public void paint(Graphics g)
	{
		House.drawFloors(g);
		House.drawRoof(g);
		House.drawDoor(g);
		House.drawWindows(g);
		House.drawChimney(g);
 		Tree.drawTrunk(g);
  		Tree.drawLeaves(g);
  		Background.drawSky(g);
  		Background.drawGrass(g);
	}
}
