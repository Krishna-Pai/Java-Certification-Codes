import java.util.Scanner;
import java.io.*;
class kp38emp
{
public static void main(String arg[])throws IOException
{
Scanner o=new Scanner(System.in);
BufferedReader w=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter name of the person:");
String a=w.readLine();
System.out.println("Enter ID no:");
int b=o.nextInt();
System.out.println("Enter salary:");
float c=o.nextFloat();
System.out.println("Details: ");
System.out.println("Name of the person: "+a);
System.out.println("ID no: "+b);
System.out.println("Salary: "+c);
}
}