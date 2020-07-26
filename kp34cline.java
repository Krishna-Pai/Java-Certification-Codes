class kp34cline
{
public static void main(String args[])
{
int invalid=0,count=0, number;
for (int i=0;i<args.length;i++)
{
	try
	{
		number=Integer.parseInt(args[i]);
	}
	catch(NumberFormatException e)
	{
		invalid++;
		System.out.println("Invalid number: "+args[i]);
		continue;
	}
	count++;
	System.out.println("Vaild number: "+args[i]);	
}
System.out.println("Vaild number: "+count);
System.out.println("Invaild number: "+invalid);
}
}			