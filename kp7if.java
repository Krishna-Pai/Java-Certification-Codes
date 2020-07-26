class kp7if
{
public static void main(String args[])
{
float[] weight={45.0F,55.0F,65.0F,75.0F,85.0F,95.0F};
float[] height={170.0F,175.0F,180.0F,185.0F,190.0F,195.0F};
int count=0;
int count1=0;
int count2=0;
int i;
for(i=0;i<weight.length;i++)
{
if(weight[i]>75.0 && height[i]>180.0)
{
count1= count1+1;
}
count=count+1;
}
count2=count-count1;
System.out.println("No of ppl above condition="+count1);
System.out.println("Total no of ppl="+count);
System.out.println("No of ppl below condition="+count2);
}
}