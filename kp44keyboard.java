import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class kp44keyboard extends Applet implements KeyListener
{
public void init()
{
addKeyListener(this);
}
public void keyTyped(KeyEvent K){}
public void keyReleased(KeyEvent K)
{
showStatus("Key on the keyboard is released");
}
public void keyPressed(KeyEvent K)
{
showStatus("Key on the keyboard is pressed");
}

Font f1 = new Font("Courier New", Font.BOLD,20);
public void paint (Graphics g)
{
g.setFont(f1);
g.setColor(Color.blue);
g.drawString("This applet sense the up/down motion of keys",20,120);
}
}
