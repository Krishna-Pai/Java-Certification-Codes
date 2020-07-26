class shape
{
int len ,wid;
shape(int x,int y)
{
len=x;
wid=y;
}
shape(int x)
{
len=wid=x;
}
int rectArea()
{
return (len*wid);
}
}

class kp29const
{
public static void main(String args[])
{
shape rect1= new shape(10);
int area=rect1.rectArea();
System.out.println("Area= "+area);
}
}