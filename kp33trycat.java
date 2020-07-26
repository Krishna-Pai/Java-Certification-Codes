 class kp33trycat
{
public static void main(String arg[])
{
int a=10,b=5,c=5,x,y;
try
{
	x=a/(b-c);
}
catch(ArithmeticException e)
{
	System.out.println("Division by Zero");
}
y=a/(b+c);
System.out.println("y= "+y);	
}
}