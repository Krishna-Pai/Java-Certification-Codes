class kp15dowhile
{
public static void main(String args[])
{
int r, c,y;
System.out.println("Multiplication table");
r=1;
do
{
c=1;
do
{
y=r*c;
System.out.print(" "+y);
c++;
}
while(c<=3);
System.out.println("\n");
r++;
}
while(r<=3);
}
}