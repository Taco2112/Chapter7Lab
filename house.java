import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import java.applet.*;
/*
********GRADER NOTES **************
(COPPIED DIRECTLY FROM THE LAB FORM)
_______________________________________________________________________________________
80 Point Version

Your program has one class with four or more methods.
_______________________________________________________________________________________
90 Point Version

Your program has one class with four or more methods.
It has a second class with three or more methods.

_______________________________________________________________________________________
100 Point Version

Your program has one class with four or more methods.
It has a second class with three or more methods.
It has a third class with two or more methods.

_______________________________________________________________________________________
110 Point Version

This has the same classes as the 100 point version, but each class is now in its own file.

----------------------------------------
AND
----------------------------------------
_______________________________________________________________________________________
This is your first open-ended lab assignment.
This means that you are not shown a specific picture or program computation output that is required when you execute your lab assignment
_______________________________________________________________________________________
------------------------------------
Kool aid lets begin
************************************
*/
class house{
//This draws my house

public static void drawFloors(Graphics g){
//This draws my floors of the house
    //The rectangle below is the bottom half of the house
    g.setColor(new Color(232, 182, 152));
    g.fillRect(80, 200, 200, 100);
    g.setColor(Color.blue);
    g.drawRect(80, 200, 200, 100);

/*int r = 232;     TEST CODE
int g = 182;       TEST CODE
int b = 152;       TEST CODE
Color billymaysbadge = new Color(232, 182, 152); TEST CODE*/

    //The rectangle below is the top half of the house
    g.setColor(new Color(232, 182, 152));
    g.fillRect(80, 100, 200, 100);
    g.setColor(Color.blue);
    g.drawRect(80, 100, 200, 100);
}

public static void drawRoof(Graphics g){
//This draws my roof


  /*TEST CODE
  The line below is the left part of the triangle
  g.setColor(Color.red);
  g.drawLine(80, 100, 180, 50);

  The line below is the right part of the triangle
  g.setColor(Color.red);
  g.drawLine(280, 100, 180, 50);

but then I realized that code above was kinda dumb so I overlayed the bottom stuff on top of it :D
TEST CODE*/


 g.setColor(Color.red);
  int x[] = { 80,280,180 };

        // y coordinates of vertices
        int y[] = { 100,100,50,50 };

        // number of vertices
        int numberofpoints = 3;

        // set the color of line drawn to blue
        g.setColor(Color.red);

        // draw the polygon using drawPolygon function / makes the roof
        g.setColor(Color.blue);
        g.drawPolygon(x, y, numberofpoints);
         g.setColor(Color.red);
         g.fillPolygon(x,y, numberofpoints);


}

public static void drawDoor(Graphics g){
//This draws my door
g.setColor(Color.blue);
g.fillRect(170, 250, 25, 50);
g.setColor(Color.black);
g.drawRect(170, 250, 25, 50);

//this draws that oval..circle thing in the middle of the door
g.setColor(Color.black);
g.drawOval(170, 250, 25, 50 );
g.setColor(Color.blue);

// this draws the door knob because we'd like to get inside
g.setColor(Color.black);
g.drawOval(190, 270, 5, 10 );
g.setColor(Color.blue);

}
public static void drawWindows(Graphics g){
//This draws my windows
//code is >..COMMING SOON TO DVD AND VIDEO
g.setColor(Color.white);
g.fillRect(90, 110, 70, 80);
g.setColor(Color.black);
g.drawRect(90, 110, 70, 80);
//One window is good , anymore would complicate the building
//I was thinking putting none but then I thought that was scary
//because it be like a prision , So good thing I put that one window there
//😅 right?

}

public static void drawChimney(Graphics g){
//This draws my chimney
g.setColor(Color.red);
g.fillRect(220, 50, 20, 50);
g.setColor(Color.blue);
g.drawRect(220, 50, 20, 50);

}





}
