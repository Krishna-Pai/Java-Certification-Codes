class kp23mani
{
public static void main(String args[])
{
StringBuffer str=new StringBuffer("Object language");
System.out.println("Original String: "+str);
String s2= " improves security";
int n= str.length();
System.out.println("Length of the string: "+n);
for(int i=0;i<n;i++)
{
	int p=i+1;
	System.out.println("Character at position "+p+" is "+str.charAt(i));
}
System.out.println("Modified string: "+str.insert(7, "Oriented "));
System.out.println("String now: "+str.insert(6, "-"));
System.out.println("Appended string: "+str.append(s2));
}
}


