class kp18charea
{
public static void main(String args[])
{
float  len= 6.0F;
float bre=4.0F;
float rad= 3.5F;
float hei=5.0F;
double area;
int choice=4;
switch(choice)
{
case 1:	area = (3.142*rad*rad);
	System.out.println("Area of CIRCLE: "+area);
	break;
case 2:	area = (len*bre);
	System.out.println("Area of RECTANGLE: "+area);
	break;
case 3:	area = (bre*bre);
	System.out.println("Area of SQUARE: "+area);
	break;
case 4:	area = (0.5*bre*hei);
	System.out.println("Area of TRIANGLE: "+area);
	break;
}
}
}
