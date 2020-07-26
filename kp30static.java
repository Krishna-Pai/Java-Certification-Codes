class mathop
{
static double mul(double x,double y)
{
return x*y;
}
static double div(double x,double y)
{
return x/y;
}
}

class kp30static
{
public static void  main(String args[])
{
double a=mathop.mul(4.0,5.0);
double b=mathop.div(a,2.0);
System.out.println("b= "+b);
}
}