import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class kp45Mouse extends Applet implements MouseListener, MouseMotionListener
{
int X=0, Y=0;
String msg = "Mouse Events";
public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
setBackground(Color.black);
setForeground(Color.red);
}
public void mouseEntered(MouseEvent m)
{
msg = "Mouse Entered";
setBackground(Color.cyan);
showStatus("Mouse Entered");
repaint();
}
public void mouseExited(MouseEvent m)
{
msg = "Mouse Exited";
setBackground(Color.green);
showStatus("Mouse Exited");
repaint();
}
public void mouseMoved(MouseEvent m)
{
X=m.getX();
Y=m.getY();
msg = "Mouse Moved";
setBackground(Color.white);
showStatus("Mouse Moved  x:" + X+ "  y:" +Y);
repaint();
}
public void mousePressed(MouseEvent m)
{
msg = "Mouse Pressed";
setBackground(Color.orange);
showStatus("Mouse Pressed");
repaint();
}
public void mouseClicked(MouseEvent m)
{
msg = "Mouse Clicked";
setBackground(Color.pink);
showStatus("Mouse Clicked");
repaint();
}
public void mouseDragged(MouseEvent m)
{
msg = "Mouse Dragged";
setBackground(Color.yellow);
showStatus("Mouse Dragged  x:" + m.getX()+ "   y:" +m.getY());
repaint();
}
public void mouseReleased(MouseEvent m)
{
msg = "Mouse Released";
setBackground(Color.blue);
showStatus("Mouse Released");
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg ,X, Y);
}
}
