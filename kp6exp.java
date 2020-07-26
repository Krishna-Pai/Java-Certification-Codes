class kp6exp
{
public static void main(String args[])
{
int a =10,b=5,c=8,d=2;
float x=6.4F, y=3.0F;
 
int ans1=a*b+c/d;
int ans2=a*(b+c)/d;

float ans3=a/c;
float ans4=(float)a/c;
float ans5= a/y;

int ans6=a%c;
float ans7= x%y;

boolean bool1= a>b&&c>d;
boolean bool2=a<b&&c>d;
boolean bool3=a<b||c>d;
boolean bool4=!(a-b==c);

System.out.println("order of evaluation");
System.out.println("a*b+c/d="+ans1);
System.out.println("a*(b+c)/d="+ans2);

System.out.println("type conversion");
System.out.println("a/c="+ans3);
System.out.println("(float)a/c="+ans4);
System.out.println("a/y="+ans5);

System.out.println("modulus operation");
System.out.println("a%c="+ans6);
System.out.println("x%y="+ans7);

System.out.println("logical operation");
System.out.println("a>b&&c>d="+bool1);
System.out.println("a<b&&c>d="+bool2);
System.out.println("a<b||c>d="+bool3);
System.out.println("!(a-b==c)="+bool4);
}
}