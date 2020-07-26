class kp14while
{
public static void main(String args[])
{
int num=5,a=1;
int i=2;
int temp=(num/2);

while (i<=temp)
{
	if((num%i)==0)
	{
	a=0;
	break;
	}
	i++;

}
if(a==0)
{
System.out.println("is not a prime ");
}
else
{
System.out.println("is a prime ");
}
}
}