class kp21key
{
public static void main(String args[])
{
int a[]={15,45,36,95,5,41};
int n = a.length;
int key= 36;
int b=0,i;
System.out.println(" Given array: ");
	for( i=0;i<n;i++)
	{
		System.out.print("  " +a[i]);
	}
System.out.println("  ");
System.out.println(" Key element is: "+key);
	for( i=0;i<n;i++)
	{
		if(key==a[i])
		{
			b++;
			break;
		}
	}
	if(b==0)
	{
		System.out.println("Key element not found");
	}
	else
	{
		System.out.println("Key element found at "+i+" postion");
	}
}
}