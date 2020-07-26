class kp12marks
{
public static void main(String args[])
{
int choice=45,x;
System.out.flush();
x=choice/10;
switch (x)
{
case   9:
case   8: System.out.println("FCD"); 
	break;

case   7:
case  6: System.out.println("1st class");
	break;
case   5:
case  4: System.out.println("2nd class");
	break;

case  3 : System.out.println("Pass class");
	break;
default:  System.out.println("Invalid input ");
}
}
}