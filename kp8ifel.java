class kp8ifel
{
public static void main(String args[])
{
int[] num={10,20,30,40,50,60,70,80,90,100};
int eve=0,odd=0;
int i;
for(i=0;i<(num.length);i++)
{
if (num[i]%2==0)
{
eve++;
}
else
{
odd++;
}
}
System.out.println("Even numbers="+eve+" Odd numbers="+odd);
}
}
