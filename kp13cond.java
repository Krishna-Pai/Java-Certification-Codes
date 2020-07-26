class kp13cond
{
public static void main(String args[])
{
int x=40; 
double salary;
salary = (x!=40)? ((x<40)? (4*x+100) : (4.5*x+150)) : 300;
System.out.println("The person sold "+x+ "products, so his salary is "+salary);
}
}