class Rectangle
{
int len, wid;

void getData(int x, int y)
{
len =x;
wid =y;
}

int rectArea()
{
int area= len*wid;
return (area);
}
}

class kp26rect
{
public static void main(String args[])
{
int area1, area2;
Rectangle rect1= new Rectangle();
Rectangle rect2= new Rectangle();
rect1.len=15;
rect1.wid=10;
area1=rect1.len*rect1.wid;
rect2.getData(20,12);
area2=rect2.rectArea();
System.out.println("Area1= "+area1);
System.out.println("Area2= "+area2);
}
}