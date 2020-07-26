import java.util.*;
import java.io.*;
class kp40arr
{
public static void main(String args[])throws IOException
{
Scanner i=new Scanner(System.in);
int a[];
int found =0, j;
System.out.println("Enter the size of array: ");
int n= i.nextInt();
a= new int[n];
System.out.println("Enter the numbers: ");
for( j=0;j<n;j++)
{
a[j]=i.nextInt();
}
System.out.println("Enter the key element: ");
int k= i.nextInt();
for( j=0;j<n;j++)
{
	if(k==a[j])
	{	
		found+=1;
		j=j+1;
		break;	
	}
}
if(found==1)
{
	System.out.println("The key element found at postion: "+j);
}
else
{
	System.out.println("The key element not found");
}
}
}