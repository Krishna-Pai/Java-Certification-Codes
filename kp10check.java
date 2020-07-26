class kp10check
{
public static void main(String args[])
{
char ch='%';
int vol=0, con=0, dig=0, sym=0, i;

if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
{
	if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
	vol++;
	}
	else
	{
	con++;
	}
}
else
{

	if(ch>='0'&&ch<='9')
	{
	dig++;
	}
	else
	{
	sym++;
	}
}
System.out.println("Total number of:\n vowels:"+vol+"\n consonants:"+con+"\n digits:"+dig+"\n symbols:"+sym);
}
}