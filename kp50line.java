import java.awt.*;
import java.applet.*;
public class kp50line extends Applet
{
public void paint (Graphics g)
{
int x[]= {0,60,120,180,240,300,360,400};
int y[] = {400,280,220,140,60,60,100,220};
int n = x.length;
g.drawPolygon(x,y,n);
}
}