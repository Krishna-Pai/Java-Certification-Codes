import java.util.Scanner;
import java.io.*;
class kp39math
{
public static void main(String args[])throws IOException
{
Scanner i=new Scanner(System.in);
BufferedReader w=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter value of 'a': ");
float a=i.nextFloat();
System.out.println("Enter value of 'b': ");
float b=i.nextFloat();
float c=a+b;
float d=a-b;
float e=a*b;
float f=a/b;
System.out.println("The answer of a+b= "+c);
System.out.println("The answer of a-b= "+d);
System.out.println("The answer of a*b= "+e);
System.out.println("The answer of a/b= "+f);
}
}