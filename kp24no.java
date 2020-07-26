class kp24no
{
public static void main(String args[])
{

 StringBuffer s1=new StringBuffer("Object-Oriented Language");
System.out.println(s1);
int vol=0,con=0, spa=0,sym=0,dig=0;
String s2;;
int n= s1.length();

for(int j=0;j<n;j++)
{
	s2[j]=s1[j];
	if(b>='a' && b<='z')
	{
		if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u')
			vol++;
		else
			con++;
	}
	else
	{
		if(b>='0' && b<='9')
		{
		dig++;
		}
		else
		{
		sym++;
		}
	}
}
System.out.println("No of vowels: "+vol+"\nNo of consonants: "+con+"\nNo of Symbols: "+sym+"\nNo of digits: "+dig);
}
}

