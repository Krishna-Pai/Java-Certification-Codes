class kp54sort
{
public static void main(String args[])
{
int num[] = {4,8,2,5,6,4,7,2,3,5,8,1};
int j;
int n= num.length;
	for(int i=0;i<n;i++)
	{
		for( j=i+1;j<n;j++)
		{
			if(num[i]>num[j])
		{
			int temp = num[i];
			num[i] = num[j];
			num[j] = temp;
		}
		}
	}
for(int i=0;i<n;i++)
	{
		System.out.println(num[i]);
	}
System.out.println("largest number: "+num[n-1]);
}
}
