import java.lang.Math;
class kp1
{
public static void main(String args[])
{
double x;
int a=2,b=3,c=-4;
System.out.println("Here a="+a+"b="+b+"c="+c);
x=Math.max(a,b);
System.out.println("The maximum among two is "+x);
x=Math.sqrt(a);
System.out.println("The square root is "+x);
x=Math.abs(c);
System.out.println("The absolute is "+x);
x=Math.pow(a,b);
System.out.println("The power  is "+x);
x=Math.min(a,b);
System.out.println("The minimum among two is "+x);
x=Math.log(b);
System.out.println("The log is "+x);
}
}