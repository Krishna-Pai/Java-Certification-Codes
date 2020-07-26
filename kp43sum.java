import java.awt.*;
import java.applet.*;
public class kp43sum extends Applet
{
public void paint (Graphics g)
{
int a =10, b=20;
int sum = a+b;
String s="Sum: "+String.valueOf(sum);
g.drawString(s,100,100);
}
}