class math
{
float num1,num2;
void getData(float a, float b)
{
num1=a;
num2=b;
}
float add()
{
float add=num1+num2;
return (add);
}
float sub()
{
float sub=num1-num2;
return (sub);
}
float mul()
{
float mul=num1*num2;
return (mul);
}
float div()
{
float div=num1/num2;
return (div);
}
}

class kp28math
{
public static void main(String args[])
{
float A,B,C,D;
math math1=new math();
math math2=new math();
math math3=new math();
math math4=new math();
math1.getData(68,45);
A=math1.add();
math2.getData(68,45);
B=math2.sub();
math3.getData(68,45);
C=math3.mul();
math4.getData(68,45);
D=math4.div();
System.out.println("ADD= "+A);
System.out.println("SUB= "+B);
System.out.println("MUL= "+C);
System.out.println("DIV= "+D);
}
}
