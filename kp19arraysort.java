class kp19arraysort
{
public static void main(String args[])
{
int num[] = {45,95,75,25,65,85,35,15,55};
int n= num.length;
System.out.println(" Given list:   ");
	for(int i=0;i<n;i++)
	{
		System.out.print(" "+ num[i]);
	}
System.out.println("   ");
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(num[i]<num[j])
		{
			int temp = num[i];
			num[i] = num[j];
			num[j] = temp;
		}
		}
	}
System.out.println(" Sorted list:   ");
	for(int i=0;i<n;i++)
	{
		System.out.print(" "+num[i]);
	}
System.out.println("   ");
}
}

