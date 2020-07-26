class Room
{
float len, bre;
void getdata(float a, float b)
{
len =a;
bre=b;
}
}

class kp27class
{
public static void main (String args[])
{
float area;
Room room1=new Room();
room1.getdata(14,20);
area=room1.len*room1.bre;
System.out.println("Area= "+area);
}
}