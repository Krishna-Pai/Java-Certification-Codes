class kp22alph
{
static String a[]={"Bombay", "Delhi","Goa","Ahmedabad","Madras"};
public static void main(String args[])
{
int n= a.length;
String temp;
for(int i=0;i<n;i++)
{
	for(int j=i+1;j<n;j++)
	{
		if(a[j].compareTo(a[i])<0)
		{
			temp =a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
for(int i=0;i<n;i++)
{
	System.out.println(a[i]);
}
}
}