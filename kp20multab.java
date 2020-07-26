class kp20multab
{
final static int ROW= 20;
final static int COL= 20;
public static void main(String args[])
{
int product[][]=new int [ROW][COL];
System.out.println("MULTIPICATION TABLE");
System.out.println("  ");
	for(int i=10; i<ROW;i++)
	{
		for(int j=10; j<COL;j++)
		{
			product[i][j]=i*j;
			System.out.print("  "+product[i][j]);
		}
		System.out.println("  ");
	}
}
}
